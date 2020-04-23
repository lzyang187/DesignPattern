package factory.chinapizza;

/**
 * @author: cyli8
 * @date: 2019-04-22 20:30
 */
public class AnHuiPizza extends DefaultChinaPizza {
    @Override
    public void bake() {
        System.out.println("徽味烘焙");
    }
}
