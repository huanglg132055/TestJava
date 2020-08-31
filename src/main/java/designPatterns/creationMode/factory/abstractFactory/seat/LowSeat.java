package designPatterns.creationMode.factory.abstractFactory.seat;

/**
 * 低端汽车座椅
 * @ClassName LowSeat
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class LowSeat implements Seat {

    public void message() {
        System.out.println("不舒适，做工粗糙！");
    }
}