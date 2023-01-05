package feeCollection;

public class ListingVoucherProxy implements feeCollection.ListingVoucher {
  private String _endpoint = null;
  private feeCollection.ListingVoucher listingVoucher = null;
  
  public ListingVoucherProxy() {
    _initListingVoucherProxy();
  }
  
  public ListingVoucherProxy(String endpoint) {
    _endpoint = endpoint;
    _initListingVoucherProxy();
  }
  
  private void _initListingVoucherProxy() {
    try {
      listingVoucher = (new feeCollection.ListingVoucherServiceLocator()).getListingVoucher();
      if (listingVoucher != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listingVoucher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listingVoucher)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listingVoucher != null)
      ((javax.xml.rpc.Stub)listingVoucher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public feeCollection.ListingVoucher getListingVoucher() {
    if (listingVoucher == null)
      _initListingVoucherProxy();
    return listingVoucher;
  }
  
  public feeCollection.VoucherList[] vouchers() throws java.rmi.RemoteException{
    if (listingVoucher == null)
      _initListingVoucherProxy();
    return listingVoucher.vouchers();
  }
  
  
}