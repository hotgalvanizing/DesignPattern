package chapther7.adapter;

/**
 * Created by steel on 2019/3/3.
 */
public class WildTurkey implements Tuekey
{
    @Override
    public void gobble()
    {
        System.out.println("Gobble");
    }

    @Override
    public void fly()
    {
        System.out.println("Little Fly");
    }
}
