package designPatterns.actionModel.observer;

public class Client {

    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        //改变目标状态
        subject.setState(3000);
        System.out.println("#############");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        //改变目标状态
        subject.setState(40);
        System.out.println("#############");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
