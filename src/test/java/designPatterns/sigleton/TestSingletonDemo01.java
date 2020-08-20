package designPatterns.sigleton;

/**
 * 饿汉式单例模式测试
 * @ClassName TestSingletonDemo01
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/19
 * @Version V1.0
 **/
public class TestSingletonDemo01 {

    public static void main(String[] args) {
        SingletonDemo01 s1 = SingletonDemo01.getInstance();
        SingletonDemo01 s2 = SingletonDemo01.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}