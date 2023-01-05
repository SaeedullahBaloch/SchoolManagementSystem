/**
 * Edit_exams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Exam;

public interface Edit_exams extends java.rmi.Remote {
    public int edit_exam(int examID, java.lang.String name, java.lang.String startDate, java.lang.String endDate, java.lang.String status) throws java.rmi.RemoteException;
}
