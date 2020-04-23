package iterator;

import java.util.Iterator;

/**
 * 系统的数组未实现迭代器，所以这里需要实现
 *
 * @author: cyli8
 * @date: 2019-05-23 16:04
 */
public class ArrayIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int index;

    public ArrayIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return index < menuItems.length && menuItems[index] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[index];
        index++;
        return menuItem;
    }
}
