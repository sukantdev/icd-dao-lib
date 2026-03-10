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
@Table(name = "MRCH_LOC_FN_XREF_TMP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchLocFnXrefTmp.findAll", query = "SELECT m FROM MrchLocFnXrefTmp m")})
public class MrchLocFnXrefTmp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocFnXrefTmpPK mrchLocFnXrefTmpPK;
    @Basic(optional = false)
    @Column(name = "RESETTLE_FLAG")
    private Character resettleFlag;
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
    @Column(name = "SITE_STATUS")
    private String siteStatus;
    @Basic(optional = false)
    @Column(name = "SITE_NM")
    private String siteNm;
    @Basic(optional = false)
    @Column(name = "FM_LOC_FLG")
    private Character fmLocFlg;
    @Basic(optional = false)
    @Column(name = "FM_DISC_FLG")
    private Character fmDiscFlg;

    public MrchLocFnXrefTmp() {
    }

    public MrchLocFnXrefTmp(MrchLocFnXrefTmpPK mrchLocFnXrefTmpPK) {
        this.mrchLocFnXrefTmpPK = mrchLocFnXrefTmpPK;
    }

    public MrchLocFnXrefTmp(MrchLocFnXrefTmpPK mrchLocFnXrefTmpPK, Character resettleFlag, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String siteStatus, String siteNm, Character fmLocFlg, Character fmDiscFlg) {
        this.mrchLocFnXrefTmpPK = mrchLocFnXrefTmpPK;
        this.resettleFlag = resettleFlag;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.siteStatus = siteStatus;
        this.siteNm = siteNm;
        this.fmLocFlg = fmLocFlg;
        this.fmDiscFlg = fmDiscFlg;
    }

    public MrchLocFnXrefTmp(String siteId, String locId) {
        this.mrchLocFnXrefTmpPK = new MrchLocFnXrefTmpPK(siteId, locId);
    }

    public MrchLocFnXrefTmpPK getMrchLocFnXrefTmpPK() {
        return mrchLocFnXrefTmpPK;
    }

    public void setMrchLocFnXrefTmpPK(MrchLocFnXrefTmpPK mrchLocFnXrefTmpPK) {
        this.mrchLocFnXrefTmpPK = mrchLocFnXrefTmpPK;
    }

    public Character getResettleFlag() {
        return resettleFlag;
    }

    public void setResettleFlag(Character resettleFlag) {
        this.resettleFlag = resettleFlag;
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

    public String getSiteStatus() {
        return siteStatus;
    }

    public void setSiteStatus(String siteStatus) {
        this.siteStatus = siteStatus;
    }

    public String getSiteNm() {
        return siteNm;
    }

    public void setSiteNm(String siteNm) {
        this.siteNm = siteNm;
    }

    public Character getFmLocFlg() {
        return fmLocFlg;
    }

    public void setFmLocFlg(Character fmLocFlg) {
        this.fmLocFlg = fmLocFlg;
    }

    public Character getFmDiscFlg() {
        return fmDiscFlg;
    }

    public void setFmDiscFlg(Character fmDiscFlg) {
        this.fmDiscFlg = fmDiscFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrchLocFnXrefTmpPK != null ? mrchLocFnXrefTmpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocFnXrefTmp)) {
            return false;
        }
        MrchLocFnXrefTmp other = (MrchLocFnXrefTmp) object;
        if ((this.mrchLocFnXrefTmpPK == null && other.mrchLocFnXrefTmpPK != null) || (this.mrchLocFnXrefTmpPK != null && !this.mrchLocFnXrefTmpPK.equals(other.mrchLocFnXrefTmpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocFnXrefTmp[ mrchLocFnXrefTmpPK=" + mrchLocFnXrefTmpPK + " ]";
    }
    
}
