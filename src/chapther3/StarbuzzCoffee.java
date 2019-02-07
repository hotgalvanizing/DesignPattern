package chapther3;

import chapther3.beverage.Beverage;
import chapther3.beverage.Espresso;
import chapther3.beverage.HouseBlend;
import chapther3.condimentdecorator.Mocha;
import chapther3.condimentdecorator.Whip;

/**
 * Created by steel on 2019/2/7.
 */
public class StarbuzzCoffee
{
    public static void main(String[] args)
    {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + beverage.cost());

        Beverage beverage1 = new Espresso();
//        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + beverage1.cost());


    }
}
