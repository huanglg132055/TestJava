package designPatterns.structuredModel.adapter;

/**
 * 测试类适配器
 */
public class TestAdapter1 {

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();

        Target t = new Adapter();
        c.test(t);
    }
}
