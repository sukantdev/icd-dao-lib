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
@Table(name = "TELE_REASON_CODES", catalog = "", schema = "DBO")
public class TeleReasonCodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REASON_CODE")
    private Short reasonCode;
    @Basic(optional = false)
    @Column(name = "REASON_CDE_DESCR")
    private String reasonCdeDescr;
    @Basic(optional = false)
    @Column(name = "EMAIL_REQUIRED")
    private Character emailRequired;
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

    public TeleReasonCodes() {
    }

    public TeleReasonCodes(Short reasonCode) {
        this.reasonCode = reasonCode;
    }

    public TeleReasonCodes(Short reasonCode, String reasonCdeDescr, Character emailRequired, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.reasonCode = reasonCode;
        this.reasonCdeDescr = reasonCdeDescr;
        this.emailRequired = emailRequired;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Short getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Short reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonCdeDescr() {
        return reasonCdeDescr;
    }

    public void setReasonCdeDescr(String reasonCdeDescr) {
        this.reasonCdeDescr = reasonCdeDescr;
    }

    public Character getEmailRequired() {
        return emailRequired;
    }

    public void setEmailRequired(Character emailRequired) {
        this.emailRequired = emailRequired;
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
        hash += (reasonCode != null ? reasonCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TeleReasonCodes)) {
            return false;
        }
        TeleReasonCodes other = (TeleReasonCodes) object;
        if ((this.reasonCode == null && other.reasonCode != null) || (this.reasonCode != null && !this.reasonCode.equals(other.reasonCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TeleReasonCodes[ reasonCode=" + reasonCode + " ]";
    }

}
