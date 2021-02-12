package designPatterns.actionModel.templateMethod;

public class DrawMoney extends BankTemplateMethod {
    public void transact() {
        System.out.println("我要取款！！！");
    }
}
