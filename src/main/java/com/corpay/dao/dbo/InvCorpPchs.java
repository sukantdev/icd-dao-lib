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
@Table(name = "INV_CORP_PCHS", catalog = "", schema = "DBO")
public class InvCorpPchs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvCorpPchsPK invCorpPchsPK;
    @Basic(optional = false)
    @Column(name = "CORP_PUCH_CR_OR_DB")
    private Character corpPuchCrOrDb;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "CUST_CD")
    private String custCd;
    @Basic(optional = false)
    @Column(name = "MRCH_TYP")
    private String mrchTyp;
    @Basic(optional = false)
    @Column(name = "MRCH_TAX_ID")
    private String mrchTaxId;

    @Basic(optional = false)
    @Column(name = "TAX_AMT")
    private BigDecimal taxAmt;
    @Basic(optional = false)
    @Column(name = "TAX_CLTD_IND")
    private Character taxCltdInd;
    @Basic(optional = false)
    @Column(name = "CRPN_VAT_NBR")
    private String crpnVatNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_REF_NBR")
    private String mrchRefNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_AMT")
    private BigDecimal trnsAmt;
    @Basic(optional = false)
    @Column(name = "DUTY_AMT")
    private BigDecimal dutyAmt;
    @Basic(optional = false)
    @Column(name = "DEST_POST_CD")
    private String destPostCd;
    @Basic(optional = false)
    @Column(name = "DEST_ST_CD")
    private String destStCd;
    @Basic(optional = false)
    @Column(name = "DEST_CRTY_CD")
    private String destCrtyCd;
    @Basic(optional = false)
    @Column(name = "ALT_TAX_INCL_IND")
    private Character altTaxInclInd;
    @Basic(optional = false)
    @Column(name = "ALT_TAX_AMT")
    private BigDecimal altTaxAmt;
    @Basic(optional = false)
    @Column(name = "SHIP_FROM_POST_CD")
    private String shipFromPostCd;
    @Basic(optional = false)
    @Column(name = "ORDER_DT")
    @Temporal(TemporalType.DATE)
    private Date orderDt;
    @Basic(optional = false)
    @Column(name = "MRCH_VAT_NBR")
    private String mrchVatNbr;
    @Basic(optional = false)
    @Column(name = "CUST_VAT_NBR")
    private String custVatNbr;
    @Basic(optional = false)
    @Column(name = "COM_CD")
    private String comCd;
    @Basic(optional = false)
    @Column(name = "TAX_EXPT_IND")
    private Character taxExptInd;
    @Basic(optional = false)
    @Column(name = "TAX_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taxTs;
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
    @Column(name = "ADCRD_ACPT_IN")
    private String adcrdAcptIn;
    @Basic(optional = false)
    @Column(name = "ATETRA_NBR")
    private String atetraNbr;
    @Basic(optional = false)
    @Column(name = "NAICS_CD")
    private String naicsCd;
    @Basic(optional = false)
    @Column(name = "UNIQUE_INV")
    private String uniqueInv;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "DISC_AMT_SI")
    private Character discAmtSi;
    @Basic(optional = false)
    @Column(name = "DISC_TP")
    private String discTp;
    @Basic(optional = false)
    @Column(name = "DEBIT_CREDIT")
    private Character debitCredit;
    @Basic(optional = false)
    @Column(name = "BILLING_TYPE")
    private Character billingType;
    @Basic(optional = false)
    @Column(name = "AUTH_CON_NM")
    private String authConNm;
    @Basic(optional = false)
    @Column(name = "AUTH_CON_PH")
    private String authConPh;
    @Basic(optional = false)
    @Column(name = "CRD_ACP_EMAIL")
    private String crdAcpEmail;
    @Basic(optional = false)
    @Column(name = "MRCH_TAX_ID_PROVIDED_CD")
    private Character mrchTaxIdProvidedCd;

    public InvCorpPchs() {
    }

    public InvCorpPchs(InvCorpPchsPK invCorpPchsPK) {
        this.invCorpPchsPK = invCorpPchsPK;
    }

    public InvCorpPchs(InvCorpPchsPK invCorpPchsPK, Character corpPuchCrOrDb, Character blngTyp, String custCd, String mrchTyp, String mrchTaxId, BigDecimal taxAmt, Character taxCltdInd, String crpnVatNbr, String mrchRefNbr, BigDecimal trnsAmt, BigDecimal dutyAmt, String destPostCd, String destStCd, String destCrtyCd, Character altTaxInclInd, BigDecimal altTaxAmt, String shipFromPostCd, Date orderDt, String mrchVatNbr, String custVatNbr, String comCd, Character taxExptInd, Date taxTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String adcrdAcptIn, String atetraNbr, String naicsCd, String uniqueInv, BigDecimal discAmt, Character discAmtSi, String discTp, Character debitCredit, Character billingType, String authConNm, String authConPh, String crdAcpEmail, Character mrchTaxIdProvidedCd) {
        this.invCorpPchsPK = invCorpPchsPK;
        this.corpPuchCrOrDb = corpPuchCrOrDb;
        this.blngTyp = blngTyp;
        this.custCd = custCd;
        this.mrchTyp = mrchTyp;
        this.mrchTaxId = mrchTaxId;
        this.taxAmt = taxAmt;
        this.taxCltdInd = taxCltdInd;
        this.crpnVatNbr = crpnVatNbr;
        this.mrchRefNbr = mrchRefNbr;
        this.trnsAmt = trnsAmt;
        this.dutyAmt = dutyAmt;
        this.destPostCd = destPostCd;
        this.destStCd = destStCd;
        this.destCrtyCd = destCrtyCd;
        this.altTaxInclInd = altTaxInclInd;
        this.altTaxAmt = altTaxAmt;
        this.shipFromPostCd = shipFromPostCd;
        this.orderDt = orderDt;
        this.mrchVatNbr = mrchVatNbr;
        this.custVatNbr = custVatNbr;
        this.comCd = comCd;
        this.taxExptInd = taxExptInd;
        this.taxTs = taxTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.adcrdAcptIn = adcrdAcptIn;
        this.atetraNbr = atetraNbr;
        this.naicsCd = naicsCd;
        this.uniqueInv = uniqueInv;
        this.discAmt = discAmt;
        this.discAmtSi = discAmtSi;
        this.discTp = discTp;
        this.debitCredit = debitCredit;
        this.billingType = billingType;
        this.authConNm = authConNm;
        this.authConPh = authConPh;
        this.crdAcpEmail = crdAcpEmail;
        this.mrchTaxIdProvidedCd = mrchTaxIdProvidedCd;
    }

    public InvCorpPchs(Date pstdDt, int trnsId) {
        this.invCorpPchsPK = new InvCorpPchsPK(pstdDt, trnsId);
    }

    public InvCorpPchsPK getInvCorpPchsPK() {
        return invCorpPchsPK;
    }

    public void setInvCorpPchsPK(InvCorpPchsPK invCorpPchsPK) {
        this.invCorpPchsPK = invCorpPchsPK;
    }

    public Character getCorpPuchCrOrDb() {
        return corpPuchCrOrDb;
    }

    public void setCorpPuchCrOrDb(Character corpPuchCrOrDb) {
        this.corpPuchCrOrDb = corpPuchCrOrDb;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd;
    }

    public String getMrchTyp() {
        return mrchTyp;
    }

    public void setMrchTyp(String mrchTyp) {
        this.mrchTyp = mrchTyp;
    }

    public String getMrchTaxId() {
        return mrchTaxId;
    }

    public void setMrchTaxId(String mrchTaxId) {
        this.mrchTaxId = mrchTaxId;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Character getTaxCltdInd() {
        return taxCltdInd;
    }

    public void setTaxCltdInd(Character taxCltdInd) {
        this.taxCltdInd = taxCltdInd;
    }

    public String getCrpnVatNbr() {
        return crpnVatNbr;
    }

    public void setCrpnVatNbr(String crpnVatNbr) {
        this.crpnVatNbr = crpnVatNbr;
    }

    public String getMrchRefNbr() {
        return mrchRefNbr;
    }

    public void setMrchRefNbr(String mrchRefNbr) {
        this.mrchRefNbr = mrchRefNbr;
    }

    public BigDecimal getTrnsAmt() {
        return trnsAmt;
    }

    public void setTrnsAmt(BigDecimal trnsAmt) {
        this.trnsAmt = trnsAmt;
    }

    public BigDecimal getDutyAmt() {
        return dutyAmt;
    }

    public void setDutyAmt(BigDecimal dutyAmt) {
        this.dutyAmt = dutyAmt;
    }

    public String getDestPostCd() {
        return destPostCd;
    }

    public void setDestPostCd(String destPostCd) {
        this.destPostCd = destPostCd;
    }

    public String getDestStCd() {
        return destStCd;
    }

    public void setDestStCd(String destStCd) {
        this.destStCd = destStCd;
    }

    public String getDestCrtyCd() {
        return destCrtyCd;
    }

    public void setDestCrtyCd(String destCrtyCd) {
        this.destCrtyCd = destCrtyCd;
    }

    public Character getAltTaxInclInd() {
        return altTaxInclInd;
    }

    public void setAltTaxInclInd(Character altTaxInclInd) {
        this.altTaxInclInd = altTaxInclInd;
    }

    public BigDecimal getAltTaxAmt() {
        return altTaxAmt;
    }

    public void setAltTaxAmt(BigDecimal altTaxAmt) {
        this.altTaxAmt = altTaxAmt;
    }

    public String getShipFromPostCd() {
        return shipFromPostCd;
    }

    public void setShipFromPostCd(String shipFromPostCd) {
        this.shipFromPostCd = shipFromPostCd;
    }

    public Date getOrderDt() {
        return orderDt;
    }

    public void setOrderDt(Date orderDt) {
        this.orderDt = orderDt;
    }

    public String getMrchVatNbr() {
        return mrchVatNbr;
    }

    public void setMrchVatNbr(String mrchVatNbr) {
        this.mrchVatNbr = mrchVatNbr;
    }

    public String getCustVatNbr() {
        return custVatNbr;
    }

    public void setCustVatNbr(String custVatNbr) {
        this.custVatNbr = custVatNbr;
    }

    public String getComCd() {
        return comCd;
    }

    public void setComCd(String comCd) {
        this.comCd = comCd;
    }

    public Character getTaxExptInd() {
        return taxExptInd;
    }

    public void setTaxExptInd(Character taxExptInd) {
        this.taxExptInd = taxExptInd;
    }

    public Date getTaxTs() {
        return taxTs;
    }

    public void setTaxTs(Date taxTs) {
        this.taxTs = taxTs;
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

    public String getAdcrdAcptIn() {
        return adcrdAcptIn;
    }

    public void setAdcrdAcptIn(String adcrdAcptIn) {
        this.adcrdAcptIn = adcrdAcptIn;
    }

    public String getAtetraNbr() {
        return atetraNbr;
    }

    public void setAtetraNbr(String atetraNbr) {
        this.atetraNbr = atetraNbr;
    }

    public String getNaicsCd() {
        return naicsCd;
    }

    public void setNaicsCd(String naicsCd) {
        this.naicsCd = naicsCd;
    }

    public String getUniqueInv() {
        return uniqueInv;
    }

    public void setUniqueInv(String uniqueInv) {
        this.uniqueInv = uniqueInv;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public Character getDiscAmtSi() {
        return discAmtSi;
    }

    public void setDiscAmtSi(Character discAmtSi) {
        this.discAmtSi = discAmtSi;
    }

    public String getDiscTp() {
        return discTp;
    }

    public void setDiscTp(String discTp) {
        this.discTp = discTp;
    }

    public Character getDebitCredit() {
        return debitCredit;
    }

    public void setDebitCredit(Character debitCredit) {
        this.debitCredit = debitCredit;
    }

    public Character getBillingType() {
        return billingType;
    }

    public void setBillingType(Character billingType) {
        this.billingType = billingType;
    }

    public String getAuthConNm() {
        return authConNm;
    }

    public void setAuthConNm(String authConNm) {
        this.authConNm = authConNm;
    }

    public String getAuthConPh() {
        return authConPh;
    }

    public void setAuthConPh(String authConPh) {
        this.authConPh = authConPh;
    }

    public String getCrdAcpEmail() {
        return crdAcpEmail;
    }

    public void setCrdAcpEmail(String crdAcpEmail) {
        this.crdAcpEmail = crdAcpEmail;
    }

    public Character getMrchTaxIdProvidedCd() {
        return mrchTaxIdProvidedCd;
    }

    public void setMrchTaxIdProvidedCd(Character mrchTaxIdProvidedCd) {
        this.mrchTaxIdProvidedCd = mrchTaxIdProvidedCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invCorpPchsPK != null ? invCorpPchsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvCorpPchs)) {
            return false;
        }
        InvCorpPchs other = (InvCorpPchs) object;
        if ((this.invCorpPchsPK == null && other.invCorpPchsPK != null) || (this.invCorpPchsPK != null && !this.invCorpPchsPK.equals(other.invCorpPchsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvCorpPchs[ invCorpPchsPK=" + invCorpPchsPK + " ]";
    }

}
