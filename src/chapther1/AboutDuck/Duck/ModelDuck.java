package chapther1.AboutDuck.Duck;

import chapther1.AboutDuck.Fly.FlyNoWay;
import chapther1.AboutDuck.Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
