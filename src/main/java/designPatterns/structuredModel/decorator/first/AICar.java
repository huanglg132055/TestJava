package designPatterns.structuredModel.decorator.first;

public class AICar extends SuperCar {
    public AICar(ICar car) {
        super(car);
    }

    public void autoRun(){
        System.out.println("自动驾驶----------");
    }

    public void move(){
        super.move();
        autoRun();
    }
}
