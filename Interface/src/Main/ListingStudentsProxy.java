package Main;

public class ListingStudentsProxy implements Main.ListingStudents {
  private String _endpoint = null;
  private Main.ListingStudents listingStudents = null;
  
  public ListingStudentsProxy() {
    _initListingStudentsProxy();
  }
  
  public ListingStudentsProxy(String endpoint) {
    _endpoint = endpoint;
    _initListingStudentsProxy();
  }
  
  private void _initListingStudentsProxy() {
    try {
      listingStudents = (new Main.ListingStudentsServiceLocator()).getListingStudents();
      if (listingStudents != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listingStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listingStudents)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listingStudents != null)
      ((javax.xml.rpc.Stub)listingStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Main.ListingStudents getListingStudents() {
    if (listingStudents == null)
      _initListingStudentsProxy();
    return listingStudents;
  }
  
  public Main.StudentList[] listAllStudents() throws java.rmi.RemoteException{
    if (listingStudents == null)
      _initListingStudentsProxy();
    return listingStudents.listAllStudents();
  }
  
  
}