package patterns.combiningpatterns.absfactory;

/**
 * Абстрактная фабрика уток, реализация будет в субклассах.
 * Каждый метод создает одну из разновидностей уток
 */

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}
