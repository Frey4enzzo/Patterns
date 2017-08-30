package patterns.templatemethod.barista;


public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            // выполнится только если метод выше вернет true
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Нагреваем воду");
    }

    void pourInCup() {
        System.out.println("Переливаем напиток в чашку");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
