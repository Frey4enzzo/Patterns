package patterns.command.remote;


public class CeilingFan {

    String location = "";

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " потолочный вентилятор включен");
    }

    public void off() {
        System.out.println(location + " потолочный вентилятор выключен");
    }
}
