/**
 * Marks_list.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Exam;

public class Marks_list  implements java.io.Serializable {
    private int examID;

    private int totalMarks;

    private int obtainedMarks;

    private java.lang.String result;

    private java.lang.String studentID;

    private java.lang.String teacherID;

    public Marks_list() {
    }

    public Marks_list(
           int examID,
           int totalMarks,
           int obtainedMarks,
           java.lang.String result,
           java.lang.String studentID,
           java.lang.String teacherID) {
           this.examID = examID;
           this.totalMarks = totalMarks;
           this.obtainedMarks = obtainedMarks;
           this.result = result;
           this.studentID = studentID;
           this.teacherID = teacherID;
    }


    /**
     * Gets the examID value for this Marks_list.
     * 
     * @return examID
     */
    public int getExamID() {
        return examID;
    }


    /**
     * Sets the examID value for this Marks_list.
     * 
     * @param examID
     */
    public void setExamID(int examID) {
        this.examID = examID;
    }


    /**
     * Gets the totalMarks value for this Marks_list.
     * 
     * @return totalMarks
     */
    public int getTotalMarks() {
        return totalMarks;
    }


    /**
     * Sets the totalMarks value for this Marks_list.
     * 
     * @param totalMarks
     */
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }


    /**
     * Gets the obtainedMarks value for this Marks_list.
     * 
     * @return obtainedMarks
     */
    public int getObtainedMarks() {
        return obtainedMarks;
    }


    /**
     * Sets the obtainedMarks value for this Marks_list.
     * 
     * @param obtainedMarks
     */
    public void setObtainedMarks(int obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }


    /**
     * Gets the result value for this Marks_list.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this Marks_list.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the studentID value for this Marks_list.
     * 
     * @return studentID
     */
    public java.lang.String getStudentID() {
        return studentID;
    }


    /**
     * Sets the studentID value for this Marks_list.
     * 
     * @param studentID
     */
    public void setStudentID(java.lang.String studentID) {
        this.studentID = studentID;
    }


    /**
     * Gets the teacherID value for this Marks_list.
     * 
     * @return teacherID
     */
    public java.lang.String getTeacherID() {
        return teacherID;
    }


    /**
     * Sets the teacherID value for this Marks_list.
     * 
     * @param teacherID
     */
    public void setTeacherID(java.lang.String teacherID) {
        this.teacherID = teacherID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Marks_list)) return false;
        Marks_list other = (Marks_list) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.examID == other.getExamID() &&
            this.totalMarks == other.getTotalMarks() &&
            this.obtainedMarks == other.getObtainedMarks() &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.studentID==null && other.getStudentID()==null) || 
             (this.studentID!=null &&
              this.studentID.equals(other.getStudentID()))) &&
            ((this.teacherID==null && other.getTeacherID()==null) || 
             (this.teacherID!=null &&
              this.teacherID.equals(other.getTeacherID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getExamID();
        _hashCode += getTotalMarks();
        _hashCode += getObtainedMarks();
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getStudentID() != null) {
            _hashCode += getStudentID().hashCode();
        }
        if (getTeacherID() != null) {
            _hashCode += getTeacherID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Marks_list.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Exam", "Marks_list"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Exam", "ExamID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Exam", "TotalMarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obtainedMarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Exam", "ObtainedMarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Exam", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Exam", "StudentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teacherID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Exam", "TeacherID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
