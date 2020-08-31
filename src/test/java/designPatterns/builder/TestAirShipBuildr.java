package designPatterns.builder;

import designPatterns.builder.bulider.AirShipBuilder;
import designPatterns.builder.bulider.SzAirShipBuilder;
import designPatterns.builder.director.AirShipDirector;
import designPatterns.builder.director.SzAirShipDirector;

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