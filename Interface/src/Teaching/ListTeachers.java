/**
 * ListTeachers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Teaching;

public class ListTeachers  implements java.io.Serializable {
    private int teacherID;

    private int registrationNumber;

    private java.lang.String name;

    private java.lang.String father;

    private java.lang.String dateOfBirth;

    private java.lang.String phone;

    private java.lang.String CNIC;

    private java.lang.String qualification;

    private java.lang.String email;

    private java.lang.String address;

    private java.lang.String registrationDate;

    private java.lang.String status;

    public ListTeachers() {
    }

    public ListTeachers(
           int teacherID,
           int registrationNumber,
           java.lang.String name,
           java.lang.String father,
           java.lang.String dateOfBirth,
           java.lang.String phone,
           java.lang.String CNIC,
           java.lang.String qualification,
           java.lang.String email,
           java.lang.String address,
           java.lang.String registrationDate,
           java.lang.String status) {
           this.teacherID = teacherID;
           this.registrationNumber = registrationNumber;
           this.name = name;
           this.father = father;
           this.dateOfBirth = dateOfBirth;
           this.phone = phone;
           this.CNIC = CNIC;
           this.qualification = qualification;
           this.email = email;
           this.address = address;
           this.registrationDate = registrationDate;
           this.status = status;
    }


    /**
     * Gets the teacherID value for this ListTeachers.
     * 
     * @return teacherID
     */
    public int getTeacherID() {
        return teacherID;
    }


    /**
     * Sets the teacherID value for this ListTeachers.
     * 
     * @param teacherID
     */
    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }


    /**
     * Gets the registrationNumber value for this ListTeachers.
     * 
     * @return registrationNumber
     */
    public int getRegistrationNumber() {
        return registrationNumber;
    }


    /**
     * Sets the registrationNumber value for this ListTeachers.
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    /**
     * Gets the name value for this ListTeachers.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ListTeachers.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the father value for this ListTeachers.
     * 
     * @return father
     */
    public java.lang.String getFather() {
        return father;
    }


    /**
     * Sets the father value for this ListTeachers.
     * 
     * @param father
     */
    public void setFather(java.lang.String father) {
        this.father = father;
    }


    /**
     * Gets the dateOfBirth value for this ListTeachers.
     * 
     * @return dateOfBirth
     */
    public java.lang.String getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this ListTeachers.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the phone value for this ListTeachers.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this ListTeachers.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the CNIC value for this ListTeachers.
     * 
     * @return CNIC
     */
    public java.lang.String getCNIC() {
        return CNIC;
    }


    /**
     * Sets the CNIC value for this ListTeachers.
     * 
     * @param CNIC
     */
    public void setCNIC(java.lang.String CNIC) {
        this.CNIC = CNIC;
    }


    /**
     * Gets the qualification value for this ListTeachers.
     * 
     * @return qualification
     */
    public java.lang.String getQualification() {
        return qualification;
    }


    /**
     * Sets the qualification value for this ListTeachers.
     * 
     * @param qualification
     */
    public void setQualification(java.lang.String qualification) {
        this.qualification = qualification;
    }


    /**
     * Gets the email value for this ListTeachers.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ListTeachers.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the address value for this ListTeachers.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ListTeachers.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the registrationDate value for this ListTeachers.
     * 
     * @return registrationDate
     */
    public java.lang.String getRegistrationDate() {
        return registrationDate;
    }


    /**
     * Sets the registrationDate value for this ListTeachers.
     * 
     * @param registrationDate
     */
    public void setRegistrationDate(java.lang.String registrationDate) {
        this.registrationDate = registrationDate;
    }


    /**
     * Gets the status value for this ListTeachers.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ListTeachers.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListTeachers)) return false;
        ListTeachers other = (ListTeachers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.teacherID == other.getTeacherID() &&
            this.registrationNumber == other.getRegistrationNumber() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.father==null && other.getFather()==null) || 
             (this.father!=null &&
              this.father.equals(other.getFather()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.CNIC==null && other.getCNIC()==null) || 
             (this.CNIC!=null &&
              this.CNIC.equals(other.getCNIC()))) &&
            ((this.qualification==null && other.getQualification()==null) || 
             (this.qualification!=null &&
              this.qualification.equals(other.getQualification()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.registrationDate==null && other.getRegistrationDate()==null) || 
             (this.registrationDate!=null &&
              this.registrationDate.equals(other.getRegistrationDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += getTeacherID();
        _hashCode += getRegistrationNumber();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFather() != null) {
            _hashCode += getFather().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getCNIC() != null) {
            _hashCode += getCNIC().hashCode();
        }
        if (getQualification() != null) {
            _hashCode += getQualification().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getRegistrationDate() != null) {
            _hashCode += getRegistrationDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListTeachers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Teaching", "ListTeachers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teacherID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "TeacherID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "RegistrationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("father");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "Father"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "CNIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "Qualification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "RegistrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Teaching", "Status"));
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
