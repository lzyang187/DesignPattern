package strategy;

/**
 * @author: cyli8
 * @date: 2019-04-17 20:13
 */
public class FlyNoWayImpl implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞的实现类");
    }
}
