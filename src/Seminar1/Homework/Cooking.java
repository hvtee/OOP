package Seminar1.Homework;

public class Cooking extends Person {

    public Cooking(String firstName, String lastName, int skill) {
        super(firstName, lastName, skill);
    }

    public void cookLasagna() {
        checkSkill(getSkill(), 5);
    }

    public void cookPasta() {
        checkSkill(getSkill(), 3);
    }

    public void cookEggs() {
        checkSkill(getSkill(), 1);
    }

    private void checkSkill(int skill, int difficulty) {
        if (skill < difficulty) {
            System.out.println("Not enough skill, " + getFirstName());
        } else {
            System.out.println("You cooked well, " + getFirstName());
        }
    }
}
