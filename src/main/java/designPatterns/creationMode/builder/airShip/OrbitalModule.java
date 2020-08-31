package designPatterns.creationMode.builder.airShip;

/**
 * 轨道舱
 * @ClassName OrbitalModule
 * @Description: TODO
 * @Author huanglg
 * @Date 2020/8/30
 * @Version V1.0
 **/
public class OrbitalModule {

    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}