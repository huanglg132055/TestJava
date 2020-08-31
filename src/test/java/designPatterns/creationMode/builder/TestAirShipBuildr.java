package designPatterns.creationMode.builder;

import designPatterns.creationMode.builder.bulider.SzAirShipBuilder;
import designPatterns.creationMode.builder.director.AirShipDirector;
import designPatterns.creationMode.builder.director.SzAirShipDirector;

/**
 * 测试建造者模式
 * @ClassName TestAirShipBuildr
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class TestAirShipBuildr {

    public static void main(String[] args) {
        AirShipDirector director = new SzAirShipDirector(new SzAirShipBuilder());
        AirShip ship = director.directAirShip();
        System.out.println(ship.getEngine().getName());
    }
}