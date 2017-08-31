package patterns.proxy.gumballmonitor;

/**
 *  Контекст - класс с несколькими внутренними состояниями
 */

public class GumballMachine {

    // все возможные состояния
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    // переменная для хранения текущего состояния
    State state = soldOutState;
    // количество шариков, изначально автомат пуст
    int count = 0;

    // конструктор
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    // Setter позволяет объектам State перевести автомат в другое состояние
    public void setState(State state) {
        this.state = state;
    }

    // операция делигируется объекту текущего состояния
    public void insertQuarter() {
        state.insertQuarter();
    }

    // операция делигируется объекту текущего состояния
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    // операция делигируется объекту текущего состояния
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    // вспомогательный метод (отпускает шарик и декриментит счетчик шариков)
    void releaseBall() {
        System.out.println("Сейчас шарик появится в выдаче....");
        if (count != 0) {
            count -= 1;
        }
    }

    // заполняет автомат шариками на указанное количество count
    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    // GETTERS
    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " Gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
