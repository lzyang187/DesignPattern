package factory.factorymethod;

import factory.AbstractPizza;

/**
 * 工厂方法模式
 *
 * @author: cyli8
 * @date: 2019-04-22 20:20
 */
public abstract class AbstractCreatePizza {
    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza = createPizza(type);
        if (pizza != null) {
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    protected abstract AbstractPizza createPizza(String type);
}
