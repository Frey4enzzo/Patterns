package patterns.combiningpatterns.observer;

/**
 * Интерфейс наблюдения за утками
 */

public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
