package Seminar1.Homework;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements TreeInterface {
    private List<Integer> personID = new ArrayList<>();
    private int personIDIndex = 0;
    private List<String> fullName = new ArrayList<>();
    private List<String> birthDate = new ArrayList<>();
    private List<Integer> generation = new ArrayList<>();
    private List<String> notice = new ArrayList<>();

    public FamilyTree() {
    }

    public FamilyTree(String fullName, String birthDate, int generation, String notice) {
        this.personID.add(personIDIndex);
        personIDIndex += 1;
        this.fullName.add(fullName);
        this.birthDate.add(birthDate);
        this.generation.add(generation);
        this.notice.add(notice);
    }

    @Override
    public void addPerson(String fullName, String birthDate, int generation, String notice) {
        this.personID.add(personIDIndex);
        personIDIndex += 1;
        this.fullName.add(fullName);
        this.birthDate.add(birthDate);
        this.generation.add(generation);
        this.notice.add(notice);
    }

    @Override
    public void showAll() {
        for (int i = 0; i < personIDIndex; i++) {
            System.out.println("Full name: " + fullName.get(i));
            System.out.println("Birth date: " + birthDate.get(i));
            System.out.println("Generation: " + generation.get(i));
            System.out.println("Notice: " + notice.get(i));
            System.out.println("------------");
        }
    }

    @Override
    public void getInfo(String fn) {
        int id = fullName.indexOf(fn);
        System.out.println("Full name: " + fullName.get(id));
        System.out.println("Birth date: " + birthDate.get(id));
        System.out.println("Generation: " + generation.get(id));
        System.out.println("Notice: " + notice.get(id));
    }

}
