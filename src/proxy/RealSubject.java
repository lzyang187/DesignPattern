package proxy;

/**
 * RealSubject（真实对象）：实现了Subject接口，代表真实的业务逻辑。
 */
class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}
