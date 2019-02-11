package chapther4;

import chapther4.creator.NYPizzaStore;
import chapther4.creator.PizzaStore;
import chapther4.prodect.Pizza;

/**
 * Created by steel on 2019/2/11.
 */
public class PizzaTestDrive
{
    public static void main(String[] args)
    {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

        System.out.println(pizza.getName());
    }
}
