/**
 * SearchStudents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Main;

public interface SearchStudents extends java.rmi.Remote {
    public Main.StudentList findStudents(int admissionNumber) throws java.rmi.RemoteException;
}
