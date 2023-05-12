package Singha.Student;

import java.util.Scanner;

import Singha.Admin.Admin;

public class Section extends Admin {
    public static String secName;
    public static String classTime;
    public static int roomNumber;
    public static String semeSter;

    public static void sectionDisplay() {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the section name:");
        String secname = ob.nextLine();

        System.out.println("Your class time:");
        String classtime = ob.nextLine();

        System.out.println("Enter your classNumber:");
        int roomnumber = ob.nextInt();

        System.out.println("Enter the semester:");
        String semester = ob.nextLine();

        secName = secname;
        classTime = classtime;
        roomNumber = roomnumber;
        semeSter = semester;

    }

    public static void Display() {

        System.out.print("Section name is :" + secName);
        System.out.print("Class time is :" + classTime);
        System.out.print("Section Number is :" + roomNumber);
        System.out.print("Semester is :" + semeSter);
    }

}
