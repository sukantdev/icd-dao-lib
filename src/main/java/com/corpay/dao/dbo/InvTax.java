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
@Table(name = "INV_TAX", catalog = "", schema = "DBO")
public class InvTax implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvTaxPK invTaxPK;
    @Basic(optional = false)
    @Column(name = "TAX_INCL_IND")
    private Character taxInclInd;

    @Basic(optional = false)
    @Column(name = "TAX_RT_APPLIED")
    private BigDecimal taxRtApplied;
    @Basic(optional = false)
    @Column(name = "TAX_AMT")
    private BigDecimal taxAmt;
    @Basic(optional = false)
    @Column(name = "TAX_TYP_ID")
    private String taxTypId;
    @Basic(optional = false)
    @Column(name = "CRD_ACPTR_TAX_ID")
    private String crdAcptrTaxId;
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
    @Column(name = "TAX_AMT_SIGN")
    private Character taxAmtSign;

    public InvTax() {
    }

    public InvTax(InvTaxPK invTaxPK) {
        this.invTaxPK = invTaxPK;
    }

    public InvTax(InvTaxPK invTaxPK, Character taxInclInd, BigDecimal taxRtApplied, BigDecimal taxAmt, String taxTypId, String crdAcptrTaxId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character taxAmtSign) {
        this.invTaxPK = invTaxPK;
        this.taxInclInd = taxInclInd;
        this.taxRtApplied = taxRtApplied;
        this.taxAmt = taxAmt;
        this.taxTypId = taxTypId;
        this.crdAcptrTaxId = crdAcptrTaxId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.taxAmtSign = taxAmtSign;
    }

    public InvTax(Date taxTs, String taxPrdTyp, short taxSeqNbr) {
        this.invTaxPK = new InvTaxPK(taxTs, taxPrdTyp, taxSeqNbr);
    }

    public InvTaxPK getInvTaxPK() {
        return invTaxPK;
    }

    public void setInvTaxPK(InvTaxPK invTaxPK) {
        this.invTaxPK = invTaxPK;
    }

    public Character getTaxInclInd() {
        return taxInclInd;
    }

    public void setTaxInclInd(Character taxInclInd) {
        this.taxInclInd = taxInclInd;
    }

    public BigDecimal getTaxRtApplied() {
        return taxRtApplied;
    }

    public void setTaxRtApplied(BigDecimal taxRtApplied) {
        this.taxRtApplied = taxRtApplied;
    }

    public BigDecimal getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(BigDecimal taxAmt) {
        this.taxAmt = taxAmt;
    }

    public String getTaxTypId() {
        return taxTypId;
    }

    public void setTaxTypId(String taxTypId) {
        this.taxTypId = taxTypId;
    }

    public String getCrdAcptrTaxId() {
        return crdAcptrTaxId;
    }

    public void setCrdAcptrTaxId(String crdAcptrTaxId) {
        this.crdAcptrTaxId = crdAcptrTaxId;
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

    public Character getTaxAmtSign() {
        return taxAmtSign;
    }

    public void setTaxAmtSign(Character taxAmtSign) {
        this.taxAmtSign = taxAmtSign;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invTaxPK != null ? invTaxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvTax)) {
            return false;
        }
        InvTax other = (InvTax) object;
        if ((this.invTaxPK == null && other.invTaxPK != null) || (this.invTaxPK != null && !this.invTaxPK.equals(other.invTaxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvTax[ invTaxPK=" + invTaxPK + " ]";
    }

}
