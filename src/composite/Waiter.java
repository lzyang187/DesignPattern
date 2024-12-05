package composite;

/**
 * @author: cyli8
 * @date: 2019-05-28 18:55
 */
public class Waiter {
    private final AbstractMenuComponent component;

    public Waiter(AbstractMenuComponent component) {
        this.component = component;
    }

    public void print() {
        System.out.println(component.print());
    }
}
