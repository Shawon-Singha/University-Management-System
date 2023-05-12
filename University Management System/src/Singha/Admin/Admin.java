package Singha.Admin;

import java.util.Scanner;

import Singha.Author.Authority;

public class Admin extends Authority {
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

    public void admin() {
        Admin ad = new Admin();
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter your name:");

        String adminName = ob.next();

        System.out.print("Enter your Id:");
        String adminId = ob.next();

        System.out.print("Enter your password:");
        String adminPassword = ob.next();

        // System.out.println("");
        // System.out.println("\nName of Admin:" + adminName);
        // System.out.println("Id of Admin:" + adminId);
        // System.out.println("Password of Admin:" + adminPassword);
    }

    public void addTeacher() {

        Scanner ob = new Scanner(System.in);
        System.out.println(" Creat a Teacher account.\n");

        System.out.print("Enter the teache's name:");
        String c3 = ob.next();

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

        System.out.println("acoount is created.");
        System.out.println("\n\n");

    }

    public void addStudent() {

        Scanner std = new Scanner(System.in);
        System.out.print("Enter your name:");

        String stdName = std.nextLine();

        System.out.print("Enter your Id:");
        String stdId = std.nextLine();

        System.out.print("Enter your password:");
        String stdPassword = std.nextLine();

        System.out.print("Enter your age:");
        int stdAge = std.nextInt();

        System.out.print("Enter your Student mail:");
        String c6 = std.next();

        String stdMail = std.nextLine();

        System.out.println("\n\n");

        System.out.println("Student's name:" + stdName);
        System.out.println("Student's id:" + stdId);
        System.out.println("Student's password:" + stdPassword);
        System.out.println("Student's age:" + stdAge);
        System.out.println("Student's mail:" + stdMail);
        System.out.println("those info is given bt mail.");
    }

}
