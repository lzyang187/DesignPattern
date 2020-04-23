package state;

/**
 * 已经投币的状态
 *
 * @author: cyli8
 * @date: 2019-05-29 18:17
 */
public class HasMoneyState implements IState {
    private GumballMachine mMachine;

    public HasMoneyState(GumballMachine machine) {
        mMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("已经投过币了，请勿重复投币");
    }

    @Override
    public void backMoney() {
        System.out.println("已经退币");
        mMachine.setState(mMachine.mNoMoneyState);
    }

    @Override
    public void turnCrank() {
        System.out.println("已经转动了曲柄");
        mMachine.setState(mMachine.mSoldState);
    }

    @Override
    public void dispense() {
        System.out.println("需要先转动曲柄");
    }
}
