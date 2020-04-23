package TemplateMethod;

/**
 * @author: cyli8
 * @date: 2019-05-23 16:55
 */
public class Tea extends AbstractBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水浸泡茶叶");
    }

    @Override
    protected void addCondiments() {

    }

    @Override
    boolean needCondiment() {
        return false;
    }
}
