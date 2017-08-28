package patterns.command.simpleremote;


public class Light {

    public Light() {
    }

    public void on(){
        System.out.println("Свет включен");
    }

    public void off() {
        System.out.println("Свет выключен");
    }
}
