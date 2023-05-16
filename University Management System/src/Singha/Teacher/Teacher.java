package Singha.Teacher;

import java.util.Scanner;

import Singha.Admin.*;

public class Teacher extends Admin {
    public String teachername;
    public String teacherid;
    private String teacherpassword;

    public Teacher(String teachername, String teacherid) {

        this.teachername = teachername;
        this.teacherid = teacherid;
    }

    public void setteacherPass(String teacherpassword) {
        this.teacherpassword = teacherpassword;
    }

    public String getTpass() {
        return teacherpassword;
    }

}
