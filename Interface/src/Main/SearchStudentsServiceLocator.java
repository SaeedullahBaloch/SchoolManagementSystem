/**
 * SearchStudentsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Main;

public class SearchStudentsServiceLocator extends org.apache.axis.client.Service implements Main.SearchStudentsService {

    public SearchStudentsServiceLocator() {
    }


    public SearchStudentsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchStudentsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchStudents
    private java.lang.String SearchStudents_address = "http://localhost:8080/SchoolManagementSystemNew/services/SearchStudents";

    public java.lang.String getSearchStudentsAddress() {
        return SearchStudents_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchStudentsWSDDServiceName = "SearchStudents";

    public java.lang.String getSearchStudentsWSDDServiceName() {
        return SearchStudentsWSDDServiceName;
    }

    public void setSearchStudentsWSDDServiceName(java.lang.String name) {
        SearchStudentsWSDDServiceName = name;
    }

    public Main.SearchStudents getSearchStudents() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchStudents_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchStudents(endpoint);
    }

    public Main.SearchStudents getSearchStudents(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Main.SearchStudentsSoapBindingStub _stub = new Main.SearchStudentsSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchStudentsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchStudentsEndpointAddress(java.lang.String address) {
        SearchStudents_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Main.SearchStudents.class.isAssignableFrom(serviceEndpointInterface)) {
                Main.SearchStudentsSoapBindingStub _stub = new Main.SearchStudentsSoapBindingStub(new java.net.URL(SearchStudents_address), this);
                _stub.setPortName(getSearchStudentsWSDDServiceName());
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
        if ("SearchStudents".equals(inputPortName)) {
            return getSearchStudents();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Main", "SearchStudentsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Main", "SearchStudents"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchStudents".equals(portName)) {
            setSearchStudentsEndpointAddress(address);
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
