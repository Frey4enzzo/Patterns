package patterns.proxy.gumball;

/**
 * Этот класс выводит небольшую статистику по конкретному автомату
 */

public class GumballMonitor {

    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("----- ОТЧЕТ О СОСТОЯНИИ -----");
        System.out.println("Местонахождение автомата: " + gumballMachine.getLocation());
        System.out.println("Текущее количество оставшихся шариков: " + gumballMachine.getCount());
        System.out.println("Текущее состояние автомата: " + gumballMachine.getState());
    }

}
