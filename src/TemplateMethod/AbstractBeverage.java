package TemplateMethod;

/**
 * 模板方法模式，在1个方法中定义一套算法的骨架
 *
 * @author: cyli8
 * @date: 2019-05-23 16:44
 */
public abstract class AbstractBeverage {
    public void make() {
        //第1步，烧开水
        boilWater();
        //第2步，用沸水泡饮料
        brew();
        //第3步，把饮料倒入杯子中
        pourInCup();
        //第4步，加入调料
        if (needCondiment()) {
            addCondiments();
        }
    }

    /**
     * 钩子，让子类可以用此钩子控制是否需要加调料
     */
    boolean needCondiment() {
        return false;
    }

    private void boilWater() {
        System.out.println("把水煮沸");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("将饮料倒入杯子中");
    }

    protected void addCondiments() {

    }

}
