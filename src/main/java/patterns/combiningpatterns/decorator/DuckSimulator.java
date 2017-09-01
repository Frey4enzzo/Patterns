package patterns.combiningpatterns.decorator;


public class DuckSimulator {
    public static void main(String[] args) {

        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {

        // упаковываем кажду реализацию в декоратор
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        // гуся не упаковываем, т.к. он не крякает, а мы считаем только кряки уток
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("---- Duck Simulator v 1.2 (with decorator) ----");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("Утки крякнули " + QuackCounter.quackCount + " раз(а)");
    }

    // перегруженная версия simulate имитирует одну утку
    void simulate(Quackable duck) {
        duck.quack();
    }
}
