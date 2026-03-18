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
@Table(name = "CUST_DESC_XREF", catalog = "", schema = "DBO")
public class CustDescXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustDescXrefPK custDescXrefPK;
    @Basic(optional = false)
    @Column(name = "CUST_ACCT_DESC")
    private String custAcctDesc;
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

    public CustDescXref() {
    }

    public CustDescXref(CustDescXrefPK custDescXrefPK) {
        this.custDescXrefPK = custDescXrefPK;
    }

    public CustDescXref(CustDescXrefPK custDescXrefPK, String custAcctDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.custDescXrefPK = custDescXrefPK;
        this.custAcctDesc = custAcctDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CustDescXref(String acctNbr, String custId, int seqNbr) {
        this.custDescXrefPK = new CustDescXrefPK(acctNbr, custId, seqNbr);
    }

    public CustDescXrefPK getCustDescXrefPK() {
        return custDescXrefPK;
    }

    public void setCustDescXrefPK(CustDescXrefPK custDescXrefPK) {
        this.custDescXrefPK = custDescXrefPK;
    }

    public String getCustAcctDesc() {
        return custAcctDesc;
    }

    public void setCustAcctDesc(String custAcctDesc) {
        this.custAcctDesc = custAcctDesc;
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
        hash += (custDescXrefPK != null ? custDescXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustDescXref)) {
            return false;
        }
        CustDescXref other = (CustDescXref) object;
        if ((this.custDescXrefPK == null && other.custDescXrefPK != null) || (this.custDescXrefPK != null && !this.custDescXrefPK.equals(other.custDescXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustDescXref[ custDescXrefPK=" + custDescXrefPK + " ]";
    }

}
