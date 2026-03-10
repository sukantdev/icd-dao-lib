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
@Table(name = "SUB_PROD_XLATE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "SubProdXlate.findAll", query = "SELECT s FROM SubProdXlate s")})
public class SubProdXlate implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubProdXlatePK subProdXlatePK;
    @Basic(optional = false)
    @Column(name = "CDN_SUB_PROD_CD")
    private String cdnSubProdCd;
    @Basic(optional = false)
    @Column(name = "FL_TYP")
    private String flTyp;
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

    public SubProdXlate() {
    }

    public SubProdXlate(SubProdXlatePK subProdXlatePK) {
        this.subProdXlatePK = subProdXlatePK;
    }

    public SubProdXlate(SubProdXlatePK subProdXlatePK, String cdnSubProdCd, String flTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.subProdXlatePK = subProdXlatePK;
        this.cdnSubProdCd = cdnSubProdCd;
        this.flTyp = flTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public SubProdXlate(Character cdTyp, String inSubProdCd) {
        this.subProdXlatePK = new SubProdXlatePK(cdTyp, inSubProdCd);
    }

    public SubProdXlatePK getSubProdXlatePK() {
        return subProdXlatePK;
    }

    public void setSubProdXlatePK(SubProdXlatePK subProdXlatePK) {
        this.subProdXlatePK = subProdXlatePK;
    }

    public String getCdnSubProdCd() {
        return cdnSubProdCd;
    }

    public void setCdnSubProdCd(String cdnSubProdCd) {
        this.cdnSubProdCd = cdnSubProdCd;
    }

    public String getFlTyp() {
        return flTyp;
    }

    public void setFlTyp(String flTyp) {
        this.flTyp = flTyp;
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
        hash += (subProdXlatePK != null ? subProdXlatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubProdXlate)) {
            return false;
        }
        SubProdXlate other = (SubProdXlate) object;
        if ((this.subProdXlatePK == null && other.subProdXlatePK != null) || (this.subProdXlatePK != null && !this.subProdXlatePK.equals(other.subProdXlatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SubProdXlate[ subProdXlatePK=" + subProdXlatePK + " ]";
    }
    
}
