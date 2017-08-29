package patterns.command.remote_undo_with_state;


public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    // в локальной переменной хранится скорость вращения вентилятора
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + " скорость вентилятора HIGH");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + " скорость вентилятора MEDIUM");
    }

    public void low() {
        speed = LOW;
        System.out.println(location + " скорость вентилятора LOW");
    }

    public void off() {
        speed = OFF;
        System.out.println(location + " потолочный вентилятор выключен");
    }

    // получение текущей скорости
    public int getSpeed() {
        return speed;
    }
}
