package singleton;

/**
 * 饿汉式，适用于肯定会创建实例或者创建实例的负担很小的情况
 *
 * @author: cyli8
 * @date: 2019-04-17 19:55
 */
public class HungrySingleton {
    private static HungrySingleton mInstance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return mInstance;
    }
}
