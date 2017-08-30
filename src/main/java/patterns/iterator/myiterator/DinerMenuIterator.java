package patterns.iterator.myiterator;

// в этом классе организован процесс перебора
public class DinerMenuIterator implements Iterator{

    MenuItem[] items;
    // текущая позиция перебора в массиве
    int position = 0;

    // конструктор получает массив объектов, для перебора которых созд-ся итератор
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
