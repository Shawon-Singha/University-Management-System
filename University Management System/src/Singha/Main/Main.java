package Singha.Main;

import Singha.Admin.*;
import Singha.Student.*;

import java.util.Scanner;

public class Main {
    public static void main() {
        System.out.println("\n\n\t\t\t\t\t\t\t***_University Management System_***\n\n");
        System.out.println("Please,Enter your choice:");
        System.out.println("1.Admin");
        System.out.println("2.Teacher");
        System.out.println("3.Student\n");
    }

    

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        main();

        System.out.println("Please,Enter your choice:");
        int choice = ob.nextInt();

        switch (choice) {
            case 3:

                System.out.println("Enter your name:");
                String name = ob.nextLine();

                System.out.println("Enter your Id:");
                String id = ob.nextLine();

                System.out.println("Enter your password:");
                String password = ob.nextLine();

                System.out.println("Enter your gender:");
                String gender = ob.nextLine();

                System.out.println("Enter your age:");
                int age = ob.nextInt();

                System.out.println("Enter your Studentmail");
                String stdMail = ob.nextLine();

                Student std = new Student();

                std.setPassword(password);
                std.setStdMail(stdMail);

                std.display();

                System.out.println("Your login is done.");

        }
    }

}
