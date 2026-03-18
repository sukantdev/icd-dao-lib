package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CRD_TYP_RENEW", catalog = "", schema = "DBO")
public class CrdTypRenew implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdTypRenewPK crdTypRenewPK;
    @Basic(optional = false)
    @Column(name = "TO_CRD_TYP_CD")
    private String toCrdTypCd;
    @Basic(optional = false)
    @Column(name = "TO_CRD_STYLE_CD")
    private String toCrdStyleCd;
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

    public CrdTypRenew() {
    }

    public CrdTypRenew(CrdTypRenewPK crdTypRenewPK) {
        this.crdTypRenewPK = crdTypRenewPK;
    }

    public CrdTypRenew(CrdTypRenewPK crdTypRenewPK, String toCrdTypCd, String toCrdStyleCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdTypRenewPK = crdTypRenewPK;
        this.toCrdTypCd = toCrdTypCd;
        this.toCrdStyleCd = toCrdStyleCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdTypRenew(String custId, String fromCrdTypCd, String fromCrdStyleCd) {
        this.crdTypRenewPK = new CrdTypRenewPK(custId, fromCrdTypCd, fromCrdStyleCd);
    }

    public CrdTypRenewPK getCrdTypRenewPK() {
        return crdTypRenewPK;
    }

    public void setCrdTypRenewPK(CrdTypRenewPK crdTypRenewPK) {
        this.crdTypRenewPK = crdTypRenewPK;
    }

    public String getToCrdTypCd() {
        return toCrdTypCd;
    }

    public void setToCrdTypCd(String toCrdTypCd) {
        this.toCrdTypCd = toCrdTypCd;
    }

    public String getToCrdStyleCd() {
        return toCrdStyleCd;
    }

    public void setToCrdStyleCd(String toCrdStyleCd) {
        this.toCrdStyleCd = toCrdStyleCd;
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
        hash += (crdTypRenewPK != null ? crdTypRenewPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdTypRenew)) {
            return false;
        }
        CrdTypRenew other = (CrdTypRenew) object;
        if ((this.crdTypRenewPK == null && other.crdTypRenewPK != null) || (this.crdTypRenewPK != null && !this.crdTypRenewPK.equals(other.crdTypRenewPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypRenew[ crdTypRenewPK=" + crdTypRenewPK + " ]";
    }

}
