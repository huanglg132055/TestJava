package designPatterns.factory.abstractFactory;

import designPatterns.factory.abstractFactory.engine.Engine;
import designPatterns.factory.abstractFactory.engine.LowEngine;
import designPatterns.factory.abstractFactory.seat.LowSeat;
import designPatterns.factory.abstractFactory.seat.Seat;
import designPatterns.factory.abstractFactory.tyre.LowTyre;
import designPatterns.factory.abstractFactory.tyre.Tyre;

/**
 * 低端汽车工厂
 * @ClassName LowFactory
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class LowFactory implements CarFactory {

    public Engine createEngine() {
        return new LowEngine();
    }

    public Seat createSeat() {
        return new LowSeat();
    }

    public Tyre createTyre() {
        return new LowTyre();
    }
}