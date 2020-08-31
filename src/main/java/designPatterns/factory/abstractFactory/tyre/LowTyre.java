package designPatterns.factory.abstractFactory.tyre;

/**
 * 低端轮胎
 * @ClassName LowTyre
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class LowTyre implements Tyre {

    public void revolve() {
        System.out.println("转的慢，磨损快！");
    }
}