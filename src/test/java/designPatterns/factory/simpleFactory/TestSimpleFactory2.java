package designPatterns.factory.simpleFactory;

/**
 * 测试第二种简单工厂模式
 * @ClassName TestSimpleFactory2
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/27
 * @Version V1.0
 **/
public class TestSimpleFactory2 {

    public static void main(String[] args) {
        CarFactory2.createAudi().run();
        CarFactory2.createByd().run();

    }
}