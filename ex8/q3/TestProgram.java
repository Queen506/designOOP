public class TestProgram {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(8);

        Light bedroomLight = new Light("Bed Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedroomAC = new Airconditioner("Bed Room");

        Command lightOnBedroom = new LightOnCommand(bedroomLight);
        Command lightOffBedroom = new LightOffCommand(bedroomLight);
        Command lightOnKitchen = new LightOnCommand(kitchenLight);
        Command lightOffKitchen = new LightOffCommand(kitchenLight);
        Command acOnBedroom = new ACOnCommand(bedroomAC);
        Command acOffBedroom = new ACOffCommand(bedroomAC);

        remoteControl.setCommand(0, lightOnBedroom);
        remoteControl.setCommand(1, lightOffBedroom);
        remoteControl.setCommand(2, lightOnKitchen);
        remoteControl.setCommand(3, lightOffKitchen);
        remoteControl.setCommand(4, acOnBedroom);
        remoteControl.setCommand(5, acOffBedroom);

        System.out.println("slot 0, Light in Bed Room");
        remoteControl.pressButton(0, "On");
        remoteControl.pressButton(1, "Off");
        System.out.println("--------------------------------");

        System.out.println("slot 1, Light in Kitchen");
        remoteControl.pressButton(2, "On");
        remoteControl.pressButton(3, "Off");
        System.out.println("--------------------------------");

        System.out.println("slot 2, AC in Bed Room");
        remoteControl.pressButton(4, "On");
        remoteControl.pressButton(5, "Off");
        System.out.println("--------------------------------");

        System.out.println("test one unavailable slot, slot 3");
        remoteControl.pressButton(6, "On");
        remoteControl.pressButton(7, "Off");
    }
}
