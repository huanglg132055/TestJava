package designPatterns.actionModel.iterator;

public class Client {

    public static void main(String[] args) {
        ConcreteMyAggregate cm = new ConcreteMyAggregate();
        cm.addObject("aa");
        cm.addObject("bb");
        cm.addObject("dd");

        MyIterator iter = cm.createIterator();
        while(iter.hasNext()){
            System.out.println(iter.getCurrentObj());
            iter.next();
        }

    }
}
