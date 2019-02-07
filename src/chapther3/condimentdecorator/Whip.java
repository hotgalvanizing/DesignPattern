package chapther3.condimentdecorator;

import chapther3.beverage.Beverage;
import chapther3.condimentdecorator.CondimentDecorator;

/**
 * Created by steel on 2019/2/7.
 */
public class Whip extends CondimentDecorator
{
    Beverage beverage;

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost()
    {
        return beverage.cost() + 0.5;
    }
}
