package designPatterns.actionModel.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    //观察者对象集合
    protected List<Observer> list = new ArrayList<Observer>();

    //注册观察者
    public void registerObserver(Observer observer){
        list.add(observer);
    }

    //移除观察者
    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    //通知所有观察者更新状态
    public void notifyAllObserver(){
        for (Observer obs: list) {
            obs.update(this);
        }
    }
}
