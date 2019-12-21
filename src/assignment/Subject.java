package assignment;

// Subject känner till 1 Seminar

public class Subject {
    private String name;

    //Konstruktor
    public Subject(String name) {
        this.name = name;
    }

    // Metoder

    // TODO: 2019-12-21 viewsubjectInfo
    // Även exempelvis i Subject finns en metod viewSubjectInfo().
    // Då kan man bara lägga till ett attribut -info:String
//    public viewSubjectInfo() {
//
//    }

    public String getName() {
        return this.name;
    }
}
