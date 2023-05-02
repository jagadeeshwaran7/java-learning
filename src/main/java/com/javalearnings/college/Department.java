package com.javalearnings.college;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String departmentName;
    private final Integer departmentCode;
    private final List<Student> students = new ArrayList<>();

    //Here using Argument constructor for initializing class fields
    public Department(final String departmentName, final Integer departmentCode) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    public void addStudent(final Student student) {students.add(student);}

    public String getDepartmentName() {return departmentName;}

    public Integer getDepartmentCode() {return departmentCode;}

    public List<Student> getStudents() {return students;}

}
