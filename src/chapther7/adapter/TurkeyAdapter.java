package chapther7.adapter;

/**
 * Created by steel on 2019/3/3.
 */
public class TurkeyAdapter implements Duck
{
    Tuekey tuekey;

    public TurkeyAdapter(Tuekey tuekey)
    {
        this.tuekey = tuekey;
    }

    @Override
    public void quack()
    {
        tuekey.gobble();
    }

    @Override
    public void fly()
    {
        for (int i = 0; i < 5; i++)
        {
            tuekey.fly();
        }
    }
}
