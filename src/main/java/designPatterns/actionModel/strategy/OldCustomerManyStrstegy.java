package designPatterns.actionModel.strategy;

public class OldCustomerManyStrstegy implements Strategy {
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice * 0.8;
    }
}
