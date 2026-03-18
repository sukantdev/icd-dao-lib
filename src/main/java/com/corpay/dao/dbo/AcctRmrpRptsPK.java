package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AcctRmrpRptsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "RPT_SYS_CD")
    private String rptSysCd;
    @Basic(optional = false)
    @Column(name = "RPT_CD")
    private String rptCd;

    public AcctRmrpRptsPK() {
    }

    public AcctRmrpRptsPK(String acctNbr, String custId, String rptSysCd, String rptCd) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.rptSysCd = rptSysCd;
        this.rptCd = rptCd;
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

    public String getRptSysCd() {
        return rptSysCd;
    }

    public void setRptSysCd(String rptSysCd) {
        this.rptSysCd = rptSysCd;
    }

    public String getRptCd() {
        return rptCd;
    }

    public void setRptCd(String rptCd) {
        this.rptCd = rptCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (rptSysCd != null ? rptSysCd.hashCode() : 0);
        hash += (rptCd != null ? rptCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AcctRmrpRptsPK)) {
            return false;
        }
        AcctRmrpRptsPK other = (AcctRmrpRptsPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.rptSysCd == null && other.rptSysCd != null) || (this.rptSysCd != null && !this.rptSysCd.equals(other.rptSysCd))) {
            return false;
        }
        if ((this.rptCd == null && other.rptCd != null) || (this.rptCd != null && !this.rptCd.equals(other.rptCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctRmrpRptsPK[ acctNbr=" + acctNbr + ", custId=" + custId + ", rptSysCd=" + rptSysCd + ", rptCd=" + rptCd + " ]";
    }

}
