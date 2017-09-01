package patterns.combiningpatterns.adapter;


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
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("---- Duck Simulator v 1.1 (with goose adapter) ----");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    // перегруженная версия simulate имитирует одну утку
    void simulate(Quackable duck) {
        duck.quack();
    }
}
