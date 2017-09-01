package patterns.combiningpatterns.decorator;


public class RedheadDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Кря-кря");
    }
}
