package Exam;

public class Add_Student_MarksProxy implements Exam.Add_Student_Marks {
  private String _endpoint = null;
  private Exam.Add_Student_Marks add_Student_Marks = null;
  
  public Add_Student_MarksProxy() {
    _initAdd_Student_MarksProxy();
  }
  
  public Add_Student_MarksProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdd_Student_MarksProxy();
  }
  
  private void _initAdd_Student_MarksProxy() {
    try {
      add_Student_Marks = (new Exam.Add_Student_MarksServiceLocator()).getAdd_Student_Marks();
      if (add_Student_Marks != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)add_Student_Marks)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)add_Student_Marks)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (add_Student_Marks != null)
      ((javax.xml.rpc.Stub)add_Student_Marks)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Exam.Add_Student_Marks getAdd_Student_Marks() {
    if (add_Student_Marks == null)
      _initAdd_Student_MarksProxy();
    return add_Student_Marks;
  }
  
  public int addstudentmarks(int examID, int studentID, int teacherID, int totalMarks, int obtainedMarks, java.lang.String result) throws java.rmi.RemoteException{
    if (add_Student_Marks == null)
      _initAdd_Student_MarksProxy();
    return add_Student_Marks.addstudentmarks(examID, studentID, teacherID, totalMarks, obtainedMarks, result);
  }
  
  
}