/**
 * UpdateServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Teaching;

public class UpdateServiceLocator extends org.apache.axis.client.Service implements Teaching.UpdateService {

    public UpdateServiceLocator() {
    }


    public UpdateServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UpdateServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for update
    private java.lang.String update_address = "http://localhost:8080/SchoolManagementSystemNew/services/update";

    public java.lang.String getupdateAddress() {
        return update_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String updateWSDDServiceName = "update";

    public java.lang.String getupdateWSDDServiceName() {
        return updateWSDDServiceName;
    }

    public void setupdateWSDDServiceName(java.lang.String name) {
        updateWSDDServiceName = name;
    }

    public Teaching.Update getupdate() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(update_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getupdate(endpoint);
    }

    public Teaching.Update getupdate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Teaching.UpdateSoapBindingStub _stub = new Teaching.UpdateSoapBindingStub(portAddress, this);
            _stub.setPortName(getupdateWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setupdateEndpointAddress(java.lang.String address) {
        update_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Teaching.Update.class.isAssignableFrom(serviceEndpointInterface)) {
                Teaching.UpdateSoapBindingStub _stub = new Teaching.UpdateSoapBindingStub(new java.net.URL(update_address), this);
                _stub.setPortName(getupdateWSDDServiceName());
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
        if ("update".equals(inputPortName)) {
            return getupdate();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Teaching", "updateService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Teaching", "update"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("update".equals(portName)) {
            setupdateEndpointAddress(address);
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
