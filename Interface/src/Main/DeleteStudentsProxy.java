package Main;

public class DeleteStudentsProxy implements Main.DeleteStudents {
  private String _endpoint = null;
  private Main.DeleteStudents deleteStudents = null;
  
  public DeleteStudentsProxy() {
    _initDeleteStudentsProxy();
  }
  
  public DeleteStudentsProxy(String endpoint) {
    _endpoint = endpoint;
    _initDeleteStudentsProxy();
  }
  
  private void _initDeleteStudentsProxy() {
    try {
      deleteStudents = (new Main.DeleteStudentsServiceLocator()).getDeleteStudents();
      if (deleteStudents != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)deleteStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)deleteStudents)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (deleteStudents != null)
      ((javax.xml.rpc.Stub)deleteStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Main.DeleteStudents getDeleteStudents() {
    if (deleteStudents == null)
      _initDeleteStudentsProxy();
    return deleteStudents;
  }
  
  public int deleteStudent(int id) throws java.rmi.RemoteException{
    if (deleteStudents == null)
      _initDeleteStudentsProxy();
    return deleteStudents.deleteStudent(id);
  }
  
  
}