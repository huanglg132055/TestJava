package designPatterns.sigleton;

/**
 * 静态内部类单例模式（懒加载）
 * @ClassName SingletonDemo04
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class SingletonDemo04 {

    private static class SingletonClassInstance{
        private static final SingletonDemo04 instance = new SingletonDemo04();
    }

    private SingletonDemo04(){}

    public static SingletonDemo04 getInstance(){
        return SingletonClassInstance.instance;
    }
}