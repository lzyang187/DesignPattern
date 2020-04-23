package composite;

/**
 * 组合模式，组合了菜单和菜单项
 *
 * @author: cyli8
 * @date: 2019-05-28 18:28
 */
public abstract class AbstractMenuComponent {

    public String name;

    abstract String print();

    /**
     * 菜单项的方法
     */
    abstract double getPrice();

    /**
     * 菜单的方法，包含子菜单
     */

    abstract void add(AbstractMenuComponent component);

    abstract void remove(AbstractMenuComponent component);

    abstract AbstractMenuComponent getChild(int index);
}
