package designPatterns.factory.abstractFactory.engine;

/**
 * 高端引擎
 * @ClassName LuxuryEngine
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class LuxuryEngine implements Engine {

    public void run() {
        System.out.println("转的快！");
    }

    public void start() {
        System.out.println("启动速度快，能自动启停！");
    }
}