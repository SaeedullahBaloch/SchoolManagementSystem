/**
 * AddStudents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Main;

public interface AddStudents extends java.rmi.Remote {
    public int addNewStudent(int admissionNumber, java.lang.String studentName, java.lang.String father, java.lang.String DOB, java.lang.String phone, java.lang.String address, java.lang.String email, int classID, int status) throws java.rmi.RemoteException;
}
