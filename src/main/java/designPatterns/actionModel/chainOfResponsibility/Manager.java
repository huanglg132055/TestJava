package designPatterns.actionModel.chainOfResponsibility;

/**
 * 经理
 */
public class Manager extends Leader {

    public Manager(String leaderName) {
        super(leaderName);
    }

    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays() < 10){
            System.out.println("员工姓名：" + leaveRequest.getEmoName() + ",请假" + leaveRequest.getLeaveDays() + "天，请假原因：" + leaveRequest.getReason());
            System.out.println("经理姓名：" + this.LeaderName + "审批通过！");
        }else{
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
