package composite;

/**
 * 菜单项的实现
 *
 * @author: cyli8
 * @date: 2019-05-28 18:34
 */
public class MenuItem extends AbstractMenuComponent {
    private final double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    String print() {
        return "菜单项：" + name + "\n";
    }

    @Override
    double getPrice() {
        return price;
    }

    /**
     * 对于菜单项来说，这些方法没有意义，因为已经是叶子节点，没有子节点了
     */
    @Override
    void add(AbstractMenuComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    void remove(AbstractMenuComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    AbstractMenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

}
