package chapther4.creator;

import chapther4.prodect.Pizza;

/**
 * 抽象创建者类
 *
 * 定义一个抽象工厂方法
 * 让子类实现这个方法制造产品
 */
public abstract class PizzaStore
{
    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
