package designPatterns.factory.abstractFactory;

import designPatterns.factory.abstractFactory.engine.Engine;
import designPatterns.factory.abstractFactory.seat.Seat;
import designPatterns.factory.abstractFactory.tyre.Tyre;

/**
 * 汽车工厂接口
 */
public interface CarFactory {

    public Engine createEngine();

    public Seat createSeat();

    public Tyre createTyre();
}
