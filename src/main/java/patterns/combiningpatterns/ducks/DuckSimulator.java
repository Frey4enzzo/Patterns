package patterns.combiningpatterns.ducks;


public class DuckSimulator {
    public static void main(String[] args) {

        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("---- Duck Simulator v 1.0 ----");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    // перегруженная версия simulate имитирует одну утку
    void simulate(Quackable duck) {
        duck.quack();
    }
}
