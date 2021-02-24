package designPatterns.actionModel.state;

/**
 * 已入住状态
 */
public class CheckedInState implements State {
    public void handle() {
        System.out.println("房间已入住，请勿打扰！！");
    }
}
