package designPatterns.sigleton;

/**
 * 懒汉式单例模式
 * @ClassName SingletonDemo02
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class SingletonDemo02 {

    private static SingletonDemo02 instance;

    private SingletonDemo02(){}

    public static synchronized SingletonDemo02 getInstance(){
        if(instance == null){
            instance = new SingletonDemo02();
        }
        return instance;
    }
}