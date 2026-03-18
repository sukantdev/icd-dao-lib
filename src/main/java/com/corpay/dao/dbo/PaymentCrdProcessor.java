package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PAYMENT_CRD_PROCESSOR", catalog = "", schema = "DBO")
public class PaymentCrdProcessor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROCESSOR_ID")
    private String processorId;
    @Basic(optional = false)
    @Column(name = "PROCESSOR_NM")
    private String processorNm;
    @Basic(optional = false)
    @Column(name = "STAT")
    private Character stat;
    @Basic(optional = false)
    @Column(name = "API_KEY_ID")
    private String apiKeyId;
    @Basic(optional = false)
    @Column(name = "API_URL")
    private String apiUrl;
    @Basic(optional = false)
    @Column(name = "CONTACT_NM")
    private String contactNm;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;
    @Basic(optional = false)
    @Column(name = "PH_NBR")
    private String phNbr;
    @Basic(optional = false)
    @Column(name = "ADDR")
    private String addr;
    @Basic(optional = false)
    @Column(name = "CTY_NM")
    private String ctyNm;
    @Basic(optional = false)
    @Column(name = "ST_CD")
    private String stCd;
    @Basic(optional = false)
    @Column(name = "ZIP_CD")
    private String zipCd;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public PaymentCrdProcessor() {
    }

    public PaymentCrdProcessor(String processorId) {
        this.processorId = processorId;
    }

    public PaymentCrdProcessor(String processorId, String processorNm, Character stat, String apiKeyId, String apiUrl, String contactNm, String emailAddr, String phNbr, String addr, String ctyNm, String stCd, String zipCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.processorId = processorId;
        this.processorNm = processorNm;
        this.stat = stat;
        this.apiKeyId = apiKeyId;
        this.apiUrl = apiUrl;
        this.contactNm = contactNm;
        this.emailAddr = emailAddr;
        this.phNbr = phNbr;
        this.addr = addr;
        this.ctyNm = ctyNm;
        this.stCd = stCd;
        this.zipCd = zipCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getProcessorId() {
        return processorId;
    }

    public void setProcessorId(String processorId) {
        this.processorId = processorId;
    }

    public String getProcessorNm() {
        return processorNm;
    }

    public void setProcessorNm(String processorNm) {
        this.processorNm = processorNm;
    }

    public Character getStat() {
        return stat;
    }

    public void setStat(Character stat) {
        this.stat = stat;
    }

    public String getApiKeyId() {
        return apiKeyId;
    }

    public void setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getContactNm() {
        return contactNm;
    }

    public void setContactNm(String contactNm) {
        this.contactNm = contactNm;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getPhNbr() {
        return phNbr;
    }

    public void setPhNbr(String phNbr) {
        this.phNbr = phNbr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCtyNm() {
        return ctyNm;
    }

    public void setCtyNm(String ctyNm) {
        this.ctyNm = ctyNm;
    }

    public String getStCd() {
        return stCd;
    }

    public void setStCd(String stCd) {
        this.stCd = stCd;
    }

    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (processorId != null ? processorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PaymentCrdProcessor)) {
            return false;
        }
        PaymentCrdProcessor other = (PaymentCrdProcessor) object;
        if ((this.processorId == null && other.processorId != null) || (this.processorId != null && !this.processorId.equals(other.processorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaymentCrdProcessor[ processorId=" + processorId + " ]";
    }

}
