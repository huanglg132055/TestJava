package designPatterns.actionModel.strategy;

public class OldCustomerFewStrategy implements Strategy {
    public double getPrice(double standardPrice) {
        System.out.println("打八五折");
        return standardPrice * 0.85;
    }
}