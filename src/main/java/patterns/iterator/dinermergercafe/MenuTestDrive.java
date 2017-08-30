package patterns.iterator.dinermergercafe;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();

        System.out.println("\n----- Переработанная официантка AlterWeitress -----\n");

        ArrayList<Menu> listMenus = new ArrayList<>();
        listMenus.add(pancakeHouseMenu);
        listMenus.add(dinerMenu);
        listMenus.add(cafeMenu);
        AlterWaitress alterWaitress = new AlterWaitress(listMenus);
        alterWaitress.printMenu();
    }
}
