package patterns.singleton;

/**
 * Потокобезопасный синглтон с ранней инициализацией
 */
public class Singleton2 {

    // статическая инициализация гарантирует потоковую безопасность
    private static Singleton2 instance = new Singleton2();

    public Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
