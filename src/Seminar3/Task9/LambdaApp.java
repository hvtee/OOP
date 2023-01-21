package Seminar3.Task9;

import java.util.Scanner;

class User {

    private String name;

    String getName() {
        return name;
    }

    User(String n) {
        this.name = n;
    }
}

public class LambdaApp {

    public static void main(String[] args) {

        Supplier<User> userFactory = () -> {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());
    }
}



