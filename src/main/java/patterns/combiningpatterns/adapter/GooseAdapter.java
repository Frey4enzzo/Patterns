package patterns.combiningpatterns.adapter;

/**
 * Применение паттерна Адаптер
 */

public class GooseAdapter implements Quackable{

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
