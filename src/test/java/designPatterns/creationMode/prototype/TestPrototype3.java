package designPatterns.creationMode.prototype;

import java.io.*;
import java.util.Date;

/**
 * 测试原型模式
 * 通过序列化和反序列化进行深复制(深克隆)
 * @ClassName TestPrototype2
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class TestPrototype3 {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date = new Date(132143124324L);
        Sheep s1 = new Sheep("多利",date);
//        Sheep s2 = (Sheep) s1.clone();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();


        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());
        date.setTime(354364576457l);
        System.out.println(s1.getBirthday());

        s2.setName("多利2");
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());
    }
}