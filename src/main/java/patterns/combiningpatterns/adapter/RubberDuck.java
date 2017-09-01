package patterns.combiningpatterns.adapter;

/**
 * Резиновая утка
 */
public class RubberDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Писк резиновой уточки");
    }
}
