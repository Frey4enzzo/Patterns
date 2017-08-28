package patterns.command.remote;


public class KitchenLightOffCommand implements Command{

    Light light;

    public KitchenLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
