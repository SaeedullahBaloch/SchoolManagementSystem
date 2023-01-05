package Exam;

public class Mark_listingProxy implements Exam.Mark_listing {
  private String _endpoint = null;
  private Exam.Mark_listing mark_listing = null;
  
  public Mark_listingProxy() {
    _initMark_listingProxy();
  }
  
  public Mark_listingProxy(String endpoint) {
    _endpoint = endpoint;
    _initMark_listingProxy();
  }
  
  private void _initMark_listingProxy() {
    try {
      mark_listing = (new Exam.Mark_listingServiceLocator()).getMark_listing();
      if (mark_listing != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mark_listing)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mark_listing)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mark_listing != null)
      ((javax.xml.rpc.Stub)mark_listing)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Exam.Mark_listing getMark_listing() {
    if (mark_listing == null)
      _initMark_listingProxy();
    return mark_listing;
  }
  
  public Exam.Marks_list[] mark_listing() throws java.rmi.RemoteException{
    if (mark_listing == null)
      _initMark_listingProxy();
    return mark_listing.mark_listing();
  }
  
  
}