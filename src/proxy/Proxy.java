package proxy;

/**
 * 代理模式（Proxy Pattern）为其他对象提供一种代理以控制对这个对象的访问。特点是
 * 1、控制访问：可以在代理中添加访问控制逻辑。
 * 2、增强功能：可以在代理中添加额外的功能，如日志记录、性能监控等。
 * Proxy（代理对象）：持有对RealSubject的引用，并控制对其访问。
 */
class Proxy implements Subject {
    private RealSubject realSubject;

    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        // 可以添加额外的逻辑
        System.out.println("Proxy: Logging before request.");
        realSubject.request();
        System.out.println("Proxy: Logging after request.");
    }
}
