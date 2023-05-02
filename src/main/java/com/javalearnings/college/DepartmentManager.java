package com.javalearnings.college;

import java.util.List;

public class DepartmentManager {
    public static void main(String[] args) {
        // Creating objects for each subject
        Subject tamil = new Subject("Tamil", 1001);
        Subject english = new Subject("English", 1002);
        Subject maths = new Subject("Maths", 1003);
        Subject science = new Subject("Science", 1004);
        Subject socialScience = new Subject("Social Science", 1005);

        //Creating objects for students
        Student jaga = new Student("Jagadeesh", 1729);
        Student vicky = new Student("vicky", 1730);

        // Adding subjects for department of the Students
        jaga.addSubject(tamil);
        jaga.addSubject(english);
        jaga.addSubject(maths);
        jaga.addSubject(science);
        jaga.addSubject(socialScience);

        vicky.addSubject(tamil);
        vicky.addSubject(english);
        vicky.addSubject(maths);
        vicky.addSubject(science);
        vicky.addSubject(socialScience);

        //Set marks
        jaga.setMarks(350);
        vicky.setMarks(450);

        //Creating Object for each Department
        Department cse = new Department("CSE", 8901);

        //Adding student object to the particular department
        cse.addStudent(jaga);
        cse.addStudent(vicky);

        //Print information
        System.out.println("---------- Department Information --------------");
        System.out.println("Department Id: " + cse.getDepartmentCode());
        System.out.println("Department Name: " + cse.getDepartmentName());

        List<Student> studentList = cse.getStudents();

        System.out.println("-----------------Students--------------");
        for (Student student : studentList) {

            System.out.println("Student Id: " + student.getStudentId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Student Average mark: " + student.getAverage());
            System.out.println("-----------------Subjects--------------");

            List<Subject> subjectList = student.getSubjects();
            for (Subject subject : subjectList) {
                System.out.println("Subject Id: " + subject.getSubjectCode());
                System.out.println("Subject Name: " + subject.getSubjectName());
            }
        }


    }
}
