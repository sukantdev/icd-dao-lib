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
@Table(name = "STG_BILLPAY_INV_BT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "StgBillpayInvBt.findAll", query = "SELECT s FROM StgBillpayInvBt s")})
public class StgBillpayInvBt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StgBillpayInvBtPK stgBillpayInvBtPK;
    @Basic(optional = false)
    @Column(name = "PGM_BTCH_CD")
    private String pgmBtchCd;
    @Basic(optional = false)
    @Column(name = "TRX_SYS_ID")
    private String trxSysId;
    @Basic(optional = false)
    @Column(name = "AR_SYS_ID")
    private String arSysId;
    @Basic(optional = false)
    @Column(name = "LANG_ID")
    private String langId;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "BILL_ADDR_1")
    private String billAddr1;
    @Basic(optional = false)
    @Column(name = "BILL_ADDR_2")
    private String billAddr2;
    @Basic(optional = false)
    @Column(name = "BILL_ADDR_CITY_NM")
    private String billAddrCityNm;
    @Basic(optional = false)
    @Column(name = "BILL_ADDR_ST_CD")
    private String billAddrStCd;
    @Basic(optional = false)
    @Column(name = "BILL_ADDR_ZIP_CD")
    private String billAddrZipCd;
    @Basic(optional = false)
    @Column(name = "BILL_ADDR_CTRY_CD")
    private String billAddrCtryCd;
    @Basic(optional = false)
    @Column(name = "INV_NBR")
    private String invNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "INV_DUE_AMT")
    private BigDecimal invDueAmt;
    @Basic(optional = false)
    @Column(name = "INV_DUE_AMT_DT")
    @Temporal(TemporalType.DATE)
    private Date invDueAmtDt;
    @Basic(optional = false)
    @Column(name = "INV_DUE_MIN_AMT")
    private BigDecimal invDueMinAmt;
    @Basic(optional = false)
    @Column(name = "CUST_EMAIL_ID")
    private String custEmailId;
    @Basic(optional = false)
    @Column(name = "CUST_FAX_NBR")
    private String custFaxNbr;
    @Basic(optional = false)
    @Column(name = "NTFY_DLVR_FLG")
    private Character ntfyDlvrFlg;
    @Basic(optional = false)
    @Column(name = "ACCT_STAT_FLG")
    private Character acctStatFlg;
    @Basic(optional = false)
    @Column(name = "CLNT_ACCT_NBR")
    private String clntAcctNbr;
    @Basic(optional = false)
    @Column(name = "INV_PDF_NM")
    private String invPdfNm;
    @Basic(optional = false)
    @Column(name = "INV_URL_ADDR")
    private String invUrlAddr;
    @Basic(optional = false)
    @Column(name = "INV_SENT_FLG")
    private Character invSentFlg;
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
    @Column(name = "CORPAY_SENT_FLG")
    private Character corpaySentFlg;
    @Basic(optional = false)
    @Column(name = "FMR_INV_PDF_NM")
    private String fmrInvPdfNm;

    public StgBillpayInvBt() {
    }

    public StgBillpayInvBt(StgBillpayInvBtPK stgBillpayInvBtPK) {
        this.stgBillpayInvBtPK = stgBillpayInvBtPK;
    }

    public StgBillpayInvBt(StgBillpayInvBtPK stgBillpayInvBtPK, String pgmBtchCd, String trxSysId, String arSysId, String langId, String custNm, String billAddr1, String billAddr2, String billAddrCityNm, String billAddrStCd, String billAddrZipCd, String billAddrCtryCd, String invNbr, BigDecimal invDueAmt, Date invDueAmtDt, BigDecimal invDueMinAmt, String custEmailId, String custFaxNbr, Character ntfyDlvrFlg, Character acctStatFlg, String clntAcctNbr, String invPdfNm, String invUrlAddr, Character invSentFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character corpaySentFlg, String fmrInvPdfNm) {
        this.stgBillpayInvBtPK = stgBillpayInvBtPK;
        this.pgmBtchCd = pgmBtchCd;
        this.trxSysId = trxSysId;
        this.arSysId = arSysId;
        this.langId = langId;
        this.custNm = custNm;
        this.billAddr1 = billAddr1;
        this.billAddr2 = billAddr2;
        this.billAddrCityNm = billAddrCityNm;
        this.billAddrStCd = billAddrStCd;
        this.billAddrZipCd = billAddrZipCd;
        this.billAddrCtryCd = billAddrCtryCd;
        this.invNbr = invNbr;
        this.invDueAmt = invDueAmt;
        this.invDueAmtDt = invDueAmtDt;
        this.invDueMinAmt = invDueMinAmt;
        this.custEmailId = custEmailId;
        this.custFaxNbr = custFaxNbr;
        this.ntfyDlvrFlg = ntfyDlvrFlg;
        this.acctStatFlg = acctStatFlg;
        this.clntAcctNbr = clntAcctNbr;
        this.invPdfNm = invPdfNm;
        this.invUrlAddr = invUrlAddr;
        this.invSentFlg = invSentFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.corpaySentFlg = corpaySentFlg;
        this.fmrInvPdfNm = fmrInvPdfNm;
    }

    public StgBillpayInvBt(String acctNbr, Date invDt) {
        this.stgBillpayInvBtPK = new StgBillpayInvBtPK(acctNbr, invDt);
    }

    public StgBillpayInvBtPK getStgBillpayInvBtPK() {
        return stgBillpayInvBtPK;
    }

    public void setStgBillpayInvBtPK(StgBillpayInvBtPK stgBillpayInvBtPK) {
        this.stgBillpayInvBtPK = stgBillpayInvBtPK;
    }

    public String getPgmBtchCd() {
        return pgmBtchCd;
    }

    public void setPgmBtchCd(String pgmBtchCd) {
        this.pgmBtchCd = pgmBtchCd;
    }

    public String getTrxSysId() {
        return trxSysId;
    }

    public void setTrxSysId(String trxSysId) {
        this.trxSysId = trxSysId;
    }

    public String getArSysId() {
        return arSysId;
    }

    public void setArSysId(String arSysId) {
        this.arSysId = arSysId;
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getBillAddr1() {
        return billAddr1;
    }

    public void setBillAddr1(String billAddr1) {
        this.billAddr1 = billAddr1;
    }

    public String getBillAddr2() {
        return billAddr2;
    }

    public void setBillAddr2(String billAddr2) {
        this.billAddr2 = billAddr2;
    }

    public String getBillAddrCityNm() {
        return billAddrCityNm;
    }

    public void setBillAddrCityNm(String billAddrCityNm) {
        this.billAddrCityNm = billAddrCityNm;
    }

    public String getBillAddrStCd() {
        return billAddrStCd;
    }

    public void setBillAddrStCd(String billAddrStCd) {
        this.billAddrStCd = billAddrStCd;
    }

    public String getBillAddrZipCd() {
        return billAddrZipCd;
    }

    public void setBillAddrZipCd(String billAddrZipCd) {
        this.billAddrZipCd = billAddrZipCd;
    }

    public String getBillAddrCtryCd() {
        return billAddrCtryCd;
    }

    public void setBillAddrCtryCd(String billAddrCtryCd) {
        this.billAddrCtryCd = billAddrCtryCd;
    }

    public String getInvNbr() {
        return invNbr;
    }

    public void setInvNbr(String invNbr) {
        this.invNbr = invNbr;
    }

    public BigDecimal getInvDueAmt() {
        return invDueAmt;
    }

    public void setInvDueAmt(BigDecimal invDueAmt) {
        this.invDueAmt = invDueAmt;
    }

    public Date getInvDueAmtDt() {
        return invDueAmtDt;
    }

    public void setInvDueAmtDt(Date invDueAmtDt) {
        this.invDueAmtDt = invDueAmtDt;
    }

    public BigDecimal getInvDueMinAmt() {
        return invDueMinAmt;
    }

    public void setInvDueMinAmt(BigDecimal invDueMinAmt) {
        this.invDueMinAmt = invDueMinAmt;
    }

    public String getCustEmailId() {
        return custEmailId;
    }

    public void setCustEmailId(String custEmailId) {
        this.custEmailId = custEmailId;
    }

    public String getCustFaxNbr() {
        return custFaxNbr;
    }

    public void setCustFaxNbr(String custFaxNbr) {
        this.custFaxNbr = custFaxNbr;
    }

    public Character getNtfyDlvrFlg() {
        return ntfyDlvrFlg;
    }

    public void setNtfyDlvrFlg(Character ntfyDlvrFlg) {
        this.ntfyDlvrFlg = ntfyDlvrFlg;
    }

    public Character getAcctStatFlg() {
        return acctStatFlg;
    }

    public void setAcctStatFlg(Character acctStatFlg) {
        this.acctStatFlg = acctStatFlg;
    }

    public String getClntAcctNbr() {
        return clntAcctNbr;
    }

    public void setClntAcctNbr(String clntAcctNbr) {
        this.clntAcctNbr = clntAcctNbr;
    }

    public String getInvPdfNm() {
        return invPdfNm;
    }

    public void setInvPdfNm(String invPdfNm) {
        this.invPdfNm = invPdfNm;
    }

    public String getInvUrlAddr() {
        return invUrlAddr;
    }

    public void setInvUrlAddr(String invUrlAddr) {
        this.invUrlAddr = invUrlAddr;
    }

    public Character getInvSentFlg() {
        return invSentFlg;
    }

    public void setInvSentFlg(Character invSentFlg) {
        this.invSentFlg = invSentFlg;
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

    public Character getCorpaySentFlg() {
        return corpaySentFlg;
    }

    public void setCorpaySentFlg(Character corpaySentFlg) {
        this.corpaySentFlg = corpaySentFlg;
    }

    public String getFmrInvPdfNm() {
        return fmrInvPdfNm;
    }

    public void setFmrInvPdfNm(String fmrInvPdfNm) {
        this.fmrInvPdfNm = fmrInvPdfNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stgBillpayInvBtPK != null ? stgBillpayInvBtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StgBillpayInvBt)) {
            return false;
        }
        StgBillpayInvBt other = (StgBillpayInvBt) object;
        if ((this.stgBillpayInvBtPK == null && other.stgBillpayInvBtPK != null) || (this.stgBillpayInvBtPK != null && !this.stgBillpayInvBtPK.equals(other.stgBillpayInvBtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.StgBillpayInvBt[ stgBillpayInvBtPK=" + stgBillpayInvBtPK + " ]";
    }
    
}
