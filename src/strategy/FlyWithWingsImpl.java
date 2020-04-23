package strategy;

/**
 * @author: cyli8
 * @date: 2019-04-17 20:12
 */
public class FlyWithWingsImpl implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("用翅膀飞的实现类");
    }
}
