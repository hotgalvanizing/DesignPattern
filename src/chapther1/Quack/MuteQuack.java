package chapther1.Quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
