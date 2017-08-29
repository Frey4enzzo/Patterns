package patterns.adapter.duck_adapter;


public class DuckTestDrive {
    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        // упаковываем индюшку в адаптер, и она начинает выглядеть как утка
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says...");
        testDuck(duck);

        System.out.println("The turkeyAdapter says...");

        // именно здесь выдаем индюшку за утку
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
