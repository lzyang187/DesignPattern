package factory.abstractfactory;

/**
 * @author: cyli8
 * @date: 2019-04-29 19:34
 */
public class ChinaPizzaResFactory implements IPizzaResFactory {
    @Override
    public IClams createClams() {
        return new RefreshClam();
    }
}
