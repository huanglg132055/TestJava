package designPatterns.creationMode.prototype;

/**
 * 模拟new对象时的耗时
 * @ClassName LapTop
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class LapTop implements Cloneable {

    public LapTop(){
        try {
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }
}