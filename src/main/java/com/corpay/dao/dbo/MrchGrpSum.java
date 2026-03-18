package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MRCH_GRP_SUM", catalog = "", schema = "DBO")
public class MrchGrpSum implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchGrpSumPK mrchGrpSumPK;
    @Basic(optional = false)
    @Column(name = "PRTN_ID")
    private short prtnId;

    @Basic(optional = false)
    @Column(name = "NET_AMT_DUE")
    private BigDecimal netAmtDue;
    @Basic(optional = false)
    @Column(name = "CR_OR_DB")
    private Character crOrDb;
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

    public MrchGrpSum() {
    }

    public MrchGrpSum(MrchGrpSumPK mrchGrpSumPK) {
        this.mrchGrpSumPK = mrchGrpSumPK;
    }

    public MrchGrpSum(MrchGrpSumPK mrchGrpSumPK, short prtnId, BigDecimal netAmtDue, Character crOrDb, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchGrpSumPK = mrchGrpSumPK;
        this.prtnId = prtnId;
        this.netAmtDue = netAmtDue;
        this.crOrDb = crOrDb;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchGrpSum(Date pstdDt, Character ntwk, String acctNbr, String custId, String mrchGrpText, short lvlSeq, String lvlVal) {
        this.mrchGrpSumPK = new MrchGrpSumPK(pstdDt, ntwk, acctNbr, custId, mrchGrpText, lvlSeq, lvlVal);
    }

    public MrchGrpSumPK getMrchGrpSumPK() {
        return mrchGrpSumPK;
    }

    public void setMrchGrpSumPK(MrchGrpSumPK mrchGrpSumPK) {
        this.mrchGrpSumPK = mrchGrpSumPK;
    }

    public short getPrtnId() {
        return prtnId;
    }

    public void setPrtnId(short prtnId) {
        this.prtnId = prtnId;
    }

    public BigDecimal getNetAmtDue() {
        return netAmtDue;
    }

    public void setNetAmtDue(BigDecimal netAmtDue) {
        this.netAmtDue = netAmtDue;
    }

    public Character getCrOrDb() {
        return crOrDb;
    }

    public void setCrOrDb(Character crOrDb) {
        this.crOrDb = crOrDb;
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
        hash += (mrchGrpSumPK != null ? mrchGrpSumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchGrpSum)) {
            return false;
        }
        MrchGrpSum other = (MrchGrpSum) object;
        if ((this.mrchGrpSumPK == null && other.mrchGrpSumPK != null) || (this.mrchGrpSumPK != null && !this.mrchGrpSumPK.equals(other.mrchGrpSumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchGrpSum[ mrchGrpSumPK=" + mrchGrpSumPK + " ]";
    }

}
