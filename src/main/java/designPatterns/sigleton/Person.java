package designPatterns.sigleton;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/20
 * @Version V1.0
 **/
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}