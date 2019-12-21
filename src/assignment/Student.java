package assignment;

// Student känner till flera Attendance (???).

import java.util.ArrayList;
import java.util.List;

public class Student extends Program {
    private String name;
    private List<Attendance> attendedSeminars;

    public Student(String name) {
        this.name = name;
        this.attendedSeminars = new ArrayList<>();
    }

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
