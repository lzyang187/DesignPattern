package decorator;

/**
 * @author: cyli8
 * @date: 2019-05-13 18:16
 */
public class Mocha extends AbstractCondiment {

    public Mocha(AbstractBeverage beverage) {
        this.beverage = beverage;
        this.size = beverage.size;
    }

    @Override
    String getDesc() {
        return beverage.getDesc() + "摩卡调料" + getSize() + "杯";
    }

    @Override
    double cost() {
        double cost = beverage.cost();
        switch (getSize()) {
            case SMALL:
                cost += 0.3;
                break;
            case MIDUME:
                cost += 0.5;
                break;
            case LARGE:
                cost += 1;
                break;
        }
        return cost;
    }
}
