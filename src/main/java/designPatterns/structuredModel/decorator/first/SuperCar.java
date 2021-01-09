package designPatterns.structuredModel.decorator.first;

public class SuperCar implements ICar {
    protected ICar car;

    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    public void move() {
        car.move();
    }
}
