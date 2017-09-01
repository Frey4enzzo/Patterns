package patterns.combiningpatterns.adapter;

/**
 * Обычная утка
 */

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Кря-кря");
    }
}
