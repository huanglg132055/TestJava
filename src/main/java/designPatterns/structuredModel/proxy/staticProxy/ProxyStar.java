package designPatterns.structuredModel.proxy.staticProxy;

/**
 * 明星代理人
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    public void signConstract() {
        System.out.println("ProxyStar.singConstract()");
    }

    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    public void sing() {
        star.sing();
    }

    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }
}
