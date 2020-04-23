package state;

/**
 * 糖果机
 *
 * @author: cyli8
 * @date: 2019-05-29 18:17
 */
public class GumballMachine {
    public IState mNoMoneyState;
    public IState mHasMoneyState;
    public IState mSoldState;
    public IState mSoldOutState;

    private IState mCurState;
    public int mGumballCount;

    public GumballMachine(int gumballCount) {
        this.mGumballCount = gumballCount;
        mNoMoneyState = new NoMoneyState(this);
        mHasMoneyState = new HasMoneyState(this);
        mSoldState = new SoldState(this);
        mSoldOutState = new SoldOutState(this);
        if (mGumballCount > 0) {
            mCurState = mNoMoneyState;
        } else {
            mCurState = mSoldOutState;
        }
    }

    public void insertMoney() {
        mCurState.insertMoney();
    }

    public void backMoney() {
        mCurState.backMoney();
    }

    public void dispense() {
        mCurState.turnCrank();
        mCurState.dispense();
    }

    public void setState(IState state) {
        mCurState = state;
    }

}
