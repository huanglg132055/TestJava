package designPatterns.structuredModel.decorator.first;

/**
 * 真实对象
 */
public class Car implements ICar {

    public void move(){
        System.out.println("陆地上跑");
    }
}
