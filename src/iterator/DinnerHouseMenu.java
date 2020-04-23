package iterator;

import java.util.Iterator;

/**
 * 正餐屋的菜单，用数组维护菜单集合
 *
 * @author: cyli8
 * @date: 2019-05-23 15:48
 */
public class DinnerHouseMenu implements IMenu {
    public static final int MENU_ITEM_SIZE = 3;
    private MenuItem[] menuItems;
    private int index = 0;

    public DinnerHouseMenu() {
        menuItems = new MenuItem[MENU_ITEM_SIZE];
        addItem(new MenuItem("油焖大虾", 50));
        addItem(new MenuItem("木须肉", 30));
    }

    public void addItem(MenuItem menuItem) {
        if (index < MENU_ITEM_SIZE) {
            menuItems[index] = menuItem;
            index++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return new ArrayIterator(menuItems);
    }

}
