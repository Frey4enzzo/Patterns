package patterns.command.simpleremote;

// RemoteControlTest - клиент в терминологии паттерна
public class RemoteControlTest {
    public static void main(String[] args) {

        // Объект remote - инициатор, ему будет передаваться объект команды
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // создаем объект Light, который будет получателем запроса
        Light light = new Light();

        // создание команды с указанием получателя
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        // команда передается инициатору
        remote.setCommand(lightOn);

        // имитация нажатия на кнопку
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
