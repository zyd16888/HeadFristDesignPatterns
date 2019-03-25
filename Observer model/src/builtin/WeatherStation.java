package builtin;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-25 21:33
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(50,40,30);
        weatherData.setMeasurements(20,10,6);
    }
}
