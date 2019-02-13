package chapther6;

/**
 * Created by steel on 2019/2/13.
 */
public class RemoteControlWithUndo
{
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo()
    {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int solt,Command onCommand,Command offCommand){
        onCommands[solt] = onCommand;
        offCommands[solt] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        if (onCommands[slot] != null){
            onCommands[slot].excute();
            undoCommand = onCommands[slot];
        }
    }

    public void offButtonWasPushed(int slot){
        if (offCommands[slot] != null){
            offCommands[slot].excute();
            undoCommand = offCommands[slot];
        }
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
