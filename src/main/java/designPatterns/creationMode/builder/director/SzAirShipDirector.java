package designPatterns.creationMode.builder.director;

import designPatterns.creationMode.builder.AirShip;
import designPatterns.creationMode.builder.airShip.Engine;
import designPatterns.creationMode.builder.airShip.EscapeTower;
import designPatterns.creationMode.builder.airShip.OrbitalModule;
import designPatterns.creationMode.builder.bulider.AirShipBuilder;

/**
 * 神州飞船组装者
 * @ClassName SzAirShipDirector
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class SzAirShipDirector implements AirShipDirector {

    private AirShipBuilder airShipBuilder;

    public SzAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    public AirShip directAirShip() {
        OrbitalModule o = airShipBuilder.createOrbitalModule();
        Engine e = airShipBuilder.createEngine();
        EscapeTower et = airShipBuilder.createEscapeTower();

        //装配成飞船对象
        AirShip a = new AirShip();
        a.setOrbitalModule(o);
        a.setEngine(e);
        a.setEscapeTower(et);

        return a;
    }
}