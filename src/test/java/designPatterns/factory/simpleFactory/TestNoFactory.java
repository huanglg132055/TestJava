package designPatterns.factory.simpleFactory;

/**
 * @ClassName TestNoFactory
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/27
 * @Version V1.0
 **/
public class TestNoFactory {

    public static void main(String[] args) {
        Car car1 = new Audi();
        Car car2 = new Byd();

        car1.run();
        car2.run();
    }
}