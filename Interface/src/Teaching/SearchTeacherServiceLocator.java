/**
 * SearchTeacherServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Teaching;

public class SearchTeacherServiceLocator extends org.apache.axis.client.Service implements Teaching.SearchTeacherService {

    public SearchTeacherServiceLocator() {
    }


    public SearchTeacherServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchTeacherServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchTeacher
    private java.lang.String SearchTeacher_address = "http://localhost:8080/SchoolManagementSystemNew/services/SearchTeacher";

    public java.lang.String getSearchTeacherAddress() {
        return SearchTeacher_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchTeacherWSDDServiceName = "SearchTeacher";

    public java.lang.String getSearchTeacherWSDDServiceName() {
        return SearchTeacherWSDDServiceName;
    }

    public void setSearchTeacherWSDDServiceName(java.lang.String name) {
        SearchTeacherWSDDServiceName = name;
    }

    public Teaching.SearchTeacher getSearchTeacher() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchTeacher_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchTeacher(endpoint);
    }

    public Teaching.SearchTeacher getSearchTeacher(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Teaching.SearchTeacherSoapBindingStub _stub = new Teaching.SearchTeacherSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchTeacherWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchTeacherEndpointAddress(java.lang.String address) {
        SearchTeacher_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Teaching.SearchTeacher.class.isAssignableFrom(serviceEndpointInterface)) {
                Teaching.SearchTeacherSoapBindingStub _stub = new Teaching.SearchTeacherSoapBindingStub(new java.net.URL(SearchTeacher_address), this);
                _stub.setPortName(getSearchTeacherWSDDServiceName());
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
        if ("SearchTeacher".equals(inputPortName)) {
            return getSearchTeacher();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Teaching", "SearchTeacherService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Teaching", "SearchTeacher"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchTeacher".equals(portName)) {
            setSearchTeacherEndpointAddress(address);
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
