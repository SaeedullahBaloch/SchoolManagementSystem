/**
 * DeleteStudentsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Main;

public class DeleteStudentsServiceLocator extends org.apache.axis.client.Service implements Main.DeleteStudentsService {

    public DeleteStudentsServiceLocator() {
    }


    public DeleteStudentsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DeleteStudentsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DeleteStudents
    private java.lang.String DeleteStudents_address = "http://localhost:8080/SchoolManagementSystemNew/services/DeleteStudents";

    public java.lang.String getDeleteStudentsAddress() {
        return DeleteStudents_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DeleteStudentsWSDDServiceName = "DeleteStudents";

    public java.lang.String getDeleteStudentsWSDDServiceName() {
        return DeleteStudentsWSDDServiceName;
    }

    public void setDeleteStudentsWSDDServiceName(java.lang.String name) {
        DeleteStudentsWSDDServiceName = name;
    }

    public Main.DeleteStudents getDeleteStudents() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DeleteStudents_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDeleteStudents(endpoint);
    }

    public Main.DeleteStudents getDeleteStudents(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Main.DeleteStudentsSoapBindingStub _stub = new Main.DeleteStudentsSoapBindingStub(portAddress, this);
            _stub.setPortName(getDeleteStudentsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDeleteStudentsEndpointAddress(java.lang.String address) {
        DeleteStudents_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Main.DeleteStudents.class.isAssignableFrom(serviceEndpointInterface)) {
                Main.DeleteStudentsSoapBindingStub _stub = new Main.DeleteStudentsSoapBindingStub(new java.net.URL(DeleteStudents_address), this);
                _stub.setPortName(getDeleteStudentsWSDDServiceName());
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
        if ("DeleteStudents".equals(inputPortName)) {
            return getDeleteStudents();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Main", "DeleteStudentsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Main", "DeleteStudents"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DeleteStudents".equals(portName)) {
            setDeleteStudentsEndpointAddress(address);
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
