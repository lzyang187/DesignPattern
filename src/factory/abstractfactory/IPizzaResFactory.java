package factory.abstractfactory;

/**
 * 抽象工厂模式：定义一个负责创建一组产品的接口，这个接口中的每个方法都负责创建一个具体产品。
 * 抽象工厂的方法经常以工厂方法的方式实现
 */
public interface IPizzaResFactory {
    IClams createClams();
}
