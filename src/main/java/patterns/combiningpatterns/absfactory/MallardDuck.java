package patterns.combiningpatterns.absfactory;

/**
 * Обычная утка
 */

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Кря-кря");
    }
}
