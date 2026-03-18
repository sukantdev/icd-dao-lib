package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_DTL_TAX", catalog = "", schema = "CXXCOW")
public class McDtlTax implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McDtlTaxPK mcDtlTaxPK;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_ID")
    private Character taxAmtId;

    @Basic(optional = false)
    @Column(name = "TAX_AMT")
    private BigDecimal taxAmt;
    @Basic(optional = false)
    @Column(name = "TAX_RT")
    private BigDecimal taxRt;
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
    @Column(name = "A_TAX_AMT")
    private BigDecimal aTaxAmt;
    @Basic(optional = false)
    @Column(name = "A_TAX_RT")
    private BigDecimal aTaxRt;
    @Basic(optional = false)
    @Column(name = "A_TAX_TYP_APP")
    private String aTaxTypApp;
    @Basic(optional = false)
    @Column(name = "A_TAX_TYP_ID")
    private String aTaxTypId;
    @Basic(optional = false)
    @Column(name = "DTL_TAX_ADDED")
    private Character dtlTaxAdded;

    public McDtlTax() {
    }

    public McDtlTax(McDtlTaxPK mcDtlTaxPK) {
        this.mcDtlTaxPK = mcDtlTaxPK;
    }

    public McDtlTax(McDtlTaxPK mcDtlTaxPK, Character taxAmtId, BigDecimal taxAmt, BigDecimal taxRt, short taxRtExp, String taxTypApp, String taxTypId, String crdAcceptance, Character taxAmtSign, BigDecimal aTaxAmt, BigDecimal aTaxRt, String aTaxTypApp, String aTaxTypId, Character dtlTaxAdded) {
        this.mcDtlTaxPK = mcDtlTaxPK;
        this.taxAmtId = taxAmtId;
        this.taxAmt = taxAmt;
        this.taxRt = taxRt;
        this.taxRtExp = taxRtExp;
        this.taxTypApp = taxTypApp;
        this.taxTypId = taxTypId;
        this.crdAcceptance = crdAcceptance;
        this.taxAmtSign = taxAmtSign;
        this.aTaxAmt = aTaxAmt;
        this.aTaxRt = aTaxRt;
        this.aTaxTypApp = aTaxTypApp;
        this.aTaxTypId = aTaxTypId;
        this.dtlTaxAdded = dtlTaxAdded;
    }

    public McDtlTax(String taxAmtTs, short taxAmtOccInd, String parentTable) {
        this.mcDtlTaxPK = new McDtlTaxPK(taxAmtTs, taxAmtOccInd, parentTable);
    }

    public McDtlTaxPK getMcDtlTaxPK() {
        return mcDtlTaxPK;
    }

    public void setMcDtlTaxPK(McDtlTaxPK mcDtlTaxPK) {
        this.mcDtlTaxPK = mcDtlTaxPK;
    }

    public Character getTaxAmtId() {
        return taxAmtId;
    }

    public void setTaxAmtId(Character taxAmtId) {
        this.taxAmtId = taxAmtId;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public BigDecimal getTaxRt() {
        return taxRt;
    }

    public void setTaxRt(BigDecimal taxRt) {
        this.taxRt = taxRt;
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

    public BigDecimal getATaxAmt() {
        return aTaxAmt;
    }

    public void setATaxAmt(BigDecimal aTaxAmt) {
        this.aTaxAmt = aTaxAmt;
    }

    public BigDecimal getATaxRt() {
        return aTaxRt;
    }

    public void setATaxRt(BigDecimal aTaxRt) {
        this.aTaxRt = aTaxRt;
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

    public Character getDtlTaxAdded() {
        return dtlTaxAdded;
    }

    public void setDtlTaxAdded(Character dtlTaxAdded) {
        this.dtlTaxAdded = dtlTaxAdded;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcDtlTaxPK != null ? mcDtlTaxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McDtlTax)) {
            return false;
        }
        McDtlTax other = (McDtlTax) object;
        if ((this.mcDtlTaxPK == null && other.mcDtlTaxPK != null) || (this.mcDtlTaxPK != null && !this.mcDtlTaxPK.equals(other.mcDtlTaxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McDtlTax[ mcDtlTaxPK=" + mcDtlTaxPK + " ]";
    }

}
