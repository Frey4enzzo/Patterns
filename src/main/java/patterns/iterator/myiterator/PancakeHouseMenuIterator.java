package patterns.iterator.myiterator;


import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

    ArrayList<MenuItem> itemList;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public boolean hasNext() {
        if (position >= itemList.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = itemList.get(position);
        position += 1;
        return menuItem;
    }
}
