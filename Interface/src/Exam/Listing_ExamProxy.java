package Exam;

public class Listing_ExamProxy implements Exam.Listing_Exam {
  private String _endpoint = null;
  private Exam.Listing_Exam listing_Exam = null;
  
  public Listing_ExamProxy() {
    _initListing_ExamProxy();
  }
  
  public Listing_ExamProxy(String endpoint) {
    _endpoint = endpoint;
    _initListing_ExamProxy();
  }
  
  private void _initListing_ExamProxy() {
    try {
      listing_Exam = (new Exam.Listing_ExamServiceLocator()).getListing_Exam();
      if (listing_Exam != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listing_Exam)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listing_Exam)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listing_Exam != null)
      ((javax.xml.rpc.Stub)listing_Exam)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Exam.Listing_Exam getListing_Exam() {
    if (listing_Exam == null)
      _initListing_ExamProxy();
    return listing_Exam;
  }
  
  public Exam.Exam_list[] listing_Exams() throws java.rmi.RemoteException{
    if (listing_Exam == null)
      _initListing_ExamProxy();
    return listing_Exam.listing_Exams();
  }
  
  
}