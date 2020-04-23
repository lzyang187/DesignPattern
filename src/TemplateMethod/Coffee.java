package TemplateMethod;

/**
 * @author: cyli8
 * @date: 2019-05-23 16:56
 */
public class Coffee extends AbstractBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
