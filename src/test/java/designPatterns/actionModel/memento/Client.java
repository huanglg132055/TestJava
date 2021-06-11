package designPatterns.actionModel.memento;

public class Client {

    public static void main(String[] args) {
        CareTaker ck = new CareTaker();

        Emp emp = new Emp("黄立果", 31, 12000);
        System.out.println("第一次打印对象：" + emp.getEname() + "---" + emp.getAge() + "----" + emp.getSalary());

        ck.setEmpMemento(emp.memento());//备忘一次

        emp.setEname("薛志远");
        emp.setAge(26);
        emp.setSalary(16000);
        System.out.println("第二次打印对象：" + emp.getEname() + "---" + emp.getAge() + "----" + emp.getSalary());

        emp.recovery(ck.getEmpMemento());//恢复到备忘录保存的状态

        System.out.println("第三次打印对象：" + emp.getEname() + "---" + emp.getAge() + "----" + emp.getSalary());
    }
}
