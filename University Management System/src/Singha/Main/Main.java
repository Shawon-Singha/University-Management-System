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
        System.out.println("3.Student");
        System.out.println("4.exit\n");
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        boolean result = true;

        while (result) {
            main();

            System.out.print("Please,Enter your choice:");
            int choice = ob.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nWelcome to Admin Panel");

                    System.out.println("\n");

                    Admin ad = new Admin();
                    ad.admin();

                    System.out.println("This info delivery through email.");
                    System.out.println("\n\n");

                    System.out.println("What do you want?\n");
                    System.out.println("1.Log in");
                    System.out.println("2.Go back.\n\n");

                    System.out.print("please input your choice:");
                    int choice1 = ob.nextInt();

                    System.out.println("\n");

                    switch (choice1) {

                        case 1:
                            
                            System.out.println("\n");

                            

                            System.out.print("Enter your Id:");
                            String adminId = ob.next();

                            System.out.print("Enter your password:");
                            String adminPassword = ob.next();

                            // System.out.println(adminname);
                            // System.out.println(adminid);
                            // System.out.println(adminpassword);

                            if ((adminId.equals(ad.adminId))
                                    && (adminPassword.equals(ad.getPass()))) {
                                System.out.println("Login Failed");
                            }

                            else {
                                System.out.println("Your are log in successfully\n");

                                System.out.println("What do you want?\n");

                                System.out.println("1.Teacher info update");
                                System.out.println("2.Student info update\n");

                                System.out.print("Enter your choice:");
                                int choice2 = ob.nextInt();

                                switch (choice2) {

                                    case 1:
                                        System.out.println(" Admin Creats a Teacher account.\n");

                                        System.out.print("Enter the teache's name:");
                                        String c = ob.next();
                                        String teachername = ob.next();

                                        System.out.print("Enter the teacher's Id:");
                                        String c4 = ob.next();
                                        String teacherid = ob.nextLine();

                                        System.out.print("Enter the teacher's password:");
                                        String c8 = ob.next();
                                        String teacherpassword = ob.nextLine();
                                        System.out.println("\n Teacher acoount is created.\n");

                                        System.out.println("Those info is given through the mail.");

                                        Section.sectionDisplay();

                                       

                                        // System.out.println("The teacher's name is : " + teachername);
                                        // System.out.println("The teacher's id is :" + teacherid);
                                        // System.out.println("The teacher's password is : " + teacherpassword);
                                        // System.out.println("Those info is given through the mail.");

                                        System.out.println("\n");

                                        System.out.println("1.Teacher log in.");
                                        System.out.println("2.Back in.");

                                        System.out.print("\nEnter your choice:");

                                        int choice3 = ob.nextInt();

                                        switch (choice3) {
                                            case 1:

        
                                                System.out.print("Enter the teacher's Id:");
                                                String teacherid1 = ob.next();

                                                System.out.print("Enter the teacher's password:");
                                                String teacherpassword1 = ob.next();

                                                
                                                if (teacherid1.equals(teacherid)
                                                        && teacherpassword1.equals(teacherpassword)) {
                                                    System.out.println("Log in failed.");
                                                }

                                                else {
                                                    System.out.println("Log in successfully.");

                                                    System.out.println("\n Welcome to Teacher portal.\n");

                                                    
                                                    Section.Display();

                                                }
                                                break;

                                            case 2: {
                                                System.out.println("back in successfully.");
                                            }
                                                break;

                                            default: {
                                                System.out.println("Invaild.");
                                            }
                                                break;
                                        }

                                        break;

                                    case 2:
                                        System.out.println("welcome to student panel");
                                        System.out.println("\n");
                                        
                                        ad.addStudent();

                                        System.out.println("\n\n");

                                        
                                        System.out.print("Enter student Id:");
                                        String c9 = ob.next();
                                        String stdId = ob.nextLine();

                                        System.out.print("Enter student password:");
                                        String stdPassword = ob.nextLine();

                                        
                                        System.out.println("\n");

                                        if (stdId.equals(stdId) && stdPassword.equals(stdPassword)) {
                                            System.out.println("log in successfullty.");
                                        }

                                        else {
                                            System.out.println("log in failed");
                                        }
                                        break;

                                }
                            }

                        case 2:

                            System.out.println("Your are successfull back from this site");
                            break;
                    }

                    break;

                case 2:
                    System.out.print("Enter the teache's name:");
                    String c4 = ob.nextLine();

                    String teachername = ob.nextLine();

                    System.out.print("Enter the teacher's Id:");
                    String teacherid = ob.nextLine();

                    System.out.print("Enter the teacher's password:");
                    String teacherpassword = ob.nextLine();

                    System.out.println("\n");

                    Teacher tea = new Teacher(teachername, teacherid);

                    tea.teachername = teachername;
                    tea.teacherid = teacherid;

                    tea.setteacherPass(teacherpassword);

                    if (teacherpassword.equals(teacherpassword)) {
                        System.out.println("log in successfully");
                    }

                    else{
                        System.out.println("Log in failed.");
                    }

                    Section.Display();

               break;
                case 3:

                    System.out.print("Enter your name:");
                    String c1 = ob.next();

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
                    Section.Display();

                    break;

                case 4:
                    System.out.println("You are exiting from this panel.");
                    System.out.println("Thank you for visiting out panel.");

                    result = false;
                    break;

                default:
                    System.out.println("invaild input");
                    break;

            }

        }
        ob.close();

    }

}
