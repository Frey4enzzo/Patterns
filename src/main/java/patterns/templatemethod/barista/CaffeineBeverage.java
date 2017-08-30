package patterns.templatemethod.barista;


public abstract class CaffeineBeverage {

    // субклассы н долдны переопределять этот метод
    // шаблонный метод (шаблон для алгоритма приготовления напитка)
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();
    }

    // субкласс предоставит реализацию метода
    abstract void brew();

    // субкласс предоставит реализацию метода
    abstract void addCondiments();


    void boilWater() {
        System.out.println("Нагреваем воду");
    }

    void pourInCup() {
        System.out.println("Наливаем напиток в чашку");
    }

    // метод - перехватчик
    void hook() {}
}
