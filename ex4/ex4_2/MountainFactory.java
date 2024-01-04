public class MountainFactory implements ICustomerFactory {
    private static MountainFactory factory = new MountainFactory();

    private MountainFactory() {

    }

    public static MountainFactory getFactory() {
        return factory;
    }

    @Override
    public IMail createMail() {
        return new MountainMail();
    }

    @Override
    public IBrochure createBrochure() {
        return new MountainBrochure();
    }
}
