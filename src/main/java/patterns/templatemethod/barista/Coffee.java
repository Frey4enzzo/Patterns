package patterns.templatemethod.barista;


public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Пропускаем кофе через фильтр");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем сахарок и молочко");
    }
}
