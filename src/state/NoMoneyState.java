package state;

/**
 * 没有投币的状态
 *
 * @author: cyli8
 * @date: 2019-05-29 18:16
 */
public class NoMoneyState implements IState {
    private GumballMachine mMachine;

    public NoMoneyState(GumballMachine machine) {
        mMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("用户投币");
        mMachine.setState(mMachine.mHasMoneyState);
    }

    @Override
    public void backMoney() {
        System.out.println("尚未投币，不能退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("尚未投币，不能转动曲柄");
    }

    @Override
    public void dispense() {
        System.out.println("尚未投币，不能售出糖果");
    }
}
