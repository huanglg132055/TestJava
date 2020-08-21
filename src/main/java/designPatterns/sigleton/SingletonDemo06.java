package designPatterns.sigleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式单例模式
 * @ClassName SingletonDemo02
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class SingletonDemo06 implements Serializable {

    private static SingletonDemo06 instance;

    private SingletonDemo06(){
        if(instance != null){
            throw new RuntimeException("不允许反射破解饿汉式单例模式");
        }
    }

    public static synchronized SingletonDemo06 getInstance(){
        if(instance == null){
            instance = new SingletonDemo06();
        }
        return instance;
    }

    //反序列化时，如果指定了readResolve()方法，直接返回该方法指定的对象，而不需要再创建新对象！
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}