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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PAYMENT_CRD_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PaymentCrdInfo.findAll", query = "SELECT p FROM PaymentCrdInfo p")})
public class PaymentCrdInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaymentCrdInfoPK paymentCrdInfoPK;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;
    @Basic(optional = false)
    @Column(name = "CRD_TYP_CD")
    private String crdTypCd;
    @Basic(optional = false)
    @Column(name = "CRD_SAVED_NM")
    private String crdSavedNm;
    @Basic(optional = false)
    @Column(name = "NM_ON_CRD_TXT")
    private String nmOnCrdTxt;
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
    @Column(name = "STAT")
    private Character stat;
    @Basic(optional = false)
    @Column(name = "PREF_FLG")
    private Character prefFlg;
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
    @Column(name = "CRD_DEBIT_NETW_ID")
    private String crdDebitNetwId;
    @Basic(optional = false)
    @Column(name = "FUNDING_SOURCE_EXTERNAL_CD")
    private Character fundingSourceExternalCd;

    public PaymentCrdInfo() {
    }

    public PaymentCrdInfo(PaymentCrdInfoPK paymentCrdInfoPK) {
        this.paymentCrdInfoPK = paymentCrdInfoPK;
    }

    public PaymentCrdInfo(PaymentCrdInfoPK paymentCrdInfoPK, String crdNbrLastFour, String crdTypCd, String crdSavedNm, String nmOnCrdTxt, String blngAddr1, String blngAddr2, String blngCty, String blngStCd, String blngZipCd, String blngCtry, Character stat, Character prefFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character fundingSourceCd, String crdDebitNetwId, Character fundingSourceExternalCd) {
        this.paymentCrdInfoPK = paymentCrdInfoPK;
        this.crdNbrLastFour = crdNbrLastFour;
        this.crdTypCd = crdTypCd;
        this.crdSavedNm = crdSavedNm;
        this.nmOnCrdTxt = nmOnCrdTxt;
        this.blngAddr1 = blngAddr1;
        this.blngAddr2 = blngAddr2;
        this.blngCty = blngCty;
        this.blngStCd = blngStCd;
        this.blngZipCd = blngZipCd;
        this.blngCtry = blngCtry;
        this.stat = stat;
        this.prefFlg = prefFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.fundingSourceCd = fundingSourceCd;
        this.crdDebitNetwId = crdDebitNetwId;
        this.fundingSourceExternalCd = fundingSourceExternalCd;
    }

    public PaymentCrdInfo(String acctNbr, String crdTknNbr) {
        this.paymentCrdInfoPK = new PaymentCrdInfoPK(acctNbr, crdTknNbr);
    }

    public PaymentCrdInfoPK getPaymentCrdInfoPK() {
        return paymentCrdInfoPK;
    }

    public void setPaymentCrdInfoPK(PaymentCrdInfoPK paymentCrdInfoPK) {
        this.paymentCrdInfoPK = paymentCrdInfoPK;
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

    public String getCrdSavedNm() {
        return crdSavedNm;
    }

    public void setCrdSavedNm(String crdSavedNm) {
        this.crdSavedNm = crdSavedNm;
    }

    public String getNmOnCrdTxt() {
        return nmOnCrdTxt;
    }

    public void setNmOnCrdTxt(String nmOnCrdTxt) {
        this.nmOnCrdTxt = nmOnCrdTxt;
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

    public Character getStat() {
        return stat;
    }

    public void setStat(Character stat) {
        this.stat = stat;
    }

    public Character getPrefFlg() {
        return prefFlg;
    }

    public void setPrefFlg(Character prefFlg) {
        this.prefFlg = prefFlg;
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

    public String getCrdDebitNetwId() {
        return crdDebitNetwId;
    }

    public void setCrdDebitNetwId(String crdDebitNetwId) {
        this.crdDebitNetwId = crdDebitNetwId;
    }

    public Character getFundingSourceExternalCd() {
        return fundingSourceExternalCd;
    }

    public void setFundingSourceExternalCd(Character fundingSourceExternalCd) {
        this.fundingSourceExternalCd = fundingSourceExternalCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentCrdInfoPK != null ? paymentCrdInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentCrdInfo)) {
            return false;
        }
        PaymentCrdInfo other = (PaymentCrdInfo) object;
        if ((this.paymentCrdInfoPK == null && other.paymentCrdInfoPK != null) || (this.paymentCrdInfoPK != null && !this.paymentCrdInfoPK.equals(other.paymentCrdInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaymentCrdInfo[ paymentCrdInfoPK=" + paymentCrdInfoPK + " ]";
    }
    
}
