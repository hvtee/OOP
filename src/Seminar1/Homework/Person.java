package Seminar1.Homework;

public class Person {

    static void getInfo(){
        System.out.println("This is cooking!");
    }

    private String firstName;
    private String LastName;
    private int skill;

    public Person(String firstName, String lastName, int skill) {
        this.firstName = firstName;
        LastName = lastName;
        this.skill = skill;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getSkill() {
        return skill;
    }

}
