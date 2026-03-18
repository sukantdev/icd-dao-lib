package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class TransRptIndexPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TYP")
    private String typ;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "RPT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rptDt;
    @Basic(optional = false)
    @Column(name = "RDM_NBR")
    private String rdmNbr;

    public TransRptIndexPK() {
    }

    public TransRptIndexPK(String typ, String acctNbr, String custId, Date rptDt, String rdmNbr) {
        this.typ = typ;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.rptDt = rptDt;
        this.rdmNbr = rdmNbr;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getRptDt() {
        return rptDt;
    }

    public void setRptDt(Date rptDt) {
        this.rptDt = rptDt;
    }

    public String getRdmNbr() {
        return rdmNbr;
    }

    public void setRdmNbr(String rdmNbr) {
        this.rdmNbr = rdmNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typ != null ? typ.hashCode() : 0);
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (rptDt != null ? rptDt.hashCode() : 0);
        hash += (rdmNbr != null ? rdmNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TransRptIndexPK)) {
            return false;
        }
        TransRptIndexPK other = (TransRptIndexPK) object;
        if ((this.typ == null && other.typ != null) || (this.typ != null && !this.typ.equals(other.typ))) {
            return false;
        }
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.rptDt == null && other.rptDt != null) || (this.rptDt != null && !this.rptDt.equals(other.rptDt))) {
            return false;
        }
        if ((this.rdmNbr == null && other.rdmNbr != null) || (this.rdmNbr != null && !this.rdmNbr.equals(other.rdmNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TransRptIndexPK[ typ=" + typ + ", acctNbr=" + acctNbr + ", custId=" + custId + ", rptDt=" + rptDt + ", rdmNbr=" + rdmNbr + " ]";
    }

}
