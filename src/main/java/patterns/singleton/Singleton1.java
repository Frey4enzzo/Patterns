package patterns.singleton;

/**
 * Потокобезопасный синглтон, синхронизированный метод getInstance
 */
public class Singleton1 {

    public static Singleton1 instance;

    public Singleton1() {}

    // каждый поток будет ждать своей очереди
    public static synchronized Singleton1 getIntstance() {
        if (instance == null) {
            return new Singleton1();
        } else {
            return instance;
        }
    }
}
