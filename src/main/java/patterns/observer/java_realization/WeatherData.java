package patterns.observer.java_realization;

/**
 * Суперкласс Observable ерет на себя все управление наблюдателями,
 * поэтому в этом варианте не нужна реализация кода регистрации, добавления
 * и оповещения.
 * Здесь объект данных не передается - это означает,
 * что мы используем модель ЗАПРОСА ДАННЫХ
 */

import java.util.Observable;

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
