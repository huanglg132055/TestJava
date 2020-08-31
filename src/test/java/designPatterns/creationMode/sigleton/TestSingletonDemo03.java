package designPatterns.creationMode.sigleton;

/**
 * 双重检测锁单例模式测试
 * @ClassName TestSingletonDemo03
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class TestSingletonDemo03 {

    public static void main(String[] args) {
        SingletonDemo03 s1 = SingletonDemo03.getInstance();
        SingletonDemo03 s2 = SingletonDemo03.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}