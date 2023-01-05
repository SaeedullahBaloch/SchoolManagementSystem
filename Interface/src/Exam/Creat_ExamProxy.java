package Exam;

public class Creat_ExamProxy implements Exam.Creat_Exam {
  private String _endpoint = null;
  private Exam.Creat_Exam creat_Exam = null;
  
  public Creat_ExamProxy() {
    _initCreat_ExamProxy();
  }
  
  public Creat_ExamProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreat_ExamProxy();
  }
  
  private void _initCreat_ExamProxy() {
    try {
      creat_Exam = (new Exam.Creat_ExamServiceLocator()).getCreat_Exam();
      if (creat_Exam != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)creat_Exam)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)creat_Exam)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (creat_Exam != null)
      ((javax.xml.rpc.Stub)creat_Exam)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Exam.Creat_Exam getCreat_Exam() {
    if (creat_Exam == null)
      _initCreat_ExamProxy();
    return creat_Exam;
  }
  
  public int addExam(int examID, java.lang.String name, java.lang.String startDate, java.lang.String endDate, int status) throws java.rmi.RemoteException{
    if (creat_Exam == null)
      _initCreat_ExamProxy();
    return creat_Exam.addExam(examID, name, startDate, endDate, status);
  }
  
  
}