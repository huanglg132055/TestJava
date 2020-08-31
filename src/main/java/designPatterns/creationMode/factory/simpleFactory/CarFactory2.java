package designPatterns.creationMode.factory.simpleFactory;

/**
 * 第二种简单工厂写法
 * @ClassName CarFactory2
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/27
 * @Version V1.0
 **/
public class CarFactory2 {

    public static Car createAudi(){
        return new Audi();
    }

    public static Car createByd(){
        return new Byd();
    }
}