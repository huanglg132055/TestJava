package designPatterns.actionModel.iterator;

/**
 * 自定义的迭代器接口
 */
public interface MyIterator {
    void first();       //将游标指向第一个元素
    void next();        //将游标指向下一个元素
    boolean hasNext();  //判断是否存在下一个元素

    boolean isFirst();  //判断当前元素是否是第一个元素
    boolean isLast();   //判断当前元素是否是最后一个元素

    Object getCurrentObj(); //获取当前游标指向的对象
}
