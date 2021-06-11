package designPatterns.actionModel.observer;

public class ObserverA implements Observer {

    private int myState;//myState需要和目标对象的state保持一致

    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
