package factory.chinapizza;

import factory.AbstractPizza;
import factory.abstractfactory.ChinaPizzaResFactory;

/**
 * @author: cyli8
 * @date: 2019-04-22 20:11
 */
public class DefaultChinaPizza extends AbstractPizza {

    public DefaultChinaPizza() {
        this.factory = new ChinaPizzaResFactory();
    }

    @Override
    public void bake() {
        System.out.println("默认的中式烘焙");
    }
}
