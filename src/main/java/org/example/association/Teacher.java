package org.example.association;


//  Solid Line with Arrow — Association (with Direction)

public class Teacher {

    Student student;  // This is a field-level reference to another class

    public Teacher(Student student){
        this.student = student;
    }

    public void startClass(){
        student.attendClass();
    }
}

// Teacher ───────────→ Student

/*
Solid line = association
Arrow = unidirectional (Teacher → Student)
Teacher uses or references Student
*/