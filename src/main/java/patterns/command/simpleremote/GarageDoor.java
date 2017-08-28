package patterns.command.simpleremote;


public class GarageDoor {

    public GarageDoor() {
    }

    public void up() {
        System.out.println("Открываем гаражную дверь");
    }

    public void down() {
        System.out.println("Закрываем гаражную дверь");
    }

    public void stop() {
        System.out.println("Остановить дверь!");
    }

    public void lightOn() {
        System.out.println("Включить освещение гаражной двери");
    }

    public void lightOff() {
        System.out.println("Выключить освещение гаражной двери");
    }
}
