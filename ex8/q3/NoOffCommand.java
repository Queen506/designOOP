public class NoOffCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Off button No command is assigned to this slot");
    }
}
