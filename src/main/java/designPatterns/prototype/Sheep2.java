package designPatterns.prototype;

import java.util.Date;

/**
 * 原型类2
 * @ClassName Sheep2
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class Sheep2 implements Cloneable {

    private String name;
    private Date birthday;

    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        //添加如下代码实现深复制（deep clone）
        Sheep2 s = (Sheep2) obj;
        s.birthday = (Date) this.birthday.clone();//把属性也进行克隆
        return obj;
    }

    public Sheep2(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Sheep2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}