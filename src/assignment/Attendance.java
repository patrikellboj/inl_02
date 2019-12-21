package assignment;

public class Attendance {
    private boolean attendanceLevel = false;
    private Seminar seminar;
    private Student student;

    //Konstruktor
    public Attendance(Seminar seminar, Student student) {
        this.seminar = seminar;
        this.student = student;
    }

    // Metoder
    public void registerAttendance(Seminar seminar, Student student) {
        attendanceLevel = true;
        student.attendSeminar(this);
        seminar.addAttendence(this);
    }

    public Seminar getSeminar() {
        return this.seminar;
    }

    public Student getStudent() {
        return this.student;
    }

    // TODO: 2019-12-21 Fixa den här metoden 
//    public removeAttendance(Seminar, Student) {
//
//    }
}
