package designPatterns.factory.abstractFactory.seat;

/**
 * 高端汽车座椅
 * @ClassName LuxurySeat
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class LuxurySeat implements Seat {

    public void message() {
        System.out.println("座椅舒适，带有按摩功能！");
    }
}