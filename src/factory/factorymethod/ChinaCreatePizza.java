package factory.factorymethod;

import factory.AbstractPizza;
import factory.chinapizza.AnHuiPizza;
import factory.chinapizza.BeiJingPizza;

/**
 * 中国披萨加盟店
 *
 * @author: cyli8
 * @date: 2019-04-22 20:35
 */
public class ChinaCreatePizza extends AbstractCreatePizza {
    @Override
    protected AbstractPizza createPizza(String type) {
        switch (type) {
            case "anhui":
                return new AnHuiPizza();
            case "beijing":
                return new BeiJingPizza();
            default:
                return null;
        }
    }
}
