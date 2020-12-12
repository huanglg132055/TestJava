package designPatterns.structuredModel.proxy.staticProxy;

/**
 * 测试静态代理类
 */
public class TestStaticProxy {

    public static void main(String[] args) {
        Star real = new RealStar();
        Star star = new ProxyStar(real);

        star.confer();
        star.signConstract();
        star.bookTicket();
        star.sing();
        star.collectMoney();
    }
}
