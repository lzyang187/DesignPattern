package adapter;

/**
 * 绿头鸭
 *
 * @author: cyli8
 * @date: 2019-05-14 18:54
 */
public class MallarDuck implements IDuck {
    @Override
    public void quack() {
        System.out.println("绿头鸭呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("绿头鸭飞");
    }
}
