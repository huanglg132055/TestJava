package designPatterns.builder.airShip;

/**
 * 逃逸塔
 * @ClassName EscapeTower
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class EscapeTower {

    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}