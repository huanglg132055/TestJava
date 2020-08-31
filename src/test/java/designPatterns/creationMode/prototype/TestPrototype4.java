package designPatterns.creationMode.prototype;

/**
 * 模拟测试原型模式耗时
 * @ClassName TestPrototype4
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class TestPrototype4 {

    public static void testNew(int size){
        long start = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            LapTop lt = new LapTop();
        }
        long end = System.currentTimeMillis();
        System.out.println("测试new对象方式耗时：" + (end - start));
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        LapTop lt = new LapTop();
        for(int i = 0; i < size; i ++){
            LapTop temp = (LapTop) lt.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("测试使用原型模式创建对象耗时：" + (end - start));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        testNew(1000);
        testClone(1000);
    }
}