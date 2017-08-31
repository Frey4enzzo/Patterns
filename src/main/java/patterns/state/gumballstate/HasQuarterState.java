package patterns.state.gumballstate;

import java.util.Random;

/**
 * Состояние, когда в автомат вставлена монетка
 */

public class HasQuarterState implements State{
    // генератор случайного выигрыша с вероятностью 10%
    Random randomWinner = new Random(System.currentTimeMillis());

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    // некорректное действие для этого состояния
    public void insertQuarter() {
        System.out.println("Вы уже вставили монетку. Нельзя засунуть сразу 2 монетки");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Вы вернули монетку");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы дернули за рычаг");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    // некорректное действие для состояния
    public void dispense() {
        System.out.println("Шарик не выдан");
    }
}
