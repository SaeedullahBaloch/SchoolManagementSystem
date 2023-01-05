/**
 * EditStudents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Main;

public interface EditStudents extends java.rmi.Remote {
    public int editStudents(int admissionNumber, java.lang.String studentName, java.lang.String father, java.lang.String DOB, java.lang.String phone, java.lang.String address, java.lang.String email, int classID, java.lang.String status) throws java.rmi.RemoteException;
}
