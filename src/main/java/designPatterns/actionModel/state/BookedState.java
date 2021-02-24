package designPatterns.actionModel.state;

/**
 * 已预定状态
 */
public class BookedState implements State {

    public void handle() {
        System.out.println("房间已预定，别人不能订");
    }
}
