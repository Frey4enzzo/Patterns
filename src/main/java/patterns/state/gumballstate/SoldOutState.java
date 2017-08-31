package patterns.state.gumballstate;

/**
 * Состояние, когда в автомате нет шариков
 */

public class SoldOutState implements State{

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Извините, но шариков нет в наличии");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Вы не можете вернуть монетку, сначала надо её вставить");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы дернули за рычаг, но в автомате нет шариков");
    }

    @Override
    public void dispense() {
        System.out.println("Шарик не выдан");
    }
}
