package umlToJava;

public class Subject {
    private String name;
    private String info;

    //Konstruktor
    public Subject(String name) {
        this.name = name;
    }

    // Metoder
    public String getName() {
        return this.name;
    }

    // Används inte
    public void setInfo(String info) {
        this.info = info;
    }

    public String viewSubjectInfo() {
        return this.info;
    }
}
