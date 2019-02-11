package chapther4;

import chapther4.Ingredient.*;

/**
 * Created by steel on 2019/2/11.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        return null;
    }

    @Override
    public Sauce createSauce()
    {
        return null;
    }

    @Override
    public Cheese createCheese()
    {
        return null;
    }

    @Override
    public Veggies[] createVeggies()
    {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni()
    {
        return null;
    }

    @Override
    public Clams createClam()
    {
        return null;
    }
}
