package com.javalearnings.college;
public class Subject {
    private final String subjectName;
    private final Integer subjectCode;
    private Integer mark;
    //Using argument constructor for initializing class fields
    public Subject(final String subjectName, final Integer subjectCode) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {return subjectName;}

    public Integer getSubjectCode() {return subjectCode;}

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
