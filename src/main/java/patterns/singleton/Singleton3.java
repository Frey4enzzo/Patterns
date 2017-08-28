package patterns.singleton;

/**
 * Потокобезопасный синглтон с условной блокировкой
 * Синхронизация требует по минимуму ресурсов, т.к.
 * синхронизация осуществляется только при первом вызове метода getInstance()
 */
public class Singleton3 {

    private static volatile Singleton3 instance;

    public Singleton3() {
    }

    public static Singleton3 getInstance() {

        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
