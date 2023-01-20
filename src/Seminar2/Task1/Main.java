package Seminar2.Task1;

public class Main {
    public static void main(String[] args) {
        Test1 ob1 = new Test1();
        Test2 ob2 = new Test2();
        Program ob;

        ob1.setStart(15);
        ob2.setStart(15);
        for (int i = 0; i < 5; i++) {
            ob = ob1;
            System.out.println("ob = ob1 - " + ob.getNext());
            ob = ob2;
            System.out.println("ob = ob2 - " + ob.getNext());
            System.out.println("-------------");
        }

//        ob1.reset();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(ob1.getNext());
//        }

//        ob2.setStart(15);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(ob2.getNext());
//        }
//
//        ob2.reset();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(ob2.getNext());
//        }
//

    }
}
