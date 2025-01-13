package proxy;

/**
 * 客户端代码
 */
public class Client {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
