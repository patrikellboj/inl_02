package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private ProgramCoordinator coordinator;
    private List<Seminar> seminars;

    //Konstruktor
    public Program(String name) {
        this.name = name;
        this.seminars = new ArrayList<>();
    }

    // Metoder
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for(Seminar seminar: seminars) {
            for(Attendance attendance: seminar.getStudentsAttended()) {
                if(!students.contains(attendance.getStudent())) {
                    students.add(attendance.getStudent());
                }
            }
        }
        return students;
    }

    public String getName() {
        return this.name;
    }

    public void setCoordinator(ProgramCoordinator coordinator) {
        this.coordinator = coordinator;
    }

    public ProgramCoordinator getCoordinator() {
        return this.coordinator;
    }

    public void addSeminars(Seminar seminar) {
        if(this.equals(seminar.getProgram())) {
            this.seminars.add(seminar);
        }
    }
}
