package chapther1.AboutDuck.Duck;

import chapther1.AboutDuck.Fly.FlyBehavior;
import chapther1.AboutDuck.Quack.QuackBehavior;

public abstract class Duck {

    public Duck() {
    }

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void preformFly(){
        flyBehavior.fly();
    }

    public void preformQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All Duck Can Swim !");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
