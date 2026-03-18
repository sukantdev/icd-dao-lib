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
@Table(name = "ACCT_BRDNG_XREF", catalog = "", schema = "DBO")
public class AcctBrdngXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctBrdngXrefPK acctBrdngXrefPK;
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

    public AcctBrdngXref() {
    }

    public AcctBrdngXref(AcctBrdngXrefPK acctBrdngXrefPK) {
        this.acctBrdngXrefPK = acctBrdngXrefPK;
    }

    public AcctBrdngXref(AcctBrdngXrefPK acctBrdngXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.acctBrdngXrefPK = acctBrdngXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AcctBrdngXref(String brdngCd, String acctNbr) {
        this.acctBrdngXrefPK = new AcctBrdngXrefPK(brdngCd, acctNbr);
    }

    public AcctBrdngXrefPK getAcctBrdngXrefPK() {
        return acctBrdngXrefPK;
    }

    public void setAcctBrdngXrefPK(AcctBrdngXrefPK acctBrdngXrefPK) {
        this.acctBrdngXrefPK = acctBrdngXrefPK;
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
        hash += (acctBrdngXrefPK != null ? acctBrdngXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AcctBrdngXref)) {
            return false;
        }
        AcctBrdngXref other = (AcctBrdngXref) object;
        if ((this.acctBrdngXrefPK == null && other.acctBrdngXrefPK != null) || (this.acctBrdngXrefPK != null && !this.acctBrdngXrefPK.equals(other.acctBrdngXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctBrdngXref[ acctBrdngXrefPK=" + acctBrdngXrefPK + " ]";
    }

}
