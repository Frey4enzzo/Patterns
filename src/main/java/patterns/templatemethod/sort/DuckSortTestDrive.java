package patterns.templatemethod.sort;


import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {

        Duck[] ducks = {new Duck("Duffy", 8),
                        new Duck("Billy", 2),
                        new Duck("Dilly", 4),
                        new Duck("Willy", 4),
                        new Duck("Donald", 6)};


        System.out.println("До сортировки");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("После сортировки");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
