package builtuser;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-25 20:51
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,66,29.3f);
        weatherData.setMeasurements(78,90, 30.5f);
    }
}
