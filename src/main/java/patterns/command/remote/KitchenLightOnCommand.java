package patterns.command.remote;


public class KitchenLightOnCommand implements Command{

    Light light;

    public KitchenLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
