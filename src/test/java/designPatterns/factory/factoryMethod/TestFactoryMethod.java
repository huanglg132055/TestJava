package designPatterns.factory.factoryMethod;

/**
 * 测试工厂方法模式（相比简单工厂，不建议使用工厂方法模式）
 * @ClassName TestFactoryMethod
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/27
 * @Version V1.0
 **/
public class TestFactoryMethod {

    public static void main(String[] args) {
        Car car1 = new AudiFactory().createCar();
        Car car2 = new BydFactory().createCar();

        car1.run();
        car2.run();
    }
}