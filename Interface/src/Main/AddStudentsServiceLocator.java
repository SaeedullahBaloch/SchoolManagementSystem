/**
 * AddStudentsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Main;

public class AddStudentsServiceLocator extends org.apache.axis.client.Service implements Main.AddStudentsService {

    public AddStudentsServiceLocator() {
    }


    public AddStudentsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddStudentsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddStudents
    private java.lang.String AddStudents_address = "http://localhost:8080/SchoolManagementSystemNew/services/AddStudents";

    public java.lang.String getAddStudentsAddress() {
        return AddStudents_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddStudentsWSDDServiceName = "AddStudents";

    public java.lang.String getAddStudentsWSDDServiceName() {
        return AddStudentsWSDDServiceName;
    }

    public void setAddStudentsWSDDServiceName(java.lang.String name) {
        AddStudentsWSDDServiceName = name;
    }

    public Main.AddStudents getAddStudents() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddStudents_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddStudents(endpoint);
    }

    public Main.AddStudents getAddStudents(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Main.AddStudentsSoapBindingStub _stub = new Main.AddStudentsSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddStudentsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddStudentsEndpointAddress(java.lang.String address) {
        AddStudents_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Main.AddStudents.class.isAssignableFrom(serviceEndpointInterface)) {
                Main.AddStudentsSoapBindingStub _stub = new Main.AddStudentsSoapBindingStub(new java.net.URL(AddStudents_address), this);
                _stub.setPortName(getAddStudentsWSDDServiceName());
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
        if ("AddStudents".equals(inputPortName)) {
            return getAddStudents();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Main", "AddStudentsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Main", "AddStudents"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddStudents".equals(portName)) {
            setAddStudentsEndpointAddress(address);
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
