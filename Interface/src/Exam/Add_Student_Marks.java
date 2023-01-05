/**
 * Add_Student_Marks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Exam;

public interface Add_Student_Marks extends java.rmi.Remote {
    public int addstudentmarks(int examID, int studentID, int teacherID, int totalMarks, int obtainedMarks, java.lang.String result) throws java.rmi.RemoteException;
}
