package designPatterns.structuredModel.adapter;

/**
 * 第二种适配器
 * 对象适配器，使用了组合方式整合适配对象
 * 相当于usb和ps/2的转换器
 */
public class TestAdapter2 {

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();

        Target t = new Adapter2(a);
        c.test(t);
    }
}
