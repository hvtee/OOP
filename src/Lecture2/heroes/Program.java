package Lecture2.heroes;

import Lecture2.heroes.HeroClasses.Paladin;

public class Program {
    public static void main(String[] args) {
        Paladin pal1 = new Paladin("Hector");
        System.out.println(pal1.getName() + pal1.getLevel());
    }
}
