package patterns.iterator.utiliterator;

import java.util.Iterator;

/**
 * Этот интерфейс является решением проблемы зависимости
 * Waitress от MenuItems
 */

public interface Menu {

    public Iterator createIterator();
}
