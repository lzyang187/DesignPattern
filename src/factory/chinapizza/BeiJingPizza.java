package factory.chinapizza;

/**
 * @author: cyli8
 * @date: 2019-04-22 20:31
 */
public class BeiJingPizza extends DefaultChinaPizza {
    @Override
    public void bake() {
        System.out.println("京味烘焙");
    }
}
