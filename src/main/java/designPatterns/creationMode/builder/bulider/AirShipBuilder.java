package designPatterns.creationMode.builder.bulider;

import designPatterns.creationMode.builder.airShip.Engine;
import designPatterns.creationMode.builder.airShip.EscapeTower;
import designPatterns.creationMode.builder.airShip.OrbitalModule;

/**
 * 飞船建造者接口
 */
public interface AirShipBuilder {

    //创建轨道舱
    OrbitalModule createOrbitalModule();

    //创建发动机
    Engine createEngine();

    //创建逃逸塔
    EscapeTower createEscapeTower();
}
