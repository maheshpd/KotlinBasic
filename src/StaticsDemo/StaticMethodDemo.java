package StaticsDemo;

class Student1 {
    int rollno;
    String name;

    static String schoolName= "XYZ";

    //static method to change the value of static variable

    static void changeName() {
        schoolName = "PQR";
    }

    //constructor to initialize the variable
    Student1(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display value
    void display() {
        System.out.println(rollno+ " "+name+" "+schoolName);
    }
}
  class TestStaticMethod {
     public static void main(String args[]) {

         System.out.println("Before school name change");
         System.out.println(Student1.schoolName);

         System.out.println("After school name change");
         Student1.changeName();
         System.out.println(Student1.schoolName);


         Student1 student1 = new Student1(111,"Karan");
         student1.display();

     }
}
