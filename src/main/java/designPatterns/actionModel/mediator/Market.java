package designPatterns.actionModel.mediator;

public class Market implements Department {

    private Mediator m;     //持有中介者（总经理）的引用

    public Market(Mediator m) {
        this.m = m;
        m.register("market",this);
    }

    public void selfAction() {
        System.out.println("承接项目");
    }

    public void outAction() {
        System.out.println("汇报工作，承接项目的进度，需要资金支持！");
        m.command("finacial");
    }
}
