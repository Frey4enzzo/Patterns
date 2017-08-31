package patterns.proxy.gumballmonitor;

/**
 * Состояние выигрыша 1 из 10
 */

public class WinnerState implements State{

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Пожалуйста подождите, сейчас вы получите шарик");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Пожалуйста подождите, сейчас вы получите шарик");
    }

    @Override
    public void turnCrank() {
        System.out.println("Дернув рычаг дважды вы не получите бесплатно второй шарик");
    }

    @Override
    public void dispense() {
        System.out.println("Вы счастливчик! Вы получаете второй шарик совершенно бесплатно!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
