package chapther1.AboutDuck.Duck;

import chapther1.AboutDuck.Fly.FlyWithWings;
import chapther1.AboutDuck.Quack.Quack;

public class MailardDuck extends Duck {

    public MailardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
