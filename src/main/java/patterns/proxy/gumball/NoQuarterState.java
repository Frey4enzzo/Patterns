package patterns.proxy.gumball;

/**
 * Состояние, когда в автомате нет монетки
 */

public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    // если бросили монетку в автомат
    public void insertQuarter() {
        System.out.println("Вы вставили монетку");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    // если пытаются вернуть монетку
    public void ejectQuarter() {
        System.out.println("Вы не вставили монетку");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы дернули за рычаг, но не вставили монетку");
    }

    @Override
    public void dispense() {
        System.out.println("Сначала надо вставить монетку в автомат");
    }

    @Override
    public String toString() {
        return "в ожидании когда бросят монетку";
    }
}
