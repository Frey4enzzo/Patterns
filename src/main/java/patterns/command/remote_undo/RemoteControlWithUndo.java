package patterns.command.remote_undo;


public class RemoteControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    // переменная для хранения последней выполненной операции
    Command undoCommand;

    // конструктор
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // имитируем нажатие кнопки
    public void onButtonWasPushed(int slot) {
        // читаем и выполняем команду
        onCommands[slot].execute();
        // сохраняем в переменную ссылку на выполненную команду
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    // отменяет операцию последней выполненной команды
    public void undoButtonEasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
