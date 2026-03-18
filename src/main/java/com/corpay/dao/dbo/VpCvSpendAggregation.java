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
@Table(name = "VP_CV_SPEND_AGGREGATION", catalog = "", schema = "DBO")
public class VpCvSpendAggregation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpCvSpendAggregationPK vpCvSpendAggregationPK;
    @Basic(optional = false)
    @Column(name = "CV_MAST_ID")
    private String cvMastId;
    @Basic(optional = false)
    @Column(name = "ISSUED_CNT")
    private int issuedCnt;

    @Basic(optional = false)
    @Column(name = "ISSUED_AMT")
    private BigDecimal issuedAmt;
    @Basic(optional = false)
    @Column(name = "POSTED_CNT")
    private int postedCnt;
    @Basic(optional = false)
    @Column(name = "POSTED_AMT")
    private BigDecimal postedAmt;
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
    @Basic(optional = false)
    @Column(name = "DRTY_FLG")
    private Character drtyFlg;

    public VpCvSpendAggregation() {
    }

    public VpCvSpendAggregation(VpCvSpendAggregationPK vpCvSpendAggregationPK) {
        this.vpCvSpendAggregationPK = vpCvSpendAggregationPK;
    }

    public VpCvSpendAggregation(VpCvSpendAggregationPK vpCvSpendAggregationPK, String cvMastId, int issuedCnt, BigDecimal issuedAmt, int postedCnt, BigDecimal postedAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character drtyFlg) {
        this.vpCvSpendAggregationPK = vpCvSpendAggregationPK;
        this.cvMastId = cvMastId;
        this.issuedCnt = issuedCnt;
        this.issuedAmt = issuedAmt;
        this.postedCnt = postedCnt;
        this.postedAmt = postedAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.drtyFlg = drtyFlg;
    }

    public VpCvSpendAggregation(String custId, String vendorNbr, String locCd, Date aggregationDt) {
        this.vpCvSpendAggregationPK = new VpCvSpendAggregationPK(custId, vendorNbr, locCd, aggregationDt);
    }

    public VpCvSpendAggregationPK getVpCvSpendAggregationPK() {
        return vpCvSpendAggregationPK;
    }

    public void setVpCvSpendAggregationPK(VpCvSpendAggregationPK vpCvSpendAggregationPK) {
        this.vpCvSpendAggregationPK = vpCvSpendAggregationPK;
    }

    public String getCvMastId() {
        return cvMastId;
    }

    public void setCvMastId(String cvMastId) {
        this.cvMastId = cvMastId;
    }

    public int getIssuedCnt() {
        return issuedCnt;
    }

    public void setIssuedCnt(int issuedCnt) {
        this.issuedCnt = issuedCnt;
    }

    public BigDecimal getIssuedAmt() {
        return issuedAmt;
    }

    public void setIssuedAmt(BigDecimal issuedAmt) {
        this.issuedAmt = issuedAmt;
    }

    public int getPostedCnt() {
        return postedCnt;
    }

    public void setPostedCnt(int postedCnt) {
        this.postedCnt = postedCnt;
    }

    public BigDecimal getPostedAmt() {
        return postedAmt;
    }

    public void setPostedAmt(BigDecimal postedAmt) {
        this.postedAmt = postedAmt;
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

    public Character getDrtyFlg() {
        return drtyFlg;
    }

    public void setDrtyFlg(Character drtyFlg) {
        this.drtyFlg = drtyFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpCvSpendAggregationPK != null ? vpCvSpendAggregationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpCvSpendAggregation)) {
            return false;
        }
        VpCvSpendAggregation other = (VpCvSpendAggregation) object;
        if ((this.vpCvSpendAggregationPK == null && other.vpCvSpendAggregationPK != null) || (this.vpCvSpendAggregationPK != null && !this.vpCvSpendAggregationPK.equals(other.vpCvSpendAggregationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCvSpendAggregation[ vpCvSpendAggregationPK=" + vpCvSpendAggregationPK + " ]";
    }

}
