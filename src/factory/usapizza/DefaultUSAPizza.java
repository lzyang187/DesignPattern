package factory.usapizza;

import factory.AbstractPizza;
import factory.abstractfactory.UsaPizzaResFactory;

/**
 * @author: cyli8
 * @date: 2019-04-22 20:12
 */
public class DefaultUSAPizza extends AbstractPizza {

    public DefaultUSAPizza() {
        this.factory = new UsaPizzaResFactory();
    }
}
