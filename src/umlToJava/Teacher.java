package umlToJava;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Seminar> seminars;

    //Konstruktor
    public Teacher(String name) {
        this.name = name;
        this.seminars = new ArrayList<>();
    }

    // Metoder
    public List<Seminar> getSeminarHistory() {
        return this.seminars;
    }

    public String getName() {
        return this.name;
    }

    public void addSeminar(Seminar seminar) {
        this.seminars.add(seminar);
    }

    // Används inte
    public Seminar getCurrentSeminar() {
        return this.seminars.get(0);
    }
}
