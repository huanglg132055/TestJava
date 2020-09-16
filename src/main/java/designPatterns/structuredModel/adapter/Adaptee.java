package designPatterns.structuredModel.adapter;

/**
 * 被适配的类
 * （相当于示例中的ps/2键盘）
 */
public class Adaptee {

    public void request(){
        System.out.println("可以完成客户请求所需要的功能！");
    }
}
