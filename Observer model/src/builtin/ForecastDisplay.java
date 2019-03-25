package builtin;

import builtuser.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-25 21:19
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Last pressure: " + lastPressure + "F Feature Pressure: " + currentPressure);
    }
}
