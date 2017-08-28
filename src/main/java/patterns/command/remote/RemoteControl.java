package patterns.command.remote;

/**
 * Инициатор (Invoker)
 */
public class RemoteControl {

    // семь команд включения для 7 устройств
    Command[] onCommands;
    // семь команд выключения для 7 устройств
    Command[] offCommands;

    // конструктор создает экземпляры команд и инициализирует массивы
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    // метод получает ячейку и команды включения\выключения для этой ячейки
    // команды сохраняются в массивах для последующего использвания
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // имитация кнопки Вкл. на пульте
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    // имитация кнопки Выкл. на пульте
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
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
