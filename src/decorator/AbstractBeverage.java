package decorator;

/**
 * @author: cyli8
 * @date: 2019-05-13 18:09
 */
public abstract class AbstractBeverage {

    public static final int SMALL = 1;
    public static final int MIDUME = 2;
    public static final int LARGE = 3;

    int size;

    String desc;

    abstract String getDesc();

    abstract double cost();

    int getSize() {
        return size;
    }

}
