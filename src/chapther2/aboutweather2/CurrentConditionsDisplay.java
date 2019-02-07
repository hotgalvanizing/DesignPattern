package chapther2.aboutweather2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by steel on 2019/2/6.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement
{
    private float temperature;
    private float hunidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData)
    {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }



    @Override
    public void display()
    {
        System.out.println(CurrentConditionsDisplay.class.getSimpleName()+temperature+hunidity);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof WeatherData){
            WeatherData w = (WeatherData) o;
            this.temperature = w.getTemperature();
            this.hunidity = w.getHunidity();
            display();
        }
    }
}
