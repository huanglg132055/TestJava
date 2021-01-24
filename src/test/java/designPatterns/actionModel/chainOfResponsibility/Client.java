package designPatterns.actionModel.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest leaveRequest = new LeaveRequest("hehe",30,"回家过年");
        a.handleRequest(leaveRequest);
    }
}
