package adapter;

/**
 * 把火鸡伪装成绿头鸭的适配器。
 * 适配器和外观模式都可以包装或转换一个类或多个类，他们的区别是适配器的意图是将接口转换成目标接口，
 * 而外观模式的意图是简化接口
 *
 * @author: cyli8
 * @date: 2019-05-14 18:56
 */
public class TurkeyAdapter implements IDuck {
    ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
