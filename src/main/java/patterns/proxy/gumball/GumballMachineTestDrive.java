package patterns.proxy.gumball;


public class GumballMachineTestDrive {
    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine("Звездный городок",10);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();

        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
    }
}
