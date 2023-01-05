/**
 * Creat_ExamServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Exam;

public class Creat_ExamServiceLocator extends org.apache.axis.client.Service implements Exam.Creat_ExamService {

    public Creat_ExamServiceLocator() {
    }


    public Creat_ExamServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Creat_ExamServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Creat_Exam
    private java.lang.String Creat_Exam_address = "http://localhost:8080/SchoolManagementSystemNew/services/Creat_Exam";

    public java.lang.String getCreat_ExamAddress() {
        return Creat_Exam_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Creat_ExamWSDDServiceName = "Creat_Exam";

    public java.lang.String getCreat_ExamWSDDServiceName() {
        return Creat_ExamWSDDServiceName;
    }

    public void setCreat_ExamWSDDServiceName(java.lang.String name) {
        Creat_ExamWSDDServiceName = name;
    }

    public Exam.Creat_Exam getCreat_Exam() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Creat_Exam_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreat_Exam(endpoint);
    }

    public Exam.Creat_Exam getCreat_Exam(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Exam.Creat_ExamSoapBindingStub _stub = new Exam.Creat_ExamSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreat_ExamWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreat_ExamEndpointAddress(java.lang.String address) {
        Creat_Exam_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Exam.Creat_Exam.class.isAssignableFrom(serviceEndpointInterface)) {
                Exam.Creat_ExamSoapBindingStub _stub = new Exam.Creat_ExamSoapBindingStub(new java.net.URL(Creat_Exam_address), this);
                _stub.setPortName(getCreat_ExamWSDDServiceName());
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
        if ("Creat_Exam".equals(inputPortName)) {
            return getCreat_Exam();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Exam", "Creat_ExamService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Exam", "Creat_Exam"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Creat_Exam".equals(portName)) {
            setCreat_ExamEndpointAddress(address);
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
