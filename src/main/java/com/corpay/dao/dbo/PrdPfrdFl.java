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
@Table(name = "PRD_PFRD_FL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdPfrdFl.findAll", query = "SELECT p FROM PrdPfrdFl p")})
public class PrdPfrdFl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdPfrdFlPK prdPfrdFlPK;
    @Basic(optional = false)
    @Column(name = "STUP_BLNG_MTHD")
    private String stupBlngMthd;
    @Basic(optional = false)
    @Column(name = "NBR_CARDS")
    private int nbrCards;
    @Basic(optional = false)
    @Column(name = "NBR_FNDD_GALS_MO")
    private int nbrFnddGalsMo;
    @Basic(optional = false)
    @Column(name = "AVG_GAL_FILL")
    private String avgGalFill;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CDN_FNDD_FL_LVLA")
    private BigDecimal cdnFnddFlLvla;
    @Basic(optional = false)
    @Column(name = "CDN_FNDD_FL_LVLB")
    private BigDecimal cdnFnddFlLvlb;
    @Basic(optional = false)
    @Column(name = "CDN_FNDD_FL_LVLC")
    private BigDecimal cdnFnddFlLvlc;
    @Basic(optional = false)
    @Column(name = "CDN_FNDD_CASH_ONLY")
    private BigDecimal cdnFnddCashOnly;
    @Basic(optional = false)
    @Column(name = "STRP_RDR")
    private BigDecimal strpRdr;
    @Basic(optional = false)
    @Column(name = "NBR_UNITS")
    private short nbrUnits;
    @Basic(optional = false)
    @Column(name = "NBR_UNITS_PRTR")
    private short nbrUnitsPrtr;
    @Basic(optional = false)
    @Column(name = "STRP_RDR_W_PRTR")
    private BigDecimal strpRdrWPrtr;
    @Basic(optional = false)
    @Column(name = "CASH_ADD_ON_RT")
    private BigDecimal cashAddOnRt;
    @Basic(optional = false)
    @Column(name = "FL_NTWKS_REQD")
    private Character flNtwksReqd;
    @Basic(optional = false)
    @Column(name = "NTWK")
    private String ntwk;
    @Basic(optional = false)
    @Column(name = "CSTM_TRUCK_STP_FEE")
    private String cstmTruckStpFee;
    @Basic(optional = false)
    @Column(name = "FL_PCHS_LMT")
    private short flPchsLmt;
    @Basic(optional = false)
    @Column(name = "DLY_FL")
    private Character dlyFl;
    @Basic(optional = false)
    @Column(name = "DLY_FL_AMT")
    private BigDecimal dlyFlAmt;
    @Basic(optional = false)
    @Column(name = "RCRNG_FL")
    private short rcrngFl;
    @Basic(optional = false)
    @Column(name = "RCRNG_FL_AMT")
    private BigDecimal rcrngFlAmt;
    @Basic(optional = false)
    @Column(name = "ONE_TIMES_FL_PCHS")
    private Character oneTimesFlPchs;
    @Basic(optional = false)
    @Column(name = "FL_GAL_LMT")
    private String flGalLmt;
    @Basic(optional = false)
    @Column(name = "MULP_PROFILES")
    private Character mulpProfiles;
    @Basic(optional = false)
    @Column(name = "ONE_TIMES_PCHS_OPT")
    private Character oneTimesPchsOpt;
    @Basic(optional = false)
    @Column(name = "CASH_LMT")
    private BigDecimal cashLmt;
    @Basic(optional = false)
    @Column(name = "DLY_CASH_AMT")
    private BigDecimal dlyCashAmt;
    @Basic(optional = false)
    @Column(name = "RCRNG_CASH")
    private short rcrngCash;
    @Basic(optional = false)
    @Column(name = "RCRNG_CASH_AMT")
    private BigDecimal rcrngCashAmt;
    @Basic(optional = false)
    @Column(name = "ONE_TIMES_CASH")
    private Character oneTimesCash;
    @Basic(optional = false)
    @Column(name = "ONE_TIMES_CASH_OPT")
    private Character oneTimesCashOpt;
    @Basic(optional = false)
    @Column(name = "VERIFY_UNIT")
    private Character verifyUnit;
    @Basic(optional = false)
    @Column(name = "HUB_CPTR")
    private Character hubCptr;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private Character tripNbr;
    @Basic(optional = false)
    @Column(name = "VERIFY_DRV_NBR")
    private Character verifyDrvNbr;
    @Basic(optional = false)
    @Column(name = "PCHS_ORD")
    private Character pchsOrd;
    @Basic(optional = false)
    @Column(name = "OVRD_HUB")
    private Character ovrdHub;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR_MAX_LGTH")
    private String tripNbrMaxLgth;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR_EDIT")
    private String tripNbrEdit;
    @Basic(optional = false)
    @Column(name = "TRL_EDIT")
    private String trlEdit;
    @Basic(optional = false)
    @Column(name = "RFR_FL_BLOCK")
    private Character rfrFlBlock;
    @Basic(optional = false)
    @Column(name = "OIL_BLOCK")
    private Character oilBlock;
    @Basic(optional = false)
    @Column(name = "BLOCK_NBR_ONE")
    private Character blockNbrOne;
    @Basic(optional = false)
    @Column(name = "MAX_OIL")
    private BigDecimal maxOil;
    @Basic(optional = false)
    @Column(name = "RFR_ONLY")
    private Character rfrOnly;
    @Basic(optional = false)
    @Column(name = "BLOCK_BLENDED")
    private Character blockBlended;
    @Basic(optional = false)
    @Column(name = "HUB_MIN_MAX")
    private String hubMinMax;
    @Basic(optional = false)
    @Column(name = "MIN_GAS")
    private BigDecimal minGas;
    @Basic(optional = false)
    @Column(name = "ACT_CRD_CNT")
    private int actCrdCnt;
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
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "DLY_CSH_FLG")
    private Character dlyCshFlg;

    public PrdPfrdFl() {
    }

    public PrdPfrdFl(PrdPfrdFlPK prdPfrdFlPK) {
        this.prdPfrdFlPK = prdPfrdFlPK;
    }

    public PrdPfrdFl(PrdPfrdFlPK prdPfrdFlPK, String stupBlngMthd, int nbrCards, int nbrFnddGalsMo, String avgGalFill, BigDecimal cdnFnddFlLvla, BigDecimal cdnFnddFlLvlb, BigDecimal cdnFnddFlLvlc, BigDecimal cdnFnddCashOnly, BigDecimal strpRdr, short nbrUnits, short nbrUnitsPrtr, BigDecimal strpRdrWPrtr, BigDecimal cashAddOnRt, Character flNtwksReqd, String ntwk, String cstmTruckStpFee, short flPchsLmt, Character dlyFl, BigDecimal dlyFlAmt, short rcrngFl, BigDecimal rcrngFlAmt, Character oneTimesFlPchs, String flGalLmt, Character mulpProfiles, Character oneTimesPchsOpt, BigDecimal cashLmt, BigDecimal dlyCashAmt, short rcrngCash, BigDecimal rcrngCashAmt, Character oneTimesCash, Character oneTimesCashOpt, Character verifyUnit, Character hubCptr, Character tripNbr, Character verifyDrvNbr, Character pchsOrd, Character ovrdHub, String tripNbrMaxLgth, String tripNbrEdit, String trlEdit, Character rfrFlBlock, Character oilBlock, Character blockNbrOne, BigDecimal maxOil, Character rfrOnly, Character blockBlended, String hubMinMax, BigDecimal minGas, int actCrdCnt, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs, Character dlyCshFlg) {
        this.prdPfrdFlPK = prdPfrdFlPK;
        this.stupBlngMthd = stupBlngMthd;
        this.nbrCards = nbrCards;
        this.nbrFnddGalsMo = nbrFnddGalsMo;
        this.avgGalFill = avgGalFill;
        this.cdnFnddFlLvla = cdnFnddFlLvla;
        this.cdnFnddFlLvlb = cdnFnddFlLvlb;
        this.cdnFnddFlLvlc = cdnFnddFlLvlc;
        this.cdnFnddCashOnly = cdnFnddCashOnly;
        this.strpRdr = strpRdr;
        this.nbrUnits = nbrUnits;
        this.nbrUnitsPrtr = nbrUnitsPrtr;
        this.strpRdrWPrtr = strpRdrWPrtr;
        this.cashAddOnRt = cashAddOnRt;
        this.flNtwksReqd = flNtwksReqd;
        this.ntwk = ntwk;
        this.cstmTruckStpFee = cstmTruckStpFee;
        this.flPchsLmt = flPchsLmt;
        this.dlyFl = dlyFl;
        this.dlyFlAmt = dlyFlAmt;
        this.rcrngFl = rcrngFl;
        this.rcrngFlAmt = rcrngFlAmt;
        this.oneTimesFlPchs = oneTimesFlPchs;
        this.flGalLmt = flGalLmt;
        this.mulpProfiles = mulpProfiles;
        this.oneTimesPchsOpt = oneTimesPchsOpt;
        this.cashLmt = cashLmt;
        this.dlyCashAmt = dlyCashAmt;
        this.rcrngCash = rcrngCash;
        this.rcrngCashAmt = rcrngCashAmt;
        this.oneTimesCash = oneTimesCash;
        this.oneTimesCashOpt = oneTimesCashOpt;
        this.verifyUnit = verifyUnit;
        this.hubCptr = hubCptr;
        this.tripNbr = tripNbr;
        this.verifyDrvNbr = verifyDrvNbr;
        this.pchsOrd = pchsOrd;
        this.ovrdHub = ovrdHub;
        this.tripNbrMaxLgth = tripNbrMaxLgth;
        this.tripNbrEdit = tripNbrEdit;
        this.trlEdit = trlEdit;
        this.rfrFlBlock = rfrFlBlock;
        this.oilBlock = oilBlock;
        this.blockNbrOne = blockNbrOne;
        this.maxOil = maxOil;
        this.rfrOnly = rfrOnly;
        this.blockBlended = blockBlended;
        this.hubMinMax = hubMinMax;
        this.minGas = minGas;
        this.actCrdCnt = actCrdCnt;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.dlyCshFlg = dlyCshFlg;
    }

    public PrdPfrdFl(String applNbr, String childTyp) {
        this.prdPfrdFlPK = new PrdPfrdFlPK(applNbr, childTyp);
    }

    public PrdPfrdFlPK getPrdPfrdFlPK() {
        return prdPfrdFlPK;
    }

    public void setPrdPfrdFlPK(PrdPfrdFlPK prdPfrdFlPK) {
        this.prdPfrdFlPK = prdPfrdFlPK;
    }

    public String getStupBlngMthd() {
        return stupBlngMthd;
    }

    public void setStupBlngMthd(String stupBlngMthd) {
        this.stupBlngMthd = stupBlngMthd;
    }

    public int getNbrCards() {
        return nbrCards;
    }

    public void setNbrCards(int nbrCards) {
        this.nbrCards = nbrCards;
    }

    public int getNbrFnddGalsMo() {
        return nbrFnddGalsMo;
    }

    public void setNbrFnddGalsMo(int nbrFnddGalsMo) {
        this.nbrFnddGalsMo = nbrFnddGalsMo;
    }

    public String getAvgGalFill() {
        return avgGalFill;
    }

    public void setAvgGalFill(String avgGalFill) {
        this.avgGalFill = avgGalFill;
    }

    public BigDecimal getCdnFnddFlLvla() {
        return cdnFnddFlLvla;
    }

    public void setCdnFnddFlLvla(BigDecimal cdnFnddFlLvla) {
        this.cdnFnddFlLvla = cdnFnddFlLvla;
    }

    public BigDecimal getCdnFnddFlLvlb() {
        return cdnFnddFlLvlb;
    }

    public void setCdnFnddFlLvlb(BigDecimal cdnFnddFlLvlb) {
        this.cdnFnddFlLvlb = cdnFnddFlLvlb;
    }

    public BigDecimal getCdnFnddFlLvlc() {
        return cdnFnddFlLvlc;
    }

    public void setCdnFnddFlLvlc(BigDecimal cdnFnddFlLvlc) {
        this.cdnFnddFlLvlc = cdnFnddFlLvlc;
    }

    public BigDecimal getCdnFnddCashOnly() {
        return cdnFnddCashOnly;
    }

    public void setCdnFnddCashOnly(BigDecimal cdnFnddCashOnly) {
        this.cdnFnddCashOnly = cdnFnddCashOnly;
    }

    public BigDecimal getStrpRdr() {
        return strpRdr;
    }

    public void setStrpRdr(BigDecimal strpRdr) {
        this.strpRdr = strpRdr;
    }

    public short getNbrUnits() {
        return nbrUnits;
    }

    public void setNbrUnits(short nbrUnits) {
        this.nbrUnits = nbrUnits;
    }

    public short getNbrUnitsPrtr() {
        return nbrUnitsPrtr;
    }

    public void setNbrUnitsPrtr(short nbrUnitsPrtr) {
        this.nbrUnitsPrtr = nbrUnitsPrtr;
    }

    public BigDecimal getStrpRdrWPrtr() {
        return strpRdrWPrtr;
    }

    public void setStrpRdrWPrtr(BigDecimal strpRdrWPrtr) {
        this.strpRdrWPrtr = strpRdrWPrtr;
    }

    public BigDecimal getCashAddOnRt() {
        return cashAddOnRt;
    }

    public void setCashAddOnRt(BigDecimal cashAddOnRt) {
        this.cashAddOnRt = cashAddOnRt;
    }

    public Character getFlNtwksReqd() {
        return flNtwksReqd;
    }

    public void setFlNtwksReqd(Character flNtwksReqd) {
        this.flNtwksReqd = flNtwksReqd;
    }

    public String getNtwk() {
        return ntwk;
    }

    public void setNtwk(String ntwk) {
        this.ntwk = ntwk;
    }

    public String getCstmTruckStpFee() {
        return cstmTruckStpFee;
    }

    public void setCstmTruckStpFee(String cstmTruckStpFee) {
        this.cstmTruckStpFee = cstmTruckStpFee;
    }

    public short getFlPchsLmt() {
        return flPchsLmt;
    }

    public void setFlPchsLmt(short flPchsLmt) {
        this.flPchsLmt = flPchsLmt;
    }

    public Character getDlyFl() {
        return dlyFl;
    }

    public void setDlyFl(Character dlyFl) {
        this.dlyFl = dlyFl;
    }

    public BigDecimal getDlyFlAmt() {
        return dlyFlAmt;
    }

    public void setDlyFlAmt(BigDecimal dlyFlAmt) {
        this.dlyFlAmt = dlyFlAmt;
    }

    public short getRcrngFl() {
        return rcrngFl;
    }

    public void setRcrngFl(short rcrngFl) {
        this.rcrngFl = rcrngFl;
    }

    public BigDecimal getRcrngFlAmt() {
        return rcrngFlAmt;
    }

    public void setRcrngFlAmt(BigDecimal rcrngFlAmt) {
        this.rcrngFlAmt = rcrngFlAmt;
    }

    public Character getOneTimesFlPchs() {
        return oneTimesFlPchs;
    }

    public void setOneTimesFlPchs(Character oneTimesFlPchs) {
        this.oneTimesFlPchs = oneTimesFlPchs;
    }

    public String getFlGalLmt() {
        return flGalLmt;
    }

    public void setFlGalLmt(String flGalLmt) {
        this.flGalLmt = flGalLmt;
    }

    public Character getMulpProfiles() {
        return mulpProfiles;
    }

    public void setMulpProfiles(Character mulpProfiles) {
        this.mulpProfiles = mulpProfiles;
    }

    public Character getOneTimesPchsOpt() {
        return oneTimesPchsOpt;
    }

    public void setOneTimesPchsOpt(Character oneTimesPchsOpt) {
        this.oneTimesPchsOpt = oneTimesPchsOpt;
    }

    public BigDecimal getCashLmt() {
        return cashLmt;
    }

    public void setCashLmt(BigDecimal cashLmt) {
        this.cashLmt = cashLmt;
    }

    public BigDecimal getDlyCashAmt() {
        return dlyCashAmt;
    }

    public void setDlyCashAmt(BigDecimal dlyCashAmt) {
        this.dlyCashAmt = dlyCashAmt;
    }

    public short getRcrngCash() {
        return rcrngCash;
    }

    public void setRcrngCash(short rcrngCash) {
        this.rcrngCash = rcrngCash;
    }

    public BigDecimal getRcrngCashAmt() {
        return rcrngCashAmt;
    }

    public void setRcrngCashAmt(BigDecimal rcrngCashAmt) {
        this.rcrngCashAmt = rcrngCashAmt;
    }

    public Character getOneTimesCash() {
        return oneTimesCash;
    }

    public void setOneTimesCash(Character oneTimesCash) {
        this.oneTimesCash = oneTimesCash;
    }

    public Character getOneTimesCashOpt() {
        return oneTimesCashOpt;
    }

    public void setOneTimesCashOpt(Character oneTimesCashOpt) {
        this.oneTimesCashOpt = oneTimesCashOpt;
    }

    public Character getVerifyUnit() {
        return verifyUnit;
    }

    public void setVerifyUnit(Character verifyUnit) {
        this.verifyUnit = verifyUnit;
    }

    public Character getHubCptr() {
        return hubCptr;
    }

    public void setHubCptr(Character hubCptr) {
        this.hubCptr = hubCptr;
    }

    public Character getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(Character tripNbr) {
        this.tripNbr = tripNbr;
    }

    public Character getVerifyDrvNbr() {
        return verifyDrvNbr;
    }

    public void setVerifyDrvNbr(Character verifyDrvNbr) {
        this.verifyDrvNbr = verifyDrvNbr;
    }

    public Character getPchsOrd() {
        return pchsOrd;
    }

    public void setPchsOrd(Character pchsOrd) {
        this.pchsOrd = pchsOrd;
    }

    public Character getOvrdHub() {
        return ovrdHub;
    }

    public void setOvrdHub(Character ovrdHub) {
        this.ovrdHub = ovrdHub;
    }

    public String getTripNbrMaxLgth() {
        return tripNbrMaxLgth;
    }

    public void setTripNbrMaxLgth(String tripNbrMaxLgth) {
        this.tripNbrMaxLgth = tripNbrMaxLgth;
    }

    public String getTripNbrEdit() {
        return tripNbrEdit;
    }

    public void setTripNbrEdit(String tripNbrEdit) {
        this.tripNbrEdit = tripNbrEdit;
    }

    public String getTrlEdit() {
        return trlEdit;
    }

    public void setTrlEdit(String trlEdit) {
        this.trlEdit = trlEdit;
    }

    public Character getRfrFlBlock() {
        return rfrFlBlock;
    }

    public void setRfrFlBlock(Character rfrFlBlock) {
        this.rfrFlBlock = rfrFlBlock;
    }

    public Character getOilBlock() {
        return oilBlock;
    }

    public void setOilBlock(Character oilBlock) {
        this.oilBlock = oilBlock;
    }

    public Character getBlockNbrOne() {
        return blockNbrOne;
    }

    public void setBlockNbrOne(Character blockNbrOne) {
        this.blockNbrOne = blockNbrOne;
    }

    public BigDecimal getMaxOil() {
        return maxOil;
    }

    public void setMaxOil(BigDecimal maxOil) {
        this.maxOil = maxOil;
    }

    public Character getRfrOnly() {
        return rfrOnly;
    }

    public void setRfrOnly(Character rfrOnly) {
        this.rfrOnly = rfrOnly;
    }

    public Character getBlockBlended() {
        return blockBlended;
    }

    public void setBlockBlended(Character blockBlended) {
        this.blockBlended = blockBlended;
    }

    public String getHubMinMax() {
        return hubMinMax;
    }

    public void setHubMinMax(String hubMinMax) {
        this.hubMinMax = hubMinMax;
    }

    public BigDecimal getMinGas() {
        return minGas;
    }

    public void setMinGas(BigDecimal minGas) {
        this.minGas = minGas;
    }

    public int getActCrdCnt() {
        return actCrdCnt;
    }

    public void setActCrdCnt(int actCrdCnt) {
        this.actCrdCnt = actCrdCnt;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public Character getDlyCshFlg() {
        return dlyCshFlg;
    }

    public void setDlyCshFlg(Character dlyCshFlg) {
        this.dlyCshFlg = dlyCshFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdPfrdFlPK != null ? prdPfrdFlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdPfrdFl)) {
            return false;
        }
        PrdPfrdFl other = (PrdPfrdFl) object;
        if ((this.prdPfrdFlPK == null && other.prdPfrdFlPK != null) || (this.prdPfrdFlPK != null && !this.prdPfrdFlPK.equals(other.prdPfrdFlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdPfrdFl[ prdPfrdFlPK=" + prdPfrdFlPK + " ]";
    }
    
}
