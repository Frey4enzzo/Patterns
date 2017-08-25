package patterns.strategy;


public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Кря-кря бля!");
    }
}
