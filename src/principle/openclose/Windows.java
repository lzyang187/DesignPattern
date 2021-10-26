package principle.openclose;

/**
 * 类应该对拓展开放，对修改关闭
 * 可以通过“抽象约束、封装变化”来实现开闭原则，即通过接口或者抽象类为软件实体定义一个相对稳定的抽象层，
 * 而将相同的可变因素封装在相同的具体实现类中。
 *
 * @author: cyli8
 * @date: 2019-04-30 11:04
 */
public class Windows {
    private ITheme theme;

    public void setTheme(ITheme theme) {
        this.theme = theme;
    }

    public void display() {
        if (theme != null) {
            theme.display();
        }
    }
}
