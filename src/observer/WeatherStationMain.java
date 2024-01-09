package observer;

public class WeatherStationMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // observer is registered. display() will be invoked.
        weatherData.setMeasurements(80, 65, 30.4f);

        weatherData.removeObserver(currentConditionsDisplay);
        // observer is removed. display() will not be invoked.
        weatherData.setMeasurements(81, 64, 30.5f);
    }
}
