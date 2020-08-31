package designPatterns.creationMode.builder.bulider;

import designPatterns.creationMode.builder.airShip.Engine;
import designPatterns.creationMode.builder.airShip.EscapeTower;
import designPatterns.creationMode.builder.airShip.OrbitalModule;

/**
 * 神州飞船建造者
 * 在这里可以加入工厂模式
 */
public class SzAirShipBuilder implements AirShipBuilder {

    public OrbitalModule createOrbitalModule() {
        System.out.println("构建神州牌轨道舱！");
        return new OrbitalModule("神州牌轨道舱！");
    }

    public Engine createEngine() {
        System.out.println("构建神州牌发动机！");
        return new Engine("神州牌发动机！");
    }

    public EscapeTower createEscapeTower() {
        System.out.println("构建神州牌逃逸塔！");
        return new EscapeTower("神州牌逃逸塔！");
    }
}
