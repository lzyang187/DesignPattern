package strategy;

/**
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
