/**
 * Listing_ExamServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Exam;

public class Listing_ExamServiceLocator extends org.apache.axis.client.Service implements Exam.Listing_ExamService {

    public Listing_ExamServiceLocator() {
    }


    public Listing_ExamServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Listing_ExamServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Listing_Exam
    private java.lang.String Listing_Exam_address = "http://localhost:8080/SchoolManagementSystemNew/services/Listing_Exam";

    public java.lang.String getListing_ExamAddress() {
        return Listing_Exam_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Listing_ExamWSDDServiceName = "Listing_Exam";

    public java.lang.String getListing_ExamWSDDServiceName() {
        return Listing_ExamWSDDServiceName;
    }

    public void setListing_ExamWSDDServiceName(java.lang.String name) {
        Listing_ExamWSDDServiceName = name;
    }

    public Exam.Listing_Exam getListing_Exam() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Listing_Exam_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getListing_Exam(endpoint);
    }

    public Exam.Listing_Exam getListing_Exam(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Exam.Listing_ExamSoapBindingStub _stub = new Exam.Listing_ExamSoapBindingStub(portAddress, this);
            _stub.setPortName(getListing_ExamWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setListing_ExamEndpointAddress(java.lang.String address) {
        Listing_Exam_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Exam.Listing_Exam.class.isAssignableFrom(serviceEndpointInterface)) {
                Exam.Listing_ExamSoapBindingStub _stub = new Exam.Listing_ExamSoapBindingStub(new java.net.URL(Listing_Exam_address), this);
                _stub.setPortName(getListing_ExamWSDDServiceName());
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
        if ("Listing_Exam".equals(inputPortName)) {
            return getListing_Exam();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Exam", "Listing_ExamService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Exam", "Listing_Exam"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Listing_Exam".equals(portName)) {
            setListing_ExamEndpointAddress(address);
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
