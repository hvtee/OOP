package Seminar3.Task2;

public class Demo {
    public static void main(String[] args) {
        Inter f = (n) -> {
            int res = 1;
            n = n < 0 ? -n : n;
            for (int i = 2; i <= n / i; i++) {
                if ((n % i) == 0) {
                    res = i;
                    break;
                }
            }
            return res;
        };
        System.out.println("Наименший делитель 12 является " + f.func(12));
        System.out.println("Наименший делитель 11 является " + f.func(11));
    }
}
