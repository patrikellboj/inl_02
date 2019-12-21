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

    // Metoder

    // TODO: 2019-12-21 Fixa den här metoden 
//    public getStudents() {
//
//    }

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
