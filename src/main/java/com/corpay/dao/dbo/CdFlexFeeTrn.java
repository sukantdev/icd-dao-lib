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
@Table(name = "CD_FLEX_FEE_TRN", catalog = "", schema = "DBO")
public class CdFlexFeeTrn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CdFlexFeeTrnPK cdFlexFeeTrnPK;
    @Basic(optional = false)
    @Column(name = "BLNG_ACCT_NBR")
    private String blngAcctNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;

    @Basic(optional = false)
    @Column(name = "TRN_AMT")
    private BigDecimal trnAmt;
    @Basic(optional = false)
    @Column(name = "FEE_AMT")
    private BigDecimal feeAmt;
    @Basic(optional = false)
    @Column(name = "TRN_TM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trnTm;
    @Basic(optional = false)
    @Column(name = "SC_FEE_TYP_CD")
    private Character scFeeTypCd;
    @Basic(optional = false)
    @Column(name = "SC_RMS_ALL_FLG")
    private Character scRmsAllFlg;
    @Basic(optional = false)
    @Column(name = "SC_XTN_RATE_PCT")
    private BigDecimal scXtnRatePct;
    @Basic(optional = false)
    @Column(name = "SC_CALL_FEE_PCT")
    private BigDecimal scCallFeePct;
    @Basic(optional = false)
    @Column(name = "SC_TIERED_FEES_FLG")
    private Character scTieredFeesFlg;
    @Basic(optional = false)
    @Column(name = "PROC_FLG")
    private Character procFlg;
    @Basic(optional = false)
    @Column(name = "PROC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date procTs;
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

    public CdFlexFeeTrn() {
    }

    public CdFlexFeeTrn(CdFlexFeeTrnPK cdFlexFeeTrnPK) {
        this.cdFlexFeeTrnPK = cdFlexFeeTrnPK;
    }

    public CdFlexFeeTrn(CdFlexFeeTrnPK cdFlexFeeTrnPK, String blngAcctNbr, String mrchCd, String acctNbr, String custId, String crdNbr, BigDecimal trnAmt, BigDecimal feeAmt, Date trnTm, Character scFeeTypCd, Character scRmsAllFlg, BigDecimal scXtnRatePct, BigDecimal scCallFeePct, Character scTieredFeesFlg, Character procFlg, Date procTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.cdFlexFeeTrnPK = cdFlexFeeTrnPK;
        this.blngAcctNbr = blngAcctNbr;
        this.mrchCd = mrchCd;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.crdNbr = crdNbr;
        this.trnAmt = trnAmt;
        this.feeAmt = feeAmt;
        this.trnTm = trnTm;
        this.scFeeTypCd = scFeeTypCd;
        this.scRmsAllFlg = scRmsAllFlg;
        this.scXtnRatePct = scXtnRatePct;
        this.scCallFeePct = scCallFeePct;
        this.scTieredFeesFlg = scTieredFeesFlg;
        this.procFlg = procFlg;
        this.procTs = procTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CdFlexFeeTrn(Date trnDt, int cntlNbr) {
        this.cdFlexFeeTrnPK = new CdFlexFeeTrnPK(trnDt, cntlNbr);
    }

    public CdFlexFeeTrnPK getCdFlexFeeTrnPK() {
        return cdFlexFeeTrnPK;
    }

    public void setCdFlexFeeTrnPK(CdFlexFeeTrnPK cdFlexFeeTrnPK) {
        this.cdFlexFeeTrnPK = cdFlexFeeTrnPK;
    }

    public String getBlngAcctNbr() {
        return blngAcctNbr;
    }

    public void setBlngAcctNbr(String blngAcctNbr) {
        this.blngAcctNbr = blngAcctNbr;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
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

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public BigDecimal getTrnAmt() {
        return trnAmt;
    }

    public void setTrnAmt(BigDecimal trnAmt) {
        this.trnAmt = trnAmt;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public Date getTrnTm() {
        return trnTm;
    }

    public void setTrnTm(Date trnTm) {
        this.trnTm = trnTm;
    }

    public Character getScFeeTypCd() {
        return scFeeTypCd;
    }

    public void setScFeeTypCd(Character scFeeTypCd) {
        this.scFeeTypCd = scFeeTypCd;
    }

    public Character getScRmsAllFlg() {
        return scRmsAllFlg;
    }

    public void setScRmsAllFlg(Character scRmsAllFlg) {
        this.scRmsAllFlg = scRmsAllFlg;
    }

    public BigDecimal getScXtnRatePct() {
        return scXtnRatePct;
    }

    public void setScXtnRatePct(BigDecimal scXtnRatePct) {
        this.scXtnRatePct = scXtnRatePct;
    }

    public BigDecimal getScCallFeePct() {
        return scCallFeePct;
    }

    public void setScCallFeePct(BigDecimal scCallFeePct) {
        this.scCallFeePct = scCallFeePct;
    }

    public Character getScTieredFeesFlg() {
        return scTieredFeesFlg;
    }

    public void setScTieredFeesFlg(Character scTieredFeesFlg) {
        this.scTieredFeesFlg = scTieredFeesFlg;
    }

    public Character getProcFlg() {
        return procFlg;
    }

    public void setProcFlg(Character procFlg) {
        this.procFlg = procFlg;
    }

    public Date getProcTs() {
        return procTs;
    }

    public void setProcTs(Date procTs) {
        this.procTs = procTs;
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
        hash += (cdFlexFeeTrnPK != null ? cdFlexFeeTrnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CdFlexFeeTrn)) {
            return false;
        }
        CdFlexFeeTrn other = (CdFlexFeeTrn) object;
        if ((this.cdFlexFeeTrnPK == null && other.cdFlexFeeTrnPK != null) || (this.cdFlexFeeTrnPK != null && !this.cdFlexFeeTrnPK.equals(other.cdFlexFeeTrnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CdFlexFeeTrn[ cdFlexFeeTrnPK=" + cdFlexFeeTrnPK + " ]";
    }

}
