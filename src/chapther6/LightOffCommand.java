package chapther6;

/**
 * Created by steel on 2019/2/13.
 */
public class LightOffCommand implements Command
{
    Light light;

    public LightOffCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void excute()
    {
        light.off();
    }

    @Override
    public void undo()
    {
        light.on();
    }
}
