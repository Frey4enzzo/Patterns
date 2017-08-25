package patterns.observer.my_realization;


public class ForecastDisplay implements Observer, DisplayElement{

    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        if (this.humidity == 80) System.out.println("Прогноз: облачно");
        else if (this.humidity < 80) System.out.println("Прогноз: ясно");
        else if (this.humidity > 80) System.out.println("Прогноз: дождливо");
    }
}
