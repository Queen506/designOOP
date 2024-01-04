public class RegularFactory implements ICustomerFactory {
    private static RegularFactory factory = new RegularFactory();

    private RegularFactory() {

    }

    public static RegularFactory getFactory() {
        return factory;
    }

    @Override
    public IMail createMail() {
        return new RegularMail();
    }

    @Override
    public IBrochure createBrochure() {
        return new RegularBrochure();
    }

}
