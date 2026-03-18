package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class Ps14MaintReqPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "REQ_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqTs;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private int seqNbr;

    public Ps14MaintReqPK() {
    }

    public Ps14MaintReqPK(String acctNbr, String custId, String usrId, Date reqTs, int seqNbr) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.usrId = usrId;
        this.reqTs = reqTs;
        this.seqNbr = seqNbr;
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

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public Date getReqTs() {
        return reqTs;
    }

    public void setReqTs(Date reqTs) {
        this.reqTs = reqTs;
    }

    public int getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(int seqNbr) {
        this.seqNbr = seqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (reqTs != null ? reqTs.hashCode() : 0);
        hash += (int) seqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Ps14MaintReqPK)) {
            return false;
        }
        Ps14MaintReqPK other = (Ps14MaintReqPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.reqTs == null && other.reqTs != null) || (this.reqTs != null && !this.reqTs.equals(other.reqTs))) {
            return false;
        }
        if (this.seqNbr != other.seqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Ps14MaintReqPK[ acctNbr=" + acctNbr + ", custId=" + custId + ", usrId=" + usrId + ", reqTs=" + reqTs + ", seqNbr=" + seqNbr + " ]";
    }

}
