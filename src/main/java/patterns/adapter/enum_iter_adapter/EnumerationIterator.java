package patterns.adapter.enum_iter_adapter;

import java.util.Enumeration;
import java.util.Iterator;

// адаптер будет восприниматься как Итератор
public class EnumerationIterator implements Iterator {

    // адаптируемый объект
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
