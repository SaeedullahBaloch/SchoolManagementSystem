package Main;

public class EditStudentsProxy implements Main.EditStudents {
  private String _endpoint = null;
  private Main.EditStudents editStudents = null;
  
  public EditStudentsProxy() {
    _initEditStudentsProxy();
  }
  
  public EditStudentsProxy(String endpoint) {
    _endpoint = endpoint;
    _initEditStudentsProxy();
  }
  
  private void _initEditStudentsProxy() {
    try {
      editStudents = (new Main.EditStudentsServiceLocator()).getEditStudents();
      if (editStudents != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)editStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)editStudents)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (editStudents != null)
      ((javax.xml.rpc.Stub)editStudents)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Main.EditStudents getEditStudents() {
    if (editStudents == null)
      _initEditStudentsProxy();
    return editStudents;
  }
  
  public int editStudents(int admissionNumber, java.lang.String studentName, java.lang.String father, java.lang.String DOB, java.lang.String phone, java.lang.String address, java.lang.String email, int classID, java.lang.String status) throws java.rmi.RemoteException{
    if (editStudents == null)
      _initEditStudentsProxy();
    return editStudents.editStudents(admissionNumber, studentName, father, DOB, phone, address, email, classID, status);
  }
  
  
}