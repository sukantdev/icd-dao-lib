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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRD_VSAT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdVsat.findAll", query = "SELECT p FROM PrdVsat p")})
public class PrdVsat implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdVsatPK prdVsatPK;
    @Basic(optional = false)
    @Column(name = "VSAT_UNITS")
    private int vsatUnits;
    @Basic(optional = false)
    @Column(name = "VSAT_CD")
    private String vsatCd;
    @Basic(optional = false)
    @Column(name = "TS_CD")
    private String tsCd;
    @Basic(optional = false)
    @Column(name = "TRNDR_CD")
    private String trndrCd;
    @Basic(optional = false)
    @Column(name = "NEW_NSTL_FLG")
    private Character newNstlFlg;
    @Basic(optional = false)
    @Column(name = "RNTL_FLG")
    private Character rntlFlg;
    @Basic(optional = false)
    @Column(name = "TS_NM")
    private String tsNm;
    @Basic(optional = false)
    @Column(name = "SHP_DT")
    @Temporal(TemporalType.DATE)
    private Date shpDt;
    @Basic(optional = false)
    @Column(name = "NSTL_DT")
    @Temporal(TemporalType.DATE)
    private Date nstlDt;
    @Basic(optional = false)
    @Column(name = "COMM_FLGS")
    private short commFlgs;
    @Basic(optional = false)
    @Column(name = "OWNRSHP_CHG_FLG")
    private Character ownrshpChgFlg;
    @Basic(optional = false)
    @Column(name = "OLD_TS_CD")
    private String oldTsCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "VSAT_SYS_AMT")
    private BigDecimal vsatSysAmt;
    @Basic(optional = false)
    @Column(name = "MAINT_AMT")
    private BigDecimal maintAmt;
    @Basic(optional = false)
    @Column(name = "ABORTED_NSTL_FEE")
    private BigDecimal abortedNstlFee;
    @Basic(optional = false)
    @Column(name = "RELOCATION_FEE")
    private BigDecimal relocationFee;
    @Basic(optional = false)
    @Column(name = "DEICING_FEE")
    private BigDecimal deicingFee;
    @Basic(optional = false)
    @Column(name = "SITE_SURVEY_FEE")
    private BigDecimal siteSurveyFee;
    @Basic(optional = false)
    @Column(name = "NSTL_CHRG")
    private BigDecimal nstlChrg;
    @Basic(optional = false)
    @Column(name = "RNTL_AMT")
    private BigDecimal rntlAmt;
    @Basic(optional = false)
    @Column(name = "NBR_MONTHS")
    private int nbrMonths;
    @Basic(optional = false)
    @Column(name = "BAND_WIDTH")
    private String bandWidth;
    @Basic(optional = false)
    @Column(name = "UNDER_CNSTRTN_FLG")
    private Character underCnstrtnFlg;
    @Basic(optional = false)
    @Column(name = "OWN_RENT_FLG")
    private Character ownRentFlg;
    @Basic(optional = false)
    @Column(name = "ROOF_STRU_FLGS")
    private short roofStruFlgs;
    @Basic(optional = false)
    @Column(name = "ROOF_STRU_OTH_DESC")
    private String roofStruOthDesc;
    @Basic(optional = false)
    @Column(name = "LLRD_PRMSN_FLG")
    private Character llrdPrmsnFlg;
    @Basic(optional = false)
    @Column(name = "NBR_STORIES")
    private Character nbrStories;
    @Basic(optional = false)
    @Column(name = "SIGHT_LN_BLKD_FLG")
    private Character sightLnBlkdFlg;
    @Basic(optional = false)
    @Column(name = "DEICING_FLG")
    private Character deicingFlg;
    @Basic(optional = false)
    @Column(name = "STH_END_DTLS")
    private String sthEndDtls;
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
    @Column(name = "VSAT_CST_FLGS")
    private short vsatCstFlgs;

    public PrdVsat() {
    }

    public PrdVsat(PrdVsatPK prdVsatPK) {
        this.prdVsatPK = prdVsatPK;
    }

    public PrdVsat(PrdVsatPK prdVsatPK, int vsatUnits, String vsatCd, String tsCd, String trndrCd, Character newNstlFlg, Character rntlFlg, String tsNm, Date shpDt, Date nstlDt, short commFlgs, Character ownrshpChgFlg, String oldTsCd, BigDecimal vsatSysAmt, BigDecimal maintAmt, BigDecimal abortedNstlFee, BigDecimal relocationFee, BigDecimal deicingFee, BigDecimal siteSurveyFee, BigDecimal nstlChrg, BigDecimal rntlAmt, int nbrMonths, String bandWidth, Character underCnstrtnFlg, Character ownRentFlg, short roofStruFlgs, String roofStruOthDesc, Character llrdPrmsnFlg, Character nbrStories, Character sightLnBlkdFlg, Character deicingFlg, String sthEndDtls, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, short vsatCstFlgs) {
        this.prdVsatPK = prdVsatPK;
        this.vsatUnits = vsatUnits;
        this.vsatCd = vsatCd;
        this.tsCd = tsCd;
        this.trndrCd = trndrCd;
        this.newNstlFlg = newNstlFlg;
        this.rntlFlg = rntlFlg;
        this.tsNm = tsNm;
        this.shpDt = shpDt;
        this.nstlDt = nstlDt;
        this.commFlgs = commFlgs;
        this.ownrshpChgFlg = ownrshpChgFlg;
        this.oldTsCd = oldTsCd;
        this.vsatSysAmt = vsatSysAmt;
        this.maintAmt = maintAmt;
        this.abortedNstlFee = abortedNstlFee;
        this.relocationFee = relocationFee;
        this.deicingFee = deicingFee;
        this.siteSurveyFee = siteSurveyFee;
        this.nstlChrg = nstlChrg;
        this.rntlAmt = rntlAmt;
        this.nbrMonths = nbrMonths;
        this.bandWidth = bandWidth;
        this.underCnstrtnFlg = underCnstrtnFlg;
        this.ownRentFlg = ownRentFlg;
        this.roofStruFlgs = roofStruFlgs;
        this.roofStruOthDesc = roofStruOthDesc;
        this.llrdPrmsnFlg = llrdPrmsnFlg;
        this.nbrStories = nbrStories;
        this.sightLnBlkdFlg = sightLnBlkdFlg;
        this.deicingFlg = deicingFlg;
        this.sthEndDtls = sthEndDtls;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.vsatCstFlgs = vsatCstFlgs;
    }

    public PrdVsat(String applNbr, String childTyp) {
        this.prdVsatPK = new PrdVsatPK(applNbr, childTyp);
    }

    public PrdVsatPK getPrdVsatPK() {
        return prdVsatPK;
    }

    public void setPrdVsatPK(PrdVsatPK prdVsatPK) {
        this.prdVsatPK = prdVsatPK;
    }

    public int getVsatUnits() {
        return vsatUnits;
    }

    public void setVsatUnits(int vsatUnits) {
        this.vsatUnits = vsatUnits;
    }

    public String getVsatCd() {
        return vsatCd;
    }

    public void setVsatCd(String vsatCd) {
        this.vsatCd = vsatCd;
    }

    public String getTsCd() {
        return tsCd;
    }

    public void setTsCd(String tsCd) {
        this.tsCd = tsCd;
    }

    public String getTrndrCd() {
        return trndrCd;
    }

    public void setTrndrCd(String trndrCd) {
        this.trndrCd = trndrCd;
    }

    public Character getNewNstlFlg() {
        return newNstlFlg;
    }

    public void setNewNstlFlg(Character newNstlFlg) {
        this.newNstlFlg = newNstlFlg;
    }

    public Character getRntlFlg() {
        return rntlFlg;
    }

    public void setRntlFlg(Character rntlFlg) {
        this.rntlFlg = rntlFlg;
    }

    public String getTsNm() {
        return tsNm;
    }

    public void setTsNm(String tsNm) {
        this.tsNm = tsNm;
    }

    public Date getShpDt() {
        return shpDt;
    }

    public void setShpDt(Date shpDt) {
        this.shpDt = shpDt;
    }

    public Date getNstlDt() {
        return nstlDt;
    }

    public void setNstlDt(Date nstlDt) {
        this.nstlDt = nstlDt;
    }

    public short getCommFlgs() {
        return commFlgs;
    }

    public void setCommFlgs(short commFlgs) {
        this.commFlgs = commFlgs;
    }

    public Character getOwnrshpChgFlg() {
        return ownrshpChgFlg;
    }

    public void setOwnrshpChgFlg(Character ownrshpChgFlg) {
        this.ownrshpChgFlg = ownrshpChgFlg;
    }

    public String getOldTsCd() {
        return oldTsCd;
    }

    public void setOldTsCd(String oldTsCd) {
        this.oldTsCd = oldTsCd;
    }

    public BigDecimal getVsatSysAmt() {
        return vsatSysAmt;
    }

    public void setVsatSysAmt(BigDecimal vsatSysAmt) {
        this.vsatSysAmt = vsatSysAmt;
    }

    public BigDecimal getMaintAmt() {
        return maintAmt;
    }

    public void setMaintAmt(BigDecimal maintAmt) {
        this.maintAmt = maintAmt;
    }

    public BigDecimal getAbortedNstlFee() {
        return abortedNstlFee;
    }

    public void setAbortedNstlFee(BigDecimal abortedNstlFee) {
        this.abortedNstlFee = abortedNstlFee;
    }

    public BigDecimal getRelocationFee() {
        return relocationFee;
    }

    public void setRelocationFee(BigDecimal relocationFee) {
        this.relocationFee = relocationFee;
    }

    public BigDecimal getDeicingFee() {
        return deicingFee;
    }

    public void setDeicingFee(BigDecimal deicingFee) {
        this.deicingFee = deicingFee;
    }

    public BigDecimal getSiteSurveyFee() {
        return siteSurveyFee;
    }

    public void setSiteSurveyFee(BigDecimal siteSurveyFee) {
        this.siteSurveyFee = siteSurveyFee;
    }

    public BigDecimal getNstlChrg() {
        return nstlChrg;
    }

    public void setNstlChrg(BigDecimal nstlChrg) {
        this.nstlChrg = nstlChrg;
    }

    public BigDecimal getRntlAmt() {
        return rntlAmt;
    }

    public void setRntlAmt(BigDecimal rntlAmt) {
        this.rntlAmt = rntlAmt;
    }

    public int getNbrMonths() {
        return nbrMonths;
    }

    public void setNbrMonths(int nbrMonths) {
        this.nbrMonths = nbrMonths;
    }

    public String getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(String bandWidth) {
        this.bandWidth = bandWidth;
    }

    public Character getUnderCnstrtnFlg() {
        return underCnstrtnFlg;
    }

    public void setUnderCnstrtnFlg(Character underCnstrtnFlg) {
        this.underCnstrtnFlg = underCnstrtnFlg;
    }

    public Character getOwnRentFlg() {
        return ownRentFlg;
    }

    public void setOwnRentFlg(Character ownRentFlg) {
        this.ownRentFlg = ownRentFlg;
    }

    public short getRoofStruFlgs() {
        return roofStruFlgs;
    }

    public void setRoofStruFlgs(short roofStruFlgs) {
        this.roofStruFlgs = roofStruFlgs;
    }

    public String getRoofStruOthDesc() {
        return roofStruOthDesc;
    }

    public void setRoofStruOthDesc(String roofStruOthDesc) {
        this.roofStruOthDesc = roofStruOthDesc;
    }

    public Character getLlrdPrmsnFlg() {
        return llrdPrmsnFlg;
    }

    public void setLlrdPrmsnFlg(Character llrdPrmsnFlg) {
        this.llrdPrmsnFlg = llrdPrmsnFlg;
    }

    public Character getNbrStories() {
        return nbrStories;
    }

    public void setNbrStories(Character nbrStories) {
        this.nbrStories = nbrStories;
    }

    public Character getSightLnBlkdFlg() {
        return sightLnBlkdFlg;
    }

    public void setSightLnBlkdFlg(Character sightLnBlkdFlg) {
        this.sightLnBlkdFlg = sightLnBlkdFlg;
    }

    public Character getDeicingFlg() {
        return deicingFlg;
    }

    public void setDeicingFlg(Character deicingFlg) {
        this.deicingFlg = deicingFlg;
    }

    public String getSthEndDtls() {
        return sthEndDtls;
    }

    public void setSthEndDtls(String sthEndDtls) {
        this.sthEndDtls = sthEndDtls;
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

    public short getVsatCstFlgs() {
        return vsatCstFlgs;
    }

    public void setVsatCstFlgs(short vsatCstFlgs) {
        this.vsatCstFlgs = vsatCstFlgs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdVsatPK != null ? prdVsatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdVsat)) {
            return false;
        }
        PrdVsat other = (PrdVsat) object;
        if ((this.prdVsatPK == null && other.prdVsatPK != null) || (this.prdVsatPK != null && !this.prdVsatPK.equals(other.prdVsatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdVsat[ prdVsatPK=" + prdVsatPK + " ]";
    }
    
}
