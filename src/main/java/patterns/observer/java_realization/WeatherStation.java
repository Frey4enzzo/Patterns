package patterns.observer.java_realization;


public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // имитация новых погодных данных
        weatherData.setMeasurements(80, 65, 34.4f);
        weatherData.setMeasurements(82, 80, 29.2f);
        weatherData.setMeasurements(78, 90, 40.4f);
    }
}
