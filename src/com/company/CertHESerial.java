package com.company;

/**
 * Created by Brion Mario on 22/04/2016.
 */
public class CertHESerial implements java.io.Serializable{

    @Override
    public String toString() {
        return "CertHESerial{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", RegNo='" + RegNo + '\'' +
                '}';
    }


    private String FirstName;
    private String LastName;
    private String RegNo;

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

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        this.RegNo = regNo;
    }

}
