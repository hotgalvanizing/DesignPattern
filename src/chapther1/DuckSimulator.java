package chapther1;

import chapther1.Duck.Duck;
import chapther1.Duck.MailardDuck;
import chapther1.Duck.ModelDuck;
import chapther1.Fly.FlyRocketPowered;

/**
 * 策略模式：
 *
 *
 */

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MailardDuck();
        duck.preformFly();
        duck.preformQuack();
        duck.swim();

        Duck duck1 = new ModelDuck();
        duck1.preformFly();
        duck1.setFlyBehavior(new FlyRocketPowered());
        duck1.preformFly();
    }
}
