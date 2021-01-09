package designPatterns.structuredModel.decorator.first;

public class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("飞行------");
    }

    public void move(){
        super.move();
        fly();
    }
}
