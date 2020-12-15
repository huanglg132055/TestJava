package designPatterns.structuredModel.bridge.secound;

public class Computer {
    protected Brand brand;

    public Computer(Brand b){
        this.brand = b;
    }

    public void sale(){
        brand.sale();
    }
}
