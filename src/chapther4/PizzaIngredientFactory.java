package chapther4;

import chapther4.Ingredient.*;

/**
 * Created by steel on 2019/2/11.
 */
public interface PizzaIngredientFactory
{
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
