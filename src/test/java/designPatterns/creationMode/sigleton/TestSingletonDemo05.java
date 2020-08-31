package designPatterns.creationMode.sigleton;

/**
 * 枚举单例模式测试
 * @ClassName TestSingletonDemo05
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class TestSingletonDemo05 {

    public static void main(String[] args) {
        Person s1 = SingletonDemo05.INSTANCE.getInstance();
        Person s2 = SingletonDemo05.INSTANCE.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}