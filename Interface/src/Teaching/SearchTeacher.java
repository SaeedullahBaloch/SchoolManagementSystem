/**
 * SearchTeacher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Teaching;

public interface SearchTeacher extends java.rmi.Remote {
    public Teaching.ListTeachers findTeachers(int teacherID) throws java.rmi.RemoteException;
}
