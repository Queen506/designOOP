public class CoffeePot implements Colleague {
    @Override
    public void mediate(Alarm alarm) {
        System.out.println("I am coffee pot,... doing my task");
        alarm.endAlarm("Coffee Pot");
    }
}