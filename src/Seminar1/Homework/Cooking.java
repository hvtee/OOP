package Seminar1.Homework;

import java.util.List;

public class Cooking extends Person implements Cook {
    static List<String> food2 = List.of(new String[]{"bread", "milk", "oil"});
    static List<String> food3 = List.of(new String[]{"lasagna", "pasta", "eggs"});

    static void showFood() {
        System.out.println(Cooking.food3);
    }

    public Cooking(String firstName, String lastName, int skill) {
        super(firstName, lastName, skill);
    }

    private void checkSkill(int skill, int difficulty) {
        if (skill < difficulty) {
            System.out.println("Not enough skill, " + getFirstName());
        } else {
            System.out.println("You cooked well, " + getFirstName());
        }
    }

    @Override
    public void cook(String food) {
        if (Cooking.food2.contains(food.toLowerCase())) {
            checkSkill(getSkill(), 2);
        } else if (Cooking.food3.contains(food.toLowerCase())) {
            checkSkill(getSkill(), 3);
        } else {
            System.out.println("Wrong food");
        }
    }
}
