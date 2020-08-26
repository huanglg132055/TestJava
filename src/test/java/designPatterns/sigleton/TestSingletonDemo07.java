package designPatterns.sigleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种单例模式的效率
 * 相对环境的测试，时间随机器不通，性能也不一样。
 * @ClassName TestSingletonDemo06
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class TestSingletonDemo07 {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int i = 0; i < threadNum; i++){
            new Thread(new Runnable() {
                public void run() {
                    for(int j = 0; j < 1000000; j++){
//                        Object instance = SingletonDemo01.getInstance();//饿汉式 340ms
                        Object instance = SingletonDemo02.getInstance();//懒汉式   333ms
//                        Object instance = SingletonDemo03.getInstance();//双重检测锁式   46ms
//                        Object instance = SingletonDemo04.getInstance();//静态内部类式   95ms
//                        Object instance = SingletonDemo05.INSTANCE;//静态内部类式   105ms
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("总共耗时：" + (end - start) + "ms!");
    }
}