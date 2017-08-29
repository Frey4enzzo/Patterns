package patterns.command.remote_undo;


public class TV {

    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " ТВ включен");
    }

    public void off() {
        System.out.println(location + " ТВ выключен");
    }

}
