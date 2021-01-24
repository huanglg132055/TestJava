package designPatterns.actionModel.mediator;

public class Development implements Department {

    private Mediator m;     //持有中介者（总经理）的引用

    public Development(Mediator m) {
        this.m = m;
        m.register("development",this);
    }

    public void selfAction() {
        System.out.println("专心科研，研发项目！");
    }

    public void outAction() {
        System.out.println("汇报工作，没钱了，请求资金支持！");
    }
}
