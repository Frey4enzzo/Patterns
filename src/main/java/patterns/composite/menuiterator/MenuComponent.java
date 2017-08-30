package patterns.composite.menuiterator;


import java.util.Iterator;

public abstract class MenuComponent {

    // Группа "комбинационных методов"
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // Группа "методов операций", используемых MenuItem
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator createIterator();

    // метод реализуется и в Menu так и в MenuItem
    public void print() {
        throw new UnsupportedOperationException();
    }
}
