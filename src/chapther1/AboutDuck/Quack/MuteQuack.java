package chapther1.AboutDuck.Quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
