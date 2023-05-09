package Singha.Main;

import Singha.Admin.*;
import Singha.Student.*;
import Singha.Teacher.*;

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

        System.out.print("Please,Enter your choice:");
        int choice = ob.nextInt();

        
        switch (choice) {
            
            case 1:
            System.out.println("Welcome to Admin Panel");

            System.out.print("Enter your name:");
                String b1 = ob.nextLine();

                String adminName = ob.nextLine();

                System.out.print("Enter your Id:");
                String adminId = ob.nextLine();

                System.out.print("Enter your password:");
                String adminPassword = ob.nextLine();

                Admin ad = new Admin();

              ad.adminName = adminName;
              ad.adminId = adminId;
              ad.setPass(adminPassword);

              System.out.println("\n\n");

              ad.adminDisplay();
              System.out.println("This info delivery through email.");
              System.out.println("\n\n");

              System.out.println("What do you want?");
               System.out.println("1.Log in");
               System.out.println("2.Go back.");

               System.out.print("please input your choice");
               int choice1 = ob.nextInt();

               switch(choice1){


                    case 1:

                    System.out.print("Enter your name:");
                    String c1 = ob.nextLine();

                    String adminname = ob.nextLine();

                    System.out.print("Enter your Id:");
                    String adminid = ob.nextLine();

                    System.out.print("Enter your password:");
                    String adminpassword = ob.nextLine();

                    // System.out.println(adminName);
                    // System.out.println(adminId);
                    // System.out.println(adminPassword);

                    if((adminname == adminName) && (adminid == adminId) && (adminpassword == adminPassword)) {
                        System.out.println("Your are log in successfully");
                    }

                    else{
                        System.out.println("Log in failed");
                    }

                    break;


                    case 2:

                    System.out.println("Your are successfull back from this site");
                    break;

               }
               break;
               


              

            
            
            
              case 3:

                System.out.print("Enter your name:");
                String c1 = ob.nextLine();

                String name = ob.nextLine();

                System.out.print("Enter your Id:");
                String id = ob.nextLine();

                System.out.print("Enter your password:");
                String password = ob.nextLine();

                System.out.print("Enter your age:");
                int age = ob.nextInt();

                System.out.print("Enter your gender:");
                String c2 = ob.next();

                 String gender = ob.nextLine();

                System.out.print("Enter your Student mail:");
                String stdMail = ob.nextLine();

                System.out.println("\n\n");

                Student std = new Student(name,id,gender,age);
                std.name = name;

                std.gender = gender;
                
                std.age = age;
                std.id = id;
                std.setPassword(password);
                std.setStdMail(stdMail);

                std.studentDisplay();

                System.out.println("Your login is done.");
                System.out.println("Welcom to Student portal.");

        }
    }

}
