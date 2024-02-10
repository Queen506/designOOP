package ex8.q2;

class ScoreDisplay implements ScoreObserver {
    private String name;

    public ScoreDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(String score) {
        System.out.println("Live result : " + score);
    }
}
