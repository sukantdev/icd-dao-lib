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
@Table(name = "SUB_XREF", catalog = "", schema = "DBO")
public class SubXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUBSYS_ID")
    private String subsysId;
    @Basic(optional = false)
    @Column(name = "CXINB003_DESC")
    private String cxinb003Desc;
    @Basic(optional = false)
    @Column(name = "FMSM_PROD_CD")
    private String fmsmProdCd;
    @Basic(optional = false)
    @Column(name = "CXINB364_DESC")
    private String cxinb364Desc;
    @Basic(optional = false)
    @Column(name = "CXINB323_DESC")
    private String cxinb323Desc;
    @Basic(optional = false)
    @Column(name = "PROD_CD")
    private int prodCd;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_1")
    private int subProd1;
    @Basic(optional = false)
    @Column(name = "SUB_PROD_2")
    private int subProd2;
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

    public SubXref() {
    }

    public SubXref(String subsysId) {
        this.subsysId = subsysId;
    }

    public SubXref(String subsysId, String cxinb003Desc, String fmsmProdCd, String cxinb364Desc, String cxinb323Desc, int prodCd, int subProd1, int subProd2, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.subsysId = subsysId;
        this.cxinb003Desc = cxinb003Desc;
        this.fmsmProdCd = fmsmProdCd;
        this.cxinb364Desc = cxinb364Desc;
        this.cxinb323Desc = cxinb323Desc;
        this.prodCd = prodCd;
        this.subProd1 = subProd1;
        this.subProd2 = subProd2;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getSubsysId() {
        return subsysId;
    }

    public void setSubsysId(String subsysId) {
        this.subsysId = subsysId;
    }

    public String getCxinb003Desc() {
        return cxinb003Desc;
    }

    public void setCxinb003Desc(String cxinb003Desc) {
        this.cxinb003Desc = cxinb003Desc;
    }

    public String getFmsmProdCd() {
        return fmsmProdCd;
    }

    public void setFmsmProdCd(String fmsmProdCd) {
        this.fmsmProdCd = fmsmProdCd;
    }

    public String getCxinb364Desc() {
        return cxinb364Desc;
    }

    public void setCxinb364Desc(String cxinb364Desc) {
        this.cxinb364Desc = cxinb364Desc;
    }

    public String getCxinb323Desc() {
        return cxinb323Desc;
    }

    public void setCxinb323Desc(String cxinb323Desc) {
        this.cxinb323Desc = cxinb323Desc;
    }

    public int getProdCd() {
        return prodCd;
    }

    public void setProdCd(int prodCd) {
        this.prodCd = prodCd;
    }

    public int getSubProd1() {
        return subProd1;
    }

    public void setSubProd1(int subProd1) {
        this.subProd1 = subProd1;
    }

    public int getSubProd2() {
        return subProd2;
    }

    public void setSubProd2(int subProd2) {
        this.subProd2 = subProd2;
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
        hash += (subsysId != null ? subsysId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof SubXref)) {
            return false;
        }
        SubXref other = (SubXref) object;
        if ((this.subsysId == null && other.subsysId != null) || (this.subsysId != null && !this.subsysId.equals(other.subsysId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SubXref[ subsysId=" + subsysId + " ]";
    }

}
