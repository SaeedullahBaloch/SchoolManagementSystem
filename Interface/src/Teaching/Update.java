/**
 * Update.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Teaching;

public interface Update extends java.rmi.Remote {
    public int updateTeacher(int teacherID, int registrationNumber, java.lang.String name, java.lang.String father, java.lang.String dateOfBirth, java.lang.String phone, java.lang.String CNIC, java.lang.String qualification, java.lang.String email, java.lang.String address, java.lang.String registrationDate, java.lang.String status) throws java.rmi.RemoteException;
}
