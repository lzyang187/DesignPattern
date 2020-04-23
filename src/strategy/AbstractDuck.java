package strategy;

/**
 * 鸭子的父类
 *
 * @author: cyli8
 * @date: 2019-04-17 20:26
 */
public abstract class AbstractDuck {
    private IFlyBehavior mFlyBehavior;
    private IQuackBehavior mQuackBehavior;

    protected void setFlyBehavior(IFlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    protected void setQuackBehavior(IQuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("游泳");
    }

    public void performFly() {
        if (mFlyBehavior != null) {
            mFlyBehavior.fly();
        }
    }

    public void performQuack() {
        if (mQuackBehavior != null) {
            mQuackBehavior.quack();
        }
    }

    abstract void display();

}
