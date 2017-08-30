package patterns.iterator.utiliterator;


import java.util.Iterator;

public class DinerMenu implements Menu{
    // максимальный размер меню
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Вегетарианский обед", "Соевый бекон с салатом и томатами",
                true, 2.99);
        addItem("Стандартный обед", "Бекон с салатом и томатами", false, 2.99);
        addItem("Супчик дня", "Супчик дня с картофельным салатиком",
                false, 3.29);
        addItem("Хотдог", "Хотдог с лучком и сыром", false, 3.05);
        addItem("Паста",
                "Спагетти с соусом Маринара и кусочкам хлеба",
                true, 3.89);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) System.out.println("Невозможно добавить новый" +
                "элемент в меню, т.к. меня полностью заполнено");
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
