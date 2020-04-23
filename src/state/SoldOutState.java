package state;

/**
 * @author: cyli8
 * @date: 2019-05-29 18:20
 */
public class SoldOutState implements IState {
    private GumballMachine mMachine;

    public SoldOutState(GumballMachine machine) {
        mMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("糖果已售罄，不能投币");
    }

    @Override
    public void backMoney() {
        System.out.println("糖果已售罄，不能退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已售罄，不能转动曲柄");
    }

    @Override
    public void dispense() {
        System.out.println("糖果已售罄，不能售出糖果");
    }
}
