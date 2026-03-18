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
@Table(name = "CRDH_SUM", catalog = "", schema = "DBO")
public class CrdhSum implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdhSumPK crdhSumPK;
    @Basic(optional = false)
    @Column(name = "PRTN_ID")
    private short prtnId;
    @Basic(optional = false)
    @Column(name = "CR_OR_DB")
    private Character crOrDb;

    @Basic(optional = false)
    @Column(name = "NET_AMT_DUE")
    private BigDecimal netAmtDue;
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

    public CrdhSum() {
    }

    public CrdhSum(CrdhSumPK crdhSumPK) {
        this.crdhSumPK = crdhSumPK;
    }

    public CrdhSum(CrdhSumPK crdhSumPK, short prtnId, Character crOrDb, BigDecimal netAmtDue, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdhSumPK = crdhSumPK;
        this.prtnId = prtnId;
        this.crOrDb = crOrDb;
        this.netAmtDue = netAmtDue;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdhSum(Date pstdDt, String crdNbr, short lvlSeq, String acctNbr, String custId, String empNbr, String lvlVal) {
        this.crdhSumPK = new CrdhSumPK(pstdDt, crdNbr, lvlSeq, acctNbr, custId, empNbr, lvlVal);
    }

    public CrdhSumPK getCrdhSumPK() {
        return crdhSumPK;
    }

    public void setCrdhSumPK(CrdhSumPK crdhSumPK) {
        this.crdhSumPK = crdhSumPK;
    }

    public short getPrtnId() {
        return prtnId;
    }

    public void setPrtnId(short prtnId) {
        this.prtnId = prtnId;
    }

    public Character getCrOrDb() {
        return crOrDb;
    }

    public void setCrOrDb(Character crOrDb) {
        this.crOrDb = crOrDb;
    }

    public BigDecimal getNetAmtDue() {
        return netAmtDue;
    }

    public void setNetAmtDue(BigDecimal netAmtDue) {
        this.netAmtDue = netAmtDue;
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
        hash += (crdhSumPK != null ? crdhSumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdhSum)) {
            return false;
        }
        CrdhSum other = (CrdhSum) object;
        if ((this.crdhSumPK == null && other.crdhSumPK != null) || (this.crdhSumPK != null && !this.crdhSumPK.equals(other.crdhSumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdhSum[ crdhSumPK=" + crdhSumPK + " ]";
    }

}
