package designPatterns.factory.abstractFactory;

import designPatterns.factory.abstractFactory.engine.Engine;
import designPatterns.factory.abstractFactory.engine.LuxuryEngine;
import designPatterns.factory.abstractFactory.seat.LuxurySeat;
import designPatterns.factory.abstractFactory.seat.Seat;
import designPatterns.factory.abstractFactory.tyre.LuxuryTyre;
import designPatterns.factory.abstractFactory.tyre.Tyre;

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