package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class KbyteLayoutPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "TRNS_NBR")
    private String trnsNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_TM")
    private String trnsTm;
    @Basic(optional = false)
    @Column(name = "CANCEL_FLG")
    private Character cancelFlg;

    public KbyteLayoutPK() {
    }

    public KbyteLayoutPK(String acctNbr, String custId, Date trnsDt, String trnsNbr, String trnsTm, Character cancelFlg) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.trnsDt = trnsDt;
        this.trnsNbr = trnsNbr;
        this.trnsTm = trnsTm;
        this.cancelFlg = cancelFlg;
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

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public String getTrnsNbr() {
        return trnsNbr;
    }

    public void setTrnsNbr(String trnsNbr) {
        this.trnsNbr = trnsNbr;
    }

    public String getTrnsTm() {
        return trnsTm;
    }

    public void setTrnsTm(String trnsTm) {
        this.trnsTm = trnsTm;
    }

    public Character getCancelFlg() {
        return cancelFlg;
    }

    public void setCancelFlg(Character cancelFlg) {
        this.cancelFlg = cancelFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (trnsDt != null ? trnsDt.hashCode() : 0);
        hash += (trnsNbr != null ? trnsNbr.hashCode() : 0);
        hash += (trnsTm != null ? trnsTm.hashCode() : 0);
        hash += (cancelFlg != null ? cancelFlg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof KbyteLayoutPK)) {
            return false;
        }
        KbyteLayoutPK other = (KbyteLayoutPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.trnsDt == null && other.trnsDt != null) || (this.trnsDt != null && !this.trnsDt.equals(other.trnsDt))) {
            return false;
        }
        if ((this.trnsNbr == null && other.trnsNbr != null) || (this.trnsNbr != null && !this.trnsNbr.equals(other.trnsNbr))) {
            return false;
        }
        if ((this.trnsTm == null && other.trnsTm != null) || (this.trnsTm != null && !this.trnsTm.equals(other.trnsTm))) {
            return false;
        }
        if ((this.cancelFlg == null && other.cancelFlg != null) || (this.cancelFlg != null && !this.cancelFlg.equals(other.cancelFlg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.KbyteLayoutPK[ acctNbr=" + acctNbr + ", custId=" + custId + ", trnsDt=" + trnsDt + ", trnsNbr=" + trnsNbr + ", trnsTm=" + trnsTm + ", cancelFlg=" + cancelFlg + " ]";
    }

}
