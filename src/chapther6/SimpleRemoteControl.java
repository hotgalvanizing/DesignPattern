package chapther6;

/**
 * Created by steel on 2019/2/13.
 */
public class SimpleRemoteControl
{
    Command slot;

    public SimpleRemoteControl()
    {
    }

    public void setSlot(Command slot)
    {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.excute();
    }
}
