package factory;

/**
 * 生成披萨的入口
 *
 * @author: cyli8
 * @date: 2019-04-22 20:14
 */
public class CreatePizza {
    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza = SimplePizzaFactory.getPizza(type);
        if (pizza != null) {
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}
