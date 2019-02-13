package chapther6;

/**
 * Created by steel on 2019/2/13.
 */
public class LightOnCommand implements Command
{
    Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void excute()
    {
        light.on();
    }

    @Override
    public void undo()
    {
        light.off();
    }
}
