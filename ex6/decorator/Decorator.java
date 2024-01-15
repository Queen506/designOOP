public class Decorator implements Beverage {
    private Beverage decoratedBeverage;

    public Decorator(Beverage decoratedBeverage) {
        this.decoratedBeverage = decoratedBeverage;
    }

    @Override
    public int getCost() {
        return decoratedBeverage.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }
}
