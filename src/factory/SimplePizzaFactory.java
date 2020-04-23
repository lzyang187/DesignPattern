package factory;

import factory.chinapizza.DefaultChinaPizza;
import factory.usapizza.DefaultUSAPizza;

/**
 * 简单工厂模式
 *
 * @author: cyli8
 * @date: 2019-04-22 20:04
 */
public class SimplePizzaFactory {

    public static AbstractPizza getPizza(String type) {
        switch (type) {
            case "china":
                return new DefaultChinaPizza();
            case "usa":
                return new DefaultUSAPizza();
            default:
                return null;
        }
    }
}
