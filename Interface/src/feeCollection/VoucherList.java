/**
 * VoucherList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package feeCollection;

public class VoucherList  implements java.io.Serializable {
    private int id;

    private int amount;

    private java.lang.String feeMonth;

    private java.lang.String date;

    private java.lang.String studentName;

    public VoucherList() {
    }

    public VoucherList(
           int id,
           int amount,
           java.lang.String feeMonth,
           java.lang.String date,
           java.lang.String studentName) {
           this.id = id;
           this.amount = amount;
           this.feeMonth = feeMonth;
           this.date = date;
           this.studentName = studentName;
    }


    /**
     * Gets the id value for this VoucherList.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this VoucherList.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the amount value for this VoucherList.
     * 
     * @return amount
     */
    public int getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this VoucherList.
     * 
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }


    /**
     * Gets the feeMonth value for this VoucherList.
     * 
     * @return feeMonth
     */
    public java.lang.String getFeeMonth() {
        return feeMonth;
    }


    /**
     * Sets the feeMonth value for this VoucherList.
     * 
     * @param feeMonth
     */
    public void setFeeMonth(java.lang.String feeMonth) {
        this.feeMonth = feeMonth;
    }


    /**
     * Gets the date value for this VoucherList.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this VoucherList.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the studentName value for this VoucherList.
     * 
     * @return studentName
     */
    public java.lang.String getStudentName() {
        return studentName;
    }


    /**
     * Sets the studentName value for this VoucherList.
     * 
     * @param studentName
     */
    public void setStudentName(java.lang.String studentName) {
        this.studentName = studentName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherList)) return false;
        VoucherList other = (VoucherList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.amount == other.getAmount() &&
            ((this.feeMonth==null && other.getFeeMonth()==null) || 
             (this.feeMonth!=null &&
              this.feeMonth.equals(other.getFeeMonth()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.studentName==null && other.getStudentName()==null) || 
             (this.studentName!=null &&
              this.studentName.equals(other.getStudentName())));
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
        _hashCode += getId();
        _hashCode += getAmount();
        if (getFeeMonth() != null) {
            _hashCode += getFeeMonth().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getStudentName() != null) {
            _hashCode += getStudentName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://feeCollection", "VoucherList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://feeCollection", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://feeCollection", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://feeCollection", "FeeMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://feeCollection", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://feeCollection", "StudentName"));
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
