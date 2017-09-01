package patterns.combiningpatterns.observer;


public class DuckSimulator {
    public static void main(String[] args) {

        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory factory) {

        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("---- Duck Simulator v 1.5 (with observer) ----");

        // общая стая для всех уток и даже гуся
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("Утки крякнули " + QuackCounter.quackCount + " раз(а)");
    }

    // перегруженная версия simulate имитирует одну утку
    void simulate(Quackable duck) {
        duck.quack();
    }
}
