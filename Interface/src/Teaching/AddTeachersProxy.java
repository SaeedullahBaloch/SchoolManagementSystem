package Teaching;

public class AddTeachersProxy implements Teaching.AddTeachers {
  private String _endpoint = null;
  private Teaching.AddTeachers addTeachers = null;
  
  public AddTeachersProxy() {
    _initAddTeachersProxy();
  }
  
  public AddTeachersProxy(String endpoint) {
    _endpoint = endpoint;
    _initAddTeachersProxy();
  }
  
  private void _initAddTeachersProxy() {
    try {
      addTeachers = (new Teaching.AddTeachersServiceLocator()).getaddTeachers();
      if (addTeachers != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addTeachers)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addTeachers)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addTeachers != null)
      ((javax.xml.rpc.Stub)addTeachers)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Teaching.AddTeachers getAddTeachers() {
    if (addTeachers == null)
      _initAddTeachersProxy();
    return addTeachers;
  }
  
  public int addNewTeacher(int teacherID, int registrationNumber, java.lang.String name, java.lang.String father, java.lang.String dateOfBirth, java.lang.String phone, java.lang.String CNIC, java.lang.String qualification, java.lang.String email, java.lang.String address, java.lang.String registrationDate, java.lang.String status) throws java.rmi.RemoteException{
    if (addTeachers == null)
      _initAddTeachersProxy();
    return addTeachers.addNewTeacher(teacherID, registrationNumber, name, father, dateOfBirth, phone, CNIC, qualification, email, address, registrationDate, status);
  }
  
  
}