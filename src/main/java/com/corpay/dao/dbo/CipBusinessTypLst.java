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
@Table(name = "CIP_BUSINESS_TYP_LST", catalog = "", schema = "DBO")
public class CipBusinessTypLst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUSINESS_TYP_CD")
    private String businessTypCd;
    @Basic(optional = false)
    @Column(name = "BUSINESS_TYP_TXT")
    private String businessTypTxt;
    @Basic(optional = false)
    @Column(name = "CATEGORY_ID")
    private int categoryId;
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

    public CipBusinessTypLst() {
    }

    public CipBusinessTypLst(String businessTypCd) {
        this.businessTypCd = businessTypCd;
    }

    public CipBusinessTypLst(String businessTypCd, String businessTypTxt, int categoryId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.businessTypCd = businessTypCd;
        this.businessTypTxt = businessTypTxt;
        this.categoryId = categoryId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getBusinessTypCd() {
        return businessTypCd;
    }

    public void setBusinessTypCd(String businessTypCd) {
        this.businessTypCd = businessTypCd;
    }

    public String getBusinessTypTxt() {
        return businessTypTxt;
    }

    public void setBusinessTypTxt(String businessTypTxt) {
        this.businessTypTxt = businessTypTxt;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
        hash += (businessTypCd != null ? businessTypCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CipBusinessTypLst)) {
            return false;
        }
        CipBusinessTypLst other = (CipBusinessTypLst) object;
        if ((this.businessTypCd == null && other.businessTypCd != null) || (this.businessTypCd != null && !this.businessTypCd.equals(other.businessTypCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CipBusinessTypLst[ businessTypCd=" + businessTypCd + " ]";
    }

}
