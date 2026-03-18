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
@Table(name = "USR_CUST_TRNSFR", catalog = "", schema = "DBO")
public class UsrCustTrnsfr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrCustTrnsfrPK usrCustTrnsfrPK;
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

    public UsrCustTrnsfr() {
    }

    public UsrCustTrnsfr(UsrCustTrnsfrPK usrCustTrnsfrPK) {
        this.usrCustTrnsfrPK = usrCustTrnsfrPK;
    }

    public UsrCustTrnsfr(UsrCustTrnsfrPK usrCustTrnsfrPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrCustTrnsfrPK = usrCustTrnsfrPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrCustTrnsfr(String usrId, String custId) {
        this.usrCustTrnsfrPK = new UsrCustTrnsfrPK(usrId, custId);
    }

    public UsrCustTrnsfrPK getUsrCustTrnsfrPK() {
        return usrCustTrnsfrPK;
    }

    public void setUsrCustTrnsfrPK(UsrCustTrnsfrPK usrCustTrnsfrPK) {
        this.usrCustTrnsfrPK = usrCustTrnsfrPK;
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
        hash += (usrCustTrnsfrPK != null ? usrCustTrnsfrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrCustTrnsfr)) {
            return false;
        }
        UsrCustTrnsfr other = (UsrCustTrnsfr) object;
        if ((this.usrCustTrnsfrPK == null && other.usrCustTrnsfrPK != null) || (this.usrCustTrnsfrPK != null && !this.usrCustTrnsfrPK.equals(other.usrCustTrnsfrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrCustTrnsfr[ usrCustTrnsfrPK=" + usrCustTrnsfrPK + " ]";
    }

}
