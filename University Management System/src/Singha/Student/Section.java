package Singha.Student;

import java.util.Scanner;

import Singha.Admin.Admin;

public class Section extends Admin {
    public static String secName;
    public static String classTime;
    public static int roomNumber;

    public static void sectionDisplay() {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the section name:");
        String secname = ob.nextLine();

        System.out.println("Your class time:");
        String classtime = ob.nextLine();

        System.out.println("Enter your classNumber:");
        int roomnumber = ob.nextInt();


        secName = secname;
        classTime = classtime;
        roomNumber = roomnumber;
       

    }

    public static void Display() {

        System.out.println("Section name is :" + secName);
        System.out.println("Class time is :" + classTime);
        System.out.println("Section Number is :" + roomNumber);
       
    }

}
