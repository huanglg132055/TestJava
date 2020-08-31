package designPatterns.creationMode.prototype;

import java.util.Date;

/**
 * 测试原型模式（深复制）
 * @ClassName TestPrototype2
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class TestPrototype2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(132143124324L);
        Sheep2 s1 = new Sheep2("多利",date);
        Sheep2 s2 = (Sheep2) s1.clone();


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