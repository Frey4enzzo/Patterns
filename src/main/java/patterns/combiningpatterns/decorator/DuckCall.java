package patterns.combiningpatterns.decorator;

/**
 * Утиный манок
 */
public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("Крииак крииак");
    }
}
