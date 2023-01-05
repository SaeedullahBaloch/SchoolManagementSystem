package Main;

public class SearchStudentsProxy implements Main.SearchStudents {
  private String _endpoint = null;
  private Main.SearchStudents searchStudents = null;
  
  public SearchStudentsProxy() {
    _initSearchStudentsProxy();
  }
  
  public SearchStudentsProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchStudentsProxy();
  }
  
  private void _initSearchStudentsProxy() {
    try {
      searchStudents = (new Main.SearchStudentsServiceLocator()).getSearchStudents();
      if (searchStudents != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searchStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searchStudents)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searchStudents != null)
      ((javax.xml.rpc.Stub)searchStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Main.SearchStudents getSearchStudents() {
    if (searchStudents == null)
      _initSearchStudentsProxy();
    return searchStudents;
  }
  
  public Main.StudentList findStudents(int admissionNumber) throws java.rmi.RemoteException{
    if (searchStudents == null)
      _initSearchStudentsProxy();
    return searchStudents.findStudents(admissionNumber);
  }
  
  
}