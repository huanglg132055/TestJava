package designPatterns.actionModel.command;

public class Client {

    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receiver());

        Invoke i = new Invoke(c);
        i.call();

        Receiver receiver = new Receiver();
        receiver.action();
    }
}
