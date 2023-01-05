package feeCollection;

public class SearchVoucherProxy implements feeCollection.SearchVoucher {
  private String _endpoint = null;
  private feeCollection.SearchVoucher searchVoucher = null;
  
  public SearchVoucherProxy() {
    _initSearchVoucherProxy();
  }
  
  public SearchVoucherProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchVoucherProxy();
  }
  
  private void _initSearchVoucherProxy() {
    try {
      searchVoucher = (new feeCollection.SearchVoucherServiceLocator()).getSearchVoucher();
      if (searchVoucher != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searchVoucher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searchVoucher)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searchVoucher != null)
      ((javax.xml.rpc.Stub)searchVoucher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public feeCollection.SearchVoucher getSearchVoucher() {
    if (searchVoucher == null)
      _initSearchVoucherProxy();
    return searchVoucher;
  }
  
  public feeCollection.VoucherList getVoucher(int id) throws java.rmi.RemoteException{
    if (searchVoucher == null)
      _initSearchVoucherProxy();
    return searchVoucher.getVoucher(id);
  }
  
  
}