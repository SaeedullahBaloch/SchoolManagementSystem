/**
 * AddTeachersServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Teaching;

public class AddTeachersServiceLocator extends org.apache.axis.client.Service implements Teaching.AddTeachersService {

    public AddTeachersServiceLocator() {
    }


    public AddTeachersServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddTeachersServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for addTeachers
    private java.lang.String addTeachers_address = "http://localhost:8080/SchoolManagementSystemNew/services/addTeachers";

    public java.lang.String getaddTeachersAddress() {
        return addTeachers_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String addTeachersWSDDServiceName = "addTeachers";

    public java.lang.String getaddTeachersWSDDServiceName() {
        return addTeachersWSDDServiceName;
    }

    public void setaddTeachersWSDDServiceName(java.lang.String name) {
        addTeachersWSDDServiceName = name;
    }

    public Teaching.AddTeachers getaddTeachers() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(addTeachers_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getaddTeachers(endpoint);
    }

    public Teaching.AddTeachers getaddTeachers(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Teaching.AddTeachersSoapBindingStub _stub = new Teaching.AddTeachersSoapBindingStub(portAddress, this);
            _stub.setPortName(getaddTeachersWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setaddTeachersEndpointAddress(java.lang.String address) {
        addTeachers_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Teaching.AddTeachers.class.isAssignableFrom(serviceEndpointInterface)) {
                Teaching.AddTeachersSoapBindingStub _stub = new Teaching.AddTeachersSoapBindingStub(new java.net.URL(addTeachers_address), this);
                _stub.setPortName(getaddTeachersWSDDServiceName());
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
        if ("addTeachers".equals(inputPortName)) {
            return getaddTeachers();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Teaching", "addTeachersService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Teaching", "addTeachers"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("addTeachers".equals(portName)) {
            setaddTeachersEndpointAddress(address);
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
