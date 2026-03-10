/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "DSPT_TRANS_DTL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "DsptTransDtl.findAll", query = "SELECT d FROM DsptTransDtl d")})
public class DsptTransDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DsptTransDtlPK dsptTransDtlPK;
    @Basic(optional = false)
    @Column(name = "TRNS_TYP_CD")
    private Character trnsTypCd;
    @Basic(optional = false)
    @Column(name = "AUTH_PAN_CD")
    private String authPanCd;
    @Basic(optional = false)
    @Column(name = "AUTH_APPROVAL_CD")
    private long authApprovalCd;
    @Basic(optional = false)
    @Column(name = "AUTH_UT_DT")
    @Temporal(TemporalType.DATE)
    private Date authUtDt;
    @Basic(optional = false)
    @Column(name = "AUTH_LOCAL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authLocalTs;
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authPostedTs;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_ID")
    private String transactionId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "POSTED_AMT")
    private BigDecimal postedAmt;
    @Basic(optional = false)
    @Column(name = "RECON_AMT")
    private BigDecimal reconAmt;
    @Basic(optional = false)
    @Column(name = "AUTH_MCC_CD")
    private String authMccCd;
    @Basic(optional = false)
    @Column(name = "POS_CD")
    private String posCd;
    @Basic(optional = false)
    @Column(name = "ARD_NBR")
    private String ardNbr;
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
    @Column(name = "MRCH_NM")
    private String mrchNm;
    @Basic(optional = false)
    @Column(name = "SF_CASE_ID")
    private String sfCaseId;
    @Basic(optional = false)
    @Column(name = "SF_CASE_NBR")
    private String sfCaseNbr;

    public DsptTransDtl() {
    }

    public DsptTransDtl(DsptTransDtlPK dsptTransDtlPK) {
        this.dsptTransDtlPK = dsptTransDtlPK;
    }

    public DsptTransDtl(DsptTransDtlPK dsptTransDtlPK, Character trnsTypCd, String authPanCd, long authApprovalCd, Date authUtDt, Date authLocalTs, Date authPostedTs, String transactionId, BigDecimal postedAmt, BigDecimal reconAmt, String authMccCd, String posCd, String ardNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String mrchNm, String sfCaseId, String sfCaseNbr) {
        this.dsptTransDtlPK = dsptTransDtlPK;
        this.trnsTypCd = trnsTypCd;
        this.authPanCd = authPanCd;
        this.authApprovalCd = authApprovalCd;
        this.authUtDt = authUtDt;
        this.authLocalTs = authLocalTs;
        this.authPostedTs = authPostedTs;
        this.transactionId = transactionId;
        this.postedAmt = postedAmt;
        this.reconAmt = reconAmt;
        this.authMccCd = authMccCd;
        this.posCd = posCd;
        this.ardNbr = ardNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.mrchNm = mrchNm;
        this.sfCaseId = sfCaseId;
        this.sfCaseNbr = sfCaseNbr;
    }

    public DsptTransDtl(String dsptId, int trnsSeqNbr) {
        this.dsptTransDtlPK = new DsptTransDtlPK(dsptId, trnsSeqNbr);
    }

    public DsptTransDtlPK getDsptTransDtlPK() {
        return dsptTransDtlPK;
    }

    public void setDsptTransDtlPK(DsptTransDtlPK dsptTransDtlPK) {
        this.dsptTransDtlPK = dsptTransDtlPK;
    }

    public Character getTrnsTypCd() {
        return trnsTypCd;
    }

    public void setTrnsTypCd(Character trnsTypCd) {
        this.trnsTypCd = trnsTypCd;
    }

    public String getAuthPanCd() {
        return authPanCd;
    }

    public void setAuthPanCd(String authPanCd) {
        this.authPanCd = authPanCd;
    }

    public long getAuthApprovalCd() {
        return authApprovalCd;
    }

    public void setAuthApprovalCd(long authApprovalCd) {
        this.authApprovalCd = authApprovalCd;
    }

    public Date getAuthUtDt() {
        return authUtDt;
    }

    public void setAuthUtDt(Date authUtDt) {
        this.authUtDt = authUtDt;
    }

    public Date getAuthLocalTs() {
        return authLocalTs;
    }

    public void setAuthLocalTs(Date authLocalTs) {
        this.authLocalTs = authLocalTs;
    }

    public Date getAuthPostedTs() {
        return authPostedTs;
    }

    public void setAuthPostedTs(Date authPostedTs) {
        this.authPostedTs = authPostedTs;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public BigDecimal getPostedAmt() {
        return postedAmt;
    }

    public void setPostedAmt(BigDecimal postedAmt) {
        this.postedAmt = postedAmt;
    }

    public BigDecimal getReconAmt() {
        return reconAmt;
    }

    public void setReconAmt(BigDecimal reconAmt) {
        this.reconAmt = reconAmt;
    }

    public String getAuthMccCd() {
        return authMccCd;
    }

    public void setAuthMccCd(String authMccCd) {
        this.authMccCd = authMccCd;
    }

    public String getPosCd() {
        return posCd;
    }

    public void setPosCd(String posCd) {
        this.posCd = posCd;
    }

    public String getArdNbr() {
        return ardNbr;
    }

    public void setArdNbr(String ardNbr) {
        this.ardNbr = ardNbr;
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

    public String getMrchNm() {
        return mrchNm;
    }

    public void setMrchNm(String mrchNm) {
        this.mrchNm = mrchNm;
    }

    public String getSfCaseId() {
        return sfCaseId;
    }

    public void setSfCaseId(String sfCaseId) {
        this.sfCaseId = sfCaseId;
    }

    public String getSfCaseNbr() {
        return sfCaseNbr;
    }

    public void setSfCaseNbr(String sfCaseNbr) {
        this.sfCaseNbr = sfCaseNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dsptTransDtlPK != null ? dsptTransDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DsptTransDtl)) {
            return false;
        }
        DsptTransDtl other = (DsptTransDtl) object;
        if ((this.dsptTransDtlPK == null && other.dsptTransDtlPK != null) || (this.dsptTransDtlPK != null && !this.dsptTransDtlPK.equals(other.dsptTransDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DsptTransDtl[ dsptTransDtlPK=" + dsptTransDtlPK + " ]";
    }
    
}
