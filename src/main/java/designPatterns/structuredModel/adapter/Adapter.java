package designPatterns.structuredModel.adapter;

public class Adapter extends Adaptee implements Target {


    public void handleReq() {
        super.request();
    }
}
