package TemplateMethod;

/**
 * @author: cyli8
 * @date: 2019-05-23 16:58
 */
public class Test {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.make();

        Coffee coffee = new Coffee();
        coffee.make();
    }
}
