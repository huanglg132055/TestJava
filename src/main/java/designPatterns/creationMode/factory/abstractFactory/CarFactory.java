package designPatterns.creationMode.factory.abstractFactory;

import designPatterns.creationMode.factory.abstractFactory.engine.Engine;
import designPatterns.creationMode.factory.abstractFactory.seat.Seat;
import designPatterns.creationMode.factory.abstractFactory.tyre.Tyre;

/**
 * 汽车工厂接口
 */
public interface CarFactory {

    public Engine createEngine();

    public Seat createSeat();

    public Tyre createTyre();
}
