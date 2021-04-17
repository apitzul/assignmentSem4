/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.*;
import java.io.*;
/**
 *
 * @author apitz
 */
public class Patient {
    
    String patientName; // patient name
    int patientNumber; // patient number
    String patientAddress; // patient address
    
    public Patient() {
        this.patientName = null;
        this.patientNumber = 0;
        this.patientAddress = null;
    }
    
    public Patient(String patientName, int patientNumber, String patientAddress) {
        this.patientName = patientName;
        this.patientNumber = patientNumber;
        this.patientAddress = patientAddress;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientName=" + patientName + ", patientNumber=" + patientNumber + ", patientAddress=" + patientAddress + '}';
    }


}
