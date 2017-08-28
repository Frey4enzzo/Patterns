package patterns.command.remote;


public class Light {

    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " свет включен");
    }

    public void off() {
        System.out.println(location + " свет выключен");
    }
}
