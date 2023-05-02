package com.javalearnings.college;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String studentName;
    private final Integer studentId;
    private Integer marks;
    private final List<Subject> subjects = new ArrayList<>();

    //Using argument constructor for initializing class fields
    public Student(String studentName, final Integer studentId) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void addSubject(final Subject subject) {subjects.add(subject);}
    public String getStudentName() {return studentName;}

    public Integer getStudentId() {return studentId;}

    public List<Subject> getSubjects() {return subjects;}

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Float getAverage() {
        return CalciUtils.findAverage(marks, subjects.size());
    }

}
