package designPatterns.structuredModel.flyweight;

/**
 * 享元类
 */
public interface ChessFlyWeight {

    //设置棋子颜色
    public void setColor(String color);

    //获取棋子颜色
    public String getColor();

    //显示
    public void display(Coordinate c);
}
