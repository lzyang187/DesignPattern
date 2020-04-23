package decorator;

/**
 * @author: cyli8
 * @date: 2019-05-13 18:20
 */
public class Whip extends AbstractCondiment {

    public Whip(AbstractBeverage beverage) {
        this.beverage = beverage;
        this.size = beverage.size;
    }

    @Override
    String getDesc() {
        return beverage.getDesc() + "奶泡调料" + getSize() + "杯";
    }

    @Override
    double cost() {
        double cost = beverage.cost();
        switch (getSize()) {
            case SMALL:
                cost += 0.7;
                break;
            case MIDUME:
                cost += 1;
                break;
            case LARGE:
                cost += 2;
                break;
        }
        return cost;
    }
}
