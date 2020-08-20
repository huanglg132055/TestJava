package designPatterns.sigleton;

/**
 * 饿汉式单例模式
 * @ClassName SingletonDemo01
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/19
 * @Version V1.0
 **/
public class SingletonDemo01 {

    private static final SingletonDemo01 instance = new SingletonDemo01();

    private SingletonDemo01(){}

    public static synchronized SingletonDemo01 getInstance(){
        return instance;
    }
}