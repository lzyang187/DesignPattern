package state;

/**
 * 状态模式，定义一组糖果机的行为
 */
public interface IState {
    void insertMoney();

    void backMoney();

    void turnCrank();

    void dispense();
}
