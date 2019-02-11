package chapther4.prodect;

import chapther4.Ingredient.*;

/**
 * 工厂生产的产品
 */
public abstract class Pizza
{
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake()
    {
        System.out.println("bake");
    }

    public void cut()
    {
        System.out.println("cut");
    }

    public void box()
    {
        System.out.println("box");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
