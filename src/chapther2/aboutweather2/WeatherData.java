package chapther2.aboutweather2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by steel on 2019/2/6.
 */
public class WeatherData extends Observable
{
    private float temperature;
    private float hunidity;
    private float pressure;

    public WeatherData()
    {
    }

    public void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float hunidity, float pressure)
    {
        this.temperature = temperature;
        this.hunidity = hunidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature()
    {
        return temperature;
    }

    public float getHunidity()
    {
        return hunidity;
    }

    public float getPressure()
    {
        return pressure;
    }
}
