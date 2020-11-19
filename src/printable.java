interface printable{

    void print();
}


class Demo implements printable {

    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        Demo ob = new Demo();
        ob.print();
    }
}
