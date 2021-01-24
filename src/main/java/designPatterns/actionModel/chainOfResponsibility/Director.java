package designPatterns.actionModel.chainOfResponsibility;

/**
 * 主任
 */
public class Director extends Leader {

    public Director(String leaderName) {
        super(leaderName);
    }

    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays() < 3){
            System.out.println("员工姓名：" + leaveRequest.getEmoName() + ",请假" + leaveRequest.getLeaveDays() + "天，请假原因：" + leaveRequest.getReason());
            System.out.println("主任姓名：" + this.LeaderName + "审批通过！");
        }else{
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
