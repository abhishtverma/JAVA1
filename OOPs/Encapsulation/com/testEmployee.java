package OOPs.Encapsulation.com;

public class testEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("abhi", 21, 2000000);
        emp1.setAge(22);
        System.out.println(emp1.getAge());
        System.out.println(emp1.employeeDetails());
        emp1.employeeDetails1();
    }
}
