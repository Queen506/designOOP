public class DelinquentFactory implements ICustomerFactory {
    private static DelinquentFactory factory = new DelinquentFactory();

    private DelinquentFactory() {

    }

    public static DelinquentFactory getFactory() {
        return factory;
    }

    @Override
    public IMail createMail() {
        return new DelinquentMail();
    }

    @Override
    public IBrochure createBrochure() {
        return new DelinquentBrochure();
    }
}
