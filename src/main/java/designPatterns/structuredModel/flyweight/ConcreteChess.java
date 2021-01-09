package designPatterns.structuredModel.flyweight;

/**
 * 内部状态ConcreteFlyWeight
 * 棋子的颜色
 */
public class ConcreteChess implements ChessFlyWeight {

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void display(Coordinate c) {
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置：" + c.getX() + ",--------" + c.getY());
    }
}
