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
@Table(name = "TAX_ID_TBL", catalog = "", schema = "DBO")
public class TaxIdTbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private Integer taxId;
    @Basic(optional = false)
    @Column(name = "TAX_DESC")
    private String taxDesc;
    @Basic(optional = false)
    @Column(name = "TAX_TYP")
    private String taxTyp;
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

    public TaxIdTbl() {
    }

    public TaxIdTbl(Integer taxId) {
        this.taxId = taxId;
    }

    public TaxIdTbl(Integer taxId, String taxDesc, String taxTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.taxId = taxId;
        this.taxDesc = taxDesc;
        this.taxTyp = taxTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public String getTaxDesc() {
        return taxDesc;
    }

    public void setTaxDesc(String taxDesc) {
        this.taxDesc = taxDesc;
    }

    public String getTaxTyp() {
        return taxTyp;
    }

    public void setTaxTyp(String taxTyp) {
        this.taxTyp = taxTyp;
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
        hash += (taxId != null ? taxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TaxIdTbl)) {
            return false;
        }
        TaxIdTbl other = (TaxIdTbl) object;
        if ((this.taxId == null && other.taxId != null) || (this.taxId != null && !this.taxId.equals(other.taxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TaxIdTbl[ taxId=" + taxId + " ]";
    }

}
