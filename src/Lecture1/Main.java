package Lecture1;

public class Main {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(0);
        a.setY(2);
        Point2D b = new Point2D(0, 0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(Point2D.distance(a, b));
    }

}
