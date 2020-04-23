package factory.usapizza;

/**
 * @author: cyli8
 * @date: 2019-04-22 20:32
 */
public class LosPizza extends DefaultUSAPizza {
    @Override
    public void bake() {
        System.out.println("洛杉矶烘焙");
    }
}
