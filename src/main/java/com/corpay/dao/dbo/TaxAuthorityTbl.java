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
@Table(name = "TAX_AUTHORITY_TBL", catalog = "", schema = "DBO")
public class TaxAuthorityTbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAX_AUTHORITY_ID")
    private Integer taxAuthorityId;
    @Basic(optional = false)
    @Column(name = "TAX_AUTHORITY_DESC")
    private String taxAuthorityDesc;
    @Basic(optional = false)
    @Column(name = "TAX_AUTHORITY_TYP")
    private String taxAuthorityTyp;
    @Basic(optional = false)
    @Column(name = "TAX_RULE_ID")
    private int taxRuleId;
    @Basic(optional = false)
    @Column(name = "PROCESS_SEQ")
    private int processSeq;
    @Basic(optional = false)
    @Column(name = "EXEMPT_ID")
    private int exemptId;
    @Basic(optional = false)
    @Column(name = "CHARGE_TYP")
    private String chargeTyp;
    @Basic(optional = false)
    @Column(name = "REGION_ID")
    private int regionId;
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

    public TaxAuthorityTbl() {
    }

    public TaxAuthorityTbl(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    public TaxAuthorityTbl(Integer taxAuthorityId, String taxAuthorityDesc, String taxAuthorityTyp, int taxRuleId, int processSeq, int exemptId, String chargeTyp, int regionId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.taxAuthorityId = taxAuthorityId;
        this.taxAuthorityDesc = taxAuthorityDesc;
        this.taxAuthorityTyp = taxAuthorityTyp;
        this.taxRuleId = taxRuleId;
        this.processSeq = processSeq;
        this.exemptId = exemptId;
        this.chargeTyp = chargeTyp;
        this.regionId = regionId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getTaxAuthorityId() {
        return taxAuthorityId;
    }

    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    public String getTaxAuthorityDesc() {
        return taxAuthorityDesc;
    }

    public void setTaxAuthorityDesc(String taxAuthorityDesc) {
        this.taxAuthorityDesc = taxAuthorityDesc;
    }

    public String getTaxAuthorityTyp() {
        return taxAuthorityTyp;
    }

    public void setTaxAuthorityTyp(String taxAuthorityTyp) {
        this.taxAuthorityTyp = taxAuthorityTyp;
    }

    public int getTaxRuleId() {
        return taxRuleId;
    }

    public void setTaxRuleId(int taxRuleId) {
        this.taxRuleId = taxRuleId;
    }

    public int getProcessSeq() {
        return processSeq;
    }

    public void setProcessSeq(int processSeq) {
        this.processSeq = processSeq;
    }

    public int getExemptId() {
        return exemptId;
    }

    public void setExemptId(int exemptId) {
        this.exemptId = exemptId;
    }

    public String getChargeTyp() {
        return chargeTyp;
    }

    public void setChargeTyp(String chargeTyp) {
        this.chargeTyp = chargeTyp;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
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
        hash += (taxAuthorityId != null ? taxAuthorityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TaxAuthorityTbl)) {
            return false;
        }
        TaxAuthorityTbl other = (TaxAuthorityTbl) object;
        if ((this.taxAuthorityId == null && other.taxAuthorityId != null) || (this.taxAuthorityId != null && !this.taxAuthorityId.equals(other.taxAuthorityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TaxAuthorityTbl[ taxAuthorityId=" + taxAuthorityId + " ]";
    }

}
