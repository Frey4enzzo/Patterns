package patterns.decorator.starbacks;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Кофеек без кофеина";
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
