package patterns.iterator.dinermergercafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class CafeMenu implements Menu{

    Map<String, MenuItem> menuItems = new HashMap();

    public CafeMenu() {
        addItem("Вегитарианский бургер и картошка фри",
                "Вегитарианский бурег с соей, помидорами и картошкой фри",
                true, 3.99);
        addItem("Супчик дня", "Супчик дня и салатик", false, 3.69);
        addItem("Буритто", "Большой буритто с фасолью, сальсой и гуакамоле",
                true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        menuItems.put(menuItem.getName(), menuItem);
    }

    // получаем итератор только для значений коллекции
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
