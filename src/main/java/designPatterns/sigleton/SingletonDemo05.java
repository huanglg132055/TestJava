package designPatterns.sigleton;

/**
 * 枚举单例模式
 * @ClassName SingletonDemo05
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public enum SingletonDemo05 {

    INSTANCE;

    private Person p;

    private SingletonDemo05(){
        p = new Person();
    }

    public Person getInstance(){
        return p;
    }
}