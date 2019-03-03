package chapther7.adapter;

/**
 * Created by steel on 2019/3/3.
 */
public class MallardDuck implements Duck
{
    @Override
    public void quack()
    {
        System.out.println("Quack");
    }

    @Override
    public void fly()
    {
        System.out.println("Fly");
    }
}
