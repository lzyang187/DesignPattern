package state;

import java.util.Random;

/**
 * 已经投币的状态
 *
 * @author: cyli8
 * @date: 2019-05-29 18:17
 */
public class HasMoneyState implements IState {
    private GumballMachine mMachine;
    private Random mRandom = new Random();

    public HasMoneyState(GumballMachine machine) {
        mMachine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("已经投过币了，请勿重复投币");
    }

    @Override
    public void backMoney() {
        System.out.println("退币成功");
        mMachine.setState(mMachine.mNoMoneyState);
    }

    @Override
    public void turnCrank() {
        System.out.println("转动曲柄成功");
        // 是赢家，并且糖果数量大于等于2，则进入赢家状态
        if (mRandom.nextInt(10) == 0 && mMachine.mGumballCount > 1) {
            mMachine.setState(mMachine.mWinnerState);
        } else {
            mMachine.setState(mMachine.mSoldState);
        }
    }

    @Override
    public void dispense() {
        System.out.println("需要先转动曲柄");
    }
}
