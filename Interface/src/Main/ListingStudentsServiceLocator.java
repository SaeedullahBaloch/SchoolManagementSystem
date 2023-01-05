/**
 * ListingStudentsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Main;

public class ListingStudentsServiceLocator extends org.apache.axis.client.Service implements Main.ListingStudentsService {

    public ListingStudentsServiceLocator() {
    }


    public ListingStudentsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ListingStudentsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ListingStudents
    private java.lang.String ListingStudents_address = "http://localhost:8080/SchoolManagementSystemNew/services/ListingStudents";

    public java.lang.String getListingStudentsAddress() {
        return ListingStudents_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ListingStudentsWSDDServiceName = "ListingStudents";

    public java.lang.String getListingStudentsWSDDServiceName() {
        return ListingStudentsWSDDServiceName;
    }

    public void setListingStudentsWSDDServiceName(java.lang.String name) {
        ListingStudentsWSDDServiceName = name;
    }

    public Main.ListingStudents getListingStudents() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ListingStudents_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getListingStudents(endpoint);
    }

    public Main.ListingStudents getListingStudents(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Main.ListingStudentsSoapBindingStub _stub = new Main.ListingStudentsSoapBindingStub(portAddress, this);
            _stub.setPortName(getListingStudentsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setListingStudentsEndpointAddress(java.lang.String address) {
        ListingStudents_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Main.ListingStudents.class.isAssignableFrom(serviceEndpointInterface)) {
                Main.ListingStudentsSoapBindingStub _stub = new Main.ListingStudentsSoapBindingStub(new java.net.URL(ListingStudents_address), this);
                _stub.setPortName(getListingStudentsWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ListingStudents".equals(inputPortName)) {
            return getListingStudents();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Main", "ListingStudentsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Main", "ListingStudents"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ListingStudents".equals(portName)) {
            setListingStudentsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
