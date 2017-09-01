package patterns.combiningpatterns.observer;

/**
 *   ДЕКОРАТОР (считает кол-во кряков)
 */
public class QuackCounter implements Quackable {

    Quackable duck;
    static int quackCount;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }

    public int getQuackCount() {
        return quackCount;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
