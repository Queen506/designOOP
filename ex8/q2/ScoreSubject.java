package ex8.q2;

import java.util.List;

interface ScoreSubject {
    void registerObserver(ScoreObserver observer);

    void removeObserver(ScoreObserver observer);

    void notifyObservers(String score);
}
