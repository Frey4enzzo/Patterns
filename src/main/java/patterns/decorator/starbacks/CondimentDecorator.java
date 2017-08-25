package patterns.decorator.starbacks;

/**
 * Абстрактный декоратор
 */

public abstract class CondimentDecorator extends Beverage{

    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
