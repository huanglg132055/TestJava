package designPatterns.creationMode.factory.abstractFactory.tyre;

/**
 * 高端轮胎
 * @ClassName LuxuryTyre
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class LuxuryTyre implements Tyre {

    public void revolve(){
        System.out.println("转的快，磨损慢！");
    }
}