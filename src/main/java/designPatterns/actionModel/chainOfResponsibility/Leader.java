package designPatterns.actionModel.chainOfResponsibility;

/**
 * 抽象对象，代表管理层
 */
public abstract class Leader {

    protected String LeaderName;
    protected Leader nextLeader;

    public Leader(String leaderName) {
        LeaderName = leaderName;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest leaveRequest);
}
