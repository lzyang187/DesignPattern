package strategy;

/**
 * 策略模式定义了策略接口和不同的策略实现，根据所需选择对应的策略实现类。主要目的是将策略的实现和策略的选择分离，达到解耦的目的。
 *
 * @author: cyli8
 * @date: 2019-04-17 20:32
 */
public class RubberDuck extends AbstractDuck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWayImpl());
        setQuackBehavior(new MuteQuackImpl());
    }

    @Override
    void display() {

    }
}
