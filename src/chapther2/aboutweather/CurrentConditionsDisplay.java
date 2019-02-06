package chapther2.aboutweather;

/**
 * Created by steel on 2019/2/6.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement
{
    private float temperature;
    private float hunidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        this.temperature = temp;
        this.hunidity = humidity;
        display();
    }

    @Override
    public void display()
    {
        System.out.println(CurrentConditionsDisplay.class.getSimpleName()+temperature+hunidity);
    }
}
