package patterns.command.remote;


public class GarageDoor {

    String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + "Гаражная дверь открывается");
    }

    public void down() {
        System.out.println(location + "Гаражная дверь закрывается");
    }

    public void stop() {
        System.out.println(location + " остановить движение гаражной двери");
    }

}
