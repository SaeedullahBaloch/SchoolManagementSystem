/**
 * Edit_examsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Exam;

public class Edit_examsServiceLocator extends org.apache.axis.client.Service implements Exam.Edit_examsService {

    public Edit_examsServiceLocator() {
    }


    public Edit_examsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Edit_examsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Edit_exams
    private java.lang.String Edit_exams_address = "http://localhost:8080/SchoolManagementSystemNew/services/Edit_exams";

    public java.lang.String getEdit_examsAddress() {
        return Edit_exams_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Edit_examsWSDDServiceName = "Edit_exams";

    public java.lang.String getEdit_examsWSDDServiceName() {
        return Edit_examsWSDDServiceName;
    }

    public void setEdit_examsWSDDServiceName(java.lang.String name) {
        Edit_examsWSDDServiceName = name;
    }

    public Exam.Edit_exams getEdit_exams() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Edit_exams_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEdit_exams(endpoint);
    }

    public Exam.Edit_exams getEdit_exams(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Exam.Edit_examsSoapBindingStub _stub = new Exam.Edit_examsSoapBindingStub(portAddress, this);
            _stub.setPortName(getEdit_examsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEdit_examsEndpointAddress(java.lang.String address) {
        Edit_exams_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Exam.Edit_exams.class.isAssignableFrom(serviceEndpointInterface)) {
                Exam.Edit_examsSoapBindingStub _stub = new Exam.Edit_examsSoapBindingStub(new java.net.URL(Edit_exams_address), this);
                _stub.setPortName(getEdit_examsWSDDServiceName());
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
        if ("Edit_exams".equals(inputPortName)) {
            return getEdit_exams();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Exam", "Edit_examsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Exam", "Edit_exams"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Edit_exams".equals(portName)) {
            setEdit_examsEndpointAddress(address);
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
