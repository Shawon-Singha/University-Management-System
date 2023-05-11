package Singha.Admin;

import java.util.Scanner;

import Singha.Author.Authority;

public class Admin implements Authority {
    public String adminName;
    public String adminId;
    private String adminPassword;

    public void main() {

    }

    public void setPass(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getPass() {
        return adminPassword;
    }

    public void adminDisplay() {
        System.out.println("Name of Admin:" + adminName);
        System.out.println("Id of Admin:" + adminId);
        System.out.println("Password of Admin:" + adminPassword);
    }

    /**
     * 
     */
    public void addTeacher() {
        String teacherName1;
        String teacherpass1;
        String teacherid1;

    
    }
    public void addStudent() {

        Scanner std = new Scanner(System.in);
                                System.out.print("Enter your name:");
                                 String c4 = std.nextLine();

                                String stdName = std.nextLine();

                                System.out.print("Enter your Id:");
                                String stdId = std.nextLine();

                                System.out.print("Enter your password:");
                                String stdPassword = std.nextLine();

                                System.out.print("Enter your age:");
                                int stdAge = std.nextInt();

                                System.out.print("Enter your gender:");
                                String c2 = std.next();

                                String stdGender = std.nextLine();

                                System.out.print("Enter your Student mail:");
                                String stdMail = std.nextLine();

                                System.out.println("\n\n"); 
                                
            System.out.println("Student's name:"+stdName);
            System.out.println("Student's id:"+stdId);
            System.out.println("Student's password:"+stdPassword);
            System.out.println("Student's age:"+stdAge);
            System.out.println("Student's gender:"+stdGender);
            System.out.println("Student's mail:"+stdMail);
    }

    }


