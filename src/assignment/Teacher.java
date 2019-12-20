package assignment;

import java.util.ArrayList;
import java.util.List;

// Teacher känner till 1 ProgramCoordinator.
// Teacher känner till flera Seminar.
public class Teacher {
    private String name;
    private List<Seminar> seminars;

    //Konstruktor
    public Teacher(String name) {
        this.name = name;
        this.seminars = new ArrayList<>();
    }

    public List<Seminar> getSeminarHistory() {
        return this.seminars;
    }
//
//    public getCurrentSeminar() {
//
//    }

    // Egna metoder
    public String getName() {
        return this.name;
    }

    public void addSeminar(Seminar seminar) {
        this.seminars.add(seminar);
    }
}
