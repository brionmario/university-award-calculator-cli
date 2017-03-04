package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brion Mario on 21/04/2016.
 */
public class FileHandling {
    //instances of the CertHESerial and DipHESerial
    CertHESerial certHESerial = new CertHESerial();
    DipHESerial dipHESerial = new DipHESerial();

    //Create two text files to write data
    File file = new File("CertHe.txt");
    File file2 = new File("DipHe.txt");

    //*********************************CERT.HE METHODS***********************************

    public void writeCertHE() throws IOException, ClassNotFoundException {

        //Creating an arraylist
        ArrayList<CertHESerial> students = new ArrayList<CertHESerial>();
        //adding the object of the CertHESerial class to the arraylist
        students.add(certHESerial);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //writing the objects into the text file as binary
        for (CertHESerial stu : students) {
            oos.writeObject(stu);
        }

    }


    public void readCertHE(ArrayList<CertHESerial> certHESerials) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("                   Students who got Certificate of Higher Education                   ");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("");

        try {
            while (true) {

                //casting the read object because it will return a object
                CertHESerial certHESerial1 = (CertHESerial) ois.readObject();
                certHESerials.add(certHESerial1);

            }
        } catch (EOFException e) {
            //System.out.println("Completed");
        }
        //Printing out the data insde the certHESerials arraylist
        for (CertHESerial s : certHESerials) {
            certHESerial = s;
            try {
                System.out.printf("Name : %s %s, Registration no : %s"
                                + "\n",
                        certHESerial.getFirstName().toUpperCase(), certHESerial.getLastName().toUpperCase(), certHESerial.getRegNo());
                System.out.println("");

            } catch (Exception e1) {

            }

        }
    }

    //*********************************DIP.HE METHODS***********************************

    public void writeDipHE() throws IOException, ClassNotFoundException {

        //Creating an arraylist
        ArrayList<DipHESerial> students = new ArrayList<DipHESerial>();
        //adding the object of the DipHESerial class to the arraylist
        students.add(dipHESerial);

        FileOutputStream fos = new FileOutputStream(file2);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //writing the objects into the text file as binary
        for (DipHESerial stu : students) {
            oos.writeObject(stu);
        }

    }


    public void readDipHE(ArrayList<DipHESerial> dipHESerials) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(file2);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("                     Students who got Diploma of Higher Education                     ");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("");

        try {
            while (true) {

                //casting the read object because it will return a object
                DipHESerial dipHESerial = (DipHESerial) ois.readObject();
                dipHESerials.add(dipHESerial);

            }
        } catch (EOFException e) {
            //System.out.println("Completed");
        }
        //Printing out the data inside the dipHESerials arraylist
        for (DipHESerial s : dipHESerials) {
            dipHESerial = s;
            try {
                System.out.printf("Name : %s %s, Registration no : %s"
                                + "\n",
                        dipHESerial.getFirstName().toUpperCase(), dipHESerial.getLastName().toUpperCase(), dipHESerial.getRegNo());
                System.out.println("");

            } catch (Exception e1) {

            }

        }
    }
}

