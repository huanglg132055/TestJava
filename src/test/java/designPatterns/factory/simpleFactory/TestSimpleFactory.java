package designPatterns.factory.simpleFactory;

/**
 * 测试第一种简单工厂模式
 * @ClassName TestSimpleFactory
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/27
 * @Version V1.0
 **/
public class TestSimpleFactory {

    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("奥迪");
        Car car2 = CarFactory.createCar("比亚迪");

        car1.run();
        car2.run();
    }
}