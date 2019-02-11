package chapther1.Duck;

import chapther1.Fly.FlyWithWings;
import chapther1.Quack.Quack;

public class MailardDuck extends Duck {

    public MailardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
