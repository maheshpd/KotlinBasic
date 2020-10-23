package Encapsulation;

import java.awt.*;

public class Test extends Student{

    int number=100;

    public static void main(String args[]) {
        //creating object of the class

        Student s = new Student();

        //setting value for name
        s.setName("Hetvi");

        //getting value of the name
        System.out.println(s.getName());
    }

}
