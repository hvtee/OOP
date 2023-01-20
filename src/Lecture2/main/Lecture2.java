package Lecture2.main;

public class Lecture2 {
}

class A {
    int a;

    A(){}

    A(int n) {
        a = n;
    }
}

class B extends A {
    int b;

    B(){}

    B(int n) {
        b = n;
    }
}

class C extends B {
    int c;
}

class Test {

    public static void main(String[] args) {
        A text1 = new A();
        A text2 = new B();
        A text3 = new C();

        text1.a = 5;
        text2.a = 11;
    }
}