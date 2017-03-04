package com.company;

import java.util.ArrayList;

/**
 * Created by Brion Mario on 27/04/2016.
 */
public class SummaryL4 {
    Student student = new Student();
    ResitDatabase resitDatabase = new ResitDatabase();
    RetakeDatabase retakeDatabase = new RetakeDatabase();

    public void getLevel4Summary(ArrayList<Student> students, ArrayList<ResitDatabase> resits, ArrayList<RetakeDatabase> retakes) {
        System.out.println("");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("                             Summary of Level 04 Modules                              ");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("");
        System.out.println("                        Computer System Fundamentals (ECSI404)                        ");
        System.out.println("               --------------------------------------------------------               ");

        System.out.println("              List of Students who got Resits for the Module (ECSI404)                ");
        System.out.println("");
        for (ResitDatabase resit : resits) {
            resitDatabase = resit;
            if (resitDatabase.getLevel4Mod1()>=30 && resitDatabase.getLevel4Mod1()<40) {
                System.out.println("Registration Number : " + resitDatabase.getIndexNumber());
                System.out.println("Name of the Student : " + resitDatabase.getFirstName().toUpperCase() + " " + resitDatabase.getLastName().toUpperCase());
                System.out.println("");
            }
        }

        System.out.println("");
        System.out.println("              List of Students who got Retakes for the Module (ECSI404)                ");
        System.out.println("");
        for (RetakeDatabase retake : retakes) {
            retakeDatabase = retake;
            if (retakeDatabase.getLevel4Mod1()<30) {
                System.out.println("Registration Number : " + retakeDatabase.getIndexNumber());
                System.out.println("Name of the Student : " + retakeDatabase.getFirstName().toUpperCase() + " " + retakeDatabase.getLastName().toUpperCase());
                System.out.println("");
            }
        }

        System.out.println("");
        System.out.println("                   List of Students who failed the Module (ECSI404)                   ");
        System.out.println("");
        for (Student student1 : students) {
            student = student1;
            if (student.getLevel4Mod1()<30) {
                System.out.println("Registration Number : " + student.getIndexNumber());
                System.out.println("Name of the Student : " + student.getFirstName().toUpperCase() + " " + student.getLastName().toUpperCase());
                System.out.println("");
            }
        }
        System.out.println("                             Career Management (ECSI400)                              ");
        System.out.println("               --------------------------------------------------------               ");

        System.out.println("              List of Students who got Resits for the Module (ECSI400)                ");
        System.out.println("");
        for (ResitDatabase resit : resits) {
            resitDatabase = resit;
            if (resitDatabase.getLevel4Mod2()>=30 && resitDatabase.getLevel4Mod2()<40) {
                System.out.println("Registration Number : " + resitDatabase.getIndexNumber());
                System.out.println("Name of the Student : " + resitDatabase.getFirstName().toUpperCase() + " " + resitDatabase.getLastName().toUpperCase());
                System.out.println("");
            }
        }

        System.out.println("");
        System.out.println("              List of Students who got Retakes for the Module (ECSI400)                ");
        System.out.println("");
        for (RetakeDatabase retake : retakes) {
            retakeDatabase = retake;
            if (retakeDatabase.getLevel4Mod2()<30) {
                System.out.println("Registration Number : " + retakeDatabase.getIndexNumber());
                System.out.println("Name of the Student : " + retakeDatabase.getFirstName().toUpperCase() + " " + retakeDatabase.getLastName().toUpperCase());
                System.out.println("");
            }
        }

        System.out.println("");
        System.out.println("                   List of Students who failed the Module (ECSI400)                   ");
        System.out.println("");
        for (Student student1 : students) {
            student = student1;
            if (student.getLevel4Mod2()<30) {
                System.out.println("Registration Number : " + student.getIndexNumber());
                System.out.println("Name of the Student : " + student.getFirstName().toUpperCase() + " " + student.getLastName().toUpperCase());
                System.out.println("");
            }
        }

    }
}
