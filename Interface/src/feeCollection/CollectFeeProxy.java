package feeCollection;

public class CollectFeeProxy implements feeCollection.CollectFee {
  private String _endpoint = null;
  private feeCollection.CollectFee collectFee = null;
  
  public CollectFeeProxy() {
    _initCollectFeeProxy();
  }
  
  public CollectFeeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCollectFeeProxy();
  }
  
  private void _initCollectFeeProxy() {
    try {
      collectFee = (new feeCollection.CollectFeeServiceLocator()).getcollectFee();
      if (collectFee != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)collectFee)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)collectFee)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (collectFee != null)
      ((javax.xml.rpc.Stub)collectFee)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public feeCollection.CollectFee getCollectFee() {
    if (collectFee == null)
      _initCollectFeeProxy();
    return collectFee;
  }
  
  public int collectStudentFee(int id, int studentID, java.lang.String feeMonth, java.lang.String date, int amount) throws java.rmi.RemoteException{
    if (collectFee == null)
      _initCollectFeeProxy();
    return collectFee.collectStudentFee(id, studentID, feeMonth, date, amount);
  }
  
  
}