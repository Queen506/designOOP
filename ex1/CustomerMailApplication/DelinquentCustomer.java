package ex1.CustomerMailApplication;

//make this class a subclass of customer
public class DelinquentCustomer extends Customer {

    // Complete this class
    @Override
    public String createMail() {
        return "DelinquentCustomer";
    }

}