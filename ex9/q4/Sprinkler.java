public class Sprinkler implements Colleague {
    @Override
    public void mediate(Alarm alarm) {
        System.out.println("I am sprinkler,... doing my task");
        alarm.endAlarm("Sprinkler");
    }
}