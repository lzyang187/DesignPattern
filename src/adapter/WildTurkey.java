package adapter;

/**
 * @author: cyli8
 * @date: 2019-05-14 18:55
 */
public class WildTurkey implements ITurkey {
    @Override
    public void gobble() {
        System.out.println("火鸡咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("火鸡飞");
    }
}
