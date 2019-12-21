package assignment;

import java.util.ArrayList;
import java.util.List;

public class ProgramCoordinator {
    private String name;
    private Program program;
    private List<Teacher> teachers;

    //Konstruktor
    public ProgramCoordinator(String name, Program program) {
        this.name = name;
        this.program = program;
        this.teachers = new ArrayList<>();
        program.setCoordinator(this);
    }

    // Metoder
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);

    }

    // TODO: 2019-12-20 Fixa metoden findTeacher 
    public Teacher findTeacher(String teacher) {
        for(Teacher e : teachers) {
            if(e.getName().equalsIgnoreCase(teacher)) {
                return e;
            }
        }
        return null;
    }

    public Program getProgram() {
        return this.program;
    }

    public String getName() {
        return this.name;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }

}
