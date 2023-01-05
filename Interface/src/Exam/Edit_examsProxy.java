package Exam;

public class Edit_examsProxy implements Exam.Edit_exams {
  private String _endpoint = null;
  private Exam.Edit_exams edit_exams = null;
  
  public Edit_examsProxy() {
    _initEdit_examsProxy();
  }
  
  public Edit_examsProxy(String endpoint) {
    _endpoint = endpoint;
    _initEdit_examsProxy();
  }
  
  private void _initEdit_examsProxy() {
    try {
      edit_exams = (new Exam.Edit_examsServiceLocator()).getEdit_exams();
      if (edit_exams != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)edit_exams)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)edit_exams)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (edit_exams != null)
      ((javax.xml.rpc.Stub)edit_exams)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Exam.Edit_exams getEdit_exams() {
    if (edit_exams == null)
      _initEdit_examsProxy();
    return edit_exams;
  }
  
  public int edit_exam(int examID, java.lang.String name, java.lang.String startDate, java.lang.String endDate, java.lang.String status) throws java.rmi.RemoteException{
    if (edit_exams == null)
      _initEdit_examsProxy();
    return edit_exams.edit_exam(examID, name, startDate, endDate, status);
  }
  
  
}