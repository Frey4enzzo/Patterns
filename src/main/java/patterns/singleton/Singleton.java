package patterns.singleton;

/**
 * Singleton (Одиночка) - гарантирует, что класс имеет только один экземпляр,
 * и  предоставляет глобальную точку доступа к этому экземпляру
 */

public class Singleton {

    // Статическая переменная для хранения единственного экземпляра
    // служит глобальной точкой для доступа к единственному экземпляру
    private static Singleton instance;

    // Приватный конструктор не позволяет создавать экзмеляры класса
    private Singleton() {
    }

    // только в этом методе создается и/или возвращается единственный экземпляр класса
    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        } else {
            return instance;
        }
    }
}
