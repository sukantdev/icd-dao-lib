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
@Table(name = "ACCT_CORP_XREF", catalog = "", schema = "DBO")
public class AcctCorpXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctCorpXrefPK acctCorpXrefPK;
    @Basic(optional = false)
    @Column(name = "CORP_NM")
    private String corpNm;
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

    public AcctCorpXref() {
    }

    public AcctCorpXref(AcctCorpXrefPK acctCorpXrefPK) {
        this.acctCorpXrefPK = acctCorpXrefPK;
    }

    public AcctCorpXref(AcctCorpXrefPK acctCorpXrefPK, String corpNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.acctCorpXrefPK = acctCorpXrefPK;
        this.corpNm = corpNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AcctCorpXref(String acctNbr, String corpCd) {
        this.acctCorpXrefPK = new AcctCorpXrefPK(acctNbr, corpCd);
    }

    public AcctCorpXrefPK getAcctCorpXrefPK() {
        return acctCorpXrefPK;
    }

    public void setAcctCorpXrefPK(AcctCorpXrefPK acctCorpXrefPK) {
        this.acctCorpXrefPK = acctCorpXrefPK;
    }

    public String getCorpNm() {
        return corpNm;
    }

    public void setCorpNm(String corpNm) {
        this.corpNm = corpNm;
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
        hash += (acctCorpXrefPK != null ? acctCorpXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AcctCorpXref)) {
            return false;
        }
        AcctCorpXref other = (AcctCorpXref) object;
        if ((this.acctCorpXrefPK == null && other.acctCorpXrefPK != null) || (this.acctCorpXrefPK != null && !this.acctCorpXrefPK.equals(other.acctCorpXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctCorpXref[ acctCorpXrefPK=" + acctCorpXrefPK + " ]";
    }

}
