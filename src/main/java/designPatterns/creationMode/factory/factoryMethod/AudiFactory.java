package designPatterns.creationMode.factory.factoryMethod;

/**
 * @ClassName AudiFactory
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/27
 * @Version V1.0
 **/
public class AudiFactory implements CarFactory {
    public Car createCar() {
        return new Audi();
    }
}