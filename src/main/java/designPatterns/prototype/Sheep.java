package designPatterns.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 原型类
 * @ClassName Sheep
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/31
 * @Version V1.0
 **/
public class Sheep implements Cloneable, Serializable {//1997年，克隆羊多利

    private String name;
    private Date birthday;

    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();//Sheep的父类是Object,直接调用Object的clone方法
        return obj;
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

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Sheep() {
    }

}