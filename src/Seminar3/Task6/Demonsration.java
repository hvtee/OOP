package Seminar3.Task6;

public class Demonsration {
    public static void main(String[] args) {
        UnaryOperator<Integer> ob = x -> x * x;
        System.out.println(ob.apply(5));
    }
}
