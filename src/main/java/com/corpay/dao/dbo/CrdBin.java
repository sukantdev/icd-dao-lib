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
@Table(name = "CRD_BIN", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdBin.findAll", query = "SELECT c FROM CrdBin c")})
public class CrdBin implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdBinPK crdBinPK;
    @Basic(optional = false)
    @Column(name = "CRD_CMNT")
    private String crdCmnt;
    @Basic(optional = false)
    @Column(name = "CRD_FLGS")
    private String crdFlgs;
    @Basic(optional = false)
    @Column(name = "CRD_STAT")
    private Character crdStat;
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
    @Column(name = "CRD_ALPHA2_CNTRY_CD")
    private String crdAlpha2CntryCd;
    @Basic(optional = false)
    @Column(name = "CRD_ALPHA3_CNTRY_CD")
    private String crdAlpha3CntryCd;
    @Basic(optional = false)
    @Column(name = "CRD_NUMERIC_CNTRY_CD")
    private short crdNumericCntryCd;
    @Basic(optional = false)
    @Column(name = "CRD_ICA_CD")
    private int crdIcaCd;
    @Basic(optional = false)
    @Column(name = "CRD_MRCH_CD")
    private String crdMrchCd;
    @Basic(optional = false)
    @Column(name = "CRD_SRVC_CD")
    private String crdSrvcCd;

    public CrdBin() {
    }

    public CrdBin(CrdBinPK crdBinPK) {
        this.crdBinPK = crdBinPK;
    }

    public CrdBin(CrdBinPK crdBinPK, String crdCmnt, String crdFlgs, Character crdStat, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String crdAlpha2CntryCd, String crdAlpha3CntryCd, short crdNumericCntryCd, int crdIcaCd, String crdMrchCd, String crdSrvcCd) {
        this.crdBinPK = crdBinPK;
        this.crdCmnt = crdCmnt;
        this.crdFlgs = crdFlgs;
        this.crdStat = crdStat;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crdAlpha2CntryCd = crdAlpha2CntryCd;
        this.crdAlpha3CntryCd = crdAlpha3CntryCd;
        this.crdNumericCntryCd = crdNumericCntryCd;
        this.crdIcaCd = crdIcaCd;
        this.crdMrchCd = crdMrchCd;
        this.crdSrvcCd = crdSrvcCd;
    }

    public CrdBin(int crdBin, String crdTyp) {
        this.crdBinPK = new CrdBinPK(crdBin, crdTyp);
    }

    public CrdBinPK getCrdBinPK() {
        return crdBinPK;
    }

    public void setCrdBinPK(CrdBinPK crdBinPK) {
        this.crdBinPK = crdBinPK;
    }

    public String getCrdCmnt() {
        return crdCmnt;
    }

    public void setCrdCmnt(String crdCmnt) {
        this.crdCmnt = crdCmnt;
    }

    public String getCrdFlgs() {
        return crdFlgs;
    }

    public void setCrdFlgs(String crdFlgs) {
        this.crdFlgs = crdFlgs;
    }

    public Character getCrdStat() {
        return crdStat;
    }

    public void setCrdStat(Character crdStat) {
        this.crdStat = crdStat;
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

    public String getCrdAlpha2CntryCd() {
        return crdAlpha2CntryCd;
    }

    public void setCrdAlpha2CntryCd(String crdAlpha2CntryCd) {
        this.crdAlpha2CntryCd = crdAlpha2CntryCd;
    }

    public String getCrdAlpha3CntryCd() {
        return crdAlpha3CntryCd;
    }

    public void setCrdAlpha3CntryCd(String crdAlpha3CntryCd) {
        this.crdAlpha3CntryCd = crdAlpha3CntryCd;
    }

    public short getCrdNumericCntryCd() {
        return crdNumericCntryCd;
    }

    public void setCrdNumericCntryCd(short crdNumericCntryCd) {
        this.crdNumericCntryCd = crdNumericCntryCd;
    }

    public int getCrdIcaCd() {
        return crdIcaCd;
    }

    public void setCrdIcaCd(int crdIcaCd) {
        this.crdIcaCd = crdIcaCd;
    }

    public String getCrdMrchCd() {
        return crdMrchCd;
    }

    public void setCrdMrchCd(String crdMrchCd) {
        this.crdMrchCd = crdMrchCd;
    }

    public String getCrdSrvcCd() {
        return crdSrvcCd;
    }

    public void setCrdSrvcCd(String crdSrvcCd) {
        this.crdSrvcCd = crdSrvcCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdBinPK != null ? crdBinPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdBin)) {
            return false;
        }
        CrdBin other = (CrdBin) object;
        if ((this.crdBinPK == null && other.crdBinPK != null) || (this.crdBinPK != null && !this.crdBinPK.equals(other.crdBinPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdBin[ crdBinPK=" + crdBinPK + " ]";
    }
    
}
