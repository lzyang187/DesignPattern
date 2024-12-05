package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式
 *
 * @author: cyli8
 * @date: 2019-05-23 15:56
 */
public class Waiter {
    private final List<IMenu> menus;

    public Waiter(List<IMenu> menuList) {
        menus = menuList;
    }

    public void printMenu() {
        for (IMenu menu : menus) {
            printIterator(menu.getIterator());
        }
    }

    private void printIterator(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println("菜名：" + menuItem.name + " 价格：" + menuItem.price);
        }
    }

    public static void main(String[] args) {
        List<IMenu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinnerHouseMenu());
        Waiter waiter = new Waiter(menus);
        waiter.printMenu();
    }
}
