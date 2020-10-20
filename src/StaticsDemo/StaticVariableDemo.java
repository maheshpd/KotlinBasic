package StaticsDemo;
 class Student {

     int rollno; //instance variable
     String name;
     static String Schoolname = "XYZ";

     //constructor

     Student(int r, String n) {
         rollno = r;
         name = n;
     }

     //method to display the value
     void display(){
         System.out.println(rollno+" and " +name+" School Name "+Schoolname);
     }
}

 class TestStaticVariable {
     public static void main(String args[]) {
         Student s1 = new Student(111,"Karan");
         Student s2 = new Student(222,"Aryan");

//         Student.Schoolname = "MPQ";

         s1.display();
         s2.display();
     }
}
