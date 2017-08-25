package patterns.observer.my_realization;

/**
 * Реализация элемента для вывода текущего состояния.
 * Соответственно реализует интерфейс Observer и DisplayElement (как и все визуальные элементы)
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // Именно в конструктор передается эл-т weatherData
    // для регистрации элемента в качестве наблюдателя
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Текущие показания: температура - " + temperature + ", влажность - " + humidity);
    }
}
