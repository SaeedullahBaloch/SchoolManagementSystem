/**
 * CollectFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package feeCollection;

public interface CollectFee extends java.rmi.Remote {
    public int collectStudentFee(int id, int studentID, java.lang.String feeMonth, java.lang.String date, int amount) throws java.rmi.RemoteException;
}
