package designPatterns.structuredModel.adapter;

/**
 * 第一种适配器
 * 类适配器
 * 客户端类
 * （相当于示例中的笔记本，只有usb接口）
 */
public class Client {

    public void test(Target t){
        t.handleReq();
    }
}
