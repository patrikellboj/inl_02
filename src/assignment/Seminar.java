package assignment;

// Seminar kännner till 1 Teacher.
// Seminar känner till 1 Program.
// Seminar kännner till flera Subject.
// Seminar känner till 1 eller flera Attendance.

import java.util.ArrayList;
import java.util.List;

public class Seminar {
    private String name;
    private Teacher teacher;
    private Program program;
    private List<Subject> subjects;
    private List<Attendance> studentsAttended;

    //Konstruktor
    public Seminar(String name, Teacher teacher, Program program) {
        this.name = name;
        this.teacher = teacher;
        this.program = program;
        this.subjects = new ArrayList<>();
        this.studentsAttended = new ArrayList<>();

    }

//    public getTotalAttendance() {
//
//    }

    // Egna metoder
    public String getName() {
        return this.name;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return this.subjects;
    }

    public void addAttendence(Attendance attendance) {
        this.studentsAttended.add(attendance);
    }

    public List<Attendance> getStudentsAttended() {
        return this.studentsAttended;
    }

}
