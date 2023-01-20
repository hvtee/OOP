package Seminar1.Homework;

public class Program {
    public static void main(String[] args) {
        FamilyTree a = new FamilyTree("A. A. A.", "11.11.2001", 1, "Dad of A. C. C");
        a.addPerson("A. B. B.", "15.15.2005", 1, "Mom");
        a.addPerson("A. C. C.", "13.13.2009", 1, "Son");
        a.showAll();
        System.out.println("******");
        a.getInfo("A. B. B.");
        System.out.println("********");



        Person.getInfo();

        Cooking artem = new Cooking("Art", "Text", 3);

        artem.cookEggs();
        artem.cookPasta();
        artem.cookLasagna();
    }
}
