package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "VP_STP_TRANSACTION", catalog = "", schema = "DBO")
public class VpStpTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STP_TRNS_ID")
    private String stpTrnsId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "VNDR_ID")
    private String vndrId;
    @Basic(optional = false)
    @Column(name = "STP_SUPL_ID")
    private String stpSuplId;
    @Basic(optional = false)
    @Column(name = "AMT")
    private String amt;
    @Basic(optional = false)
    @Column(name = "CURR_CD")
    private String currCd;
    @Basic(optional = false)
    @Column(name = "LST_REQ_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstReqTs;
    @Basic(optional = false)
    @Column(name = "CMPLTD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpltdTs;
    @Basic(optional = false)
    @Column(name = "SCSFL_CD")
    private Character scsflCd;
    @Basic(optional = false)
    @Column(name = "AUTH_CD")
    private String authCd;
    @Basic(optional = false)
    @Column(name = "PRVDR_RSLT_CD")
    private String prvdrRsltCd;
    @Basic(optional = false)
    @Column(name = "PRVDR_RSLT_DTL_CD")
    private String prvdrRsltDtlCd;
    @Basic(optional = false)
    @Column(name = "PRVDR_RSLT_ADDTL_DTL_CD")
    private String prvdrRsltAddtlDtlCd;
    @Basic(optional = false)
    @Column(name = "PRODR_RSLT_TXT")
    private String prodrRsltTxt;
    @Basic(optional = false)
    @Column(name = "PMT_STAT_HREF_ADDR")
    private String pmtStatHrefAddr;
    @Basic(optional = false)
    @Column(name = "PMT_HREF_TXT")
    private String pmtHrefTxt;
    @Basic(optional = false)
    @Column(name = "EXPR_MO")
    private String exprMo;
    @Basic(optional = false)
    @Column(name = "EXPR_YR")
    private String exprYr;
    @Basic(optional = false)
    @Column(name = "PMT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pmtTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "STP_3RD_PARTY_ID")
    private String stp3rdPartyId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_ID")
    private String paymentId;
    @Basic(optional = false)
    @Column(name = "INVOICE_NBR")
    private String invoiceNbr;
    @Basic(optional = false)
    @Column(name = "BUYER_NAME")
    private String buyerName;
    @Basic(optional = false)
    @Column(name = "BUYER_ADDRESS")
    private String buyerAddress;
    @Basic(optional = false)
    @Column(name = "BUYER_ADDRESS2")
    private String buyerAddress2;
    @Basic(optional = false)
    @Column(name = "BUYER_CITY")
    private String buyerCity;
    @Basic(optional = false)
    @Column(name = "BUYER_STATE")
    private String buyerState;
    @Basic(optional = false)
    @Column(name = "BUYER_POSTAL_CODE")
    private String buyerPostalCode;
    @Basic(optional = false)
    @Column(name = "BUYER_COUNTRY")
    private String buyerCountry;
    @Basic(optional = false)
    @Column(name = "BATCH_ID")
    private String batchId;
    @Basic(optional = false)
    @Column(name = "BATCH_SEQ_NBR")
    private long batchSeqNbr;
    @Basic(optional = false)
    @Column(name = "CANONICAL_STAT")
    private String canonicalStat;

    public VpStpTransaction() {
    }

    public VpStpTransaction(String stpTrnsId) {
        this.stpTrnsId = stpTrnsId;
    }

    public VpStpTransaction(String stpTrnsId, String crdNbr, String vndrId, String stpSuplId, String amt, String currCd, Date lstReqTs, Date cmpltdTs, Character scsflCd, String authCd, String prvdrRsltCd, String prvdrRsltDtlCd, String prvdrRsltAddtlDtlCd, String prodrRsltTxt, String pmtStatHrefAddr, String pmtHrefTxt, String exprMo, String exprYr, Date pmtTs, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String stp3rdPartyId, String paymentId, String invoiceNbr, String buyerName, String buyerAddress, String buyerAddress2, String buyerCity, String buyerState, String buyerPostalCode, String buyerCountry, String batchId, long batchSeqNbr, String canonicalStat) {
        this.stpTrnsId = stpTrnsId;
        this.crdNbr = crdNbr;
        this.vndrId = vndrId;
        this.stpSuplId = stpSuplId;
        this.amt = amt;
        this.currCd = currCd;
        this.lstReqTs = lstReqTs;
        this.cmpltdTs = cmpltdTs;
        this.scsflCd = scsflCd;
        this.authCd = authCd;
        this.prvdrRsltCd = prvdrRsltCd;
        this.prvdrRsltDtlCd = prvdrRsltDtlCd;
        this.prvdrRsltAddtlDtlCd = prvdrRsltAddtlDtlCd;
        this.prodrRsltTxt = prodrRsltTxt;
        this.pmtStatHrefAddr = pmtStatHrefAddr;
        this.pmtHrefTxt = pmtHrefTxt;
        this.exprMo = exprMo;
        this.exprYr = exprYr;
        this.pmtTs = pmtTs;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.stp3rdPartyId = stp3rdPartyId;
        this.paymentId = paymentId;
        this.invoiceNbr = invoiceNbr;
        this.buyerName = buyerName;
        this.buyerAddress = buyerAddress;
        this.buyerAddress2 = buyerAddress2;
        this.buyerCity = buyerCity;
        this.buyerState = buyerState;
        this.buyerPostalCode = buyerPostalCode;
        this.buyerCountry = buyerCountry;
        this.batchId = batchId;
        this.batchSeqNbr = batchSeqNbr;
        this.canonicalStat = canonicalStat;
    }

    public String getStpTrnsId() {
        return stpTrnsId;
    }

    public void setStpTrnsId(String stpTrnsId) {
        this.stpTrnsId = stpTrnsId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getVndrId() {
        return vndrId;
    }

    public void setVndrId(String vndrId) {
        this.vndrId = vndrId;
    }

    public String getStpSuplId() {
        return stpSuplId;
    }

    public void setStpSuplId(String stpSuplId) {
        this.stpSuplId = stpSuplId;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getCurrCd() {
        return currCd;
    }

    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    public Date getLstReqTs() {
        return lstReqTs;
    }

    public void setLstReqTs(Date lstReqTs) {
        this.lstReqTs = lstReqTs;
    }

    public Date getCmpltdTs() {
        return cmpltdTs;
    }

    public void setCmpltdTs(Date cmpltdTs) {
        this.cmpltdTs = cmpltdTs;
    }

    public Character getScsflCd() {
        return scsflCd;
    }

    public void setScsflCd(Character scsflCd) {
        this.scsflCd = scsflCd;
    }

    public String getAuthCd() {
        return authCd;
    }

    public void setAuthCd(String authCd) {
        this.authCd = authCd;
    }

    public String getPrvdrRsltCd() {
        return prvdrRsltCd;
    }

    public void setPrvdrRsltCd(String prvdrRsltCd) {
        this.prvdrRsltCd = prvdrRsltCd;
    }

    public String getPrvdrRsltDtlCd() {
        return prvdrRsltDtlCd;
    }

    public void setPrvdrRsltDtlCd(String prvdrRsltDtlCd) {
        this.prvdrRsltDtlCd = prvdrRsltDtlCd;
    }

    public String getPrvdrRsltAddtlDtlCd() {
        return prvdrRsltAddtlDtlCd;
    }

    public void setPrvdrRsltAddtlDtlCd(String prvdrRsltAddtlDtlCd) {
        this.prvdrRsltAddtlDtlCd = prvdrRsltAddtlDtlCd;
    }

    public String getProdrRsltTxt() {
        return prodrRsltTxt;
    }

    public void setProdrRsltTxt(String prodrRsltTxt) {
        this.prodrRsltTxt = prodrRsltTxt;
    }

    public String getPmtStatHrefAddr() {
        return pmtStatHrefAddr;
    }

    public void setPmtStatHrefAddr(String pmtStatHrefAddr) {
        this.pmtStatHrefAddr = pmtStatHrefAddr;
    }

    public String getPmtHrefTxt() {
        return pmtHrefTxt;
    }

    public void setPmtHrefTxt(String pmtHrefTxt) {
        this.pmtHrefTxt = pmtHrefTxt;
    }

    public String getExprMo() {
        return exprMo;
    }

    public void setExprMo(String exprMo) {
        this.exprMo = exprMo;
    }

    public String getExprYr() {
        return exprYr;
    }

    public void setExprYr(String exprYr) {
        this.exprYr = exprYr;
    }

    public Date getPmtTs() {
        return pmtTs;
    }

    public void setPmtTs(Date pmtTs) {
        this.pmtTs = pmtTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getStp3rdPartyId() {
        return stp3rdPartyId;
    }

    public void setStp3rdPartyId(String stp3rdPartyId) {
        this.stp3rdPartyId = stp3rdPartyId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerAddress2() {
        return buyerAddress2;
    }

    public void setBuyerAddress2(String buyerAddress2) {
        this.buyerAddress2 = buyerAddress2;
    }

    public String getBuyerCity() {
        return buyerCity;
    }

    public void setBuyerCity(String buyerCity) {
        this.buyerCity = buyerCity;
    }

    public String getBuyerState() {
        return buyerState;
    }

    public void setBuyerState(String buyerState) {
        this.buyerState = buyerState;
    }

    public String getBuyerPostalCode() {
        return buyerPostalCode;
    }

    public void setBuyerPostalCode(String buyerPostalCode) {
        this.buyerPostalCode = buyerPostalCode;
    }

    public String getBuyerCountry() {
        return buyerCountry;
    }

    public void setBuyerCountry(String buyerCountry) {
        this.buyerCountry = buyerCountry;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public long getBatchSeqNbr() {
        return batchSeqNbr;
    }

    public void setBatchSeqNbr(long batchSeqNbr) {
        this.batchSeqNbr = batchSeqNbr;
    }

    public String getCanonicalStat() {
        return canonicalStat;
    }

    public void setCanonicalStat(String canonicalStat) {
        this.canonicalStat = canonicalStat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stpTrnsId != null ? stpTrnsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpStpTransaction)) {
            return false;
        }
        VpStpTransaction other = (VpStpTransaction) object;
        if ((this.stpTrnsId == null && other.stpTrnsId != null) || (this.stpTrnsId != null && !this.stpTrnsId.equals(other.stpTrnsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpStpTransaction[ stpTrnsId=" + stpTrnsId + " ]";
    }

}
