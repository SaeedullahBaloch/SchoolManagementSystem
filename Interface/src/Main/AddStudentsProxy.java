package Main;

public class AddStudentsProxy implements Main.AddStudents {
  private String _endpoint = null;
  private Main.AddStudents addStudents = null;
  
  public AddStudentsProxy() {
    _initAddStudentsProxy();
  }
  
  public AddStudentsProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddStudentsProxy();
  }
  
  private void _initAddStudentsProxy() {
    try {
      addStudents = (new Main.AddStudentsServiceLocator()).getAddStudents();
      if (addStudents != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addStudents)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addStudents != null)
      ((javax.xml.rpc.Stub)addStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Main.AddStudents getAddStudents() {
    if (addStudents == null)
      _initAddStudentsProxy();
    return addStudents;
  }
  
  public int addNewStudent(int admissionNumber, java.lang.String studentName, java.lang.String father, java.lang.String DOB, java.lang.String phone, java.lang.String address, java.lang.String email, int classID, int status) throws java.rmi.RemoteException{
    if (addStudents == null)
      _initAddStudentsProxy();
    return addStudents.addNewStudent(admissionNumber, studentName, father, DOB, phone, address, email, classID, status);
  }
  
  
}