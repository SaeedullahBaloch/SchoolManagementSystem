package Teaching;

public class UpdateProxy implements Teaching.Update {
  private String _endpoint = null;
  private Teaching.Update update = null;
  
  public UpdateProxy() {
    _initUpdateProxy();
  }
  
  public UpdateProxy(String endpoint) {
    _endpoint = endpoint;
    _initUpdateProxy();
  }
  
  private void _initUpdateProxy() {
    try {
      update = (new Teaching.UpdateServiceLocator()).getupdate();
      if (update != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)update)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)update)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (update != null)
      ((javax.xml.rpc.Stub)update)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Teaching.Update getUpdate() {
    if (update == null)
      _initUpdateProxy();
    return update;
  }
  
  public int updateTeacher(int teacherID, int registrationNumber, java.lang.String name, java.lang.String father, java.lang.String dateOfBirth, java.lang.String phone, java.lang.String CNIC, java.lang.String qualification, java.lang.String email, java.lang.String address, java.lang.String registrationDate, java.lang.String status) throws java.rmi.RemoteException{
    if (update == null)
      _initUpdateProxy();
    return update.updateTeacher(teacherID, registrationNumber, name, father, dateOfBirth, phone, CNIC, qualification, email, address, registrationDate, status);
  }
  
  
}