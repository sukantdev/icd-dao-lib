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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "SUB_XREF_SJ", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "SubXrefSj.findAll", query = "SELECT s FROM SubXrefSj s")})
public class SubXrefSj implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubXrefSjPK subXrefSjPK;
    @Basic(optional = false)
    @Column(name = "SALES_JRNL_DESC")
    private String salesJrnlDesc;
    @Basic(optional = false)
    @Column(name = "UT10_DESC")
    private String ut10Desc;
    @Basic(optional = false)
    @Column(name = "REVENUE_INDX")
    private short revenueIndx;
    @Basic(optional = false)
    @Column(name = "CXRAB007_DESC")
    private String cxrab007Desc;
    @Basic(optional = false)
    @Column(name = "FEES_TO_RVNU_FLG")
    private Character feesToRvnuFlg;
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

    public SubXrefSj() {
    }

    public SubXrefSj(SubXrefSjPK subXrefSjPK) {
        this.subXrefSjPK = subXrefSjPK;
    }

    public SubXrefSj(SubXrefSjPK subXrefSjPK, String salesJrnlDesc, String ut10Desc, short revenueIndx, String cxrab007Desc, Character feesToRvnuFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.subXrefSjPK = subXrefSjPK;
        this.salesJrnlDesc = salesJrnlDesc;
        this.ut10Desc = ut10Desc;
        this.revenueIndx = revenueIndx;
        this.cxrab007Desc = cxrab007Desc;
        this.feesToRvnuFlg = feesToRvnuFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public SubXrefSj(int prodCd, int subProd1, int subProd2) {
        this.subXrefSjPK = new SubXrefSjPK(prodCd, subProd1, subProd2);
    }

    public SubXrefSjPK getSubXrefSjPK() {
        return subXrefSjPK;
    }

    public void setSubXrefSjPK(SubXrefSjPK subXrefSjPK) {
        this.subXrefSjPK = subXrefSjPK;
    }

    public String getSalesJrnlDesc() {
        return salesJrnlDesc;
    }

    public void setSalesJrnlDesc(String salesJrnlDesc) {
        this.salesJrnlDesc = salesJrnlDesc;
    }

    public String getUt10Desc() {
        return ut10Desc;
    }

    public void setUt10Desc(String ut10Desc) {
        this.ut10Desc = ut10Desc;
    }

    public short getRevenueIndx() {
        return revenueIndx;
    }

    public void setRevenueIndx(short revenueIndx) {
        this.revenueIndx = revenueIndx;
    }

    public String getCxrab007Desc() {
        return cxrab007Desc;
    }

    public void setCxrab007Desc(String cxrab007Desc) {
        this.cxrab007Desc = cxrab007Desc;
    }

    public Character getFeesToRvnuFlg() {
        return feesToRvnuFlg;
    }

    public void setFeesToRvnuFlg(Character feesToRvnuFlg) {
        this.feesToRvnuFlg = feesToRvnuFlg;
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
        hash += (subXrefSjPK != null ? subXrefSjPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubXrefSj)) {
            return false;
        }
        SubXrefSj other = (SubXrefSj) object;
        if ((this.subXrefSjPK == null && other.subXrefSjPK != null) || (this.subXrefSjPK != null && !this.subXrefSjPK.equals(other.subXrefSjPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SubXrefSj[ subXrefSjPK=" + subXrefSjPK + " ]";
    }
    
}
