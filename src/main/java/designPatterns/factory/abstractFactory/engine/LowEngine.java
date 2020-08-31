package designPatterns.factory.abstractFactory.engine;

/**
 * 低端引擎
 * @ClassName LowEngine
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class LowEngine implements Engine {

    public void run() {
        System.out.println("转的慢！");
    }

    public void start() {
        System.out.println("启动慢！");
    }
}