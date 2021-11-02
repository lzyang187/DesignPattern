package factory.factorymethod;

import factory.AbstractPizza;

/**
 * 工厂方法模式：使用继承将对象创建委托给子类，子类实现工厂方法来创建对象
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
