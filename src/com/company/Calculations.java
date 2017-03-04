package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Brion Mario on 15/04/2016.
 */
public class Calculations {
    Student student = new Student();

    //To determine the condone modules for Level 04
    public static void Condoned(int mod){
        switch (mod){
            case 0:
                System.out.println("");
                System.out.println("Computer System Fundamentals (ECSI404) Module has been condoned");
                Main.creditL4+=20;
                break;
            case 1:
                System.out.println("");
                System.out.println("Communication & Career Management (ECSI400) module has been condoned");
                Main.creditL4+=20;
                break;
            case 2:
                System.out.println("");
                System.out.println("Information & Data Modeling (ECSI412) module has been condoned");
                Main.creditL4+=20;
                break;
            case 3:
                System.out.println("");
                System.out.println("Software Development Principles 1 (ECSI410) module has been condoned");
                Main.creditL4+=20;
                break;
            case 4:
                System.out.println("");
                System.out.println("Information Systems (ECSI411) module has been condoned");
                Main.creditL4+=20;
                break;
            case 5:
                System.out.println("");
                System.out.println("Software Development Principles 2 (ECSI405) module has been condoned");
                Main.creditL4+=20;
                break;
            default:
                System.out.println("");
                System.out.println("Oops! Something went wrong.");

        }
    }

    //To determine the Retake modules for Level 04
    public static void Retake(int mod){
        switch (mod){
            case 0:
                System.out.println("");
                System.out.println("Computer System Fundamentals (ECSI404) Module has to be retaken");
                break;
            case 1:
                System.out.println("");
                System.out.println("Communication & Career Management (ECSI400) module has to be retaken");
                break;
            case 2:
                System.out.println("");
                System.out.println("Information & Data Modeling (ECSI412) module has to be retaken");
                break;
            case 3:
                System.out.println("");
                System.out.println("Software Development Principles 1 (ECSI410) module has to be retaken");
                break;
            case 4:
                System.out.println("");
                System.out.println("Information Systems (ECSI411) module has to be retaken");
                break;
            case 5:
                System.out.println("");
                System.out.println("Software Development Principles 2 (ECSI405) module has to be retaken");
                break;
        }
    }


    //To determine the Retake modules for Level 05
    public static void RetakeL5(int mod){
        switch (mod){
            case 0:
                System.out.println("");
                System.out.println("Object Oriented Programming (CCS501) module has to be retaken");
                break;
            case 1:
                System.out.println("");
                System.out.println("Client-Server Architecture (CCS504) module has to be retaken");
                break;
            case 2:
                System.out.println("");
                System.out.println("Software Development Group Project (CCS503) module has to be retaken");
                break;
            case 3:
                System.out.println("");
                System.out.println("Database Systems (CCS502) module has to be retaken");
                break;
            case 4:
                System.out.println("");
                System.out.println("Optional module - Semester One has to be retaken");
                break;
            case 5:
                System.out.println("");
                System.out.println("Optional module - Semester Two module has to be retaken");
                break;
        }
    }

    //To determine the Retake modules for Level 06
    public static void RetakeL6(int mod){
        switch (mod){
            case 0:
                System.out.println("");
                System.out.println("Computer Science Project (CCS699) module has to be retaken");
                break;
            case 1:
                System.out.println("");
                System.out.println("Reasoning About Programs (CCS603) module has to be retaken");
                break;
            case 2:
                System.out.println("");
                System.out.println("Security & Forensics (CCS602) module has to be retaken");
                break;
            case 3:
                System.out.println("");
                System.out.println("iOS Development (CCS613) module has to be retaken");
                break;
            case 4:
                System.out.println("");
                System.out.println("Optional module - Semester One has to be retaken");
                break;
            case 5:
                System.out.println("");
                System.out.println("Optional module - Semester Two module has to be retaken");
                break;
        }
    }

        public void getFirstClass(ArrayList<Student> students) {
            System.out.println("");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            System.out.println("                     Students who got 1st Class Honours(1) Degree                     ");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            //System.out.println("The Indicator score is " + student.getScore());
            for (Student student1 : students) {
                student = student1;
                if ((student.getCreditsL4() + student.getCreditsL5() + student.getCreditsL6()) == 360) {
                    if (student.getScore() >= 70) {

                        System.out.println("Registration Number : " + student.getIndexNumber());
                        System.out.println("Name of the Student : " + student.getFirstName() + " " + student.getLastName());
                        System.out.println("");
                    } else {
                        System.out.println("SORRY! No one has got First Class Honours.");
                        System.out.println("");
                    }
                }else{
                    System.out.println("SORRY! No one has got First Class Honours.");
                    System.out.println("");
                }
            }
        }

    public void getSecondUpper(ArrayList<Student> students) {
        System.out.println("");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("            Students who got 2nd Class Honours Upper Division (2:i) Degree            ");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("");
        System.out.println("The Indicator score is " + student.getScore());
        for (Student student1 : students) {
            student = student1;

            if ((student.getCreditsL4() + student.getCreditsL5() + student.getCreditsL6()) == 360) {
                if (student.getScore() >= 60 && student.getScore()<70) {

                    System.out.println("Registration Number : " + student.getIndexNumber());
                    System.out.println("Name of the Student : " + student.getFirstName() + " " + student.getLastName());
                    System.out.println("");
                } else {
                    System.out.println("SORRY! No one has got Second class upper degree.");
                    System.out.println("");
                }
            }else{
                System.out.println("SORRY! No one has got Second class upper degree.");
                System.out.println("");
            }
        }
    }

    public void getSecondLower(ArrayList<Student> students) {
        System.out.println("");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("               Students who got 2nd Class Honours Lower Division (2:ii)               ");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("");
        System.out.println("The Indicator score is " + student.getScore());
        for (Student student1 : students) {
            student = student1;

            if ((student.getCreditsL4() + student.getCreditsL5() + student.getCreditsL6()) == 360) {
                if (student.getScore() >= 50 && student.getScore()<60) {

                    System.out.println("Registration Number : " + student.getIndexNumber());
                    System.out.println("Name of the Student : " + student.getFirstName() + " " + student.getLastName());
                    System.out.println("");
                } else {
                    System.out.println("SORRY! No one has got Second class lower degree.");
                    System.out.println("");
                }
            }else{
                System.out.println("SORRY! No one has got Second class lower degree.");
                System.out.println("");
            }
        }
    }

    public void getThirdClass(ArrayList<Student> students) {
        System.out.println("");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("                     Students who got 3rd Class Honours (3) Degree                    ");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("");
        System.out.println("The Indicator score is " + student.getScore());
        for (Student student1 : students) {
            student = student1;

            if ((student.getCreditsL4() + student.getCreditsL5() + student.getCreditsL6()) == 360) {
                if (student.getScore() >= 40 && student.getScore()<50) {

                    System.out.println("Registration Number : " + student.getIndexNumber());
                    System.out.println("Name of the Student : " + student.getFirstName() + " " + student.getLastName());
                    System.out.println("");
                } else {
                    System.out.println("SORRY! No one has got 3rd Class Honours.");
                    System.out.println("");
                }
            }else{
                System.out.println("SORRY! No one has got 3rd Class Honours.");
                System.out.println("");
            }
        }
    }

    public void getNonHons(ArrayList<Student> students) {
        System.out.println("");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("                         Students who got Non-Honours Degree                          ");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("");
        System.out.println("The Indicator score is " + student.getScore());
        for (Student student1 : students) {
            student = student1;

            if ((student.getCreditsL4() + student.getCreditsL5())==240 && student.getCreditsL6() == 60) {

                    System.out.println("Registration Number : " + student.getIndexNumber());
                    System.out.println("Name of the Student : " + student.getFirstName() + " " + student.getLastName());
                    System.out.println("");

            }else{
                System.out.println("SORRY! No one has got Non-Honours Degree.");
                System.out.println("");
            }
        }
    }
    public void getDifferals(ArrayList<Student> students) {

    }


}
