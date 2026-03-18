package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Cdreprt2ReportsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUSTOMER_TYPE")
    private String customerType;
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Basic(optional = false)
    @Column(name = "SYSTEM_ID")
    private String systemId;
    @Basic(optional = false)
    @Column(name = "REPORT_CODE")
    private int reportCode;
    @Basic(optional = false)
    @Column(name = "REPORT_FREQUENCY")
    private Character reportFrequency;
    @Basic(optional = false)
    @Column(name = "RECV_CUSTOMER_TYPE")
    private String recvCustomerType;
    @Basic(optional = false)
    @Column(name = "RECV_CUSTOMER_ID")
    private String recvCustomerId;
    @Basic(optional = false)
    @Column(name = "RECV_SUB_ID")
    private String recvSubId;
    @Basic(optional = false)
    @Column(name = "CTL_BYTE")
    private Character ctlByte;

    public Cdreprt2ReportsPK() {
    }

    public Cdreprt2ReportsPK(String customerType, String customerId, String systemId, int reportCode, Character reportFrequency, String recvCustomerType, String recvCustomerId, String recvSubId, Character ctlByte) {
        this.customerType = customerType;
        this.customerId = customerId;
        this.systemId = systemId;
        this.reportCode = reportCode;
        this.reportFrequency = reportFrequency;
        this.recvCustomerType = recvCustomerType;
        this.recvCustomerId = recvCustomerId;
        this.recvSubId = recvSubId;
        this.ctlByte = ctlByte;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public int getReportCode() {
        return reportCode;
    }

    public void setReportCode(int reportCode) {
        this.reportCode = reportCode;
    }

    public Character getReportFrequency() {
        return reportFrequency;
    }

    public void setReportFrequency(Character reportFrequency) {
        this.reportFrequency = reportFrequency;
    }

    public String getRecvCustomerType() {
        return recvCustomerType;
    }

    public void setRecvCustomerType(String recvCustomerType) {
        this.recvCustomerType = recvCustomerType;
    }

    public String getRecvCustomerId() {
        return recvCustomerId;
    }

    public void setRecvCustomerId(String recvCustomerId) {
        this.recvCustomerId = recvCustomerId;
    }

    public String getRecvSubId() {
        return recvSubId;
    }

    public void setRecvSubId(String recvSubId) {
        this.recvSubId = recvSubId;
    }

    public Character getCtlByte() {
        return ctlByte;
    }

    public void setCtlByte(Character ctlByte) {
        this.ctlByte = ctlByte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerType != null ? customerType.hashCode() : 0);
        hash += (customerId != null ? customerId.hashCode() : 0);
        hash += (systemId != null ? systemId.hashCode() : 0);
        hash += (int) reportCode;
        hash += (reportFrequency != null ? reportFrequency.hashCode() : 0);
        hash += (recvCustomerType != null ? recvCustomerType.hashCode() : 0);
        hash += (recvCustomerId != null ? recvCustomerId.hashCode() : 0);
        hash += (recvSubId != null ? recvSubId.hashCode() : 0);
        hash += (ctlByte != null ? ctlByte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Cdreprt2ReportsPK)) {
            return false;
        }
        Cdreprt2ReportsPK other = (Cdreprt2ReportsPK) object;
        if ((this.customerType == null && other.customerType != null) || (this.customerType != null && !this.customerType.equals(other.customerType))) {
            return false;
        }
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        if ((this.systemId == null && other.systemId != null) || (this.systemId != null && !this.systemId.equals(other.systemId))) {
            return false;
        }
        if (this.reportCode != other.reportCode) {
            return false;
        }
        if ((this.reportFrequency == null && other.reportFrequency != null) || (this.reportFrequency != null && !this.reportFrequency.equals(other.reportFrequency))) {
            return false;
        }
        if ((this.recvCustomerType == null && other.recvCustomerType != null) || (this.recvCustomerType != null && !this.recvCustomerType.equals(other.recvCustomerType))) {
            return false;
        }
        if ((this.recvCustomerId == null && other.recvCustomerId != null) || (this.recvCustomerId != null && !this.recvCustomerId.equals(other.recvCustomerId))) {
            return false;
        }
        if ((this.recvSubId == null && other.recvSubId != null) || (this.recvSubId != null && !this.recvSubId.equals(other.recvSubId))) {
            return false;
        }
        if ((this.ctlByte == null && other.ctlByte != null) || (this.ctlByte != null && !this.ctlByte.equals(other.ctlByte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Cdreprt2ReportsPK[ customerType=" + customerType + ", customerId=" + customerId + ", systemId=" + systemId + ", reportCode=" + reportCode + ", reportFrequency=" + reportFrequency + ", recvCustomerType=" + recvCustomerType + ", recvCustomerId=" + recvCustomerId + ", recvSubId=" + recvSubId + ", ctlByte=" + ctlByte + " ]";
    }

}
