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
@Table(name = "PAYMENT_CRD_TRNS_DTL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PaymentCrdTrnsDtl.findAll", query = "SELECT p FROM PaymentCrdTrnsDtl p")})
public class PaymentCrdTrnsDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentCrdTrnsDtlPK paymentCrdTrnsDtlPK;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "NM_ON_CRD_TXT")
    private String nmOnCrdTxt;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;
    @Basic(optional = false)
    @Column(name = "CRD_TYP_CD")
    private String crdTypCd;
    @Basic(optional = false)
    @Column(name = "BLNG_ADDR1")
    private String blngAddr1;
    @Basic(optional = false)
    @Column(name = "BLNG_ADDR2")
    private String blngAddr2;
    @Basic(optional = false)
    @Column(name = "BLNG_CTY")
    private String blngCty;
    @Basic(optional = false)
    @Column(name = "BLNG_ST_CD")
    private String blngStCd;
    @Basic(optional = false)
    @Column(name = "BLNG_ZIP_CD")
    private String blngZipCd;
    @Basic(optional = false)
    @Column(name = "BLNG_CTRY")
    private String blngCtry;
    @Basic(optional = false)
    @Column(name = "TRNS_STAT")
    private String trnsStat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PREAUTH_AMT")
    private BigDecimal preauthAmt;
    @Basic(optional = false)
    @Column(name = "SETLMNT_AMT")
    private BigDecimal setlmntAmt;
    @Basic(optional = false)
    @Column(name = "TRNS_FEE_METH_CD")
    private Character trnsFeeMethCd;
    @Basic(optional = false)
    @Column(name = "TRNS_FEE_VAL")
    private BigDecimal trnsFeeVal;
    @Basic(optional = false)
    @Column(name = "TRNS_FEE_AMT")
    private BigDecimal trnsFeeAmt;
    @Basic(optional = false)
    @Column(name = "TRNS_TYP")
    private String trnsTyp;
    @Basic(optional = false)
    @Column(name = "POS_CTRL_NBR")
    private String posCtrlNbr;
    @Basic(optional = false)
    @Column(name = "POS_TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date posTrnsDt;
    @Basic(optional = false)
    @Column(name = "AUTH_RESP_CD")
    private String authRespCd;
    @Basic(optional = false)
    @Column(name = "PROCESSOR_ID")
    private String processorId;
    @Basic(optional = false)
    @Column(name = "AR_POST_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arPostTs;
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
    @Column(name = "FUNDING_SOURCE_CD")
    private Character fundingSourceCd;
    @Basic(optional = false)
    @Column(name = "MISC_CHRG_DESC")
    private String miscChrgDesc;

    public PaymentCrdTrnsDtl() {
    }

    public PaymentCrdTrnsDtl(PaymentCrdTrnsDtlPK paymentCrdTrnsDtlPK) {
        this.paymentCrdTrnsDtlPK = paymentCrdTrnsDtlPK;
    }

    public PaymentCrdTrnsDtl(PaymentCrdTrnsDtlPK paymentCrdTrnsDtlPK, String acctNbr, String custId, String nmOnCrdTxt, String crdTknNbr, String crdNbrLastFour, String crdTypCd, String blngAddr1, String blngAddr2, String blngCty, String blngStCd, String blngZipCd, String blngCtry, String trnsStat, BigDecimal preauthAmt, BigDecimal setlmntAmt, Character trnsFeeMethCd, BigDecimal trnsFeeVal, BigDecimal trnsFeeAmt, String trnsTyp, String posCtrlNbr, Date posTrnsDt, String authRespCd, String processorId, Date arPostTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character fundingSourceCd, String miscChrgDesc) {
        this.paymentCrdTrnsDtlPK = paymentCrdTrnsDtlPK;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.nmOnCrdTxt = nmOnCrdTxt;
        this.crdTknNbr = crdTknNbr;
        this.crdNbrLastFour = crdNbrLastFour;
        this.crdTypCd = crdTypCd;
        this.blngAddr1 = blngAddr1;
        this.blngAddr2 = blngAddr2;
        this.blngCty = blngCty;
        this.blngStCd = blngStCd;
        this.blngZipCd = blngZipCd;
        this.blngCtry = blngCtry;
        this.trnsStat = trnsStat;
        this.preauthAmt = preauthAmt;
        this.setlmntAmt = setlmntAmt;
        this.trnsFeeMethCd = trnsFeeMethCd;
        this.trnsFeeVal = trnsFeeVal;
        this.trnsFeeAmt = trnsFeeAmt;
        this.trnsTyp = trnsTyp;
        this.posCtrlNbr = posCtrlNbr;
        this.posTrnsDt = posTrnsDt;
        this.authRespCd = authRespCd;
        this.processorId = processorId;
        this.arPostTs = arPostTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.fundingSourceCd = fundingSourceCd;
        this.miscChrgDesc = miscChrgDesc;
    }

    public PaymentCrdTrnsDtl(String trnsId, Date trnsTs) {
        this.paymentCrdTrnsDtlPK = new PaymentCrdTrnsDtlPK(trnsId, trnsTs);
    }

    public PaymentCrdTrnsDtlPK getPaymentCrdTrnsDtlPK() {
        return paymentCrdTrnsDtlPK;
    }

    public void setPaymentCrdTrnsDtlPK(PaymentCrdTrnsDtlPK paymentCrdTrnsDtlPK) {
        this.paymentCrdTrnsDtlPK = paymentCrdTrnsDtlPK;
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

    public String getNmOnCrdTxt() {
        return nmOnCrdTxt;
    }

    public void setNmOnCrdTxt(String nmOnCrdTxt) {
        this.nmOnCrdTxt = nmOnCrdTxt;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public String getCrdNbrLastFour() {
        return crdNbrLastFour;
    }

    public void setCrdNbrLastFour(String crdNbrLastFour) {
        this.crdNbrLastFour = crdNbrLastFour;
    }

    public String getCrdTypCd() {
        return crdTypCd;
    }

    public void setCrdTypCd(String crdTypCd) {
        this.crdTypCd = crdTypCd;
    }

    public String getBlngAddr1() {
        return blngAddr1;
    }

    public void setBlngAddr1(String blngAddr1) {
        this.blngAddr1 = blngAddr1;
    }

    public String getBlngAddr2() {
        return blngAddr2;
    }

    public void setBlngAddr2(String blngAddr2) {
        this.blngAddr2 = blngAddr2;
    }

    public String getBlngCty() {
        return blngCty;
    }

    public void setBlngCty(String blngCty) {
        this.blngCty = blngCty;
    }

    public String getBlngStCd() {
        return blngStCd;
    }

    public void setBlngStCd(String blngStCd) {
        this.blngStCd = blngStCd;
    }

    public String getBlngZipCd() {
        return blngZipCd;
    }

    public void setBlngZipCd(String blngZipCd) {
        this.blngZipCd = blngZipCd;
    }

    public String getBlngCtry() {
        return blngCtry;
    }

    public void setBlngCtry(String blngCtry) {
        this.blngCtry = blngCtry;
    }

    public String getTrnsStat() {
        return trnsStat;
    }

    public void setTrnsStat(String trnsStat) {
        this.trnsStat = trnsStat;
    }

    public BigDecimal getPreauthAmt() {
        return preauthAmt;
    }

    public void setPreauthAmt(BigDecimal preauthAmt) {
        this.preauthAmt = preauthAmt;
    }

    public BigDecimal getSetlmntAmt() {
        return setlmntAmt;
    }

    public void setSetlmntAmt(BigDecimal setlmntAmt) {
        this.setlmntAmt = setlmntAmt;
    }

    public Character getTrnsFeeMethCd() {
        return trnsFeeMethCd;
    }

    public void setTrnsFeeMethCd(Character trnsFeeMethCd) {
        this.trnsFeeMethCd = trnsFeeMethCd;
    }

    public BigDecimal getTrnsFeeVal() {
        return trnsFeeVal;
    }

    public void setTrnsFeeVal(BigDecimal trnsFeeVal) {
        this.trnsFeeVal = trnsFeeVal;
    }

    public BigDecimal getTrnsFeeAmt() {
        return trnsFeeAmt;
    }

    public void setTrnsFeeAmt(BigDecimal trnsFeeAmt) {
        this.trnsFeeAmt = trnsFeeAmt;
    }

    public String getTrnsTyp() {
        return trnsTyp;
    }

    public void setTrnsTyp(String trnsTyp) {
        this.trnsTyp = trnsTyp;
    }

    public String getPosCtrlNbr() {
        return posCtrlNbr;
    }

    public void setPosCtrlNbr(String posCtrlNbr) {
        this.posCtrlNbr = posCtrlNbr;
    }

    public Date getPosTrnsDt() {
        return posTrnsDt;
    }

    public void setPosTrnsDt(Date posTrnsDt) {
        this.posTrnsDt = posTrnsDt;
    }

    public String getAuthRespCd() {
        return authRespCd;
    }

    public void setAuthRespCd(String authRespCd) {
        this.authRespCd = authRespCd;
    }

    public String getProcessorId() {
        return processorId;
    }

    public void setProcessorId(String processorId) {
        this.processorId = processorId;
    }

    public Date getArPostTs() {
        return arPostTs;
    }

    public void setArPostTs(Date arPostTs) {
        this.arPostTs = arPostTs;
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

    public Character getFundingSourceCd() {
        return fundingSourceCd;
    }

    public void setFundingSourceCd(Character fundingSourceCd) {
        this.fundingSourceCd = fundingSourceCd;
    }

    public String getMiscChrgDesc() {
        return miscChrgDesc;
    }

    public void setMiscChrgDesc(String miscChrgDesc) {
        this.miscChrgDesc = miscChrgDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentCrdTrnsDtlPK != null ? paymentCrdTrnsDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentCrdTrnsDtl)) {
            return false;
        }
        PaymentCrdTrnsDtl other = (PaymentCrdTrnsDtl) object;
        if ((this.paymentCrdTrnsDtlPK == null && other.paymentCrdTrnsDtlPK != null) || (this.paymentCrdTrnsDtlPK != null && !this.paymentCrdTrnsDtlPK.equals(other.paymentCrdTrnsDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaymentCrdTrnsDtl[ paymentCrdTrnsDtlPK=" + paymentCrdTrnsDtlPK + " ]";
    }
    
}
