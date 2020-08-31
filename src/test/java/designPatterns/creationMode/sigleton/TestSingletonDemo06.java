package designPatterns.creationMode.sigleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解单例模式（枚举无法破解）
 * @ClassName TestSingletonDemo06
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class TestSingletonDemo06 {

    public static void main(String[] args) throws Exception {
        SingletonDemo06 s1 = SingletonDemo06.getInstance();
        SingletonDemo06 s2 = SingletonDemo06.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        //通过反射的方式破解单例模式（解决办法：在单例类中的私有构造器中加入对象不为null时判断，抛出异常。）
//        Class<SingletonDemo06> clazz = (Class<SingletonDemo06>) Class.forName("designPatterns.sigleton.SingletonDemo06");
//        Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor();
//        c.setAccessible(true);
//        SingletonDemo06 s3 = c.newInstance();
//        SingletonDemo06 s4 = c.newInstance();
//        System.out.println(s3);
//        System.out.println(s4);

        //通过反序列化破解单例模式（解决办法：在序列化对象中定义readResolve()方法，在反序列化时会自动调用该方法）
        FileOutputStream fos = new FileOutputStream("E:/test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/test.txt"));
        SingletonDemo06 s3 = (SingletonDemo06) ois.readObject();
        System.out.println(s3);
    }
}