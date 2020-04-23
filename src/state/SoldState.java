package state;

/**
 * 正在发放糖果的状态
 *
 * @author: cyli8
 * @date: 2019-05-29 18:18
 */
public class SoldState implements IState {
    private GumballMachine mMachine;

    public SoldState(GumballMachine machine) {
        mMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("正在售出糖果，请不要投币");
    }

    @Override
    public void backMoney() {
        System.out.println("正在售出糖果，不能退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("正在售出糖果，不能转动曲柄");
    }

    @Override
    public void dispense() {
        System.out.println("成功售出糖果");
        mMachine.mGumballCount--;
        if (mMachine.mGumballCount > 0) {
            mMachine.setState(mMachine.mNoMoneyState);
        } else {
            mMachine.setState(mMachine.mSoldOutState);
        }
    }
}
