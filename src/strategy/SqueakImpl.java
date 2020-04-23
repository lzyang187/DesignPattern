package strategy;

/**
 * @author: cyli8
 * @date: 2019-04-17 20:18
 */
public class SqueakImpl implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭吱吱叫的实现");
    }
}
