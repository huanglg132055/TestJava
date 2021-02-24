package designPatterns.actionModel.state;

/**
 * 状态模式测试类
 */
public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();

        ctx.setState(new FreeState());
        ctx.setState(new BookedState());
    }
}
