package designPatterns.actionModel.chainOfResponsibility;

public class GeneralManager extends Leader {

    public GeneralManager(String leaderName) {
        super(leaderName);
    }

    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays() < 30){
            System.out.println("员工姓名：" + leaveRequest.getEmoName() + ",请假" + leaveRequest.getLeaveDays() + "天，请假原因：" + leaveRequest.getReason());
            System.out.println("总经理姓名：" + this.LeaderName + "审批通过！");
        }else{
            System.out.println("辞职吧！");
        }
    }
}
