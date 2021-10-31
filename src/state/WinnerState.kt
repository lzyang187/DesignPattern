package state

/**
 * 赢家状态：有10%的几率每次转动曲柄获得两枚糖果
 */
class WinnerState(private val mMachine: GumballMachine) : IState {

    override fun insertMoney() {
        println("正在售出糖果，请不要投币")
    }

    override fun backMoney() {
        println("正在售出糖果，不能退币")
    }

    override fun turnCrank() {
        println("正在售出糖果，不能转动曲柄")
    }

    override fun dispense() {
        println("成功售出第一枚糖果")
        mMachine.mGumballCount--
        if (mMachine.mGumballCount > 0) {
            println("赢家，再获得一枚糖果")
            mMachine.mGumballCount--
            if (mMachine.mGumballCount > 0) {
                mMachine.setState(mMachine.mNoMoneyState)
            } else {
                mMachine.setState(mMachine.mSoldOutState)
            }
        } else {
            mMachine.setState(mMachine.mSoldOutState)
        }
    }
}