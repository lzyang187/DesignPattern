package state;

/**
 * 状态模式，定义一组糖果机的行为
 */
public interface IState {
    void insertMoney();

    void backMoney();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
