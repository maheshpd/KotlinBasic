class Bike{

    void Bike() {
       System.out.println("Good Night");
    }

    String color = "Red";

    String sum(String a,String b) {
         return a+b;
     }

     int sum(int a, int b, int c) {
        return a+b+c;
     }
}

class BikeColor extends Bike {
    void bikesColor() {
        System.out.println(super.color);
        super.Bike();
    }
}

class Honda extends BikeColor {

    public static void main(String args[]) {
        Honda honda = new Honda();
        System.out.println(honda.sum("Ram ","Kumar"));
        System.out.println(honda.sum(2,3,4));
        honda.bikesColor();
    }

    @Override
    String sum(String a, String b) {
        return super.sum(a, b);

    }

    @Override
    int sum(int a, int b, int c) {
        return super.sum(a, b, c);
    }
}


