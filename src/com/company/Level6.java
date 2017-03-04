package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Brion Mario on 20/04/2016.
 */
public class Level6 {

    public static int creditsL4;
    public static int creditsL5;
    public static int creditsL6;
    public static int dipHe;
    public int score;

    public static void Level06Marks(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Calculations calculations = new Calculations();
        Level6 level6 = new Level6();

        //*********************************LEVEL 06***********************************
        //Getting the Module 01 Marks
        //ICT 01 Marks
        System.out.println("");
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.println("|                                WELCOME TO LEVEL 06                                |");
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.println("");
        System.out.println("Enter marks for Computer Science Project (CCS699) module");
        System.out.print("ICT 01 Marks : ");
        int mod1ICT1 = sc.nextInt();
        do {
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
        student.setLevel6Mod1((mod1ICT1 + mod1ICT2 + mod1CW) / 3);

        if (student.getLevel6Mod1() >= 40) {
            student.setCreditsL6(creditsL6 += 20);
        }
        //----------------------------------------------------------------------------
        //Getting the Module 02 Marks
        //ICT 01 Marks
        System.out.println("");
        System.out.println("Enter marks for Reasoning About Programs (CCS603) module");
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
        student.setLevel6Mod2((mod2ICT1 + mod2ICT2 + mod2CW) / 3);

        if (student.getLevel6Mod2() >= 40) {
            student.setCreditsL6(creditsL6 += 20);
        }
        //----------------------------------------------------------------------------
        //Getting the Module 03 Marks
        //ICT 01 Marks
        System.out.println("");
        System.out.println("Enter marks for Security & Forensics (CCS602) module");
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
        student.setLevel6Mod3((mod3ICT1 + mod3ICT2 + mod3CW) / 3);

        if (student.getLevel6Mod3() >= 40) {
            student.setCreditsL6(creditsL6 += 20);
        }

        //----------------------------------------------------------------------------
        //Getting the Module 04 Marks
        //ICT 01 Marks
        System.out.println("");
        System.out.println("Enter marks for iOS Development (CCS613) module");
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
        student.setLevel6Mod4((mod4ICT1 + mod4ICT2 + mod4CW) / 3);

        if (student.getLevel6Mod4() >= 40) {
            student.setCreditsL6(creditsL6 += 20);
        }

        //----------------------------------------------------------------------------
        //Getting the Module 05 Marks
        //ICT 01 Marks
        int opModule1;
        do {
            System.out.println("");
            System.out.println("Please select the optional module for Semester One");
            System.out.println("01. CCS607 - Advanced Server-side Web Programming");
            System.out.println("02. CCS605 - Concurrent Programming");
            System.out.println("");
            opModule1 = sc.nextInt();
        } while (!(opModule1 == 1 || opModule1 == 2));

        if (opModule1 == 1) {
            System.out.println("Enter marks for Advanced Server-side Web Programming (CCS607) module");
        } else {
            System.out.println("Enter marks for Concurrent Programming (CCS605) module");
        }
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
        student.setLevel6Mod5((mod5ICT1 + mod5ICT2 + mod5CW) / 3);

        if (student.getLevel6Mod5() >= 40) {
            student.setCreditsL6(creditsL6 += 20);
        }

        //----------------------------------------------------------------------------
        //Getting the Module 06 Marks
        //ICT 01 Marks
        int opModule2;
        do {
            System.out.println("");
            System.out.println("Please select the optional module for Semester Two");
            System.out.println("01. CCG602 - Advanced Maths and Game AI");
            System.out.println("02. CCS602 - Mobile Native Application Development");
            System.out.println("");
            opModule2 = sc.nextInt();
        } while (!(opModule2 == 1 || opModule2 == 2));

        if (opModule2 == 1) {
            System.out.println("Enter marks for Advanced Maths and Game AI (CCG602) module");
        } else {
            System.out.println("Enter marks for Mobile Native Application Development (CCS602) module");
        }
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
        student.setLevel6Mod6((mod6ICT1 + mod6ICT2 + mod6CW) / 3);

        if (student.getLevel6Mod6() >= 40) {
            student.setCreditsL6(creditsL6 += 20);
        }
        System.out.println("");
        System.out.println("Level 6 Credits - " + student.getCreditsL6());
        System.out.println("Total Credits - " + (student.getCreditsL4() + student.getCreditsL5() + student.getCreditsL6()));
        System.out.println("");

        //Checking for Retakes
        int retCount = 0;

        do {

            //Retakes
            if (student.getLevel6Mod1() < 30) {
                Calculations.RetakeL6(0);

                int retakeMod1L6 = sc.nextInt();
                student.setLevel6Mod1(retakeMod1L6);

                if (retakeMod1L6 >= 40) {
                    student.setCreditsL6(creditsL6 += 20);

                } else {
                    System.out.println("\n" + "The student hasn't passed the "
                            + "retake attempt and has to resit for the CCS699 module" + "\n"
                            + "Please Enter the Resit attempt Average");

                    retakeMod1L6 = sc.nextInt();
                    student.setLevel6Mod1(retakeMod1L6);
                    if (retakeMod1L6 >= 40) {
                        student.setCreditsL6(creditsL6 += 20);
                    } else {
                        System.out.println("\n" + "Sorry! The student hasn't passed the CCS699 module");

                    }
                }
                retCount++;
                if (retCount >= 3) {
                    break;
                }

            }
            if (student.getLevel6Mod2() < 30) {
                Calculations.RetakeL6(1);

                int retakeMod2L6 = sc.nextInt();
                student.setLevel6Mod2(retakeMod2L6);

                if (retakeMod2L6 >= 40) {
                    student.setCreditsL6(creditsL6 += 20);
                } else {
                    System.out.println("\n" + "The student hasn't passed the "
                            + "retake attempt and has to resit for the CCS603 module" + "\n"
                            + "Please Enter the Resit attempt Average");

                    retakeMod2L6 = sc.nextInt();
                    student.setLevel6Mod2(retakeMod2L6);
                    if (retakeMod2L6 >= 40) {
                        student.setCreditsL6(creditsL6 += 20);
                    } else {
                        System.out.println("\n" + "Sorry! The student hasn't passed the CCS603 module");

                    }
                }
                retCount++;
                if (retCount >= 3) {
                    break;
                }

            }
            if (student.getLevel6Mod3() < 30) {
                Calculations.RetakeL6(2);

                int retakeMod3L6 = sc.nextInt();
                student.setLevel6Mod3(retakeMod3L6);

                if (retakeMod3L6 >= 40) {
                    student.setCreditsL6(creditsL6 += 20);
                } else {
                    System.out.println("\n" + "The student hasn't passed the"
                            + " retake attempt and has to resit for the CCS602 module" + "\n"
                            + "Please Enter the Resit attempt Average");

                    retakeMod3L6 = sc.nextInt();
                    student.setLevel6Mod3(retakeMod3L6);
                    if (retakeMod3L6 >= 40) {
                        student.setCreditsL6(creditsL6 += 20);
                    } else {
                        System.out.println("\n" + "Sorry! The student hasn't passed the CCS602 module");
                    }
                }

                retCount++;
                if (retCount >= 3) {
                    break;
                }

            }
            if (student.getLevel6Mod4() < 30) {
                Calculations.RetakeL6(3);

                int retakeMod4L6 = sc.nextInt();
                student.setLevel6Mod4(retakeMod4L6);

                if (retakeMod4L6 >= 40) {
                    student.setCreditsL6(creditsL6 += 20);
                } else {
                    System.out.println("\n" + "The student hasn't passed the retake"
                            + " attempt and has to resit for the CCS613 module" + "\n"
                            + "Please Enter the Resit attempt Average");

                    retakeMod4L6 = sc.nextInt();
                    student.setLevel6Mod4(retakeMod4L6);
                    if (retakeMod4L6 >= 40) {
                        student.setCreditsL6(creditsL6 += 20);
                    } else {
                        System.out.println("\n" + "Sorry! The student hasn't passed the CCS613 module");
                    }
                }

                retCount++;
                if (retCount >= 3) {
                    break;
                }
            }
            if (student.getLevel6Mod5() < 30) {
                Calculations.RetakeL6(4);

                int retakeMod5L6 = sc.nextInt();
                student.setLevel6Mod5(retakeMod5L6);

                if (retakeMod5L6 >= 40) {
                    student.setCreditsL6(creditsL6 += 20);
                } else {
                    System.out.println("\n" + "The student hasn't passed the retake attempt "
                            + "and has to resit for the Optional module for Semester One" + "\n"
                            + "Please Enter the Resit attempt Average");

                    retakeMod5L6 = sc.nextInt();
                    student.setLevel6Mod5(retakeMod5L6);
                    if (retakeMod5L6 >= 40) {
                        student.setCreditsL6(creditsL6 += 20);
                    } else {
                        System.out.println("\n" + "Sorry! The student hasn't passed the Optional module for Semester One");
                    }
                }

                retCount++;
                if (retCount >= 3) {
                    break;
                }
            }
            if (student.getLevel6Mod6() < 30) {
                Calculations.RetakeL6(5);

                int retakeMod6L6 = sc.nextInt();
                student.setLevel6Mod6(retakeMod6L6);

                if (retakeMod6L6 >= 40) {
                    student.setCreditsL6(creditsL6 += 20);
                } else {
                    System.out.println("\n" + "The student hasn't passed the"
                            + " retake attempt and has to resit for the Optional module for Semester Two" + "\n"
                            + "Please Enter the Resit attempt Average");

                    retakeMod6L6 = sc.nextInt();
                    student.setLevel6Mod6(retakeMod6L6);
                    if (retakeMod6L6 >= 40) {
                        student.setCreditsL6(creditsL6 += 20);
                    } else {
                        System.out.println("\n" + "Sorry! The student hasn't passed the Optional module "
                                + "for Semester Two");
                    }
                }

                retCount++;
                if (retCount >= 3) {
                    break;
                }
            }
            break;
        } while (!(retCount == 1));
        student.setCreditsL6(creditsL6);

        System.out.println("Level 6 Credits after retake - " + student.getCreditsL6());

        //Checking if there's any retakes in Level 05
        if (student.getCreditsL5() == 100) {
            System.out.println("\n" + "ATTENTION! The student hasn't passed one Module in Level 05\n" +
                    "And it has to be retaken before the award Calculation");
            System.out.println("Please enter the Retake attempt Average\n");
            //Checking Module 1
            if (student.getLevel5Mod1() < 30) {
                Calculations.RetakeL5(0);

                int retakeMod1L5 = sc.nextInt();
                student.setLevel5Mod1(retakeMod1L5);

                if (retakeMod1L5 >= 40) {
                    student.setCreditsL5(creditsL5 += 20);

                } else {
                    System.out.println("\n" + "Sorry! The student hasn't passed the CCS501 module");

                }
                //Checking Module 2
            } else if (student.getLevel5Mod2() < 30) {
                Calculations.RetakeL5(1);

                int retakeMod2L5 = sc.nextInt();
                student.setLevel5Mod2(retakeMod2L5);

                if (retakeMod2L5 >= 40) {
                    student.setCreditsL5(creditsL5 += 20);
                } else {
                    System.out.println("\n" + "Sorry! The student hasn't passed the CCS504 module");

                }
                //Checking Module 3
            } else if (student.getLevel5Mod3() < 30) {
                Calculations.RetakeL5(2);

                int retakeMod3L5 = sc.nextInt();
                student.setLevel5Mod3(retakeMod3L5);

                if (retakeMod3L5 >= 40) {
                    student.setCreditsL5(creditsL5 += 20);
                } else {
                    System.out.println("\n" + "Sorry! The student hasn't passed the CCS503 module");
                }
                //Checking Module 4
            } else if (student.getLevel5Mod4() < 30) {
                Calculations.RetakeL5(3);

                int retakeMod4L5 = sc.nextInt();
                student.setLevel5Mod4(retakeMod4L5);

                if (retakeMod4L5 >= 40) {
                    student.setCreditsL5(creditsL5 += 20);
                } else {
                    System.out.println("\n" + "Sorry! The student hasn't passed the CCS502 module");
                }
                //Checking Module 5
            } else if (student.getLevel5Mod5() < 30) {
                Calculations.RetakeL5(4);

                int retakeMod5L5 = sc.nextInt();
                student.setLevel5Mod5(retakeMod5L5);

                if (retakeMod5L5 >= 40) {
                    student.setCreditsL5(creditsL5 += 20);
                } else {
                    System.out.println("\n" + "Sorry! The student hasn't passed the Optional module for Semester one");
                }
                //Checking Module 6
            } else if (student.getLevel5Mod6() < 30) {
                Calculations.RetakeL5(5);

                int retakeMod6L5 = sc.nextInt();
                student.setLevel5Mod6(retakeMod6L5);

                if (retakeMod6L5 >= 40) {
                    student.setCreditsL5(creditsL5 += 20);
                } else {
                    System.out.println("\n" + "Sorry! The student hasn't passed the Optional module for Semester Two");
                }

            }

        }

        //******************************Indicator Score***************************************************

        //Putting the averages in to an array to sort
        ArrayList<Integer> avg = new ArrayList<Integer>();
        avg.add(student.getLevel5Mod1());
        avg.add(student.getLevel5Mod2());
        avg.add(student.getLevel5Mod3());
        avg.add(student.getLevel5Mod4());
        avg.add(student.getLevel5Mod5());
        avg.add(student.getLevel5Mod6());

        avg.add(student.getLevel6Mod1());
        avg.add(student.getLevel6Mod2());
        avg.add(student.getLevel6Mod3());
        avg.add(student.getLevel6Mod4());
        avg.add(student.getLevel6Mod5());
        avg.add(student.getLevel6Mod6());

        //Calculate the sum of the averages in Level 5
        int sumL5 = 0;
        for (int i = 0; i <= 5; i++) {
            sumL5 += avg.get(i);
        }
        //Calculate the sum of the averages in Level 5
        int sumL6 = 0;
        for (int i = 6; i <= 11; i++) {
            sumL6 += avg.get(i);
        }

        //sort the arraylist
        Collections.sort(avg);

        //Calculate the indicator Score
        level6.score = (((sumL5 * 1 / 3) + (sumL6 * 2 / 3)) - avg.get(0)) / 5;
        student.setScore(level6.score);

        //System.out.println("The Lowest average is " + avg.get(0));


        if ((student.getCreditsL4() + student.getCreditsL6()) == 240) {
            System.out.println("");
            System.out.println("CONGRATULATIONS ! THE STUDENT IS ELIGIBLE FOR LEVEL 06");
        } else if ((student.getCreditsL4() == 120 && student.getCreditsL6() == 100)) {
            System.out.println("");
            System.out.println("CONGRATULATIONS ! THE STUDENT IS ELIGIBLE FOR LEVEL 06");
            System.out.println("But the Student has obtained only 100 credits in level 05.\n" +
                    "So the failed module has to be retaken in Level 06");
        }

        //Exit options for Level 06
        int exitOptionL6;
        do {
            System.out.println("");
            System.out.println(".....................................................................................");
            System.out.println("                    Please select an option from the list bellow.                    ");
            System.out.println(".....................................................................................");
            System.out.println("");
            System.out.println("1. Proceed");
            System.out.println("2. Exit with Diploma of Higher Education \n");
            exitOptionL6 = sc.nextInt();
            if (exitOptionL6 == 1) {
                break;

            }
            if (exitOptionL6 == 2) {

                if ((student.getCreditsL4() + student.getCreditsL5()) == 240) {
                    System.out.println("");
                    System.out.println("CONGRATULATIONS! The Student has received a Diploma of Higher Education");
                    student.setDipHe(dipHe += 1);
                    System.out.println("Number of Dip.HE in the batch - " + student.getDipHe());
                } else {
                    System.out.println("");
                    System.out.println("SORRY! The Student is not eligible for a Diploma of Higher Education");

                }
                break;
            }
            System.out.println("");
            System.out.println("Invalid Input. Please select a valid option.");


        } while ((exitOptionL6 != 0));
    }
}

