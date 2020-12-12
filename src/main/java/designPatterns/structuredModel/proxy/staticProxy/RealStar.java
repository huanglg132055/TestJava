package designPatterns.structuredModel.proxy.staticProxy;

/**
 * 真实明星
 */
public class RealStar implements Star {
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    public void signConstract() {
        System.out.println("RealStar.signConstract()");
    }

    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    public void sing() {
        System.out.println("RealStar.sing()");
    }

    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
