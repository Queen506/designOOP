public class ACOnCommand implements Command {
    private Airconditioner ac;

    public ACOnCommand(Airconditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.on();
        ac.setTemp(25);
    }
}
