package chapther1.Duck;

import chapther1.Fly.FlyNoWay;
import chapther1.Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
