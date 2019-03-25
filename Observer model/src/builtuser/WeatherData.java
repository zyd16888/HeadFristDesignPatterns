package builtuser;

import java.util.ArrayList;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-24 20:12
 */
public class WeatherData implements Subject {
    private ArrayList observes;
    private float humidity;
    private float temperature;
    private float pressure;
    public WeatherData() {
        observes = new ArrayList();
    }


    @Override
    public void removeObserver(Observer o) {
        int i = observes.indexOf(o);
        if (i >= 0){
            observes.remove(i);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observes.add(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observes.size(); i++){
            Observer observer = (Observer) observes.get(i);
            observer.update(temperature, humidity, pressure);
        }

    }

    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
