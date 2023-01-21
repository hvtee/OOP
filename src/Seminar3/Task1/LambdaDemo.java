package Seminar3.Task1;

public class LambdaDemo {
    public static void main(String[] args) {
        NumericTest isFactor = (a, b) -> (a % b) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("2 это делитель 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 не делитель 10");
        }
        System.out.println(" ");

        NumericTest isFactor2 = (m, n) -> (n < m);
        if (isFactor2.test(2, 10)) {
            System.out.println("2 < 10");
        }
        if (!isFactor2.test(10, 2)) {
            System.out.println("10!<2");
        }
        System.out.println(" ");

        NumericTest abcEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if (abcEqual.test(4, -4)) {
            System.out.println("4 = |-4|");
        }
        if (!abcEqual.test(4, -5)) {
            System.out.println("4 != |-5|");
        }
    }
}
