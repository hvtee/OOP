package Seminar3.Task3;

public class GenericsTest {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (a, b) -> (a % b) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 это делитель 10");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("3 не делитель 10");
        }
        System.out.println(" ");

        SomeTest<Double> isFactorDouble = (a, b) -> (a % b) == 0;

        if (isFactorDouble.test(10.0, 2.0)) {
            System.out.println("2 это делитель 10");
        }
        if (!isFactorDouble.test(10.3, 3.3)) {
            System.out.println("3 не делитель 10");
        }
        System.out.println(" ");

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "Обобщенный функциональный интерфейс";
        System.out.println("Test string: " + str);
        if (isIn.test(str, "Слово")){
            System.out.println("Найдено!");
        }
        else {
            System.out.println("Не найдено");
        }
    }
}
