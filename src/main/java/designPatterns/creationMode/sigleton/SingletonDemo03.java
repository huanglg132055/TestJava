package designPatterns.creationMode.sigleton;

/**
 * 双重检测锁单例模式
 * @ClassName SingletonDemo03
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class SingletonDemo03 {

    private static SingletonDemo03 instance = null;

    private SingletonDemo03(){}

    public static SingletonDemo03 getInstance(){
        if(instance == null){
            SingletonDemo03 sd;
            synchronized(SingletonDemo03.class){
                sd = instance;
                if(sd == null){
                    synchronized(SingletonDemo03.class){
                        if(sd == null){
                            sd = new SingletonDemo03();
                        }
                    }
                    instance = sd;
                }
            }
        }
        return instance;
    }
}