package designPatterns.creationMode.factory.abstractFactory;

import designPatterns.creationMode.factory.abstractFactory.engine.Engine;

/**
 * 测试抽象工厂模式
 * @ClassName TestAbstractFactory
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class TestAbstractFactory {

    public static void main(String[] args) {
        CarFactory luxuryCar = new LuxuryFactory();
        Engine e = luxuryCar.createEngine();
        e.run();
        e.start();
    }
}