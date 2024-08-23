import java.util.ArrayList;

public class Race {
    private Car winner;
    private int winnerScore = -1;
    ArrayList<Car> cars = new ArrayList<>();

    public Car getWinner() {
        return winner;
    }

    public int getWinnerScore() {
        return winnerScore;
    }

    public void scoring() {

        for (Car car : cars) {
            int score = car.speed * 24;
            if (score > this.winnerScore) {
                this.winnerScore = score;
                winner = car;
            }
        }
    }
}