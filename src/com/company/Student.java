package com.company;

import java.io.Serializable;

/**
 * Created by Brion Mario on 22/03/2016.
 */
public class Student {

    //Student Details instance variables
    private String FirstName;
    private String LastName;
    private String IndexNumber;
    private static int StudentNumber;

    //Student Details getters and setters
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getIndexNumber() {
        return IndexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.IndexNumber = indexNumber;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {

        this.StudentNumber = studentNumber;
    }

    //Level 04 instance variable list
    private int Level4Mod1;
    private int Level4Mod2;
    private int Level4Mod3;
    private int Level4Mod4;
    private int Level4Mod5;
    private int Level4Mod6;

    private static int CreditsL4;

    //Level 04 getters and setters
    public int getLevel4Mod1() {
        return Level4Mod1;
    }

    public void setLevel4Mod1(int level4Mod1) {
        this.Level4Mod1 = level4Mod1;
    }

    public int getLevel4Mod2() {
        return Level4Mod2;
    }

    public void setLevel4Mod2(int level4Mod2) {

        this.Level4Mod2 = level4Mod2;
    }

    public int getLevel4Mod3() {
        return Level4Mod3;
    }

    public void setLevel4Mod3(int level4Mod3) {

        this.Level4Mod3 = level4Mod3;
    }

    public int getLevel4Mod4() {
        return Level4Mod4;
    }

    public void setLevel4Mod4(int level4Mod4) {

        this.Level4Mod4 = level4Mod4;
    }

    public int getLevel4Mod5() {
        return Level4Mod5;
    }

    public void setLevel4Mod5(int level4Mod5) {

        this.Level4Mod5 = level4Mod5;
    }

    public int getLevel4Mod6() {
        return Level4Mod6;
    }

    public void setLevel4Mod6(int level4Mod6) {

        this.Level4Mod6 = level4Mod6;
    }
    //Level 4 credits getter and setter
    public void setCreditsL4(int creditsL4) {

        this.CreditsL4 = creditsL4;
    }

    public int getCreditsL4() {
        return CreditsL4;
    }

    //***********************************************
    //Level 05 instance variables

    private static int Level5Mod1;
    private static int Level5Mod2;
    private static int Level5Mod3;
    private static int Level5Mod4;
    private static int Level5Mod5;
    private static int Level5Mod6;

    private static int CreditsL5;

    //Level 05 getters and setters
    public int getLevel5Mod1() {
        return Level5Mod1;
    }

    public void setLevel5Mod1(int level5Mod1) {

        this.Level5Mod1 = level5Mod1;
    }

    public int getLevel5Mod2() {
        return Level5Mod2;
    }

    public void setLevel5Mod2(int level5Mod2) {

        this.Level5Mod2 = level5Mod2;
    }

    public int getLevel5Mod3() {
        return Level5Mod3;
    }

    public void setLevel5Mod3(int level5Mod3) {

        this.Level5Mod3 = level5Mod3;
    }

    public int getLevel5Mod4() {
        return Level5Mod4;
    }

    public void setLevel5Mod4(int level5Mod4) {

        this.Level5Mod4 = level5Mod4;
    }

    public int getLevel5Mod5() {
        return Level5Mod5;
    }

    public void setLevel5Mod5(int level5Mod5) {

        this.Level5Mod5 = level5Mod5;
    }

    public int getLevel5Mod6() {
        return Level5Mod6;
    }

    public void setLevel5Mod6(int level5Mod6) {

        this.Level5Mod6 = level5Mod6;
    }

    //Level 5 credits getter and setter
    public void setCreditsL5(int creditsL5) {

        this.CreditsL5 = creditsL5;
    }

    public int getCreditsL5() {
        return CreditsL5;
    }

    //******************************************
    //Level 06 instance variables

    private static int Level6Mod1;
    private static int Level6Mod2;
    private static int Level6Mod3;
    private static int Level6Mod4;
    private static int Level6Mod5;
    private static int Level6Mod6;

    private static int CreditsL6;

    //Level 06 getters and setters
    public int getLevel6Mod1() {
        return Level6Mod1;
    }

    public void setLevel6Mod1(int level6Mod1) {

        this.Level6Mod1 = level6Mod1;
    }

    public int getLevel6Mod2() {
        return Level6Mod2;
    }

    public void setLevel6Mod2(int level6Mod2) {

        this.Level6Mod2 = level6Mod2;
    }

    public int getLevel6Mod3() {
        return Level6Mod3;
    }

    public void setLevel6Mod3(int level6Mod3) {

        this.Level6Mod3 = level6Mod3;
    }

    public int getLevel6Mod4() {
        return Level6Mod4;
    }

    public void setLevel6Mod4(int level6Mod4) {

        this.Level6Mod4 = level6Mod4;
    }

    public int getLevel6Mod5() {
        return Level6Mod5;
    }

    public void setLevel6Mod5(int level6Mod5) {

        this.Level6Mod5 = level6Mod5;
    }

    public int getLevel6Mod6() {
        return Level6Mod6;
    }

    public void setLevel6Mod6(int level6Mod6) {

        this.Level6Mod6 = level6Mod6;
    }

    //Level 06 credits getter and setter
    public void setCreditsL6(int creditsL6) {

        this.CreditsL6 = creditsL6;
    }

    public int getCreditsL6() {
        return CreditsL6;
    }

    //Cert.HE instance variable and getter and setter
    private static int CertHe;

    public static int getCertHe() {
        return CertHe;
    }

    public static void setCertHe(int certHe) {
        CertHe = certHe;
    }

    //Dip.HE instance variable and getter and setter
    private static int DipHe;

    public static int getDipHe() {
        return DipHe;
    }

    public static void setDipHe(int dipHe) {
        DipHe = dipHe;
    }

    //instance variable for the indicator score
    private static int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}








