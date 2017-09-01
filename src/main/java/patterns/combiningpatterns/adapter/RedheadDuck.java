package patterns.combiningpatterns.adapter;


public class RedheadDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Кря-кря");
    }
}
