package patterns.templatemethod.barista;


public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Делаем чай");
        tea.prepareRecipe();

        System.out.println("Делаем кофеек");
        coffee.prepareRecipe();
        System.out.println("------ WITH HOOK ---------");

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("---Готовим Чай");
        teaHook.prepareRecipe();
        System.out.println("---Готовим Кофе");
        coffeeHook.prepareRecipe();
    }
}
