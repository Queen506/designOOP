public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();

        Alarm alarm = new Alarm();
        alarm.setSprinkler(sprinkler);
        alarm.setCoffeePot(coffeePot);

        alarm.doAlarm();
    }
}
