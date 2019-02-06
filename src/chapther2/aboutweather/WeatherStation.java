package chapther2.aboutweather;

/**
 * Created by steel on 2019/2/6.
 */
public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,56,30);
        weatherData.setMeasurements(80,56,31);
        weatherData.setMeasurements(80,56,33);
    }
}
