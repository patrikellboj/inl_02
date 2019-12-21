package umlToJava;

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

    // Metoder
    public String getName() {
        return this.name;
    }

    public Program getProgram() {
        return this.program;
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

    public void getTotalAttendance() {
        this.studentsAttended.forEach((e) -> System.out.println(e.getStudent().getName()));
    }

}
