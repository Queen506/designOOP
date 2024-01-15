
public class App {
	public static void main(String[] args) {
		Beverage plainBeverage = new PlainBeverage();

		Beverage beverageWithMilk = new Milk(plainBeverage);
		Beverage beverageWithMilkAndSugar = new Sugar(beverageWithMilk);

		System.out.println("You order " + plainBeverage.getDescription());
		System.out.println("The cost is " + plainBeverage.getCost());

		System.out.println("You order " + beverageWithMilkAndSugar.getDescription());
		System.out.println("The cost is " + beverageWithMilkAndSugar.getCost());
	}
}
