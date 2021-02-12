package designPatterns.actionModel.templateMethod;

public class Clinent {

    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱！！！");
            }
        };
        btm2.process();
    }
}
