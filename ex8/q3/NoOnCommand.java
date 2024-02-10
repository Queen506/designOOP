public class NoOnCommand implements Command {
    @Override
    public void execute() {
        System.out.println("On button No command is assigned to this slot");
    }
}
