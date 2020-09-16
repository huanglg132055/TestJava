package designPatterns.structuredModel.adapter;

public class Adapter2 implements Target {

    private Adaptee adaptee;

    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
