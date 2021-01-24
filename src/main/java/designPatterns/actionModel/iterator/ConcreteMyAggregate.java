package designPatterns.actionModel.iterator;

import java.util.ArrayList;
import java.util.List;

/**]
 * 自定义聚合类
 */
public class ConcreteMyAggregate {

    private List<Object> list = new ArrayList<Object>();


    public void addObject(Object obj){
        this.list.add(obj);
    }

    public void removeObject(Object obj){
       this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator createIterator(){
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator{

        private int cursor;     //定义游标用于记录遍历时的位置

        public void first() {
            cursor = 0;
        }

        public void next() {
            if(cursor < list.size()){
                cursor++;

            }
        }

        public boolean hasNext() {
            if(cursor < list.size()){
                return true;
            }
            return false;
        }

        public boolean isFirst() {
            return cursor == 0 ? true : false;
        }

        public boolean isLast() {
            return cursor == (list.size() - 1) ? true : false;
        }

        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}