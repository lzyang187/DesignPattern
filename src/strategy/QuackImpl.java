package strategy;

/**
 * @author: cyli8
 * @date: 2019-04-17 20:15
 */
public class QuackImpl implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫的实现");
    }
}
