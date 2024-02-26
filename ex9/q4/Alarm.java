public class Alarm implements Mediator {
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        sprinkler.mediate(this);
        coffeePot.mediate(this);
    }

    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }

    @Override
    public void mediate(Colleague colleague) {
        colleague.mediate(this);
    }
}