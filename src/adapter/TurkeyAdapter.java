package adapter;

/**
 * 把火鸡伪装成绿头鸭的适配器
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
