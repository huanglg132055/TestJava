package designPatterns.structuredModel.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class ChessFlyWeightFactory {

    private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

    public static ChessFlyWeight getChess(String color){
        if(map.get(color) != null){
            return map.get(color);
        }else{
            ChessFlyWeight cf = new ConcreteChess(color);
            map.put(color,cf);
            return cf;
        }
    }
}
