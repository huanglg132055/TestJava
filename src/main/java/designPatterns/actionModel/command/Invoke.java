package designPatterns.actionModel.command;

/**
 * 调用者/发起者
 */
public class Invoke {

    private Command command;    //也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库底层的事务就是类似的结构

    public Invoke(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
