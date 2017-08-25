package patterns.strategy;


public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Я летаю как реактивная ракета!");
    }
}
