package chapther3.beverage;

import chapther3.beverage.Beverage;

/**
 * Created by steel on 2019/2/7.
 */
public class Espresso extends Beverage
{

    public Espresso()
    {
        description = "Espresso";
    }

    @Override
    public double cost()
    {
        return 1.99;
    }
}
