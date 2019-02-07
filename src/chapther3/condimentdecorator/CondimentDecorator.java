package chapther3.condimentdecorator;

import chapther3.beverage.Beverage;

/**
 * Created by steel on 2019/2/7.
 */
public abstract class CondimentDecorator extends Beverage
{
    public abstract String getDescription();

    @Override
    public double cost()
    {
        return 0;
    }
}
