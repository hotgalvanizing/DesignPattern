package chapther3.condimentdecorator;

import chapther3.beverage.Beverage;
import chapther3.condimentdecorator.CondimentDecorator;

/**
 * Created by steel on 2019/2/7.
 */
public class Mocha extends CondimentDecorator
{
    Beverage beverage;

    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost()
    {
        return 0.2 + beverage.cost();
    }
}
