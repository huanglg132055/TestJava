package designPatterns.structuredModel.decorator.first;

public class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }

    public void water(){
        System.out.println("水中行驶------");
    }

    public void move(){
        super.move();
        water();
    }
}
