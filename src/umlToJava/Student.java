package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Attendance> attendedSeminars;

    // Konstruktor
    public Student(String name) {
        this.name = name;
        this.attendedSeminars = new ArrayList<>();
    }

    // Metoder
    public void attendSeminar(Attendance attendance) {
        this.attendedSeminars.add(attendance);
    }

    public List<Attendance> getSeminarsAttended() {
        return this.attendedSeminars;
    }

    public String getName() {
        return this.name;
    }
}
