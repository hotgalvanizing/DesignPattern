package chapther7.adapter;

/**
 * Created by steel on 2019/3/3.
 */
public class DuckTestDrive
{
    public static void main(String[] args)
    {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(wildTurkey);

        System.out.println("--Duck--");
        mallardDuck.fly();
        mallardDuck.quack();

        System.out.println("--Turkey--");
        wildTurkey.fly();
        wildTurkey.gobble();

        System.out.println("--Adapter--");
        duck.fly();
        duck.quack();
    }
}
