package decorator;

/**
 * 饮料浓缩咖啡，被装饰者
 *
 * @author: cyli8
 * @date: 2019-05-13 18:11
 */
public class Espresso extends AbstractBeverage {
    public Espresso(int size) {
        this.size = size;
        this.desc = "浓缩咖啡" + size + "杯";
    }

    @Override
    String getDesc() {
        return desc;
    }

    @Override
    double cost() {
        switch (size) {
            case SMALL:
                return 3;
            case MIDUME:
                return 5;
            default:
                return 10;
        }
    }

    @Override
    int getSize() {
        return size;
    }
}
