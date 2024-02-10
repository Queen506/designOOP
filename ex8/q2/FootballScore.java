package ex8.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FootballScore implements ScoreSubject {
    private List<ScoreObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ScoreObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ScoreObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String score) {
        for (ScoreObserver observer : observers) {
            observer.update(score);
        }
    }

    public void inputScore() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter Score: ");
            input = scanner.nextLine();

            if (!input.isEmpty()) {
                notifyObservers(input);
            }
        } while (!input.isEmpty());
    }
}
