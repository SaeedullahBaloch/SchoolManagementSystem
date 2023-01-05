/**
 * TeacherListingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Teaching;

public interface TeacherListingService extends javax.xml.rpc.Service {
    public java.lang.String getTeacherListingAddress();

    public Teaching.TeacherListing getTeacherListing() throws javax.xml.rpc.ServiceException;

    public Teaching.TeacherListing getTeacherListing(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
