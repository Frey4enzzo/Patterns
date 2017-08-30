package patterns.iterator.myiterator;


import java.util.ArrayList;

public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;

    // меню заполняется объектами в конструкторе
    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("Фирменный блинный завтрак", "Блины с яйцом и тостом",
                true, 2.99);
        addItem("Стандартный блинный завтрак", "Блины с жареными яйцами и сосиской",
                false, 2.99);
        addItem("Блины с черникой", "Блины со свежими ягодами черники",
                true, 3.49);
        addItem("Вафли", "Вафли с ягодным джемом на выбор",
                true, 3.59);
    }

    // метод добавляет новый элемент в меню
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }


    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
