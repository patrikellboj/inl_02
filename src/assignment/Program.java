package assignment;

// Program känner till 1 ProgramCoordinator.
// Program känner till flera Seminar.

public class Program {
    private String name;
    private ProgramCoordinator coordinator;

    //Konstruktor
    public Program(String name) {
        this.name = name;
    }

//    public getStudents() {
//
//    }

    // Egna metoder
    public String getName() {
        return this.name;
    }

    public void setCoordinator(ProgramCoordinator coordinator) {
        this.coordinator = coordinator;
    }

    public ProgramCoordinator getCoordinator() {
        return this.coordinator;
    }
}
