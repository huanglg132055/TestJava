package designPatterns.structuredModel.bridge;

import designPatterns.structuredModel.bridge.secound.*;

public class Client {

    public static void main(String[] args) {
        //销售联想的笔记本电脑
        Computer c = new Laptop(new Lenovo());
        c.sale();

        //销售神州的笔记本电脑
        Computer c2 = new Desktop(new Shenzhou());
        c2.sale();;
    }
}
