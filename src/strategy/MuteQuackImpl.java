package strategy;

/**
 * @author: cyli8
 * @date: 2019-04-17 20:19
 */
public class MuteQuackImpl implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫的实现");
    }
}
