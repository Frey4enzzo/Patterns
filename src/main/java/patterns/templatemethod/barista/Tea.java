package patterns.templatemethod.barista;


public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Завариваем чаёк");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем лимончик");
    }
}
