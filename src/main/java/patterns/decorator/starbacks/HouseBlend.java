package patterns.decorator.starbacks;


public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "Домашний кофеек";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
