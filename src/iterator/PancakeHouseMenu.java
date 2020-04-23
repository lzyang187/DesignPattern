package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 煎饼屋的菜单，用ArrayList维护菜单集合
 *
 * @author: cyli8
 * @date: 2019-05-23 15:43
 */
public class PancakeHouseMenu implements IMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem(new MenuItem("鸡蛋灌饼", 5));
        addItem(new MenuItem("韭菜盒子", 4));
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        //ArrayList已经实现了Iterator，所以不用自己实现了
        return menuItems.iterator();
    }
}
