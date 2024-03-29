package umlToJava;

//        Om du i din Main skulle instansiera dina klasser, kan man då få reda på följande
//        •	Vilket program en Coordinator ansvarar för?         Rad 99
//        •	Vilka lärare som finns för ett Program?             Rad 103
//        •	Hur många studenter som finns i ett Program?        Rad 128
//        •	Hur man lägger till en ny student till ett Program. Rad 81
//        •	Vad närvaron är för Student X?                      Rad 118
//        •	Vilka kurser/seminarier som en lärare undervisat i? Rad 108
//        •	Vilka ämnen/Subjects som undervisats i ett Seminar? Rad 113
//        •	Närvaron för Seminar X?                             Rad 123
//        •	Hur man skapar en ny Attendance?                    Rad 73

public class Main {
    public static void main(String[] args) {

        // Skapar studenter.
        Student s1 = new Student("Carolina Klüft");
        Student s2 = new Student("Stefan Sauk");
        Student s3 = new Student("Erik Gyllenhammar");
        Student s4 = new Student("Kajsa Bergkvist");
        Student s5 = new Student("Johan Eklöf");
        Student s6 = new Student("Lars Lestadius");

        // Skapar program.
        Program java19 = new Program("Java-19");

        // Skapar utbildningsledare.
        ProgramCoordinator c1 = new ProgramCoordinator("Sara Strömvall", java19);

        // Skapar lärare
        Teacher t1 = new Teacher("Sigrun Olafsdottir");
        Teacher t2 = new Teacher("Robert Kärrbrant");
        Teacher t3 = new Teacher("Mahmud Al Hakim");

        // Lägger till lärare
        c1.addTeacher(t1);
        c1.addTeacher(t2);
        c1.addTeacher(t3);

        // Skapar kurser med tillhörande lärare och program.
        Seminar sem1 = new Seminar("Java-utveckling", t3, java19);
        Seminar sem2 = new Seminar("Objektorienterad Programmering & Java", t1, java19);
        Seminar sem3 = new Seminar("Objektorienterad Analys & Design", t2, java19);
        Seminar sem4 = new Seminar("Databasteknik & Java", t1, java19);
        Seminar sem5 = new Seminar("Java Backend", t3, java19);

        // Lägg till seminar till kurs
        java19.addSeminars(sem1);

        // Lägger till kurser till lärare.
        t1.addSeminar(sem2);
        t1.addSeminar(sem4);
        t2.addSeminar(sem3);
        t3.addSeminar(sem1);
        t3.addSeminar(sem5);

        // Skapar ämnen/subject
        Subject sub1 = new Subject("Lektion 1");
        Subject sub2 = new Subject("Lektion 2");
        Subject sub3 = new Subject("Lektion 3");
        Subject sub4 = new Subject("Lektion 4");
        Subject sub5 = new Subject("Lektion 5");

        // Lägger till ämnen till kursen sem1.
        sem1.addSubject(sub1);
        sem1.addSubject(sub2);
        sem1.addSubject(sub3);
        sem1.addSubject(sub4);
        sem1.addSubject(sub5);

        // • Hur man skapar en ny Attendance?
        // Skapar olika attendance och lägger till student s1 på olika kurser
        Attendance atn1 = new Attendance(sem1, s1);
        atn1.registerAttendance(sem1, s1);
        Attendance atn2 = new Attendance(sem2, s1);
        atn2.registerAttendance(sem2, s1);
        Attendance atn3 = new Attendance(sem3, s1);
        atn3.registerAttendance(sem3, s1);

        // • Hur man lägger till en ny student till ett Program
        // Skapa en student
        // Skapa en Attendance med Seminar och studenten
        // Registrera Attendance på kursen
        
        // Skapar olika attendance och lägger till olika studenter på kursen sem1.
        Attendance atn4 = new Attendance(sem1, s2);
        atn4.registerAttendance(sem1, s2);
        Attendance atn5 = new Attendance(sem1, s3);
        atn5.registerAttendance(sem1, s3);
        Attendance atn6 = new Attendance(sem1, s4);
        atn6.registerAttendance(sem1, s4);
        Attendance atn7 = new Attendance(sem1, s5);
        atn7.registerAttendance(sem1, s5);
        
        // Utbildningsledare
        System.out.println("Utbildningsledare: " + java19.getCoordinator().getName());

        // • Vilket program en Coordinator ansvarar för?
        System.out.println("Program: " + c1.getProgram().getName());
        System.out.println("----------------");

        // • Vilka lärare som finns för ett Program?
        System.out.println("Lärare för programmet " + java19.getName() + " är:");
        java19.getCoordinator().getTeachers().forEach((e) -> System.out.println(e.getName()));
        System.out.println("----------------");

        // Vilka kurser/seminarier som en lärare undervisat i?
        System.out.println(t1.getName() + " har undervisat i: ");
        t1.getSeminarHistory().forEach((e) -> System.out.println("Kurs: " + e.getName()));
        System.out.println("----------------");

        // • Vilka ämnen som undervisats i ett Seminar?
        System.out.println("Kurs " + sem1.getName() + " har haft följande lektioner: ");
        sem1.getSubjects().forEach((e) -> System.out.println(e.getName()));
        System.out.println("----------------");

        // • Vad närvaron är för Student X?
        System.out.println("Student " + s1.getName() + " har närvarat på: ");
        s1.getSeminarsAttended().forEach((e) -> System.out.println(e.getSeminar().getName()));
        System.out.println("----------------");

        // • Närvaron för Seminar X?
        System.out.println("Studenter som har närvarat på kursen " + sem1.getName() + ":");
        sem1.getStudentsAttended().forEach((e) -> System.out.println(e.getStudent().getName()));
        System.out.println("----------------");

        // • Hur många studenter som finns i ett Program?
        System.out.println("Det går " + java19.getStudents().size() +
                "st studenter i programmet " + java19.getName());
        System.out.println("----------------");

        // Test för metoder som inte används
        // System.out.println(t2.getCurrentSeminar().getName());

        // sem1.getTotalAttendance();

        // System.out.println(c1.findTeacher("Hassan Svensson"));
        // System.out.println(c1.findTeacher("Robert Kärrbrant").getName());

        // System.out.println(atn1.isAttended());
        // atn1.removeAttendance();
        // System.out.println(atn1.isAttended());

        // sem1.getSubjects().get(3).setInfo("Denna lektion lektion kommer handla om bla bla bla");
        // System.out.println(sub4.viewSubjectInfo());
    }
}
