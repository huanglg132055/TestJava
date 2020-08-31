package designPatterns.creationMode.sigleton;

/**
 * 懒汉式单例模式测试
 * @ClassName TestSingletonDemo02
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class TestSingletonDemo02 {

    public static void main(String[] args) {
        SingletonDemo02 s1 = SingletonDemo02.getInstance();
        SingletonDemo02 s2 = SingletonDemo02.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}