package patterns.proxy.gumball;

/**
 * Состояние, когда вставили монетку и дернули за рычаг
 */

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Подождите, сейчас вы получите шарик");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Извините, вы не можете вернуть монетку, т.к. уже дернули за рычаг");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы дернули рычаг второй раз, но второй шарик бесплатно вы не получите");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {   // проверяем кол-во оставшихся шариков в автомате
            gumballMachine.setState(gumballMachine.getNoQuarterState()); // если шарики еще есть
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState()); // если шарики закончились
        }
    }
}
