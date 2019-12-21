package assignment;

// Attendance känner till 1 Seminar.
// Attendance känner till 1 Student (???).

public class Attendance {
    private boolean attendanceLevel = false;
    private Seminar seminar;
    private Student student;

    //Konstruktor
    public Attendance(Seminar seminar, Student student) {
        attendanceLevel = true;
        this.seminar = seminar;
        this.student = student;
        registerAttendance(seminar, student);
    }

    // Exempelvis när man lägger till en Attendance behöver Seminar kunna lägga till
    // en attendance på samma sätt som Student har.

    public void registerAttendance(Seminar seminar, Student student) {
        student.attendSeminar(this);
        seminar.addAttendence(this);
    }

    public Seminar getSeminar() {
        return this.seminar;
    }

    public Student getStudent() {
        return this.student;
    }

//
//    public removeAttendance(Seminar, Student) {
//
//    }
}
