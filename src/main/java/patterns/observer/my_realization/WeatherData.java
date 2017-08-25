package patterns.observer.my_realization;


import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList observers;  // список наблюдателей
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    // Новые наблюдатели просто добавляются в конец списка
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // для отмены регистрации удаляем объект из списка наблюдателей
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    // оповещение наблюдателей об изменении состояния через метод update(),
    // который реализуется всеми наблюдателями
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    // оповещение наблюдателей о появлении новых данных
    public void measurementsChanged() {
        notifyObservers();
    }

    // тестовый метод для "чтения данных с устройства"
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
