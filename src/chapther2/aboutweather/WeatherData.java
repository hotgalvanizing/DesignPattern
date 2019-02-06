package chapther2.aboutweather;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by steel on 2019/2/6.
 */
public class WeatherData implements Subject
{
    private List<Observer> observers;
    private float temperature;
    private float hunidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if (i >= 0)
        {
            observers.remove(i);
        }
    }


    @Override
    public void notifyObserver()
    {
        for (int i = 0; i < observers.size(); i++)
        {
            Observer observer = observers.get(i);
            observer.update(temperature, hunidity, pressure);
        }
    }

    public void measurementsChanged()
    {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float hunidity, float pressure)
    {
        this.temperature = temperature;
        this.hunidity = hunidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
