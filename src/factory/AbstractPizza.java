package factory;

import factory.abstractfactory.IClams;
import factory.abstractfactory.IPizzaResFactory;

/**
 * @author: cyli8
 * @date: 2019-04-22 20:05
 */
public abstract class AbstractPizza {
    private String name;
    private IClams clams;
    protected IPizzaResFactory factory;

    private void prepar() {
        clams = factory.createClams();
    }

    public void bake() {
        System.out.println("烘焙");
    }

    public void cut() {
        System.out.println("切比萨");
    }

    public void box() {
        System.out.println("将比萨打包");
    }
}
