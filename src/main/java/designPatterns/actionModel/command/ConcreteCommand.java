package designPatterns.actionModel.command;

public class ConcreteCommand implements Command {

    private Receiver receiver;      //命令的真正执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        //命令真正执行前或后，执行相关的处理！
        receiver.action();
    }
}
