package patterns.command.remote_undo;

public class Hottub {

    String location = "";

    public Hottub(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Джкузи включено");
    }

    public void off(){
        System.out.println("Джакузи выключен");
    }
}
