package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "PRP_DTL_TAX", catalog = "", schema = "DBO")
public class PrpDtlTax implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrpDtlTaxPK prpDtlTaxPK;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_IND")
    private Character taxAmtInd;

    @Basic(optional = false)
    @Column(name = "TAX_SC_BC_AMT")
    private BigDecimal taxScBcAmt;
    @Basic(optional = false)
    @Column(name = "TAX_SC_BC_RT")
    private BigDecimal taxScBcRt;
    @Basic(optional = false)
    @Column(name = "TAX_BC_AMT")
    private BigDecimal taxBcAmt;
    @Basic(optional = false)
    @Column(name = "TAX_BC_RT")
    private BigDecimal taxBcRt;
    @Basic(optional = false)
    @Column(name = "TAX_RT_EXP")
    private short taxRtExp;
    @Basic(optional = false)
    @Column(name = "TAX_TYP_APP")
    private String taxTypApp;
    @Basic(optional = false)
    @Column(name = "TAX_TYP_ID")
    private String taxTypId;
    @Basic(optional = false)
    @Column(name = "CRD_ACCEPTANCE")
    private String crdAcceptance;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_SIGN")
    private Character taxAmtSign;
    @Basic(optional = false)
    @Column(name = "A_TAX_SC_BC_AMT")
    private BigDecimal aTaxScBcAmt;
    @Basic(optional = false)
    @Column(name = "A_TAX_SC_BC_RT")
    private BigDecimal aTaxScBcRt;
    @Basic(optional = false)
    @Column(name = "A_TAX_BC_AMT")
    private BigDecimal aTaxBcAmt;
    @Basic(optional = false)
    @Column(name = "A_TAX_BC_RT")
    private BigDecimal aTaxBcRt;
    @Basic(optional = false)
    @Column(name = "A_TAX_TYP_APP")
    private String aTaxTypApp;
    @Basic(optional = false)
    @Column(name = "A_TAX_TYP_ID")
    private String aTaxTypId;
    @Basic(optional = false)
    @Column(name = "TAX_AUTO_CAL_IND")
    private Character taxAutoCalInd;

    public PrpDtlTax() {
    }

    public PrpDtlTax(PrpDtlTaxPK prpDtlTaxPK) {
        this.prpDtlTaxPK = prpDtlTaxPK;
    }

    public PrpDtlTax(PrpDtlTaxPK prpDtlTaxPK, Character taxAmtInd, BigDecimal taxScBcAmt, BigDecimal taxScBcRt, BigDecimal taxBcAmt, BigDecimal taxBcRt, short taxRtExp, String taxTypApp, String taxTypId, String crdAcceptance, Character taxAmtSign, BigDecimal aTaxScBcAmt, BigDecimal aTaxScBcRt, BigDecimal aTaxBcAmt, BigDecimal aTaxBcRt, String aTaxTypApp, String aTaxTypId, Character taxAutoCalInd) {
        this.prpDtlTaxPK = prpDtlTaxPK;
        this.taxAmtInd = taxAmtInd;
        this.taxScBcAmt = taxScBcAmt;
        this.taxScBcRt = taxScBcRt;
        this.taxBcAmt = taxBcAmt;
        this.taxBcRt = taxBcRt;
        this.taxRtExp = taxRtExp;
        this.taxTypApp = taxTypApp;
        this.taxTypId = taxTypId;
        this.crdAcceptance = crdAcceptance;
        this.taxAmtSign = taxAmtSign;
        this.aTaxScBcAmt = aTaxScBcAmt;
        this.aTaxScBcRt = aTaxScBcRt;
        this.aTaxBcAmt = aTaxBcAmt;
        this.aTaxBcRt = aTaxBcRt;
        this.aTaxTypApp = aTaxTypApp;
        this.aTaxTypId = aTaxTypId;
        this.taxAutoCalInd = taxAutoCalInd;
    }

    public PrpDtlTax(int tranDt, int taxTranTm, int taxControlNbr, String taxPrdCd, short taxOccInd) {
        this.prpDtlTaxPK = new PrpDtlTaxPK(tranDt, taxTranTm, taxControlNbr, taxPrdCd, taxOccInd);
    }

    public PrpDtlTaxPK getPrpDtlTaxPK() {
        return prpDtlTaxPK;
    }

    public void setPrpDtlTaxPK(PrpDtlTaxPK prpDtlTaxPK) {
        this.prpDtlTaxPK = prpDtlTaxPK;
    }

    public Character getTaxAmtInd() {
        return taxAmtInd;
    }

    public void setTaxAmtInd(Character taxAmtInd) {
        this.taxAmtInd = taxAmtInd;
    }

    public BigDecimal getTaxScBcAmt() {
        return taxScBcAmt;
    }

    public void setTaxScBcAmt(BigDecimal taxScBcAmt) {
        this.taxScBcAmt = taxScBcAmt;
    }

    public BigDecimal getTaxScBcRt() {
        return taxScBcRt;
    }

    public void setTaxScBcRt(BigDecimal taxScBcRt) {
        this.taxScBcRt = taxScBcRt;
    }

    public BigDecimal getTaxBcAmt() {
        return taxBcAmt;
    }

    public void setTaxBcAmt(BigDecimal taxBcAmt) {
        this.taxBcAmt = taxBcAmt;
    }

    public BigDecimal getTaxBcRt() {
        return taxBcRt;
    }

    public void setTaxBcRt(BigDecimal taxBcRt) {
        this.taxBcRt = taxBcRt;
    }

    public short getTaxRtExp() {
        return taxRtExp;
    }

    public void setTaxRtExp(short taxRtExp) {
        this.taxRtExp = taxRtExp;
    }

    public String getTaxTypApp() {
        return taxTypApp;
    }

    public void setTaxTypApp(String taxTypApp) {
        this.taxTypApp = taxTypApp;
    }

    public String getTaxTypId() {
        return taxTypId;
    }

    public void setTaxTypId(String taxTypId) {
        this.taxTypId = taxTypId;
    }

    public String getCrdAcceptance() {
        return crdAcceptance;
    }

    public void setCrdAcceptance(String crdAcceptance) {
        this.crdAcceptance = crdAcceptance;
    }

    public Character getTaxAmtSign() {
        return taxAmtSign;
    }

    public void setTaxAmtSign(Character taxAmtSign) {
        this.taxAmtSign = taxAmtSign;
    }

    public BigDecimal getATaxScBcAmt() {
        return aTaxScBcAmt;
    }

    public void setATaxScBcAmt(BigDecimal aTaxScBcAmt) {
        this.aTaxScBcAmt = aTaxScBcAmt;
    }

    public BigDecimal getATaxScBcRt() {
        return aTaxScBcRt;
    }

    public void setATaxScBcRt(BigDecimal aTaxScBcRt) {
        this.aTaxScBcRt = aTaxScBcRt;
    }

    public BigDecimal getATaxBcAmt() {
        return aTaxBcAmt;
    }

    public void setATaxBcAmt(BigDecimal aTaxBcAmt) {
        this.aTaxBcAmt = aTaxBcAmt;
    }

    public BigDecimal getATaxBcRt() {
        return aTaxBcRt;
    }

    public void setATaxBcRt(BigDecimal aTaxBcRt) {
        this.aTaxBcRt = aTaxBcRt;
    }

    public String getATaxTypApp() {
        return aTaxTypApp;
    }

    public void setATaxTypApp(String aTaxTypApp) {
        this.aTaxTypApp = aTaxTypApp;
    }

    public String getATaxTypId() {
        return aTaxTypId;
    }

    public void setATaxTypId(String aTaxTypId) {
        this.aTaxTypId = aTaxTypId;
    }

    public Character getTaxAutoCalInd() {
        return taxAutoCalInd;
    }

    public void setTaxAutoCalInd(Character taxAutoCalInd) {
        this.taxAutoCalInd = taxAutoCalInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prpDtlTaxPK != null ? prpDtlTaxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrpDtlTax)) {
            return false;
        }
        PrpDtlTax other = (PrpDtlTax) object;
        if ((this.prpDtlTaxPK == null && other.prpDtlTaxPK != null) || (this.prpDtlTaxPK != null && !this.prpDtlTaxPK.equals(other.prpDtlTaxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpDtlTax[ prpDtlTaxPK=" + prpDtlTaxPK + " ]";
    }

}
