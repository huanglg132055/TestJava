package designPatterns.factory.simpleFactory;

/**
 * 简单工厂模式第一种写法
 * @ClassName CarFactory
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/27
 * @Version V1.0
 **/
public class CarFactory {

    public static Car createCar(String type){
        if("奥迪".equals(type)){
            return new Audi();
        }else if("比亚迪".equals(type)){
            return new Byd();
        }else{
            return null;
        }
    }
}