package factory.factorymethod;

import factory.AbstractPizza;
import factory.usapizza.LosPizza;

/**
 * @author: cyli8
 * @date: 2019-04-22 20:36
 */
public class USACreatePizza extends AbstractCreatePizza {
    @Override
    protected AbstractPizza createPizza(String type) {
        switch (type) {
            case "los":
                return new LosPizza();
            default:
                return null;
        }
    }
}
