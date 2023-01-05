/**
 * ListingVoucherServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package feeCollection;

public class ListingVoucherServiceLocator extends org.apache.axis.client.Service implements feeCollection.ListingVoucherService {

    public ListingVoucherServiceLocator() {
    }


    public ListingVoucherServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ListingVoucherServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ListingVoucher
    private java.lang.String ListingVoucher_address = "http://localhost:8080/SchoolManagementSystemNew/services/ListingVoucher";

    public java.lang.String getListingVoucherAddress() {
        return ListingVoucher_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ListingVoucherWSDDServiceName = "ListingVoucher";

    public java.lang.String getListingVoucherWSDDServiceName() {
        return ListingVoucherWSDDServiceName;
    }

    public void setListingVoucherWSDDServiceName(java.lang.String name) {
        ListingVoucherWSDDServiceName = name;
    }

    public feeCollection.ListingVoucher getListingVoucher() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ListingVoucher_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getListingVoucher(endpoint);
    }

    public feeCollection.ListingVoucher getListingVoucher(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            feeCollection.ListingVoucherSoapBindingStub _stub = new feeCollection.ListingVoucherSoapBindingStub(portAddress, this);
            _stub.setPortName(getListingVoucherWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setListingVoucherEndpointAddress(java.lang.String address) {
        ListingVoucher_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (feeCollection.ListingVoucher.class.isAssignableFrom(serviceEndpointInterface)) {
                feeCollection.ListingVoucherSoapBindingStub _stub = new feeCollection.ListingVoucherSoapBindingStub(new java.net.URL(ListingVoucher_address), this);
                _stub.setPortName(getListingVoucherWSDDServiceName());
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
        if ("ListingVoucher".equals(inputPortName)) {
            return getListingVoucher();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://feeCollection", "ListingVoucherService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://feeCollection", "ListingVoucher"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ListingVoucher".equals(portName)) {
            setListingVoucherEndpointAddress(address);
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
