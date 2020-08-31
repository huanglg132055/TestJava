package designPatterns.creationMode.sigleton;

/**
 * 静态内部类单例模式测试
 * @ClassName TestSingletonDemo04
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class TestSingletonDemo04 {

    public static void main(String[] args) {
        SingletonDemo04 s1 = SingletonDemo04.getInstance();
        SingletonDemo04 s2 = SingletonDemo04.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}