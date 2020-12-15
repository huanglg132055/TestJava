package designPatterns.structuredModel.bridge.secound;

public class Laptop extends Computer {
    public Laptop(Brand b) {
        super(b);
    }

    public void sale(){
        super.sale();
        System.out.println("销售笔记本");
    }
}
