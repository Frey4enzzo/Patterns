package patterns.decorator.starbacks;

/**
 * Паттерн Декоратор динамически наделяет объект новыми возможностями
 * и является гибкой альтернативой субклассированию в области
 * расширения функциональности. Класс Beverage субклассируется только
 * для приведения к нужному типу, а не для наследования его поведения.
 * Поведение формируется в результате композиции декораторов с базовыми
 * компонентами и другими декораторами/
 */

public abstract class Beverage {

    static final int SMALL = 1;
    static final int MEDIUM = 2;
    static final int LARGE = 3;

    String description = "Абстрактный напток";
    int size;

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract double cost();
}
