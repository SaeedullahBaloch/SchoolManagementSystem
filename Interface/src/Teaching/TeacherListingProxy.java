package Teaching;

public class TeacherListingProxy implements Teaching.TeacherListing {
  private String _endpoint = null;
  private Teaching.TeacherListing teacherListing = null;
  
  public TeacherListingProxy() {
    _initTeacherListingProxy();
  }
  
  public TeacherListingProxy(String endpoint) {
    _endpoint = endpoint;
    _initTeacherListingProxy();
  }
  
  private void _initTeacherListingProxy() {
    try {
      teacherListing = (new Teaching.TeacherListingServiceLocator()).getTeacherListing();
      if (teacherListing != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)teacherListing)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)teacherListing)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (teacherListing != null)
      ((javax.xml.rpc.Stub)teacherListing)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Teaching.TeacherListing getTeacherListing() {
    if (teacherListing == null)
      _initTeacherListingProxy();
    return teacherListing;
  }
  
  public Teaching.ListTeachers[] listAllTeachers() throws java.rmi.RemoteException{
    if (teacherListing == null)
      _initTeacherListingProxy();
    return teacherListing.listAllTeachers();
  }
  
  
}