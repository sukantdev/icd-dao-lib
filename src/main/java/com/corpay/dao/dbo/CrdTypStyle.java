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
@Table(name = "CRD_TYP_STYLE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdTypStyle.findAll", query = "SELECT c FROM CrdTypStyle c")})
public class CrdTypStyle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdTypStylePK crdTypStylePK;
    @Basic(optional = false)
    @Column(name = "CRD_TYP_DESC")
    private String crdTypDesc;
    @Basic(optional = false)
    @Column(name = "CRD_VNDR_CD")
    private Character crdVndrCd;
    @Basic(optional = false)
    @Column(name = "CRD_PL_CD")
    private String crdPlCd;
    @Basic(optional = false)
    @Column(name = "CRD_ORD_TYP_NEW_CD")
    private Character crdOrdTypNewCd;
    @Basic(optional = false)
    @Column(name = "CRD_ORD_TYP_REN_CD")
    private Character crdOrdTypRenCd;
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
    @Column(name = "CRD_PL2_CD")
    private String crdPl2Cd;
    @Basic(optional = false)
    @Column(name = "CRD_PL3_CD")
    private String crdPl3Cd;

    public CrdTypStyle() {
    }

    public CrdTypStyle(CrdTypStylePK crdTypStylePK) {
        this.crdTypStylePK = crdTypStylePK;
    }

    public CrdTypStyle(CrdTypStylePK crdTypStylePK, String crdTypDesc, Character crdVndrCd, String crdPlCd, Character crdOrdTypNewCd, Character crdOrdTypRenCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String crdPl2Cd, String crdPl3Cd) {
        this.crdTypStylePK = crdTypStylePK;
        this.crdTypDesc = crdTypDesc;
        this.crdVndrCd = crdVndrCd;
        this.crdPlCd = crdPlCd;
        this.crdOrdTypNewCd = crdOrdTypNewCd;
        this.crdOrdTypRenCd = crdOrdTypRenCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crdPl2Cd = crdPl2Cd;
        this.crdPl3Cd = crdPl3Cd;
    }

    public CrdTypStyle(String crdTypCd, String crdStyleCd) {
        this.crdTypStylePK = new CrdTypStylePK(crdTypCd, crdStyleCd);
    }

    public CrdTypStylePK getCrdTypStylePK() {
        return crdTypStylePK;
    }

    public void setCrdTypStylePK(CrdTypStylePK crdTypStylePK) {
        this.crdTypStylePK = crdTypStylePK;
    }

    public String getCrdTypDesc() {
        return crdTypDesc;
    }

    public void setCrdTypDesc(String crdTypDesc) {
        this.crdTypDesc = crdTypDesc;
    }

    public Character getCrdVndrCd() {
        return crdVndrCd;
    }

    public void setCrdVndrCd(Character crdVndrCd) {
        this.crdVndrCd = crdVndrCd;
    }

    public String getCrdPlCd() {
        return crdPlCd;
    }

    public void setCrdPlCd(String crdPlCd) {
        this.crdPlCd = crdPlCd;
    }

    public Character getCrdOrdTypNewCd() {
        return crdOrdTypNewCd;
    }

    public void setCrdOrdTypNewCd(Character crdOrdTypNewCd) {
        this.crdOrdTypNewCd = crdOrdTypNewCd;
    }

    public Character getCrdOrdTypRenCd() {
        return crdOrdTypRenCd;
    }

    public void setCrdOrdTypRenCd(Character crdOrdTypRenCd) {
        this.crdOrdTypRenCd = crdOrdTypRenCd;
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

    public String getCrdPl2Cd() {
        return crdPl2Cd;
    }

    public void setCrdPl2Cd(String crdPl2Cd) {
        this.crdPl2Cd = crdPl2Cd;
    }

    public String getCrdPl3Cd() {
        return crdPl3Cd;
    }

    public void setCrdPl3Cd(String crdPl3Cd) {
        this.crdPl3Cd = crdPl3Cd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTypStylePK != null ? crdTypStylePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdTypStyle)) {
            return false;
        }
        CrdTypStyle other = (CrdTypStyle) object;
        if ((this.crdTypStylePK == null && other.crdTypStylePK != null) || (this.crdTypStylePK != null && !this.crdTypStylePK.equals(other.crdTypStylePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypStyle[ crdTypStylePK=" + crdTypStylePK + " ]";
    }
    
}
