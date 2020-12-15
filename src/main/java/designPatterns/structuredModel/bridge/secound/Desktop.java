package designPatterns.structuredModel.bridge.secound;

public class Desktop extends Computer {
    public Desktop(Brand b) {
        super(b);
    }

    public void sale(){
        super.sale();
        System.out.println("销售台式机");
    }
}
