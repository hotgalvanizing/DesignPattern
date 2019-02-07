package chapther3.beverage;

/**
 * Created by steel on 2019/2/7.
 */
public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        description = "HouseBlend";
    }

    @Override
    public double cost()
    {
        return 0.89;
    }
}
