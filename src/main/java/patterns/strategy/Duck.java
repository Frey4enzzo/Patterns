package patterns.strategy;

/**
 * Каждая утка СОДЕРЖИТ экземпляры FlyBehavior и QuackBehavior,
 * которым делигируется выполнение соответствующих операци.
 * Т.е. поведение не наследуется, а предоставляется правильно выбранным объектом.
 * Подобные связи являются механизмом КОМПОЗИЦИЯ.
 * Паттерн СТРАТЕГИЯ - определяет семейство алгоритмов, инкапсулирует каждый из них
 * и обеспечивает их взаимозаменяемость. Он позволяет модифицировать алгоритмы независимо
 * от их использования на стороне клиента
 */

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("По идее все утки умеют плавать");
    }
}
