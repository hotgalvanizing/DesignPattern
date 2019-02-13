package chapther6;

/**
 * Created by steel on 2019/2/13.
 */
public class RemoteControlTest
{
    public static void main(String[] args)
    {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setSlot(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}
