package designPatterns.creationMode.factory.abstractFactory;

import designPatterns.creationMode.factory.abstractFactory.engine.Engine;
import designPatterns.creationMode.factory.abstractFactory.engine.LowEngine;
import designPatterns.creationMode.factory.abstractFactory.seat.LowSeat;
import designPatterns.creationMode.factory.abstractFactory.seat.Seat;
import designPatterns.creationMode.factory.abstractFactory.tyre.Tyre;
import designPatterns.creationMode.factory.abstractFactory.tyre.LowTyre;

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