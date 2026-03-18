package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class FileReqPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "REQ_TS")
    @Temporal(TemporalType.DATE)
    private Date reqTs;
    @Basic(optional = false)
    @Column(name = "CYC_INV_DT")
    @Temporal(TemporalType.DATE)
    private Date cycInvDt;

    public FileReqPK() {
    }

    public FileReqPK(String acctNbr, Date reqTs, Date cycInvDt) {
        this.acctNbr = acctNbr;
        this.reqTs = reqTs;
        this.cycInvDt = cycInvDt;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Date getReqTs() {
        return reqTs;
    }

    public void setReqTs(Date reqTs) {
        this.reqTs = reqTs;
    }

    public Date getCycInvDt() {
        return cycInvDt;
    }

    public void setCycInvDt(Date cycInvDt) {
        this.cycInvDt = cycInvDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (reqTs != null ? reqTs.hashCode() : 0);
        hash += (cycInvDt != null ? cycInvDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FileReqPK)) {
            return false;
        }
        FileReqPK other = (FileReqPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.reqTs == null && other.reqTs != null) || (this.reqTs != null && !this.reqTs.equals(other.reqTs))) {
            return false;
        }
        if ((this.cycInvDt == null && other.cycInvDt != null) || (this.cycInvDt != null && !this.cycInvDt.equals(other.cycInvDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FileReqPK[ acctNbr=" + acctNbr + ", reqTs=" + reqTs + ", cycInvDt=" + cycInvDt + " ]";
    }

}
