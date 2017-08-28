package patterns.factory.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    void prepare() {
        System.out.println("Готовим пиццу " + name);
        System.out.println("Месим тесто...");
        System.out.println("Намазываем соус...");
        System.out.println("Добавляем топпинги: ");
        for (Object topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    void bake() {
        System.out.println("Готовим 25 минут при температуре 350 градусов");
    }

    void cut() {
        System.out.println("Нарезаем пиццу на 8 кусков");
    }

    void box() {
        System.out.println("Упаковываем в коробку");
    }
}
