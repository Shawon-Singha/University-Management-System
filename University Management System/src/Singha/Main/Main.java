package Singha.Main;

import Singha.Admin.*;
import Singha.Student.*;
import Singha.Teacher.*;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

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

                switch (choice1) {

                    case 1:
                        System.out.print("Enter your name:");
                        String c1 = ob.nextLine();

                        String adminname = ob.nextLine();

                        System.out.print("Enter your Id:");
                        String adminid = ob.nextLine();

                        System.out.print("Enter your password:");
                        String adminpassword = ob.nextLine();

                        // System.out.println(adminname);
                        // System.out.println(adminid);
                        // System.out.println(adminpassword);

                        // System.out.println(ad.adminName);
                        // System.out.println(ad.adminId);
                        // System.out.println(ad.getPass());

                        if ((adminname == ad.adminName) && (adminid == ad.adminId) && (adminpassword == ad.getPass())) {
                            System.out.println("Login Failed");
                        }

                        else {
                            System.out.println("Your are log in successfully");

                            System.out.println("What do you want?\n");

                            System.out.println("1.Teacher info update");
                            System.out.println("2.Student info update");

                            System.out.print("Enter your choice:");
                            int choice2 = ob.nextInt();

                            switch (choice2) {

                                case 1:
                                    System.out.println(" Creat a Teacher account.");

                                    System.out.print("Enter the teache's name:");
                                    String c3 = ob.nextLine();

                                    String teachername = ob.nextLine();

                                    System.out.print("Enter the teacher's Id:");
                                    String teacherid = ob.nextLine();

                                    System.out.print("Enter the teacher's password:");
                                    String teacherpassword = ob.nextLine();

                                    System.out.println("\n\n");

                                    System.out.println("The teacher's name is : " + teachername);
                                    System.out.println("The teacher's id is :" + teacherid);
                                    System.out.print("The teacher's password is : " + teacherpassword);
                                    System.out.println("Those info is given through the mail.");

                                    System.out.println("\n\n");

                                    System.out.println("1.Teacher log in.");
                                    System.out.println("Back in.");

                                    System.out.print("Enter your choice:");
                                    
                                    int choice3 = ob.nextInt();

                                    switch(choice3)
                                    {
                                        case 1: 
                                        System.out.print("Enter the teache's name:");
                                        String c4 = ob.nextLine();

                                        String teachername1 = ob.nextLine();

                                        System.out.print("Enter the teacher's Id:");
                                        String teacherid1 = ob.nextLine();

                                        System.out.print("Enter the teacher's password:");
                                        String teacherpassword1 = ob.nextLine();

                                        if(teachername1 == teacherid && teacherid1 == teacherid && teacherpassword1 == teacherpassword)
                                        {
                                            System.out.println("Log in failed.");
                                        }

                                        else{
                                            System.out.println("Log in successfully.");
                                        }
                                        break;

                                        case 2:
                                        {
                                            System.out.println("back in successfully.");
                                        }
                                        break;

                                        default:{
                                            System.out.println("Invaild.");
                                        }
                                        break;
                                    }

                                 break;


                                 case 2:
                                   ad.addStudent();

                                   System.out.print("Enter your name:");
                                   String c4 = ob.nextLine();

                                   String stdName = ob.nextLine();

                                   System.out.print("Enter your Id:");
                                   String stdId = ob.nextLine();

                                   System.out.print("Enter your password:");
                                   String stdPassword = ob.nextLine();

                                   System.out.print("Enter your age:");
                                   int stdAge = ob.nextInt();

                                   System.out.print("Enter your gender:");
                                   String c2 = ob.next();

                                   String stdGender = ob.nextLine();

                                   System.out.print("Enter your Student mail:");
                                   String stdMail = ob.nextLine();

                                   System.out.println("\n\n");

                                   System.out.println("Log in please.");

                                   if(stdId == stdId && stdPassword == stdPassword){
                                    System.out.println("log in successfullty.");
                                   }
                                   
                                   else{
                                    System.out.println("log in failed");
                                   }
                                   break;
                                      
                            }
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

                Student std = new Student(name, id, gender, age);
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
