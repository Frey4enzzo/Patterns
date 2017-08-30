package patterns.iterator.dinermergercafe;


import java.util.ArrayList;
import java.util.Iterator;

public class AlterWaitress {

    ArrayList<Menu> menus;

    public AlterWaitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    // перебираем объекты меню, передавая итератор каждого объекта
    // перегруженному методу printMenu()
    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
