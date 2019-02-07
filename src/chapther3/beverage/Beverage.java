package chapther3.beverage;

/**
 * Created by steel on 2019/2/7.
 */
public abstract class Beverage
{
    String description = "Unknown Beverage";

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}
