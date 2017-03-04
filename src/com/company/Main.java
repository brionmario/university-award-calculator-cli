package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brion Mario on 15/04/2016.
 */
public class Main {

    public static int creditL4;
    public static int certHe;
    public static String firstName;
    public static String lastName;
    public static String regNo;


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            //Creating Arraylists for classes
            ArrayList<Student> students = new ArrayList<Student>();
            ArrayList<CertHESerial> certHESerials = new ArrayList<CertHESerial>();
            ArrayList<DipHESerial> dipHESerials = new ArrayList<DipHESerial>();

            //Creating Arraylists for resits and retakes
            ArrayList<ResitDatabase> resits = new ArrayList<ResitDatabase>();
            ArrayList<RetakeDatabase> retakes = new ArrayList<RetakeDatabase>();

            Calculations calculations = new Calculations();
            Level5 level5 = new Level5();
            Level6 level6 = new Level6();

            Main main = new Main();

            Scanner sc = new Scanner(System.in);

            System.out.println("             ++=======================================================++             ");
            System.out.println("             ||                                                       ||             ");
            System.out.println("             ||      UNIVERSITY OF GUGSI - No Where In Particular     ||             ");
            System.out.println("             ||                                                       ||             ");
            System.out.println("             ++=======================================================++             ");

            System.out.println("             ***---------------AWARD CALCULATION SYSTEM--------------***             ");

            System.out.println("             <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>            ");
            System.out.println("");
            System.out.println("Please Enter the Number of Students in the Batch");
            int numOfStudents = sc.nextInt();

            for (int stuCount = 1; stuCount <= numOfStudents; stuCount++) {
                sc = new Scanner(System.in);

                Student student = new Student();
                CertHESerial certHESerial = new CertHESerial();
                FileHandling fileHandling = new FileHandling();

                //Creating objects to access the classes
                ResitDatabase resitDatabase = new ResitDatabase();
                RetakeDatabase retakeDatabase = new RetakeDatabase();

                System.out.println("Enter the First Name of the Student");
                main.firstName = sc.next();
                student.setFirstName(main.firstName);

                System.out.println("Enter the Last Name of the Student");
                main.lastName = sc.next();
                student.setLastName(main.lastName);

                System.out.println("Enter the UOG Registration Number of the Student");
                main.regNo = sc.next();
                student.setIndexNumber(main.regNo);

                //*********************************LEVEL 04***********************************
                //*********************************LEVEL 04***********************************
                //Getting the Module 01 Marks
                //ICT 01 Marks
                System.out.println("");
                System.out.println("+-----------------------------------------------------------------------------------+");
                System.out.println("|                                WELCOME TO LEVEL 04                                |");
                System.out.println("+-----------------------------------------------------------------------------------+");
                System.out.println("");
                System.out.println("Enter marks for Computer System Fundamentals (ECSI404) Module");
                System.out.print("ICT 01 Marks : ");
                int mod1ICT1 = sc.nextInt();
                do {
                    try {
                        if (mod1ICT1 >= 0 && mod1ICT1 <= 100) {
                            //checking if there's a resit
                            if (mod1ICT1 >= 30 && mod1ICT1 < 40) {

                                System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                                int mod1ICT1R = sc.nextInt();
                                mod1ICT1 = mod1ICT1R;

                            }
                            //checking if there's a retake
                            if (mod1ICT1 < 30) {
                                System.out.println("Student has to Retake ICT 01. Please enter the Retake marks.");
                                int mod1ICT1R = sc.nextInt();
                                mod1ICT1 = mod1ICT1R;
                            }
                        } else {
                            System.out.println("Wrong Input..... Input Value between 0 & 100");
                            mod1ICT1 = sc.nextInt();

                            //checking if there's a resit when an invalid mark is entered
                            if (mod1ICT1 >= 30 && mod1ICT1 < 40) {
                                System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                                int mod1ICT1R = sc.nextInt();
                                mod1ICT1 = mod1ICT1R;
                            }
                            //checking if there's a retake
                            if (mod1ICT1 < 30) {
                                System.out.println("Student has to Retake ICT 01. Please enter the Retake marks.");
                                int mod1ICT1R = sc.nextInt();
                                mod1ICT1 = mod1ICT1R;
                            }
                        }
                    }catch (Exception e){
                        System.out.print("invalid input");
                    }
                } while (!(mod1ICT1 >= 0 && mod1ICT1 <= 100));


                //ICT 02 Marks
                System.out.print("ICT 02 Marks : ");
                int mod1ICT2 = sc.nextInt();
                do {
                    if (mod1ICT2 >= 0 && mod1ICT2 <= 100) {
                        //checking if there's a resit
                        if (mod1ICT2 >= 30 && mod1ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod1ICT2R = sc.nextInt();
                            mod1ICT2 = mod1ICT2R;
                        }
                        //checking if there's a retake
                        if (mod1ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod1ICT2R = sc.nextInt();
                            mod1ICT2 = mod1ICT2R;
                        }
                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod1ICT2 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod1ICT2 >= 30 && mod1ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod1ICT2R = sc.nextInt();
                            mod1ICT2 = mod1ICT2R;
                        }
                        //checking if there's a retake
                        if (mod1ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod1ICT2R = sc.nextInt();
                            mod1ICT2 = mod1ICT2R;
                        }
                    }
                } while (!(mod1ICT2 >= 0 && mod1ICT2 <= 100));

                //CW Marks
                System.out.print("Coursework Marks : ");
                int mod1CW = sc.nextInt();
                do {
                    if (mod1CW >= 0 && mod1CW <= 100) {
                        //checking if there's a resit
                        if (mod1CW >= 30 && mod1CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod1CWR = sc.nextInt();
                            mod1CW = mod1CWR;
                        }

                        //checking if there's a retake
                        if (mod1CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod1CWR = sc.nextInt();
                            mod1CW = mod1CWR;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod1CW = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod1CW >= 30 && mod1CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod1CWR = sc.nextInt();
                            mod1CW = mod1CWR;
                        }

                        //checking if there's a retake
                        if (mod1CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod1CWR = sc.nextInt();
                            mod1CW = mod1CWR;
                        }
                    }
                } while (!(mod1CW >= 0 && mod1CW <= 100));

                //Storing the Mod1 average in the student class
                student.setLevel4Mod1((mod1ICT1 + mod1ICT2 + mod1CW) / 3);

                if (student.getLevel4Mod1() >= 40) {
                    student.setCreditsL4(creditL4 += 20);
                }

                //----------------------------------------------------------------------------
                //Getting the Module 02 Marks
                //ICT 01 Marks
                System.out.println("");
                System.out.println("Enter marks for Communication & Career Management (ECSI400) module");
                System.out.print("ICT 01 Marks : ");
                int mod2ICT1 = sc.nextInt();
                do {
                    if (mod2ICT1 >= 0 && mod2ICT1 <= 100) {
                        //checking if there's a resit
                        if (mod2ICT1 >= 30 && mod2ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod2ICT1R = sc.nextInt();
                            mod2ICT1 = mod2ICT1R;
                        }
                        //checking if there's a retake
                        if (mod2ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod2ICT1R = sc.nextInt();
                            mod2ICT1 = mod2ICT1R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod2ICT1 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod2ICT1 >= 30 && mod2ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod2ICT1R = sc.nextInt();
                            mod2ICT1 = mod2ICT1R;
                        }
                        //checking if there's a retake
                        if (mod2ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod2ICT1R = sc.nextInt();
                            mod2ICT1 = mod2ICT1R;
                        }

                    }
                } while (!(mod2ICT1 >= 0 && mod2ICT1 <= 100));

                //ICT 02 Marks
                System.out.print("ICT 02 Marks : ");
                int mod2ICT2 = sc.nextInt();
                do {
                    if (mod2ICT2 >= 0 && mod2ICT2 <= 100) {
                        //checking if there's a resit
                        if (mod2ICT2 >= 30 && mod2ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod2ICT2R = sc.nextInt();
                            mod2ICT2 = mod2ICT2R;
                        }
                        //checking if there's a reatke
                        if (mod2ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod2ICT2R = sc.nextInt();
                            mod2ICT2 = mod2ICT2R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod2ICT2 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod2ICT2 >= 30 && mod2ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod2ICT2R = sc.nextInt();
                            mod2ICT2 = mod2ICT2R;
                        }
                        //checking if there's a reatke
                        if (mod2ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod2ICT2R = sc.nextInt();
                            mod2ICT2 = mod2ICT2R;
                        }
                    }
                } while (!(mod2ICT2 >= 0 && mod2ICT2 <= 100));

                //CW Marks
                System.out.print("Coursework Marks : ");
                int mod2CW = sc.nextInt();
                do {
                    if (mod2CW >= 0 && mod2CW <= 100) {
                        //checking if there's a resit
                        if (mod2CW >= 30 && mod2CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod2CWR = sc.nextInt();
                            mod2CW = mod2CWR;
                        }
                        //checking if there's a retake
                        if (mod2CW < 30) {
                            System.out.println("Student has to Retake the Coursework. Please enter the Retake marks.");
                            int mod2CWR = sc.nextInt();
                            mod2CW = mod2CWR;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod2CW = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod2CW >= 30 && mod2CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod2CWR = sc.nextInt();
                            mod2CW = mod2CWR;
                        }
                        //checking if there's a retake
                        if (mod2CW < 30) {
                            System.out.println("Student has to Retake the Coursework. Please enter the Retake marks.");
                            int mod2CWR = sc.nextInt();
                            mod2CW = mod2CWR;
                        }

                    }
                } while (!(mod2CW >= 0 && mod2CW <= 100));

                //Storing the Mod2 average in the student class
                student.setLevel4Mod2((mod2ICT1 + mod2ICT2 + mod2CW) / 3);

                if (student.getLevel4Mod2() >= 40) {
                    student.setCreditsL4(creditL4 += 20);
                }
                //----------------------------------------------------------------------------
                //Getting the Module 03 Marks
                //ICT 01 Marks
                System.out.println("");
                System.out.println("Enter marks for Information & Data Modeling (ECSI412) module");
                System.out.print("ICT 01 Marks : ");
                int mod3ICT1 = sc.nextInt();
                do {
                    if (mod3ICT1 >= 0 && mod3ICT1 <= 100) {
                        //checking if there's a resit
                        if (mod3ICT1 >= 30 && mod3ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod3ICT1R = sc.nextInt();
                            mod3ICT1 = mod3ICT1R;
                        }
                        //checking if there's a retake
                        if (mod3ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod3ICT1R = sc.nextInt();
                            mod3ICT1 = mod3ICT1R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod3ICT1 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod3ICT1 >= 30 && mod3ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod3ICT1R = sc.nextInt();
                            mod3ICT1 = mod3ICT1R;
                        }
                        //checking if there's a retake
                        if (mod3ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod3ICT1R = sc.nextInt();
                            mod3ICT1 = mod3ICT1R;
                        }

                    }
                } while (!(mod3ICT1 >= 0 && mod3ICT1 <= 100));

                //ICT 02 Marks
                System.out.print("ICT 02 Marks : ");
                int mod3ICT2 = sc.nextInt();
                do {
                    if (mod3ICT2 >= 0 && mod3ICT2 <= 100) {
                        //checking if there's a resit
                        if (mod3ICT2 >= 30 && mod3ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod3ICT2R = sc.nextInt();
                            mod3ICT2 = mod3ICT2R;
                        }
                        //checking if there's a retake
                        if (mod3ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod3ICT2R = sc.nextInt();
                            mod3ICT2 = mod3ICT2R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod3ICT2 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod3ICT2 >= 30 && mod3ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod3ICT2R = sc.nextInt();
                            mod3ICT2 = mod3ICT2R;
                        }
                        //checking if there's a retake
                        if (mod3ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod3ICT2R = sc.nextInt();
                            mod3ICT2 = mod3ICT2R;
                        }

                    }
                } while (!(mod3ICT2 >= 0 && mod3ICT2 <= 100));

                //CW Marks
                System.out.print("Coursework Marks : ");
                int mod3CW = sc.nextInt();
                do {
                    if (mod3CW >= 0 && mod3CW <= 100) {
                        //checking if there's a resit
                        if (mod3CW >= 30 && mod3CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod3CWR = sc.nextInt();
                            mod3CW = mod3CWR;
                        }
                        //checking if there's a retake
                        if (mod3CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod3CWR = sc.nextInt();
                            mod3CW = mod3CWR;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod3CW = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod3CW >= 30 && mod3CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod3CWR = sc.nextInt();
                            mod3CW = mod3CWR;
                        }
                        //checking if there's a retake
                        if (mod3CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod3CWR = sc.nextInt();
                            mod3CW = mod3CWR;
                        }

                    }
                } while (!(mod3CW >= 0 && mod3CW <= 100));

                //Storing the Mod3 average in the student class
                student.setLevel4Mod3((mod3ICT1 + mod3ICT2 + mod3CW) / 3);

                if (student.getLevel4Mod3() >= 40) {
                    student.setCreditsL4(creditL4 += 20);
                }

                //----------------------------------------------------------------------------
                //Getting the Module 04 Marks
                //ICT 01 Marks
                System.out.println("");
                System.out.println("Enter marks for Software Development Principles 1 (ECSI410) module");
                System.out.print("ICT 01 Marks : ");
                int mod4ICT1 = sc.nextInt();
                do {
                    if (mod4ICT1 >= 0 && mod4ICT1 <= 100) {
                        //checking if there's a resit
                        if (mod4ICT1 >= 30 && mod4ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod4ICT1R = sc.nextInt();
                            mod4ICT1 = mod4ICT1R;
                        }
                        //checking if there's a retake
                        if (mod4ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod4ICT1R = sc.nextInt();
                            mod4ICT1 = mod4ICT1R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod4ICT1 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod4ICT1 >= 30 && mod4ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod4ICT1R = sc.nextInt();
                            mod4ICT1 = mod4ICT1R;
                        }
                        //checking if there's a retake
                        if (mod4ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod4ICT1R = sc.nextInt();
                            mod4ICT1 = mod4ICT1R;
                        }

                    }
                } while (!(mod4ICT1 >= 0 && mod4ICT1 <= 100));

                //ICT 02 Marks
                System.out.print("ICT 02 Marks : ");
                int mod4ICT2 = sc.nextInt();
                do {
                    if (mod4ICT2 >= 0 && mod4ICT2 <= 100) {
                        //checking if there's a resit
                        if (mod4ICT2 >= 30 && mod4ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod4ICT2R = sc.nextInt();
                            mod4ICT2 = mod4ICT2R;
                        }
                        //checking if there's a retake
                        if (mod4ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod4ICT2R = sc.nextInt();
                            mod4ICT2 = mod4ICT2R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod4ICT2 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod4ICT2 >= 30 && mod4ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod4ICT2R = sc.nextInt();
                            mod4ICT2 = mod4ICT2R;
                        }
                        //checking if there's a retake
                        if (mod4ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod4ICT2R = sc.nextInt();
                            mod4ICT2 = mod4ICT2R;
                        }

                    }
                } while (!(mod4ICT2 >= 0 && mod4ICT2 <= 100));

                //CW Marks
                System.out.print("Coursework Marks : ");
                int mod4CW = sc.nextInt();
                do {
                    if (mod4CW >= 0 && mod4CW <= 100) {
                        //checking if there's a resit
                        if (mod4CW >= 30 && mod4CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod4CWR = sc.nextInt();
                            mod4CW = mod4CWR;
                        }
                        //checking if there's a resit
                        if (mod4CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod4CWR = sc.nextInt();
                            mod4CW = mod4CWR;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod4CW = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod4CW >= 30 && mod4CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod4CWR = sc.nextInt();
                            mod4CW = mod4CWR;
                        }
                        //checking if there's a resit
                        if (mod4CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod4CWR = sc.nextInt();
                            mod4CW = mod4CWR;
                        }

                    }
                } while (!(mod4CW >= 0 && mod4CW <= 100));

                //Storing the Mod4 average in the student class
                student.setLevel4Mod4((mod4ICT1 + mod4ICT2 + mod4CW) / 3);

                if (student.getLevel4Mod4() >= 40) {
                    student.setCreditsL4(creditL4 += 20);
                }

                //----------------------------------------------------------------------------
                //Getting the Module 05 Marks
                //ICT 01 Marks
                System.out.println("");
                System.out.println("Enter marks for Information Systems (ECSI411) module");
                System.out.print("ICT 01 Marks : ");
                int mod5ICT1 = sc.nextInt();
                do {
                    if (mod5ICT1 >= 0 && mod5ICT1 <= 100) {
                        //checking if there's a resit
                        if (mod5ICT1 >= 30 && mod5ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod5ICT1R = sc.nextInt();
                            mod5ICT1 = mod5ICT1R;
                        }
                        //checking if there's a retake
                        if (mod5ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod5ICT1R = sc.nextInt();
                            mod5ICT1 = mod5ICT1R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod5ICT1 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod5ICT1 >= 30 && mod5ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod5ICT1R = sc.nextInt();
                            mod5ICT1 = mod5ICT1R;
                        }
                        //checking if there's a retake
                        if (mod5ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod5ICT1R = sc.nextInt();
                            mod5ICT1 = mod5ICT1R;
                        }
                    }
                } while (!(mod5ICT1 >= 0 && mod5ICT1 <= 100));

                //ICT 02 Marks
                System.out.print("ICT 02 Marks : ");
                int mod5ICT2 = sc.nextInt();
                do {
                    if (mod5ICT2 >= 0 && mod5ICT2 <= 100) {
                        //checking if there's a resit
                        if (mod5ICT2 >= 30 && mod5ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod5ICT2R = sc.nextInt();
                            mod5ICT2 = mod5ICT2R;
                        }
                        //checking if there's a retake
                        if (mod5ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod5ICT2R = sc.nextInt();
                            mod5ICT2 = mod5ICT2R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod5ICT2 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod5ICT2 >= 30 && mod5ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod5ICT2R = sc.nextInt();
                            mod5ICT2 = mod5ICT2R;
                        }
                        //checking if there's a retake
                        if (mod5ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod5ICT2R = sc.nextInt();
                            mod5ICT2 = mod5ICT2R;
                        }


                    }
                } while (!(mod5ICT2 >= 0 && mod5ICT2 <= 100));

                //CW Marks
                System.out.print("Coursework Marks : ");
                int mod5CW = sc.nextInt();
                do {
                    if (mod5CW >= 0 && mod5CW <= 100) {
                        //checking if there's a resit
                        if (mod5CW >= 30 && mod5CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod5CWR = sc.nextInt();
                            mod5CW = mod5CWR;
                        }
                        //checking if there's a retake
                        if (mod5CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod5CWR = sc.nextInt();
                            mod5CW = mod5CWR;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod5CW = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod5CW >= 30 && mod5CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod5CWR = sc.nextInt();
                            mod5CW = mod5CWR;
                        }
                        //checking if there's a retake
                        if (mod5CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod5CWR = sc.nextInt();
                            mod5CW = mod5CWR;
                        }
                    }
                } while (!(mod5CW >= 0 && mod5CW <= 100));

                //Storing the Mod5 average in the student class
                student.setLevel4Mod5((mod5ICT1 + mod5ICT2 + mod5CW) / 3);

                if (student.getLevel4Mod5() >= 40) {
                    student.setCreditsL4(creditL4 += 20);
                }

                //----------------------------------------------------------------------------
                //Getting the Module 06 Marks
                //ICT 01 Marks
                System.out.println("");
                System.out.println("Enter marks for Software Development Principles 2 (ECSI405) module");
                System.out.print("ICT 01 Marks : ");
                int mod6ICT1 = sc.nextInt();
                do {
                    if (mod6ICT1 >= 0 && mod6ICT1 <= 100) {
                        //checking if there's a resit
                        if (mod6ICT1 >= 30 && mod6ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod6ICT1R = sc.nextInt();
                            mod6ICT1 = mod6ICT1R;
                        }
                        //checking if there's a retake
                        if (mod6ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod6ICT1R = sc.nextInt();
                            mod6ICT1 = mod6ICT1R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod6ICT1 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod6ICT1 >= 30 && mod6ICT1 < 40) {
                            System.out.println("Student has to Resit for the ICT 01. Please enter the Resit marks.");
                            int mod6ICT1R = sc.nextInt();
                            mod6ICT1 = mod6ICT1R;
                        }
                        //checking if there's a retake
                        if (mod6ICT1 < 30) {
                            System.out.println("Student has to Retake the ICT 01. Please enter the Retake marks.");
                            int mod6ICT1R = sc.nextInt();
                            mod6ICT1 = mod6ICT1R;
                        }

                    }
                } while (!(mod6ICT1 >= 0 && mod6ICT1 <= 100));

                //ICT 02 Marks
                System.out.print("ICT 02 Marks : ");
                int mod6ICT2 = sc.nextInt();
                do {
                    if (mod6ICT2 >= 0 && mod6ICT2 <= 100) {
                        //checking if there's a resit
                        if (mod6ICT2 >= 30 && mod6ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod6ICT2R = sc.nextInt();
                            mod6ICT2 = mod6ICT2R;
                        }
                        //checking if there's a retake
                        if (mod6ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod6ICT2R = sc.nextInt();
                            mod6ICT2 = mod6ICT2R;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod6ICT2 = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod6ICT2 >= 30 && mod6ICT2 < 40) {
                            System.out.println("Student has to Resit for the ICT 02. Please enter the Resit marks.");
                            int mod6ICT2R = sc.nextInt();
                            mod6ICT2 = mod6ICT2R;
                        }
                        //checking if there's a retake
                        if (mod6ICT2 < 30) {
                            System.out.println("Student has to Retake the ICT 02. Please enter the Retake marks.");
                            int mod6ICT2R = sc.nextInt();
                            mod6ICT2 = mod6ICT2R;
                        }
                    }
                } while (!(mod6ICT2 >= 0 && mod6ICT2 <= 100));

                //CW Marks
                System.out.print("Coursework Marks : ");
                int mod6CW = sc.nextInt();
                do {
                    if (mod6CW >= 0 && mod6CW <= 100) {
                        //checking if there's a resit
                        if (mod6CW >= 30 && mod6CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod6CWR = sc.nextInt();
                            mod6CW = mod6CWR;
                        }
                        //checking if there's a retake
                        if (mod6CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod6CWR = sc.nextInt();
                            mod6CW = mod6CWR;
                        }

                    } else {
                        System.out.println("Wrong Input..... Input Value between 0 & 100");
                        mod6CW = sc.nextInt();

                        //checking if there's a resit when an invalid mark is entered
                        if (mod6CW >= 30 && mod6CW < 40) {
                            System.out.println("Student has to redo the Coursework. Please enter the new marks.");
                            int mod6CWR = sc.nextInt();
                            mod6CW = mod6CWR;
                        }
                        //checking if there's a retake
                        if (mod6CW < 30) {
                            System.out.println("Student has to retake the Coursework. Please enter the retake marks.");
                            int mod6CWR = sc.nextInt();
                            mod6CW = mod6CWR;
                        }

                    }
                } while (!(mod6CW >= 0 && mod6CW <= 100));

                //Storing the Mod6 average in the student class
                student.setLevel4Mod6((mod6ICT1 + mod6ICT2 + mod6CW) / 3);

                if (student.getLevel4Mod6() >= 40) {
                    student.setCreditsL4(creditL4 += 20);
                }

                System.out.println("Level 4 Credits - " + student.getCreditsL4());

                //Storing the students who got retakes and resits
                //Module 01
                if (student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) {
                    //putting the mark in the ResitDatabase to be accessed later
                    resitDatabase.setLevel4Mod1(student.getLevel4Mod1());

                    resitDatabase.setFirstName(main.firstName);
                    resitDatabase.setLastName(main.lastName);
                    resitDatabase.setIndexNumber(main.regNo);

                }
                if (student.getLevel4Mod1() < 30) {

                    //putting the mark in the RetakeDatabase to be accessed later
                    retakeDatabase.setLevel4Mod1(student.getLevel4Mod1());

                    retakeDatabase.setFirstName(main.firstName);
                    retakeDatabase.setLastName(main.lastName);
                    retakeDatabase.setIndexNumber(main.regNo);
                }
                //Module 02
                if (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) {
                    //putting the mark in the ResitDatabase to be accessed later
                    resitDatabase.setLevel4Mod2(student.getLevel4Mod2());

                    resitDatabase.setFirstName(main.firstName);
                    resitDatabase.setLastName(main.lastName);
                    resitDatabase.setIndexNumber(main.regNo);

                }
                if (student.getLevel4Mod2() < 30) {

                    //putting the mark in the RetakeDatabase to be accessed later
                    retakeDatabase.setLevel4Mod2(student.getLevel4Mod2());

                    retakeDatabase.setFirstName(main.firstName);
                    retakeDatabase.setLastName(main.lastName);
                    retakeDatabase.setIndexNumber(main.regNo);
                }
                //Module 03
                if (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40) {
                    //putting the mark in the ResitDatabase to be accessed later
                    resitDatabase.setLevel4Mod3(student.getLevel4Mod3());

                    resitDatabase.setFirstName(main.firstName);
                    resitDatabase.setLastName(main.lastName);
                    resitDatabase.setIndexNumber(main.regNo);

                }
                if (student.getLevel4Mod3() < 30) {

                    //putting the mark in the RetakeDatabase to be accessed later
                    retakeDatabase.setLevel4Mod3(student.getLevel4Mod3());

                    retakeDatabase.setFirstName(main.firstName);
                    retakeDatabase.setLastName(main.lastName);
                    retakeDatabase.setIndexNumber(main.regNo);
                }
                //Module 04
                if (student.getLevel4Mod4() >= 30 && student.getLevel4Mod4() < 40) {
                    //putting the mark in the ResitDatabase to be accessed later
                    resitDatabase.setLevel4Mod4(student.getLevel4Mod4());

                    resitDatabase.setFirstName(main.firstName);
                    resitDatabase.setLastName(main.lastName);
                    resitDatabase.setIndexNumber(main.regNo);

                }
                if (student.getLevel4Mod4() < 30) {

                    //putting the mark in the RetakeDatabase to be accessed later
                    retakeDatabase.setLevel4Mod4(student.getLevel4Mod4());

                    retakeDatabase.setFirstName(main.firstName);
                    retakeDatabase.setLastName(main.lastName);
                    retakeDatabase.setIndexNumber(main.regNo);
                }
                //Module 05
                if (student.getLevel4Mod5() >= 30 && student.getLevel4Mod5() < 40) {
                    //putting the mark in the ResitDatabase to be accessed later
                    resitDatabase.setLevel4Mod5(student.getLevel4Mod5());

                    resitDatabase.setFirstName(main.firstName);
                    resitDatabase.setLastName(main.lastName);
                    resitDatabase.setIndexNumber(main.regNo);

                }
                if (student.getLevel4Mod5() < 30) {

                    //putting the mark in the RetakeDatabase to be accessed later
                    retakeDatabase.setLevel4Mod5(student.getLevel4Mod5());

                    retakeDatabase.setFirstName(main.firstName);
                    retakeDatabase.setLastName(main.lastName);
                    retakeDatabase.setIndexNumber(main.regNo);
                }
                //Module 06
                if (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40) {
                    //putting the mark in the ResitDatabase to be accessed later
                    resitDatabase.setLevel4Mod6(student.getLevel4Mod6());

                    resitDatabase.setFirstName(main.firstName);
                    resitDatabase.setLastName(main.lastName);
                    resitDatabase.setIndexNumber(main.regNo);

                }
                if (student.getLevel4Mod6() < 30) {

                    //putting the mark in the RetakeDatabase to be accessed later
                    retakeDatabase.setLevel4Mod6(student.getLevel4Mod6());

                    retakeDatabase.setFirstName(main.firstName);
                    retakeDatabase.setLastName(main.lastName);
                    retakeDatabase.setIndexNumber(main.regNo);
                }

                resits.add(resitDatabase);
                retakes.add(retakeDatabase);

                //Checking for condoned credits
                int conCount = 0;
                //Checking for Retakes
                int retCount = 0;

                do {
                    if (student.getLevel4Mod1() >= 30 && student.getLevel4Mod1() < 40) {
                        Calculations.Condoned(0);
                        conCount++;
                        //System.out.println("count is " + conCount);
                        if (conCount >= 2) break;

                    }
                    if (student.getLevel4Mod2() >= 30 && student.getLevel4Mod2() < 40) {
                        Calculations.Condoned(1);
                        conCount++;
                        if (conCount >= 2) break;

                    }
                    if (student.getLevel4Mod3() >= 30 && student.getLevel4Mod3() < 40) {
                        Calculations.Condoned(2);
                        conCount++;
                        if (conCount >= 2) break;

                    }
                    if (student.getLevel4Mod4() >= 30 && student.getLevel4Mod4() < 40) {
                        Calculations.Condoned(3);
                        conCount++;
                        if (conCount >= 2) break;
                    }
                    if (student.getLevel4Mod5() >= 30 && student.getLevel4Mod5() < 40) {
                        Calculations.Condoned(4);
                        conCount++;
                        if (conCount >= 2) break;
                    }
                    if (student.getLevel4Mod6() >= 30 && student.getLevel4Mod6() < 40) {
                        Calculations.Condoned(5);
                        conCount++;
                        if (conCount >= 2) break;
                    }

                    //Retakes

                    if (student.getLevel4Mod1() < 30) {

                        Calculations.Retake(0);

                        int retakeMod1L4 = sc.nextInt();
                        student.setLevel4Mod1(retakeMod1L4);

                        if (retakeMod1L4 >= 40) {
                            student.setCreditsL4(creditL4 += 20);

                        } else {

                            System.out.println("\n" + "The student hasn't passed the retake attempt and has to resit for the ECSI404 module" + "\n"
                                    + "Please Enter the Resit attempt Average");

                            retakeMod1L4 = sc.nextInt();
                            student.setLevel4Mod1(retakeMod1L4);
                            if (retakeMod1L4 >= 40) {
                                student.setCreditsL4(creditL4 += 20);
                            } else {
                                System.out.println("\n" + "Sorry! The student hasn't passed the ECSI404 module");

                            }
                        }
                        retCount++;
                        if (retCount >= 3) break;

                    }
                    if (student.getLevel4Mod2() < 30) {

                        Calculations.Retake(1);

                        int retakeMod2L4 = sc.nextInt();
                        student.setLevel4Mod2(retakeMod2L4);

                        if (retakeMod2L4 >= 40) {
                            student.setCreditsL4(creditL4 += 20);
                        } else {
                            System.out.println("\n" + "The student hasn't passed the retake attempt and has to resit for the ECSI400 module" + "\n"
                                    + "Please Enter the Resit attempt Average");

                            retakeMod2L4 = sc.nextInt();
                            student.setLevel4Mod2(retakeMod2L4);
                            if (retakeMod2L4 >= 40) {
                                student.setCreditsL4(creditL4 += 20);
                            } else {
                                System.out.println("\n" + "Sorry! The student hasn't passed the ECSI400 module");

                            }
                        }
                        retCount++;
                        if (retCount >= 3) break;

                    }
                    if (student.getLevel4Mod3() < 30) {

                        Calculations.Retake(2);

                        int retakeMod3L4 = sc.nextInt();
                        student.setLevel4Mod3(retakeMod3L4);

                        if (retakeMod3L4 >= 40) {
                            student.setCreditsL4(creditL4 += 20);
                        } else {
                            System.out.println("\n" + "The student hasn't passed the retake attempt and has to resit for the ECSI412 module" + "\n"
                                    + "Please Enter the Resit attempt Average");

                            retakeMod3L4 = sc.nextInt();
                            student.setLevel4Mod3(retakeMod3L4);
                            if (retakeMod3L4 >= 40) {
                                student.setCreditsL4(creditL4 += 20);
                            } else {
                                System.out.println("\n" + "Sorry! The student hasn't passed the ECSI412 module");
                            }
                        }

                        retCount++;
                        if (retCount >= 3) break;

                    }
                    if (student.getLevel4Mod4() < 30) {

                        Calculations.Retake(3);

                        int retakeMod4L4 = sc.nextInt();
                        student.setLevel4Mod4(retakeMod4L4);

                        if (retakeMod4L4 >= 40) {
                            student.setCreditsL4(creditL4 += 20);
                        } else {
                            System.out.println("\n" + "The student hasn't passed the retake attempt and has to resit for the ECSI410 module" + "\n"
                                    + "Please Enter the Resit attempt Average");

                            retakeMod4L4 = sc.nextInt();
                            student.setLevel4Mod4(retakeMod4L4);
                            if (retakeMod4L4 >= 40) {
                                student.setCreditsL4(creditL4 += 20);
                            } else {
                                System.out.println("\n" + "Sorry! The student hasn't passed the ECSI410 module");
                            }
                        }

                        retCount++;
                        if (retCount >= 3) break;
                    }
                    if (student.getLevel4Mod5() < 30) {

                        Calculations.Retake(4);

                        int retakeMod5L4 = sc.nextInt();
                        student.setLevel4Mod5(retakeMod5L4);

                        if (retakeMod5L4 >= 40) {
                            student.setCreditsL4(creditL4 += 20);
                        } else {
                            System.out.println("\n" + "The student hasn't passed the retake attempt and has to resit for the ECSI411 module" + "\n"
                                    + "Please Enter the Resit attempt Average");

                            retakeMod5L4 = sc.nextInt();
                            student.setLevel4Mod5(retakeMod5L4);
                            if (retakeMod5L4 >= 40) {
                                student.setCreditsL4(creditL4 += 20);
                            } else {
                                System.out.println("\n" + "Sorry! The student hasn't passed the ECSI411 module");
                            }
                        }

                        retCount++;
                        if (retCount >= 3) break;
                    }
                    if (student.getLevel4Mod6() < 30) {

                        Calculations.Retake(5);

                        int retakeMod6L4 = sc.nextInt();
                        student.setLevel4Mod6(retakeMod6L4);

                        if (retakeMod6L4 >= 40) {
                            student.setCreditsL4(creditL4 += 20);
                        } else {
                            System.out.println("\n" + "The student hasn't passed the retake attempt and has to resit for the ECSI405 module" + "\n"
                                    + "Please Enter the Resit attempt Average");

                            retakeMod6L4 = sc.nextInt();
                            student.setLevel4Mod6(retakeMod6L4);
                            if (retakeMod6L4 >= 40) {
                                student.setCreditsL4(creditL4 += 20);
                            } else {
                                System.out.println("\n" + "Sorry! The student hasn't passed the ECSI405 module");
                            }
                        }

                        retCount++;
                        if (retCount >= 3) break;
                    }
                    break;
                } while (!(conCount == 1) && !(retCount == 1));
                student.setCreditsL4(creditL4);
                System.out.println("Level 4 Credits after condoned - " + student.getCreditsL4());
                System.out.println("Level 4 Credits after retake - " + student.getCreditsL4());


                if (student.getCreditsL4() >= 100 && student.getCreditsL4() < 120) {
                    System.out.println("");
                    System.out.println("CONGRATULATIONS ! THE STUDENT IS ELIGIBLE FOR LEVEL 05");
                    System.out.println("But the Student has obtained only 100 credits in level 04.\n" +
                            "So the failed module has to be retaken in Level 05");
                } else if (student.getCreditsL4() == 120) {
                    System.out.println("");
                    System.out.println("CONGRATULATIONS ! THE STUDENT IS ELIGIBLE FOR LEVEL 05");
                }

                int exitOptionL4;
                do {
                    System.out.println("");
                    System.out.println(".....................................................................................");
                    System.out.println("                    Please select an option from the list bellow.                    ");
                    System.out.println(".....................................................................................");
                    System.out.println("");
                    System.out.println("1. Proceed to Level 05");
                    System.out.println("2. Exit with Certificate of Higher Education \n");
                    exitOptionL4 = sc.nextInt();
                    if (exitOptionL4 == 1) {
                        if (student.getCreditsL4() == 120 || student.getCreditsL4() == 100) {
                            Level5.Level05Marks(certHESerials, dipHESerials, students);
                            break;
                        } else {
                            System.out.println("SORRY! The Student is not eligible for Level 05");
                            break;
                        }
                    }
                    if (exitOptionL4 == 2) {

                        if (student.getCreditsL4() == 120) {

                            System.out.println("");
                            System.out.println("CONGRATULATIONS! The Student has received a Certificate of Higher Education");
                            certHESerial.setFirstName(main.firstName);
                            certHESerial.setLastName(main.lastName);
                            certHESerial.setRegNo(main.regNo);

                            certHESerials.add(certHESerial);

                            student.setCertHe(certHe += 1);
                            fileHandling.writeCertHE();

                            //System.out.println("Number of Cert.HE in the batch - " + student.getCertHe());
                        } else {
                            System.out.println("");
                            System.out.println("SORRY! The Student is not eligible for a Certificate of Higher Education");

                        }
                        break;
                    }
                    System.out.println("");
                    System.out.println("Invalid Input. Please select a valid option.");


                } while ((exitOptionL4 != 0));


                //Initializing the credits back to zero
                creditL4 = 0;
                level5.creditsL5 = 0;
                level6.creditsL6 = 0;
                //level6.score = 0;


                if (stuCount >= numOfStudents) {
                    students.add(student);
                    System.out.println("");
                    System.out.println("-----YOU HAVE ENTERED MARKS FOR ALL THE STUDENTS-----");
                    System.out.println("");
                    break;
                } else {
                    students.add(student);
                    System.out.println("");
                    System.out.println("-----PLEASE ENTER THE MARKS OF THE " + (stuCount + 1) + " STUDENT-----");
                    System.out.println("");
                }
            }

            int option;

            FileHandling fh = new FileHandling();
            SummaryL4 summaryL4 = new SummaryL4();
            SummaryL5 summaryL5 = new SummaryL5();
            SummaryL6 summaryL6 = new SummaryL6();
            do {

                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("*                             FINAL REPORT OF THE BATCH                             *");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("");
                System.out.println("1. Students who got 1st Class Honours(1) Degree");
                System.out.println("2. Students who got 2nd Class Honours Upper Division (2:i) Degree");
                System.out.println("3. Students who got 2nd Class Honours Lower Division (2:ii) Degree");
                System.out.println("4. Students who got 3rd Class Honours (3) Degree");
                System.out.println("5. Students who got Non-Honours Degree");
                System.out.println("6. Students who got Diploma of Higher Education");
                System.out.println("7. Students who got Certificate of Higher Education");
                System.out.println("8. Summary of Level 04 Modules");
                System.out.println("9. Summary of Level 05 Modules");
                System.out.println("10. Summary of Level 06 Modules");
                System.out.println("11. List of Students who got Differed");
                System.out.println("0. Exit");

                option = sc.nextInt();
                if (option == 1) {

                    calculations.getFirstClass(students);
                }
                if (option == 2) {

                    calculations.getSecondUpper(students);
                }
                if (option == 3) {

                    calculations.getSecondLower(students);
                }
                if (option == 4) {

                    calculations.getThirdClass(students);
                }
                if (option == 5) {

                    calculations.getNonHons(students);
                }
                if (option == 6) {
                    fh.readDipHE(dipHESerials);
                }
                if (option == 7) {
                    fh.readCertHE(certHESerials);
                }
                if (option == 8) {
                    try {
                        summaryL4.getLevel4Summary(students, resits, retakes);
                    } catch (Exception e) {

                    }
                }
                if (option == 9) {
                    try {
                        summaryL5.getLevel5Summary(students, resits, retakes);
                    } catch (Exception e) {

                    }
                }
                if (option == 10) {
                    try {
                        summaryL6.getLevel6Summary(students, resits, retakes);
                    } catch (Exception e) {

                    }
                }
                if (option == 11) {
                    calculations.getDifferals(students);
                }
                if (option == 0) {
                    System.exit(0);
                }
            } while (option != 0);

        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }
}



