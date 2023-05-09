package Singha.Admin;

import Singha.Author.Authority;

public class Admin implements Authority {
    public String adminName;
    public String adminId;
    private String adminPassword;

    public void main()
    {

    }

     public void setPass(String adminPassword)
    {
       this.adminPassword = adminPassword;
    }

    public String getPass()
    {
        return adminPassword;
    }

    public void adminDisplay()
    {
        System.out.println("Name of Admin:"+adminName);
        System.out.println("Id of Admin:"+adminId);
        System.out.println("Password of Admin:"+adminPassword);
    }

    void addTeacher()
    {

    }

    void addStudent()
    {
        
    }

}
