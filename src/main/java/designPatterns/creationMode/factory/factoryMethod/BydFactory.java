package designPatterns.creationMode.factory.factoryMethod;

/**
 * @ClassName BydFactory
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/27
 * @Version V1.0
 **/
public class BydFactory implements CarFactory {
    public Car createCar() {
        return new Byd();
    }
}