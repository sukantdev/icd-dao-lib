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
@Table(name = "PRD_PCHS_DTL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdPchsDtl.findAll", query = "SELECT p FROM PrdPchsDtl p")})
public class PrdPchsDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdPchsDtlPK prdPchsDtlPK;
    @Basic(optional = false)
    @Column(name = "DLY_PCHS_LMT")
    private String dlyPchsLmt;
    @Basic(optional = false)
    @Column(name = "WKLY_PCHS_LMT")
    private String wklyPchsLmt;
    @Basic(optional = false)
    @Column(name = "MTHLY_PCHS_LMT")
    private String mthlyPchsLmt;
    @Basic(optional = false)
    @Column(name = "DLY_TRNS_CNT")
    private int dlyTrnsCnt;
    @Basic(optional = false)
    @Column(name = "WKLY_TRNS_CNT")
    private int wklyTrnsCnt;
    @Basic(optional = false)
    @Column(name = "MTHLY_TRNS_CNT")
    private int mthlyTrnsCnt;
    @Basic(optional = false)
    @Column(name = "LMT_TYP")
    private Character lmtTyp;
    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private Character crdTyp;
    @Basic(optional = false)
    @Column(name = "LVL_THREE_DATA_FLG")
    private Character lvlThreeDataFlg;
    @Basic(optional = false)
    @Column(name = "PUMP_PAY_FLG")
    private Character pumpPayFlg;
    @Basic(optional = false)
    @Column(name = "PER_TRNS_LMT")
    private String perTrnsLmt;
    @Basic(optional = false)
    @Column(name = "GHOST_FLG")
    private Character ghostFlg;
    @Basic(optional = false)
    @Column(name = "SUB_CRD_TYP")
    private Character subCrdTyp;
    @Basic(optional = false)
    @Column(name = "PBLC_SCTR_FLG")
    private Character pblcSctrFlg;
    @Basic(optional = false)
    @Column(name = "CNSTRTN_FLG")
    private Character cnstrtnFlg;
    @Basic(optional = false)
    @Column(name = "FF_DISC_RBT")
    private String ffDiscRbt;
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

    public PrdPchsDtl() {
    }

    public PrdPchsDtl(PrdPchsDtlPK prdPchsDtlPK) {
        this.prdPchsDtlPK = prdPchsDtlPK;
    }

    public PrdPchsDtl(PrdPchsDtlPK prdPchsDtlPK, String dlyPchsLmt, String wklyPchsLmt, String mthlyPchsLmt, int dlyTrnsCnt, int wklyTrnsCnt, int mthlyTrnsCnt, Character lmtTyp, Character crdTyp, Character lvlThreeDataFlg, Character pumpPayFlg, String perTrnsLmt, Character ghostFlg, Character subCrdTyp, Character pblcSctrFlg, Character cnstrtnFlg, String ffDiscRbt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdPchsDtlPK = prdPchsDtlPK;
        this.dlyPchsLmt = dlyPchsLmt;
        this.wklyPchsLmt = wklyPchsLmt;
        this.mthlyPchsLmt = mthlyPchsLmt;
        this.dlyTrnsCnt = dlyTrnsCnt;
        this.wklyTrnsCnt = wklyTrnsCnt;
        this.mthlyTrnsCnt = mthlyTrnsCnt;
        this.lmtTyp = lmtTyp;
        this.crdTyp = crdTyp;
        this.lvlThreeDataFlg = lvlThreeDataFlg;
        this.pumpPayFlg = pumpPayFlg;
        this.perTrnsLmt = perTrnsLmt;
        this.ghostFlg = ghostFlg;
        this.subCrdTyp = subCrdTyp;
        this.pblcSctrFlg = pblcSctrFlg;
        this.cnstrtnFlg = cnstrtnFlg;
        this.ffDiscRbt = ffDiscRbt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdPchsDtl(String applNbr, String childTyp) {
        this.prdPchsDtlPK = new PrdPchsDtlPK(applNbr, childTyp);
    }

    public PrdPchsDtlPK getPrdPchsDtlPK() {
        return prdPchsDtlPK;
    }

    public void setPrdPchsDtlPK(PrdPchsDtlPK prdPchsDtlPK) {
        this.prdPchsDtlPK = prdPchsDtlPK;
    }

    public String getDlyPchsLmt() {
        return dlyPchsLmt;
    }

    public void setDlyPchsLmt(String dlyPchsLmt) {
        this.dlyPchsLmt = dlyPchsLmt;
    }

    public String getWklyPchsLmt() {
        return wklyPchsLmt;
    }

    public void setWklyPchsLmt(String wklyPchsLmt) {
        this.wklyPchsLmt = wklyPchsLmt;
    }

    public String getMthlyPchsLmt() {
        return mthlyPchsLmt;
    }

    public void setMthlyPchsLmt(String mthlyPchsLmt) {
        this.mthlyPchsLmt = mthlyPchsLmt;
    }

    public int getDlyTrnsCnt() {
        return dlyTrnsCnt;
    }

    public void setDlyTrnsCnt(int dlyTrnsCnt) {
        this.dlyTrnsCnt = dlyTrnsCnt;
    }

    public int getWklyTrnsCnt() {
        return wklyTrnsCnt;
    }

    public void setWklyTrnsCnt(int wklyTrnsCnt) {
        this.wklyTrnsCnt = wklyTrnsCnt;
    }

    public int getMthlyTrnsCnt() {
        return mthlyTrnsCnt;
    }

    public void setMthlyTrnsCnt(int mthlyTrnsCnt) {
        this.mthlyTrnsCnt = mthlyTrnsCnt;
    }

    public Character getLmtTyp() {
        return lmtTyp;
    }

    public void setLmtTyp(Character lmtTyp) {
        this.lmtTyp = lmtTyp;
    }

    public Character getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(Character crdTyp) {
        this.crdTyp = crdTyp;
    }

    public Character getLvlThreeDataFlg() {
        return lvlThreeDataFlg;
    }

    public void setLvlThreeDataFlg(Character lvlThreeDataFlg) {
        this.lvlThreeDataFlg = lvlThreeDataFlg;
    }

    public Character getPumpPayFlg() {
        return pumpPayFlg;
    }

    public void setPumpPayFlg(Character pumpPayFlg) {
        this.pumpPayFlg = pumpPayFlg;
    }

    public String getPerTrnsLmt() {
        return perTrnsLmt;
    }

    public void setPerTrnsLmt(String perTrnsLmt) {
        this.perTrnsLmt = perTrnsLmt;
    }

    public Character getGhostFlg() {
        return ghostFlg;
    }

    public void setGhostFlg(Character ghostFlg) {
        this.ghostFlg = ghostFlg;
    }

    public Character getSubCrdTyp() {
        return subCrdTyp;
    }

    public void setSubCrdTyp(Character subCrdTyp) {
        this.subCrdTyp = subCrdTyp;
    }

    public Character getPblcSctrFlg() {
        return pblcSctrFlg;
    }

    public void setPblcSctrFlg(Character pblcSctrFlg) {
        this.pblcSctrFlg = pblcSctrFlg;
    }

    public Character getCnstrtnFlg() {
        return cnstrtnFlg;
    }

    public void setCnstrtnFlg(Character cnstrtnFlg) {
        this.cnstrtnFlg = cnstrtnFlg;
    }

    public String getFfDiscRbt() {
        return ffDiscRbt;
    }

    public void setFfDiscRbt(String ffDiscRbt) {
        this.ffDiscRbt = ffDiscRbt;
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
        hash += (prdPchsDtlPK != null ? prdPchsDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdPchsDtl)) {
            return false;
        }
        PrdPchsDtl other = (PrdPchsDtl) object;
        if ((this.prdPchsDtlPK == null && other.prdPchsDtlPK != null) || (this.prdPchsDtlPK != null && !this.prdPchsDtlPK.equals(other.prdPchsDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdPchsDtl[ prdPchsDtlPK=" + prdPchsDtlPK + " ]";
    }
    
}
