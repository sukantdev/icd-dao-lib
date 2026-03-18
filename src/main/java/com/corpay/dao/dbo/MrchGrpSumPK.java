package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class MrchGrpSumPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PSTD_DT")
    @Temporal(TemporalType.DATE)
    private Date pstdDt;
    @Basic(optional = false)
    @Column(name = "NTWK")
    private Character ntwk;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "MRCH_GRP_TEXT")
    private String mrchGrpText;
    @Basic(optional = false)
    @Column(name = "LVL_SEQ")
    private short lvlSeq;
    @Basic(optional = false)
    @Column(name = "LVL_VAL")
    private String lvlVal;

    public MrchGrpSumPK() {
    }

    public MrchGrpSumPK(Date pstdDt, Character ntwk, String acctNbr, String custId, String mrchGrpText, short lvlSeq, String lvlVal) {
        this.pstdDt = pstdDt;
        this.ntwk = ntwk;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.mrchGrpText = mrchGrpText;
        this.lvlSeq = lvlSeq;
        this.lvlVal = lvlVal;
    }

    public Date getPstdDt() {
        return pstdDt;
    }

    public void setPstdDt(Date pstdDt) {
        this.pstdDt = pstdDt;
    }

    public Character getNtwk() {
        return ntwk;
    }

    public void setNtwk(Character ntwk) {
        this.ntwk = ntwk;
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

    public String getMrchGrpText() {
        return mrchGrpText;
    }

    public void setMrchGrpText(String mrchGrpText) {
        this.mrchGrpText = mrchGrpText;
    }

    public short getLvlSeq() {
        return lvlSeq;
    }

    public void setLvlSeq(short lvlSeq) {
        this.lvlSeq = lvlSeq;
    }

    public String getLvlVal() {
        return lvlVal;
    }

    public void setLvlVal(String lvlVal) {
        this.lvlVal = lvlVal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pstdDt != null ? pstdDt.hashCode() : 0);
        hash += (ntwk != null ? ntwk.hashCode() : 0);
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (mrchGrpText != null ? mrchGrpText.hashCode() : 0);
        hash += (int) lvlSeq;
        hash += (lvlVal != null ? lvlVal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchGrpSumPK)) {
            return false;
        }
        MrchGrpSumPK other = (MrchGrpSumPK) object;
        if ((this.pstdDt == null && other.pstdDt != null) || (this.pstdDt != null && !this.pstdDt.equals(other.pstdDt))) {
            return false;
        }
        if ((this.ntwk == null && other.ntwk != null) || (this.ntwk != null && !this.ntwk.equals(other.ntwk))) {
            return false;
        }
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.mrchGrpText == null && other.mrchGrpText != null) || (this.mrchGrpText != null && !this.mrchGrpText.equals(other.mrchGrpText))) {
            return false;
        }
        if (this.lvlSeq != other.lvlSeq) {
            return false;
        }
        if ((this.lvlVal == null && other.lvlVal != null) || (this.lvlVal != null && !this.lvlVal.equals(other.lvlVal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchGrpSumPK[ pstdDt=" + pstdDt + ", ntwk=" + ntwk + ", acctNbr=" + acctNbr + ", custId=" + custId + ", mrchGrpText=" + mrchGrpText + ", lvlSeq=" + lvlSeq + ", lvlVal=" + lvlVal + " ]";
    }

}
