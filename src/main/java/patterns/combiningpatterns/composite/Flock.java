package patterns.combiningpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Использование паттерна компоновщик
 * Flock - стая уток.
 */
public class Flock implements Quackable {
    // здесь будет коллекция уток (стая)
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }
}
