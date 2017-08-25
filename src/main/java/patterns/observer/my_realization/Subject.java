package patterns.observer.my_realization;


public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    // оповещает наблюдателей об изменении состояния субъекта
    void notifyObservers();
}
