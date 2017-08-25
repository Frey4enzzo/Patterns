package patterns.observer.my_realization;

/**
 * Интерфейс Observer реализуется всеми наблюдателями
 */

public interface Observer {

    void update(float temp, float humidity, float pressure);
}
