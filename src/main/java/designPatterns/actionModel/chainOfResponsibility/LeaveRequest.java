package designPatterns.actionModel.chainOfResponsibility;

/**
 * 请假条
 */
public class LeaveRequest {

    private String emoName;//请假人姓名
    private int leaveDays;//请假天数
    private String reason;//原因

    public LeaveRequest(String emoName, int leaveDays, String reason) {
        this.emoName = emoName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getEmoName() {
        return emoName;
    }

    public void setEmoName(String emoName) {
        this.emoName = emoName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
