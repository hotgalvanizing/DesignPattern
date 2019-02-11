package chapther4.prodect;

import chapther4.PizzaIngredientFactory;

/**
 * Created by steel on 2019/2/11.
 */
public class NYStyleCheesePizza extends Pizza
{
    PizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare()
    {
        System.out.println("Prepare" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
