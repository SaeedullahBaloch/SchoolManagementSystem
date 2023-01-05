/**
 * SearchVoucherServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package feeCollection;

public class SearchVoucherServiceLocator extends org.apache.axis.client.Service implements feeCollection.SearchVoucherService {

    public SearchVoucherServiceLocator() {
    }


    public SearchVoucherServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchVoucherServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchVoucher
    private java.lang.String SearchVoucher_address = "http://localhost:8080/SchoolManagementSystemNew/services/SearchVoucher";

    public java.lang.String getSearchVoucherAddress() {
        return SearchVoucher_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchVoucherWSDDServiceName = "SearchVoucher";

    public java.lang.String getSearchVoucherWSDDServiceName() {
        return SearchVoucherWSDDServiceName;
    }

    public void setSearchVoucherWSDDServiceName(java.lang.String name) {
        SearchVoucherWSDDServiceName = name;
    }

    public feeCollection.SearchVoucher getSearchVoucher() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchVoucher_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchVoucher(endpoint);
    }

    public feeCollection.SearchVoucher getSearchVoucher(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            feeCollection.SearchVoucherSoapBindingStub _stub = new feeCollection.SearchVoucherSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchVoucherWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchVoucherEndpointAddress(java.lang.String address) {
        SearchVoucher_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (feeCollection.SearchVoucher.class.isAssignableFrom(serviceEndpointInterface)) {
                feeCollection.SearchVoucherSoapBindingStub _stub = new feeCollection.SearchVoucherSoapBindingStub(new java.net.URL(SearchVoucher_address), this);
                _stub.setPortName(getSearchVoucherWSDDServiceName());
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
        if ("SearchVoucher".equals(inputPortName)) {
            return getSearchVoucher();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://feeCollection", "SearchVoucherService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://feeCollection", "SearchVoucher"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchVoucher".equals(portName)) {
            setSearchVoucherEndpointAddress(address);
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
