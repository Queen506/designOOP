import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> slots;

    public RemoteControl(int numberOfSlots) {
        slots = new ArrayList<>(numberOfSlots);
        for (int i = 0; i < numberOfSlots; i++) {
            slots.add(new NoOnCommand());
            slots.add(new NoOffCommand());
        }
    }

    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < slots.size()) {
            slots.set(slot, command);
        } else {
            System.out.println("Invalid slot");
        }
    }

    public void pressButton(int slot, String buttonType) {
        if (slot >= 0 && slot < slots.size()) {
            if ("On".equals(buttonType)) {
                slots.get(slot).execute();
            } else if ("Off".equals(buttonType)) {
                slots.get(slot).execute();
            }
        } else {
            System.out.println("Invalid slot");
        }
    }

}
