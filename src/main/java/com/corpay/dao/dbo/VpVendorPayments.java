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
@Table(name = "VP_VENDOR_PAYMENTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpVendorPayments.findAll", query = "SELECT v FROM VpVendorPayments v")})
public class VpVendorPayments implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpVendorPaymentsPK vpVendorPaymentsPK;
    @Basic(optional = false)
    @Column(name = "CODEWORD")
    private String codeword;
    @Basic(optional = false)
    @Column(name = "VENDOR_NBR")
    private String vendorNbr;
    @Basic(optional = false)
    @Column(name = "VENDOR_NAME")
    private String vendorName;
    @Basic(optional = false)
    @Column(name = "REMIT_EMAIL")
    private String remitEmail;
    @Basic(optional = false)
    @Column(name = "REMIT_EMAIL2")
    private String remitEmail2;
    @Basic(optional = false)
    @Column(name = "INVOICE_NBR")
    private String invoiceNbr;
    @Basic(optional = false)
    @Column(name = "INVOICE_DATE")
    @Temporal(TemporalType.DATE)
    private Date invoiceDate;
    @Basic(optional = false)
    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    @Basic(optional = false)
    @Column(name = "PAYMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;
    @Basic(optional = false)
    @Column(name = "PAYMENT_NBR")
    private String paymentNbr;
    @Basic(optional = false)
    @Column(name = "INVOICE_COMMENTS")
    private String invoiceComments;
    @Basic(optional = false)
    @Column(name = "PURCHASE_ORDER_NBR")
    private String purchaseOrderNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "GROSS_AMT")
    private BigDecimal grossAmt;
    @Basic(optional = false)
    @Column(name = "NET_AMT")
    private BigDecimal netAmt;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "VC_INVOICE_NBR")
    private String vcInvoiceNbr;
    @Basic(optional = false)
    @Column(name = "GL_ACCT")
    private String glAcct;
    @Basic(optional = false)
    @Column(name = "VENDOR_FAX_NBR")
    private String vendorFaxNbr;
    @Basic(optional = false)
    @Column(name = "MISC_1")
    private String misc1;
    @Basic(optional = false)
    @Column(name = "MISC_2")
    private String misc2;
    @Basic(optional = false)
    @Column(name = "MISC_3")
    private String misc3;
    @Basic(optional = false)
    @Column(name = "PMT_CRTD_IND")
    private Character pmtCrtdInd;
    @Basic(optional = false)
    @Column(name = "PMT_SENT_IND")
    private Character pmtSentInd;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "CARD_EXP_DT")
    @Temporal(TemporalType.DATE)
    private Date cardExpDt;
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
    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Basic(optional = false)
    @Column(name = "VENDOR_LOC_SUB_NBR")
    private String vendorLocSubNbr;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_HASH")
    private String crdNbrHash;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_TOKEN")
    private String crdNbrToken;
    @Basic(optional = false)
    @Column(name = "REMIT_TYPE_CD")
    private Character remitTypeCd;
    @Basic(optional = false)
    @Column(name = "PMT_METHOD_CD")
    private String pmtMethodCd;
    @Basic(optional = false)
    @Column(name = "TRANS_NBR")
    private int transNbr;
    @Basic(optional = false)
    @Column(name = "EXACT_AMT_FLG")
    private Character exactAmtFlg;
    @Basic(optional = false)
    @Column(name = "CRT_VC_BY_FLG")
    private Character crtVcByFlg;
    @Basic(optional = false)
    @Column(name = "VENDOR_ADDR1")
    private String vendorAddr1;
    @Basic(optional = false)
    @Column(name = "VENDOR_ADDR2")
    private String vendorAddr2;
    @Basic(optional = false)
    @Column(name = "VENDOR_CITY")
    private String vendorCity;
    @Basic(optional = false)
    @Column(name = "VENDOR_ST")
    private String vendorSt;
    @Basic(optional = false)
    @Column(name = "VENDOR_ZIP")
    private String vendorZip;
    @Basic(optional = false)
    @Column(name = "VENDOR_PHONE_NBR")
    private String vendorPhoneNbr;
    @Basic(optional = false)
    @Column(name = "PMT_SRC_TXT")
    private String pmtSrcTxt;
    @Basic(optional = false)
    @Column(name = "PMT_STAT_CD")
    private Character pmtStatCd;
    @Basic(optional = false)
    @Column(name = "RJCT_RSN")
    private String rjctRsn;
    @Basic(optional = false)
    @Column(name = "NTFY_TS_FLG")
    private Character ntfyTsFlg;
    @Basic(optional = false)
    @Column(name = "PAY4YOU_FLG")
    private Character pay4youFlg;
    @Basic(optional = false)
    @Column(name = "FEE_AMT")
    private BigDecimal feeAmt;
    @Basic(optional = false)
    @Column(name = "SET_TYP_CD")
    private Character setTypCd;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "FAX_SENT_IND")
    private Character faxSentInd;
    @Basic(optional = false)
    @Column(name = "PMT_PAID_IND")
    private Character pmtPaidInd;
    @Basic(optional = false)
    @Column(name = "VP_3RD_PARTY_ID")
    private String vp3rdPartyId;
    @Basic(optional = false)
    @Column(name = "PFY_SENT_FLG")
    private Character pfySentFlg;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_CTY")
    private String custBlngCty;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_ST")
    private String custBlngSt;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_ADDR_1")
    private String custSrvLocAddr1;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_CTY")
    private String custSrvLocCty;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_POST_CD")
    private String custSrvLocPostCd;
    @Basic(optional = false)
    @Column(name = "CUST_TAX_ID_LAST4")
    private String custTaxIdLast4;
    @Basic(optional = false)
    @Column(name = "VNDR_ACCT_NBR")
    private String vndrAcctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_ADDR_1")
    private String custBlngAddr1;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_ADDR_2")
    private String custBlngAddr2;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_POST_CD")
    private String custBlngPostCd;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_ADDR_2")
    private String custSrvLocAddr2;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_ST")
    private String custSrvLocSt;
    @Basic(optional = false)
    @Column(name = "CUST_PIN_AT_VNDR")
    private String custPinAtVndr;
    @Column(name = "FNDD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fnddTs;
    @Column(name = "PAYMENT_UDEF_1")
    private String paymentUdef1;
    @Column(name = "PAYMENT_UDEF_2")
    private String paymentUdef2;
    @Column(name = "PAYMENT_UDEF_3")
    private String paymentUdef3;
    @Column(name = "PAYMENT_UDEF_4")
    private String paymentUdef4;
    @Column(name = "PAYMENT_UDEF_5")
    private String paymentUdef5;
    @Basic(optional = false)
    @Column(name = "EFFECTIVE_FROM_DT")
    @Temporal(TemporalType.DATE)
    private Date effectiveFromDt;
    @Basic(optional = false)
    @Column(name = "EFFECTIVE_TO_DT")
    @Temporal(TemporalType.DATE)
    private Date effectiveToDt;
    @Basic(optional = false)
    @Column(name = "PAYMENT_ID")
    private String paymentId;
    @Column(name = "WS_USR_ID")
    private String wsUsrId;

    public VpVendorPayments() {
    }

    public VpVendorPayments(VpVendorPaymentsPK vpVendorPaymentsPK) {
        this.vpVendorPaymentsPK = vpVendorPaymentsPK;
    }

    public VpVendorPayments(VpVendorPaymentsPK vpVendorPaymentsPK, String codeword, String vendorNbr, String vendorName, String remitEmail, String remitEmail2, String invoiceNbr, Date invoiceDate, Date dueDate, Date paymentDate, String paymentNbr, String invoiceComments, String purchaseOrderNbr, BigDecimal grossAmt, BigDecimal netAmt, BigDecimal discAmt, String vcInvoiceNbr, String glAcct, String vendorFaxNbr, String misc1, String misc2, String misc3, Character pmtCrtdInd, Character pmtSentInd, String crdNbr, Date cardExpDt, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String responseCode, String vendorLocSubNbr, String crdNbrHash, String crdNbrToken, Character remitTypeCd, String pmtMethodCd, int transNbr, Character exactAmtFlg, Character crtVcByFlg, String vendorAddr1, String vendorAddr2, String vendorCity, String vendorSt, String vendorZip, String vendorPhoneNbr, String pmtSrcTxt, Character pmtStatCd, String rjctRsn, Character ntfyTsFlg, Character pay4youFlg, BigDecimal feeAmt, Character setTypCd, String taxId, Character faxSentInd, Character pmtPaidInd, String vp3rdPartyId, Character pfySentFlg, String custBlngCty, String custBlngSt, String custSrvLocAddr1, String custSrvLocCty, String custSrvLocPostCd, String custTaxIdLast4, String vndrAcctNbr, String custBlngAddr1, String custBlngAddr2, String custBlngPostCd, String custSrvLocAddr2, String custSrvLocSt, String custPinAtVndr, Date effectiveFromDt, Date effectiveToDt, String paymentId) {
        this.vpVendorPaymentsPK = vpVendorPaymentsPK;
        this.codeword = codeword;
        this.vendorNbr = vendorNbr;
        this.vendorName = vendorName;
        this.remitEmail = remitEmail;
        this.remitEmail2 = remitEmail2;
        this.invoiceNbr = invoiceNbr;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
        this.paymentNbr = paymentNbr;
        this.invoiceComments = invoiceComments;
        this.purchaseOrderNbr = purchaseOrderNbr;
        this.grossAmt = grossAmt;
        this.netAmt = netAmt;
        this.discAmt = discAmt;
        this.vcInvoiceNbr = vcInvoiceNbr;
        this.glAcct = glAcct;
        this.vendorFaxNbr = vendorFaxNbr;
        this.misc1 = misc1;
        this.misc2 = misc2;
        this.misc3 = misc3;
        this.pmtCrtdInd = pmtCrtdInd;
        this.pmtSentInd = pmtSentInd;
        this.crdNbr = crdNbr;
        this.cardExpDt = cardExpDt;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.responseCode = responseCode;
        this.vendorLocSubNbr = vendorLocSubNbr;
        this.crdNbrHash = crdNbrHash;
        this.crdNbrToken = crdNbrToken;
        this.remitTypeCd = remitTypeCd;
        this.pmtMethodCd = pmtMethodCd;
        this.transNbr = transNbr;
        this.exactAmtFlg = exactAmtFlg;
        this.crtVcByFlg = crtVcByFlg;
        this.vendorAddr1 = vendorAddr1;
        this.vendorAddr2 = vendorAddr2;
        this.vendorCity = vendorCity;
        this.vendorSt = vendorSt;
        this.vendorZip = vendorZip;
        this.vendorPhoneNbr = vendorPhoneNbr;
        this.pmtSrcTxt = pmtSrcTxt;
        this.pmtStatCd = pmtStatCd;
        this.rjctRsn = rjctRsn;
        this.ntfyTsFlg = ntfyTsFlg;
        this.pay4youFlg = pay4youFlg;
        this.feeAmt = feeAmt;
        this.setTypCd = setTypCd;
        this.taxId = taxId;
        this.faxSentInd = faxSentInd;
        this.pmtPaidInd = pmtPaidInd;
        this.vp3rdPartyId = vp3rdPartyId;
        this.pfySentFlg = pfySentFlg;
        this.custBlngCty = custBlngCty;
        this.custBlngSt = custBlngSt;
        this.custSrvLocAddr1 = custSrvLocAddr1;
        this.custSrvLocCty = custSrvLocCty;
        this.custSrvLocPostCd = custSrvLocPostCd;
        this.custTaxIdLast4 = custTaxIdLast4;
        this.vndrAcctNbr = vndrAcctNbr;
        this.custBlngAddr1 = custBlngAddr1;
        this.custBlngAddr2 = custBlngAddr2;
        this.custBlngPostCd = custBlngPostCd;
        this.custSrvLocAddr2 = custSrvLocAddr2;
        this.custSrvLocSt = custSrvLocSt;
        this.custPinAtVndr = custPinAtVndr;
        this.effectiveFromDt = effectiveFromDt;
        this.effectiveToDt = effectiveToDt;
        this.paymentId = paymentId;
    }

    public VpVendorPayments(String batchId, int batchSeqNbr, String accountNbr, String custId) {
        this.vpVendorPaymentsPK = new VpVendorPaymentsPK(batchId, batchSeqNbr, accountNbr, custId);
    }

    public VpVendorPaymentsPK getVpVendorPaymentsPK() {
        return vpVendorPaymentsPK;
    }

    public void setVpVendorPaymentsPK(VpVendorPaymentsPK vpVendorPaymentsPK) {
        this.vpVendorPaymentsPK = vpVendorPaymentsPK;
    }

    public String getCodeword() {
        return codeword;
    }

    public void setCodeword(String codeword) {
        this.codeword = codeword;
    }

    public String getVendorNbr() {
        return vendorNbr;
    }

    public void setVendorNbr(String vendorNbr) {
        this.vendorNbr = vendorNbr;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getRemitEmail() {
        return remitEmail;
    }

    public void setRemitEmail(String remitEmail) {
        this.remitEmail = remitEmail;
    }

    public String getRemitEmail2() {
        return remitEmail2;
    }

    public void setRemitEmail2(String remitEmail2) {
        this.remitEmail2 = remitEmail2;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentNbr() {
        return paymentNbr;
    }

    public void setPaymentNbr(String paymentNbr) {
        this.paymentNbr = paymentNbr;
    }

    public String getInvoiceComments() {
        return invoiceComments;
    }

    public void setInvoiceComments(String invoiceComments) {
        this.invoiceComments = invoiceComments;
    }

    public String getPurchaseOrderNbr() {
        return purchaseOrderNbr;
    }

    public void setPurchaseOrderNbr(String purchaseOrderNbr) {
        this.purchaseOrderNbr = purchaseOrderNbr;
    }

    public BigDecimal getGrossAmt() {
        return grossAmt;
    }

    public void setGrossAmt(BigDecimal grossAmt) {
        this.grossAmt = grossAmt;
    }

    public BigDecimal getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(BigDecimal netAmt) {
        this.netAmt = netAmt;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public String getVcInvoiceNbr() {
        return vcInvoiceNbr;
    }

    public void setVcInvoiceNbr(String vcInvoiceNbr) {
        this.vcInvoiceNbr = vcInvoiceNbr;
    }

    public String getGlAcct() {
        return glAcct;
    }

    public void setGlAcct(String glAcct) {
        this.glAcct = glAcct;
    }

    public String getVendorFaxNbr() {
        return vendorFaxNbr;
    }

    public void setVendorFaxNbr(String vendorFaxNbr) {
        this.vendorFaxNbr = vendorFaxNbr;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
    }

    public String getMisc3() {
        return misc3;
    }

    public void setMisc3(String misc3) {
        this.misc3 = misc3;
    }

    public Character getPmtCrtdInd() {
        return pmtCrtdInd;
    }

    public void setPmtCrtdInd(Character pmtCrtdInd) {
        this.pmtCrtdInd = pmtCrtdInd;
    }

    public Character getPmtSentInd() {
        return pmtSentInd;
    }

    public void setPmtSentInd(Character pmtSentInd) {
        this.pmtSentInd = pmtSentInd;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getCardExpDt() {
        return cardExpDt;
    }

    public void setCardExpDt(Date cardExpDt) {
        this.cardExpDt = cardExpDt;
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

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getVendorLocSubNbr() {
        return vendorLocSubNbr;
    }

    public void setVendorLocSubNbr(String vendorLocSubNbr) {
        this.vendorLocSubNbr = vendorLocSubNbr;
    }

    public String getCrdNbrHash() {
        return crdNbrHash;
    }

    public void setCrdNbrHash(String crdNbrHash) {
        this.crdNbrHash = crdNbrHash;
    }

    public String getCrdNbrToken() {
        return crdNbrToken;
    }

    public void setCrdNbrToken(String crdNbrToken) {
        this.crdNbrToken = crdNbrToken;
    }

    public Character getRemitTypeCd() {
        return remitTypeCd;
    }

    public void setRemitTypeCd(Character remitTypeCd) {
        this.remitTypeCd = remitTypeCd;
    }

    public String getPmtMethodCd() {
        return pmtMethodCd;
    }

    public void setPmtMethodCd(String pmtMethodCd) {
        this.pmtMethodCd = pmtMethodCd;
    }

    public int getTransNbr() {
        return transNbr;
    }

    public void setTransNbr(int transNbr) {
        this.transNbr = transNbr;
    }

    public Character getExactAmtFlg() {
        return exactAmtFlg;
    }

    public void setExactAmtFlg(Character exactAmtFlg) {
        this.exactAmtFlg = exactAmtFlg;
    }

    public Character getCrtVcByFlg() {
        return crtVcByFlg;
    }

    public void setCrtVcByFlg(Character crtVcByFlg) {
        this.crtVcByFlg = crtVcByFlg;
    }

    public String getVendorAddr1() {
        return vendorAddr1;
    }

    public void setVendorAddr1(String vendorAddr1) {
        this.vendorAddr1 = vendorAddr1;
    }

    public String getVendorAddr2() {
        return vendorAddr2;
    }

    public void setVendorAddr2(String vendorAddr2) {
        this.vendorAddr2 = vendorAddr2;
    }

    public String getVendorCity() {
        return vendorCity;
    }

    public void setVendorCity(String vendorCity) {
        this.vendorCity = vendorCity;
    }

    public String getVendorSt() {
        return vendorSt;
    }

    public void setVendorSt(String vendorSt) {
        this.vendorSt = vendorSt;
    }

    public String getVendorZip() {
        return vendorZip;
    }

    public void setVendorZip(String vendorZip) {
        this.vendorZip = vendorZip;
    }

    public String getVendorPhoneNbr() {
        return vendorPhoneNbr;
    }

    public void setVendorPhoneNbr(String vendorPhoneNbr) {
        this.vendorPhoneNbr = vendorPhoneNbr;
    }

    public String getPmtSrcTxt() {
        return pmtSrcTxt;
    }

    public void setPmtSrcTxt(String pmtSrcTxt) {
        this.pmtSrcTxt = pmtSrcTxt;
    }

    public Character getPmtStatCd() {
        return pmtStatCd;
    }

    public void setPmtStatCd(Character pmtStatCd) {
        this.pmtStatCd = pmtStatCd;
    }

    public String getRjctRsn() {
        return rjctRsn;
    }

    public void setRjctRsn(String rjctRsn) {
        this.rjctRsn = rjctRsn;
    }

    public Character getNtfyTsFlg() {
        return ntfyTsFlg;
    }

    public void setNtfyTsFlg(Character ntfyTsFlg) {
        this.ntfyTsFlg = ntfyTsFlg;
    }

    public Character getPay4youFlg() {
        return pay4youFlg;
    }

    public void setPay4youFlg(Character pay4youFlg) {
        this.pay4youFlg = pay4youFlg;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public Character getSetTypCd() {
        return setTypCd;
    }

    public void setSetTypCd(Character setTypCd) {
        this.setTypCd = setTypCd;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Character getFaxSentInd() {
        return faxSentInd;
    }

    public void setFaxSentInd(Character faxSentInd) {
        this.faxSentInd = faxSentInd;
    }

    public Character getPmtPaidInd() {
        return pmtPaidInd;
    }

    public void setPmtPaidInd(Character pmtPaidInd) {
        this.pmtPaidInd = pmtPaidInd;
    }

    public String getVp3rdPartyId() {
        return vp3rdPartyId;
    }

    public void setVp3rdPartyId(String vp3rdPartyId) {
        this.vp3rdPartyId = vp3rdPartyId;
    }

    public Character getPfySentFlg() {
        return pfySentFlg;
    }

    public void setPfySentFlg(Character pfySentFlg) {
        this.pfySentFlg = pfySentFlg;
    }

    public String getCustBlngCty() {
        return custBlngCty;
    }

    public void setCustBlngCty(String custBlngCty) {
        this.custBlngCty = custBlngCty;
    }

    public String getCustBlngSt() {
        return custBlngSt;
    }

    public void setCustBlngSt(String custBlngSt) {
        this.custBlngSt = custBlngSt;
    }

    public String getCustSrvLocAddr1() {
        return custSrvLocAddr1;
    }

    public void setCustSrvLocAddr1(String custSrvLocAddr1) {
        this.custSrvLocAddr1 = custSrvLocAddr1;
    }

    public String getCustSrvLocCty() {
        return custSrvLocCty;
    }

    public void setCustSrvLocCty(String custSrvLocCty) {
        this.custSrvLocCty = custSrvLocCty;
    }

    public String getCustSrvLocPostCd() {
        return custSrvLocPostCd;
    }

    public void setCustSrvLocPostCd(String custSrvLocPostCd) {
        this.custSrvLocPostCd = custSrvLocPostCd;
    }

    public String getCustTaxIdLast4() {
        return custTaxIdLast4;
    }

    public void setCustTaxIdLast4(String custTaxIdLast4) {
        this.custTaxIdLast4 = custTaxIdLast4;
    }

    public String getVndrAcctNbr() {
        return vndrAcctNbr;
    }

    public void setVndrAcctNbr(String vndrAcctNbr) {
        this.vndrAcctNbr = vndrAcctNbr;
    }

    public String getCustBlngAddr1() {
        return custBlngAddr1;
    }

    public void setCustBlngAddr1(String custBlngAddr1) {
        this.custBlngAddr1 = custBlngAddr1;
    }

    public String getCustBlngAddr2() {
        return custBlngAddr2;
    }

    public void setCustBlngAddr2(String custBlngAddr2) {
        this.custBlngAddr2 = custBlngAddr2;
    }

    public String getCustBlngPostCd() {
        return custBlngPostCd;
    }

    public void setCustBlngPostCd(String custBlngPostCd) {
        this.custBlngPostCd = custBlngPostCd;
    }

    public String getCustSrvLocAddr2() {
        return custSrvLocAddr2;
    }

    public void setCustSrvLocAddr2(String custSrvLocAddr2) {
        this.custSrvLocAddr2 = custSrvLocAddr2;
    }

    public String getCustSrvLocSt() {
        return custSrvLocSt;
    }

    public void setCustSrvLocSt(String custSrvLocSt) {
        this.custSrvLocSt = custSrvLocSt;
    }

    public String getCustPinAtVndr() {
        return custPinAtVndr;
    }

    public void setCustPinAtVndr(String custPinAtVndr) {
        this.custPinAtVndr = custPinAtVndr;
    }

    public Date getFnddTs() {
        return fnddTs;
    }

    public void setFnddTs(Date fnddTs) {
        this.fnddTs = fnddTs;
    }

    public String getPaymentUdef1() {
        return paymentUdef1;
    }

    public void setPaymentUdef1(String paymentUdef1) {
        this.paymentUdef1 = paymentUdef1;
    }

    public String getPaymentUdef2() {
        return paymentUdef2;
    }

    public void setPaymentUdef2(String paymentUdef2) {
        this.paymentUdef2 = paymentUdef2;
    }

    public String getPaymentUdef3() {
        return paymentUdef3;
    }

    public void setPaymentUdef3(String paymentUdef3) {
        this.paymentUdef3 = paymentUdef3;
    }

    public String getPaymentUdef4() {
        return paymentUdef4;
    }

    public void setPaymentUdef4(String paymentUdef4) {
        this.paymentUdef4 = paymentUdef4;
    }

    public String getPaymentUdef5() {
        return paymentUdef5;
    }

    public void setPaymentUdef5(String paymentUdef5) {
        this.paymentUdef5 = paymentUdef5;
    }

    public Date getEffectiveFromDt() {
        return effectiveFromDt;
    }

    public void setEffectiveFromDt(Date effectiveFromDt) {
        this.effectiveFromDt = effectiveFromDt;
    }

    public Date getEffectiveToDt() {
        return effectiveToDt;
    }

    public void setEffectiveToDt(Date effectiveToDt) {
        this.effectiveToDt = effectiveToDt;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getWsUsrId() {
        return wsUsrId;
    }

    public void setWsUsrId(String wsUsrId) {
        this.wsUsrId = wsUsrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpVendorPaymentsPK != null ? vpVendorPaymentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpVendorPayments)) {
            return false;
        }
        VpVendorPayments other = (VpVendorPayments) object;
        if ((this.vpVendorPaymentsPK == null && other.vpVendorPaymentsPK != null) || (this.vpVendorPaymentsPK != null && !this.vpVendorPaymentsPK.equals(other.vpVendorPaymentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendorPayments[ vpVendorPaymentsPK=" + vpVendorPaymentsPK + " ]";
    }
    
}
