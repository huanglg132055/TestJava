package designPatterns.creationMode.prototype;

import java.util.Date;

/**
 * 测试原型模式
 * @ClassName TestPrototype
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {

//        Sheep s1 = new Sheep("多利",new Date(132143124324L));
//        System.out.println(s1);
//        System.out.println(s1.getName());
//        System.out.println(s1.getBirthday());
//
//        Sheep s2 = (Sheep) s1.clone();
//        s2.setName("多利2");
//        System.out.println(s2);
//        System.out.println(s2.getName());
//        System.out.println(s2.getBirthday());

        //浅克隆,只是克隆了一份Sheep对象的值，其中的引用属性的值一样。
        Date date = new Date(132143124324L);
        Sheep s1 = new Sheep("多利",date);
        Sheep s2 = (Sheep) s1.clone();


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