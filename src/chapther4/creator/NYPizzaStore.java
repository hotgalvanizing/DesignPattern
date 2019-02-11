package chapther4.creator;

import chapther4.NYPizzaIngredientFactory;
import chapther4.PizzaIngredientFactory;
import chapther4.prodect.NYStyleCheesePizza;
import chapther4.prodect.Pizza;

/**
 * Created by steel on 2019/2/11.
 */
public class NYPizzaStore extends PizzaStore
{
    @Override
    Pizza createPizza(String type)
    {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("NY cheese pizza");
        }
        return pizza;
    }
}
