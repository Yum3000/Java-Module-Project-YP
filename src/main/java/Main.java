import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the race 24 Hours of Le Mans!\n");
        Scanner input = new Scanner(System.in);

        Race newRace = new Race();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter title of car №" + (i + 1) + ":");
            String carTitle = input.next();

            int carSpeed = -1;

            do {
                System.out.println("Enter speed of car №" + (i + 1) + ":");
                if (input.hasNextInt()) {
                    carSpeed = input.nextInt();

                    if (!(carSpeed > 0 && carSpeed <= 250)) {
                        carSpeed = -1;
                        System.out.println("Error! The speed might be from 0 to 250");
                    }
                } else {
                    System.out.println("Error! Please enter only integer");
                    input.next(); // очищаем input от неправильного ввода
                }
            } while (carSpeed < 0);

            Car newCar = new Car(carTitle, carSpeed);
            System.out.println("New race participant: " + newCar.title + " with speed " + newCar.speed);

            newRace.cars.add(newCar);
            newRace.scoring();
            System.out.println("The winner of this race is " + newRace.getWinner().title + " with score " + newRace.getWinnerScore());
        }
    }
}
