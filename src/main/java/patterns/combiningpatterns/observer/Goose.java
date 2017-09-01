package patterns.combiningpatterns.observer;


public class Goose {

    public void honk() {
        System.out.println("Гусь орет!");
    }

    @Override
    public String toString() {
        return "Гусь";
    }
}
