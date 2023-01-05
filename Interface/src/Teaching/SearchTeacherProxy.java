package Teaching;

public class SearchTeacherProxy implements Teaching.SearchTeacher {
  private String _endpoint = null;
  private Teaching.SearchTeacher searchTeacher = null;
  
  public SearchTeacherProxy() {
    _initSearchTeacherProxy();
  }
  
  public SearchTeacherProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchTeacherProxy();
  }
  
  private void _initSearchTeacherProxy() {
    try {
      searchTeacher = (new Teaching.SearchTeacherServiceLocator()).getSearchTeacher();
      if (searchTeacher != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searchTeacher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searchTeacher)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searchTeacher != null)
      ((javax.xml.rpc.Stub)searchTeacher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Teaching.SearchTeacher getSearchTeacher() {
    if (searchTeacher == null)
      _initSearchTeacherProxy();
    return searchTeacher;
  }
  
  public Teaching.ListTeachers findTeachers(int teacherID) throws java.rmi.RemoteException{
    if (searchTeacher == null)
      _initSearchTeacherProxy();
    return searchTeacher.findTeachers(teacherID);
  }
  
  
}