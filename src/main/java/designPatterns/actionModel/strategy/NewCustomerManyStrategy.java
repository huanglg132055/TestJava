package designPatterns.actionModel.strategy;

public class NewCustomerManyStrategy implements Strategy {
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice * 0.9;
    }
}
