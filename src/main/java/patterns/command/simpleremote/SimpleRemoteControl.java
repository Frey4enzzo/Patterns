package patterns.command.simpleremote;


public class SimpleRemoteControl {

    // одна ячейка на одно управляемое устройства
    Command slot;

    public SimpleRemoteControl() {
    }

    // метод для назначения команды
    public void setCommand(Command command) {
        slot = command;
    }

    // метод вызываемый при нажатии кнопки
    public void buttonWasPressed() {
        slot.execute();
    }
}
