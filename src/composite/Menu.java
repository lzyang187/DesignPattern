package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cyli8
 * @date: 2019-05-28 18:37
 */
public class Menu extends AbstractMenuComponent {

    private List<AbstractMenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    String print() {
        //递归调用，打印
        StringBuilder sb = new StringBuilder();
        sb.append("菜单：").append(name).append("包含以下子菜单：{\n");
        for (AbstractMenuComponent menuComponent : menuComponents) {
            sb.append(menuComponent.print());
        }
        return sb.toString() + "}\n";
    }

    /**
     * 对于菜单来说，没有价格
     */
    @Override
    double getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    void add(AbstractMenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    void remove(AbstractMenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    AbstractMenuComponent getChild(int index) {
        if (index >= 0 && index < menuComponents.size()) {
            return menuComponents.get(index);
        }
        return null;
    }
}
