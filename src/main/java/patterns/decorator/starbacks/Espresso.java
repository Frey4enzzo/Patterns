package patterns.decorator.starbacks;


public class Espresso extends Beverage{

    public Espresso() {
        description = "Эспрессо"; // description наследуется, и задается в конструкторе
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
