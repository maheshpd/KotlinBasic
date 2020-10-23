package Inheritance;

import java.util.ArrayList;

public class Teacher extends Employee{
    int bonous = 5000;





    public Integer sum(int salary, int bonous) {
        return salary+bonous;
    }

    public static void main(String args[]) {

        Teacher t = new Teacher();

        System.out.println("Salary of Employee: "+t.salary);
        System.out.println("Bonus of Employee:"+t.bonous);



        int salary = t.salary;
        int bonous = t.bonous;

        System.out.println("Total Salary "+t.sum(salary,bonous));
    }
}
