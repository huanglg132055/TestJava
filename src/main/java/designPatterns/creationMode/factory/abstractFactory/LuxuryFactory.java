package designPatterns.creationMode.factory.abstractFactory;

import designPatterns.creationMode.factory.abstractFactory.engine.Engine;
import designPatterns.creationMode.factory.abstractFactory.engine.LuxuryEngine;
import designPatterns.creationMode.factory.abstractFactory.seat.LuxurySeat;
import designPatterns.creationMode.factory.abstractFactory.seat.Seat;
import designPatterns.creationMode.factory.abstractFactory.tyre.Tyre;
import designPatterns.creationMode.factory.abstractFactory.tyre.LuxuryTyre;

/**
 * 高端汽车工厂
 * @ClassName LuxuryFactory
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class LuxuryFactory implements CarFactory {

    public Engine createEngine() {
        return new LuxuryEngine();
    }

    public Seat createSeat() {
        return new LuxurySeat();
    }

    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}