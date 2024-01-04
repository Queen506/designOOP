import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();

        ICustomerFactory factory = getCustomerFactory(type);

        if (factory != null) {
            IMail mail = factory.createMail();
            IBrochure brochure = factory.createBrochure();

            display(mail, brochure);
        } else {
            System.out.println("Invalid customer type.");
        }

        inp.close();
    }

    public static ICustomerFactory getCustomerFactory(int type) {
        switch (type) {
            case 1:
                return RegularFactory.getFactory();
            case 2:
                return MountainFactory.getFactory();
            case 3:
                return DelinquentFactory.getFactory();
        }
        return null;
    }

    public static void display(IMail mail, IBrochure brochure) {
        System.out.println(mail.createMail());
        System.out.println(brochure.createBrochure());
    }
}
