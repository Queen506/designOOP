package ex8.q2;

public class FootballScoreApp {
    public static void main(String[] args) {
        FootballScore footballScore = new FootballScore();

        ScoreObserver observer1 = new ScoreDisplay("Observer 1");
        ScoreObserver observer2 = new ScoreDisplay("Observer 2");

        footballScore.registerObserver(observer1);
        footballScore.registerObserver(observer2);

        footballScore.inputScore();
    }
}
