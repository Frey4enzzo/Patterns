package patterns.combiningpatterns.absfactory;


public class DuckSimulator {
    public static void main(String[] args) {

        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory factory) {

        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("---- Duck Simulator v 1.3 (with AbstractFactory) ----");

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
