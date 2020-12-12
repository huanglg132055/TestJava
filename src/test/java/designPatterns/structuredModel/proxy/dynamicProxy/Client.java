package designPatterns.structuredModel.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);

        proxy.sing();
    }
}
