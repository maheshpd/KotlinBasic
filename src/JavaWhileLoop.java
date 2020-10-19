
public class JavaWhileLoop{

    public static void main(String[] args) {
        //Object 1
       /*Wheel mywheel = new Wheel();
        mywheel.numberOfWeel(3);

        //Object 2
        Wheel mywheel1 = new Wheel();
        mywheel1.numberOfWeel(4);

        //Object3
        Wheel mywheel2 = new Wheel();
        mywheel2.numberOfWeel(6);*/

        //Modifier Object
        /*Modifier m2 = new Modifier("Hetvi");
        System.out.println(m2.proccessOrder());*/


        Books mathbook = new Books("Computer",200,"Hetvi");

        /*mathbook.booksname = "Computer";
        mathbook.bookprice = 200;
        mathbook.bookAuthor = "Hetvi";*/


        System.out.println(mathbook.BookNamed());
        System.out.println(mathbook.BookPrices());
        System.out.println(mathbook.BookAuthor());

    }

}
