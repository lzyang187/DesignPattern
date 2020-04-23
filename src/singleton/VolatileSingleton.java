package singleton;

/**
 * 双重检查加锁
 *
 * @author: cyli8
 * @date: 2019-04-17 19:50
 */
public class VolatileSingleton {
    private static volatile VolatileSingleton mInstance;

    private VolatileSingleton() {

    }

    public static VolatileSingleton getInstance() {
        if (mInstance == null) {
            synchronized (VolatileSingleton.class) {
                if (mInstance == null) {
                    mInstance = new VolatileSingleton();
                }
            }
        }
        return mInstance;
    }

}
