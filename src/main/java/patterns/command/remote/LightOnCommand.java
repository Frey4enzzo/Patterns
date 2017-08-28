package patterns.command.remote;


/**
 * Реализация команды для включения света.
 * Класс любой команды должен реализовать интерфейс Command
 */

public class LightOnCommand implements Command {

    Light light;

    // В переменную light будет передаваться конкретный объект Light
    // которым будет управлять команда
    public LightOnCommand(Light light) {
        this.light = light;
    }

    // Вызывается метод on() объекта-получателя комманды
    public void execute() {
        light.on();
    }
}
