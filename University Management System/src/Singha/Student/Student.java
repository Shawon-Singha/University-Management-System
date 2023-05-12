package Singha.Student;

import java.util.Scanner;

import javax.swing.Spring;

import Singha.Admin.Admin;

public class Student extends Admin {

    private String password;
    private String StdMail;

    public String name;
    public String id;
    public String gender;
    public int age;

    public Student(String name, String id, String gender, int age) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStdMail(String StdMail) {
        this.StdMail = StdMail;
    }

    public String getPassword() {
        return password;
    }

    public String getStdMail() {
        return StdMail;
    }

    public void studentDisplay() {
        System.out.println("Name :" + name);
        System.out.println("Id :" + id);
        System.out.println("Password :" + password);
        System.out.println("Gender :" + gender);
        System.out.println("Age :" + age);
        System.out.println("Student Mail :" + StdMail);

    }
}
