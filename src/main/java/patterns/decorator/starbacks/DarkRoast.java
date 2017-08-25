package patterns.decorator.starbacks;


public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Кофеек сильной обжарки";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
