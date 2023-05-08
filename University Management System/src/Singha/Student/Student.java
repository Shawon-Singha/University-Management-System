package Singha.Student;

import Singha.Admin.Admin;

public class Student extends Admin {
    public String name;
    public String id;
    private String password;
    public String gender;
    public int age;
    private String StdMail;

    void course()
    {

    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setStdMail(String StdMail)
    {
        this.StdMail = StdMail;
    }

    public String getPassword()
    {
        return password;
    }

    public String getStdMail()
    {
        return StdMail;
    }

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Password:"+password);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Student Mail:"+StdMail);

    }

    

}
