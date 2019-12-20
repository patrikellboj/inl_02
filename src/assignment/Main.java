package assignment;

//        Om du i din Main skulle instansiera dina klasser, kan man då få reda på följande
//        •	Vilket program en Coordinator ansvarar för?
//        •	Vilka lärare som finns för ett Program?
//        todo •	Hur många studenter som finns i ett Program?
//        todo •	Hur man lägger till en ny student till ett Program
//        todo •	Vad närvaron är för Student X?
//        Vilka kurser/seminarier som en lärare undervisat i?
//        Vilka ämnen/Subjects som undervisats i ett Seminar?
//        todo •	Närvaron för Seminar X?
//        todo •	Hur man skapar en ny Attendance?

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Carolina Klüft");
        Student s2 = new Student("Stefan Sauk");
        Student s3 = new Student("Erik Gyllenhammar");
        Student s4 = new Student("Kajsa Bergkvist");
        Student s5 = new Student("Johan Eklöf");
        Student s6 = new Student("Lars Lestadius");

        Program java19 = new Program("Java-19");

        ProgramCoordinator c1 = new ProgramCoordinator("Sara Strömvall", java19);

        Teacher t1 = new Teacher("Sigrun Olafsdottir");
        Teacher t2 = new Teacher("Robert Kärrbrant");
        Teacher t3 = new Teacher("Mahmud Al Hakim");

        c1.addTeacher(t1);
        c1.addTeacher(t2);
        c1.addTeacher(t3);

        Seminar sem1 = new Seminar("Java-utveckling", t3, java19);
        Seminar sem2 = new Seminar("Objektorienterad Programmering & Java", t1, java19);
        Seminar sem3 = new Seminar("Objektorienterad Analys & Design", t2, java19);
        Seminar sem4 = new Seminar("Databasteknik & Java", t1, java19);
        Seminar sem5 = new Seminar("Java Backend", t3, java19);

        t1.addSeminar(sem2);
        t1.addSeminar(sem4);
        t2.addSeminar(sem3);
        t3.addSeminar(sem1);
        t3.addSeminar(sem5);

        Subject sub1 = new Subject("Lektion 1");
        Subject sub2 = new Subject("Lektion 2");
        Subject sub3 = new Subject("Lektion 3");
        Subject sub4 = new Subject("Lektion 4");
        Subject sub5 = new Subject("Lektion 5");

        sem1.addSubject(sub1);
        sem1.addSubject(sub2);
        sem1.addSubject(sub3);
        sem1.addSubject(sub4);
        sem1.addSubject(sub5);

        // Utbildningsledare
        System.out.println("Utbildningsledare: " + java19.getCoordinator().getName());

        // • Vilket program en Coordinator ansvarar för?
        System.out.println("Program: " + c1.getProgram().getName());


        // • Vilka lärare som finns för ett Program?
        java19.getCoordinator().getTeachers().forEach((e) -> System.out.println("Lärare: " + e.getName()));
        System.out.println("----------------");

        // Vilka kurser/seminarier som en lärare undervisat i?
        System.out.println(t1.getName() + " har undervisat i: ");
        t1.getSeminarHistory().forEach((e) -> System.out.println("Kurs: " + e.getName()));
        System.out.println("----------------");

        // •	Vilka ämnen som undervisats i ett Seminar?
        System.out.println("Kurs " + sem1.getName() + " har haft följande lektioner: ");
        sem1.getSubjects().forEach((e) -> System.out.println(e.getName()));
        System.out.println("----------------");

    }
}

//        •	Hur många studenter som finns i ett Program?
//        •	Hur man lägger till en ny student till ett Program
//        •	Vad närvaron är för Student X?
//        •	Vilka kurser/seminarier som en lärare undervisat i?
//        •	Närvaron för Seminar X?
//        •	Hur man skapar en ny Attendance?
