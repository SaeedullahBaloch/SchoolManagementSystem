/**
 * StudentList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Main;

public class StudentList  implements java.io.Serializable {
    private int admissionNumber;

    private int status;

    private java.lang.String name;

    private java.lang.String father;

    private java.lang.String DOB;

    private java.lang.String phone;

    private java.lang.String address;

    private java.lang.String email;

    private java.lang.String classID;

    public StudentList() {
    }

    public StudentList(
           int admissionNumber,
           int status,
           java.lang.String name,
           java.lang.String father,
           java.lang.String DOB,
           java.lang.String phone,
           java.lang.String address,
           java.lang.String email,
           java.lang.String classID) {
           this.admissionNumber = admissionNumber;
           this.status = status;
           this.name = name;
           this.father = father;
           this.DOB = DOB;
           this.phone = phone;
           this.address = address;
           this.email = email;
           this.classID = classID;
    }


    /**
     * Gets the admissionNumber value for this StudentList.
     * 
     * @return admissionNumber
     */
    public int getAdmissionNumber() {
        return admissionNumber;
    }


    /**
     * Sets the admissionNumber value for this StudentList.
     * 
     * @param admissionNumber
     */
    public void setAdmissionNumber(int admissionNumber) {
        this.admissionNumber = admissionNumber;
    }


    /**
     * Gets the status value for this StudentList.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StudentList.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the name value for this StudentList.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this StudentList.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the father value for this StudentList.
     * 
     * @return father
     */
    public java.lang.String getFather() {
        return father;
    }


    /**
     * Sets the father value for this StudentList.
     * 
     * @param father
     */
    public void setFather(java.lang.String father) {
        this.father = father;
    }


    /**
     * Gets the DOB value for this StudentList.
     * 
     * @return DOB
     */
    public java.lang.String getDOB() {
        return DOB;
    }


    /**
     * Sets the DOB value for this StudentList.
     * 
     * @param DOB
     */
    public void setDOB(java.lang.String DOB) {
        this.DOB = DOB;
    }


    /**
     * Gets the phone value for this StudentList.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this StudentList.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the address value for this StudentList.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this StudentList.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the email value for this StudentList.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this StudentList.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the classID value for this StudentList.
     * 
     * @return classID
     */
    public java.lang.String getClassID() {
        return classID;
    }


    /**
     * Sets the classID value for this StudentList.
     * 
     * @param classID
     */
    public void setClassID(java.lang.String classID) {
        this.classID = classID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudentList)) return false;
        StudentList other = (StudentList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.admissionNumber == other.getAdmissionNumber() &&
            this.status == other.getStatus() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.father==null && other.getFather()==null) || 
             (this.father!=null &&
              this.father.equals(other.getFather()))) &&
            ((this.DOB==null && other.getDOB()==null) || 
             (this.DOB!=null &&
              this.DOB.equals(other.getDOB()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.classID==null && other.getClassID()==null) || 
             (this.classID!=null &&
              this.classID.equals(other.getClassID())));
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
        _hashCode += getAdmissionNumber();
        _hashCode += getStatus();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFather() != null) {
            _hashCode += getFather().hashCode();
        }
        if (getDOB() != null) {
            _hashCode += getDOB().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getClassID() != null) {
            _hashCode += getClassID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudentList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Main", "StudentList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admissionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "AdmissionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("father");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "Father"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "DOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Main", "ClassID"));
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
