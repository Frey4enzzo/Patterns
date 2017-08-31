package patterns.state.gumball;


public class GumballMachine {
    // 4 состояния
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    // текущее состоние, по умолчанию нет шариков
    int state = SOLD_OUT;
    // кол-во шариков в автомате
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) state = NO_QUARTER;
    }

    // бросаем монетку в автомат
    public void insertQuarter() {
        if (state == HAS_QUARTER) {  // если в автомате уже есть монетка
            System.out.println("Вы не можете вставить еще одну монетку");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("Вы засунули монетку");
        } else if (state == SOLD_OUT){
            System.out.println("Вы не можете вставить монетку, товара нет в наличии");
        } else if (state == SOLD) {
            System.out.println("Пожалуйста подождите, сейчас вы получите шарик с жвачкой");
        }
    }

    // если покупатель пытается вернуть монетку
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Деньги возвращены покупателю");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("Сначала вы должны засунуть монетку");
        } else if (state == SOLD) {
            System.out.println("Извините, но покупка уже была совершена");
        } else if (state == SOLD_OUT) {
            System.out.println("Вы не можете вернуть деньги, т.к. автомат не принимает деньги");
        }
    }

    // покупатель дергает за рычаг
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Вы уже получили товар");
        } else if (state == NO_QUARTER) {
            System.out.println("Необходимо сначала положить монетку в автомат");
        } else if (state == SOLD_OUT) {
            System.out.println("Выдача невозможна, в автомате нет шариков");
        } else if (state == HAS_QUARTER) {
            System.out.println("Держите ваш шарик жвачки");
            state = SOLD;
            dispense();
        }
    }

    // вызывается для выдачи шарика
    public void dispense() {
        if (state == SOLD) {
            System.out.println("Выдача покупки");
            count = count - 1;
            if (count == 0) {
                System.out.println("Шарики кончились");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("Сначала вы должны заплатить");
        } else if (state == SOLD_OUT) {
            System.out.println("Нет шариков для выдачи");
        } else if (state == HAS_QUARTER) {
            System.out.println("Нет шариков для выдачи");
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " Gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a Gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
