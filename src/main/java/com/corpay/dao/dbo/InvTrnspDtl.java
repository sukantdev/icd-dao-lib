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
@Table(name = "INV_TRNSP_DTL", catalog = "", schema = "DBO")
public class InvTrnspDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvTrnspDtlPK invTrnspDtlPK;
    @Basic(optional = false)
    @Column(name = "CR_OR_DB_CD")
    private Character crOrDbCd;
    @Basic(optional = false)
    @Column(name = "PURCHASE_DT")
    @Temporal(TemporalType.DATE)
    private Date purchaseDt;
    @Basic(optional = false)
    @Column(name = "CUST_CD")
    private String custCd;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "PRD_CD_QUAL_CD")
    private String prdCdQualCd;
    @Basic(optional = false)
    @Column(name = "PRD_DESC")
    private String prdDesc;

    @Basic(optional = false)
    @Column(name = "PRD_QTY_AMT")
    private BigDecimal prdQtyAmt;
    @Basic(optional = false)
    @Column(name = "UNIT_OF_MSR_CD")
    private String unitOfMsrCd;
    @Basic(optional = false)
    @Column(name = "PRD_PRC_AMT")
    private BigDecimal prdPrcAmt;
    @Basic(optional = false)
    @Column(name = "GRS_TOT_CST_AMT")
    private BigDecimal grsTotCstAmt;
    @Basic(optional = false)
    @Column(name = "DISC_IND_CD")
    private Character discIndCd;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "ITM_DISC_RT_AMT")
    private BigDecimal itmDiscRtAmt;
    @Basic(optional = false)
    @Column(name = "COM_CD")
    private String comCd;
    @Basic(optional = false)
    @Column(name = "TOT_TAX_AMT")
    private BigDecimal totTaxAmt;
    @Basic(optional = false)
    @Column(name = "SUPPLY_TYP_NBR")
    private short supplyTypNbr;
    @Basic(optional = false)
    @Column(name = "TAX_EXEMPT_IND")
    private Character taxExemptInd;
    @Basic(optional = false)
    @Column(name = "VAT_INVOICE_NBR")
    private String vatInvoiceNbr;
    @Basic(optional = false)
    @Column(name = "TOT_LINE_AMT")
    private BigDecimal totLineAmt;
    @Basic(optional = false)
    @Column(name = "PO_LINE_NBR")
    private short poLineNbr;
    @Basic(optional = false)
    @Column(name = "SPEC_COND_TXT")
    private String specCondTxt;
    @Basic(optional = false)
    @Column(name = "GENERAL_TEXT")
    private String generalText;
    @Basic(optional = false)
    @Column(name = "ZERO_COST_CD")
    private Character zeroCostCd;
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

    public InvTrnspDtl() {
    }

    public InvTrnspDtl(InvTrnspDtlPK invTrnspDtlPK) {
        this.invTrnspDtlPK = invTrnspDtlPK;
    }

    public InvTrnspDtl(InvTrnspDtlPK invTrnspDtlPK, Character crOrDbCd, Date purchaseDt, String custCd, String prdCd, String prdCdQualCd, String prdDesc, BigDecimal prdQtyAmt, String unitOfMsrCd, BigDecimal prdPrcAmt, BigDecimal grsTotCstAmt, Character discIndCd, BigDecimal discAmt, BigDecimal itmDiscRtAmt, String comCd, BigDecimal totTaxAmt, short supplyTypNbr, Character taxExemptInd, String vatInvoiceNbr, BigDecimal totLineAmt, short poLineNbr, String specCondTxt, String generalText, Character zeroCostCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invTrnspDtlPK = invTrnspDtlPK;
        this.crOrDbCd = crOrDbCd;
        this.purchaseDt = purchaseDt;
        this.custCd = custCd;
        this.prdCd = prdCd;
        this.prdCdQualCd = prdCdQualCd;
        this.prdDesc = prdDesc;
        this.prdQtyAmt = prdQtyAmt;
        this.unitOfMsrCd = unitOfMsrCd;
        this.prdPrcAmt = prdPrcAmt;
        this.grsTotCstAmt = grsTotCstAmt;
        this.discIndCd = discIndCd;
        this.discAmt = discAmt;
        this.itmDiscRtAmt = itmDiscRtAmt;
        this.comCd = comCd;
        this.totTaxAmt = totTaxAmt;
        this.supplyTypNbr = supplyTypNbr;
        this.taxExemptInd = taxExemptInd;
        this.vatInvoiceNbr = vatInvoiceNbr;
        this.totLineAmt = totLineAmt;
        this.poLineNbr = poLineNbr;
        this.specCondTxt = specCondTxt;
        this.generalText = generalText;
        this.zeroCostCd = zeroCostCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvTrnspDtl(Date pstdDt, int trnsId, int seqNbr) {
        this.invTrnspDtlPK = new InvTrnspDtlPK(pstdDt, trnsId, seqNbr);
    }

    public InvTrnspDtlPK getInvTrnspDtlPK() {
        return invTrnspDtlPK;
    }

    public void setInvTrnspDtlPK(InvTrnspDtlPK invTrnspDtlPK) {
        this.invTrnspDtlPK = invTrnspDtlPK;
    }

    public Character getCrOrDbCd() {
        return crOrDbCd;
    }

    public void setCrOrDbCd(Character crOrDbCd) {
        this.crOrDbCd = crOrDbCd;
    }

    public Date getPurchaseDt() {
        return purchaseDt;
    }

    public void setPurchaseDt(Date purchaseDt) {
        this.purchaseDt = purchaseDt;
    }

    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public String getPrdCdQualCd() {
        return prdCdQualCd;
    }

    public void setPrdCdQualCd(String prdCdQualCd) {
        this.prdCdQualCd = prdCdQualCd;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public BigDecimal getPrdQtyAmt() {
        return prdQtyAmt;
    }

    public void setPrdQtyAmt(BigDecimal prdQtyAmt) {
        this.prdQtyAmt = prdQtyAmt;
    }

    public String getUnitOfMsrCd() {
        return unitOfMsrCd;
    }

    public void setUnitOfMsrCd(String unitOfMsrCd) {
        this.unitOfMsrCd = unitOfMsrCd;
    }

    public BigDecimal getPrdPrcAmt() {
        return prdPrcAmt;
    }

    public void setPrdPrcAmt(BigDecimal prdPrcAmt) {
        this.prdPrcAmt = prdPrcAmt;
    }

    public BigDecimal getGrsTotCstAmt() {
        return grsTotCstAmt;
    }

    public void setGrsTotCstAmt(BigDecimal grsTotCstAmt) {
        this.grsTotCstAmt = grsTotCstAmt;
    }

    public Character getDiscIndCd() {
        return discIndCd;
    }

    public void setDiscIndCd(Character discIndCd) {
        this.discIndCd = discIndCd;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public BigDecimal getItmDiscRtAmt() {
        return itmDiscRtAmt;
    }

    public void setItmDiscRtAmt(BigDecimal itmDiscRtAmt) {
        this.itmDiscRtAmt = itmDiscRtAmt;
    }

    public String getComCd() {
        return comCd;
    }

    public void setComCd(String comCd) {
        this.comCd = comCd;
    }

    public BigDecimal getTotTaxAmt() {
        return totTaxAmt;
    }

    public void setTotTaxAmt(BigDecimal totTaxAmt) {
        this.totTaxAmt = totTaxAmt;
    }

    public short getSupplyTypNbr() {
        return supplyTypNbr;
    }

    public void setSupplyTypNbr(short supplyTypNbr) {
        this.supplyTypNbr = supplyTypNbr;
    }

    public Character getTaxExemptInd() {
        return taxExemptInd;
    }

    public void setTaxExemptInd(Character taxExemptInd) {
        this.taxExemptInd = taxExemptInd;
    }

    public String getVatInvoiceNbr() {
        return vatInvoiceNbr;
    }

    public void setVatInvoiceNbr(String vatInvoiceNbr) {
        this.vatInvoiceNbr = vatInvoiceNbr;
    }

    public BigDecimal getTotLineAmt() {
        return totLineAmt;
    }

    public void setTotLineAmt(BigDecimal totLineAmt) {
        this.totLineAmt = totLineAmt;
    }

    public short getPoLineNbr() {
        return poLineNbr;
    }

    public void setPoLineNbr(short poLineNbr) {
        this.poLineNbr = poLineNbr;
    }

    public String getSpecCondTxt() {
        return specCondTxt;
    }

    public void setSpecCondTxt(String specCondTxt) {
        this.specCondTxt = specCondTxt;
    }

    public String getGeneralText() {
        return generalText;
    }

    public void setGeneralText(String generalText) {
        this.generalText = generalText;
    }

    public Character getZeroCostCd() {
        return zeroCostCd;
    }

    public void setZeroCostCd(Character zeroCostCd) {
        this.zeroCostCd = zeroCostCd;
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
        hash += (invTrnspDtlPK != null ? invTrnspDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvTrnspDtl)) {
            return false;
        }
        InvTrnspDtl other = (InvTrnspDtl) object;
        if ((this.invTrnspDtlPK == null && other.invTrnspDtlPK != null) || (this.invTrnspDtlPK != null && !this.invTrnspDtlPK.equals(other.invTrnspDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvTrnspDtl[ invTrnspDtlPK=" + invTrnspDtlPK + " ]";
    }

}
