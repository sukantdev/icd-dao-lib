package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRD_CDN_CMPLT_FLT", catalog = "", schema = "DBO")
public class PrdCdnCmpltFlt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdCdnCmpltFltPK prdCdnCmpltFltPK;

    @Basic(optional = false)
    @Column(name = "RQSTD_CR_LMT")
    private BigDecimal rqstdCrLmt;
    @Basic(optional = false)
    @Column(name = "CRD_TYP_FLGS")
    private short crdTypFlgs;
    @Basic(optional = false)
    @Column(name = "NBR_CARDS")
    private int nbrCards;
    @Basic(optional = false)
    @Column(name = "TS_MRCH")
    private String tsMrch;
    @Basic(optional = false)
    @Column(name = "FL_PCHS_LMT")
    private short flPchsLmt;
    @Basic(optional = false)
    @Column(name = "DLY_FL_FLG")
    private Character dlyFlFlg;
    @Basic(optional = false)
    @Column(name = "DLY_FL_AMT")
    private BigDecimal dlyFlAmt;
    @Basic(optional = false)
    @Column(name = "RCRNG_FL_FLGS")
    private short rcrngFlFlgs;
    @Basic(optional = false)
    @Column(name = "RCRNG_FL_AMT")
    private BigDecimal rcrngFlAmt;
    @Basic(optional = false)
    @Column(name = "ONE_TM_FL_FLG")
    private Character oneTmFlFlg;
    @Basic(optional = false)
    @Column(name = "FL_GAL_LMT")
    private String flGalLmt;
    @Basic(optional = false)
    @Column(name = "MULP_PROFILES_FLG")
    private Character mulpProfilesFlg;
    @Basic(optional = false)
    @Column(name = "ONE_TM_PCHS_OPTN")
    private Character oneTmPchsOptn;
    @Basic(optional = false)
    @Column(name = "CASH_LMT")
    private BigDecimal cashLmt;
    @Basic(optional = false)
    @Column(name = "DLY_CASH")
    private Character dlyCash;
    @Basic(optional = false)
    @Column(name = "DLY_CASH_AMT")
    private BigDecimal dlyCashAmt;
    @Basic(optional = false)
    @Column(name = "RCRNG_CASH_INTERES")
    private short rcrngCashInteres;
    @Basic(optional = false)
    @Column(name = "RCRNG_CASH_AMT")
    private BigDecimal rcrngCashAmt;
    @Basic(optional = false)
    @Column(name = "ONE_TM_CASH_FLG")
    private Character oneTmCashFlg;
    @Basic(optional = false)
    @Column(name = "ONE_TM_CASH_AMT")
    private BigDecimal oneTmCashAmt;
    @Basic(optional = false)
    @Column(name = "VERIFY_UNIT_FLG")
    private Character verifyUnitFlg;
    @Basic(optional = false)
    @Column(name = "HUB_CPTR_FLG")
    private Character hubCptrFlg;
    @Basic(optional = false)
    @Column(name = "VERIFY_DRV_NBR")
    private short verifyDrvNbr;
    @Basic(optional = false)
    @Column(name = "PCHS_ORD_FLG")
    private Character pchsOrdFlg;
    @Basic(optional = false)
    @Column(name = "OVRD_HUB_FLG")
    private Character ovrdHubFlg;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR_MAX_LGTH")
    private String tripNbrMaxLgth;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR_EDIT")
    private String tripNbrEdit;
    @Basic(optional = false)
    @Column(name = "HUB_MIN_MAX")
    private String hubMinMax;
    @Basic(optional = false)
    @Column(name = "TRL_NBR_EDIT")
    private String trlNbrEdit;
    @Basic(optional = false)
    @Column(name = "RFR_FL_BLK_FLG")
    private Character rfrFlBlkFlg;
    @Basic(optional = false)
    @Column(name = "OIL_BLK_FLG")
    private Character oilBlkFlg;
    @Basic(optional = false)
    @Column(name = "NBR_ONE_BLK_FLG")
    private Character nbrOneBlkFlg;
    @Basic(optional = false)
    @Column(name = "MAX_OIL_MIN_GAS")
    private String maxOilMinGas;
    @Basic(optional = false)
    @Column(name = "RFR_ONLY_FLG")
    private Character rfrOnlyFlg;
    @Basic(optional = false)
    @Column(name = "BLK_BLNDD_FLG")
    private Character blkBlnddFlg;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR_FLG")
    private Character tripNbrFlg;
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

    public PrdCdnCmpltFlt() {
    }

    public PrdCdnCmpltFlt(PrdCdnCmpltFltPK prdCdnCmpltFltPK) {
        this.prdCdnCmpltFltPK = prdCdnCmpltFltPK;
    }

    public PrdCdnCmpltFlt(PrdCdnCmpltFltPK prdCdnCmpltFltPK, BigDecimal rqstdCrLmt, short crdTypFlgs, int nbrCards, String tsMrch, short flPchsLmt, Character dlyFlFlg, BigDecimal dlyFlAmt, short rcrngFlFlgs, BigDecimal rcrngFlAmt, Character oneTmFlFlg, String flGalLmt, Character mulpProfilesFlg, Character oneTmPchsOptn, BigDecimal cashLmt, Character dlyCash, BigDecimal dlyCashAmt, short rcrngCashInteres, BigDecimal rcrngCashAmt, Character oneTmCashFlg, BigDecimal oneTmCashAmt, Character verifyUnitFlg, Character hubCptrFlg, short verifyDrvNbr, Character pchsOrdFlg, Character ovrdHubFlg, String tripNbrMaxLgth, String tripNbrEdit, String hubMinMax, String trlNbrEdit, Character rfrFlBlkFlg, Character oilBlkFlg, Character nbrOneBlkFlg, String maxOilMinGas, Character rfrOnlyFlg, Character blkBlnddFlg, Character tripNbrFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdCdnCmpltFltPK = prdCdnCmpltFltPK;
        this.rqstdCrLmt = rqstdCrLmt;
        this.crdTypFlgs = crdTypFlgs;
        this.nbrCards = nbrCards;
        this.tsMrch = tsMrch;
        this.flPchsLmt = flPchsLmt;
        this.dlyFlFlg = dlyFlFlg;
        this.dlyFlAmt = dlyFlAmt;
        this.rcrngFlFlgs = rcrngFlFlgs;
        this.rcrngFlAmt = rcrngFlAmt;
        this.oneTmFlFlg = oneTmFlFlg;
        this.flGalLmt = flGalLmt;
        this.mulpProfilesFlg = mulpProfilesFlg;
        this.oneTmPchsOptn = oneTmPchsOptn;
        this.cashLmt = cashLmt;
        this.dlyCash = dlyCash;
        this.dlyCashAmt = dlyCashAmt;
        this.rcrngCashInteres = rcrngCashInteres;
        this.rcrngCashAmt = rcrngCashAmt;
        this.oneTmCashFlg = oneTmCashFlg;
        this.oneTmCashAmt = oneTmCashAmt;
        this.verifyUnitFlg = verifyUnitFlg;
        this.hubCptrFlg = hubCptrFlg;
        this.verifyDrvNbr = verifyDrvNbr;
        this.pchsOrdFlg = pchsOrdFlg;
        this.ovrdHubFlg = ovrdHubFlg;
        this.tripNbrMaxLgth = tripNbrMaxLgth;
        this.tripNbrEdit = tripNbrEdit;
        this.hubMinMax = hubMinMax;
        this.trlNbrEdit = trlNbrEdit;
        this.rfrFlBlkFlg = rfrFlBlkFlg;
        this.oilBlkFlg = oilBlkFlg;
        this.nbrOneBlkFlg = nbrOneBlkFlg;
        this.maxOilMinGas = maxOilMinGas;
        this.rfrOnlyFlg = rfrOnlyFlg;
        this.blkBlnddFlg = blkBlnddFlg;
        this.tripNbrFlg = tripNbrFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdCdnCmpltFlt(String applNbr, String childTyp) {
        this.prdCdnCmpltFltPK = new PrdCdnCmpltFltPK(applNbr, childTyp);
    }

    public PrdCdnCmpltFltPK getPrdCdnCmpltFltPK() {
        return prdCdnCmpltFltPK;
    }

    public void setPrdCdnCmpltFltPK(PrdCdnCmpltFltPK prdCdnCmpltFltPK) {
        this.prdCdnCmpltFltPK = prdCdnCmpltFltPK;
    }

    public BigDecimal getRqstdCrLmt() {
        return rqstdCrLmt;
    }

    public void setRqstdCrLmt(BigDecimal rqstdCrLmt) {
        this.rqstdCrLmt = rqstdCrLmt;
    }

    public short getCrdTypFlgs() {
        return crdTypFlgs;
    }

    public void setCrdTypFlgs(short crdTypFlgs) {
        this.crdTypFlgs = crdTypFlgs;
    }

    public int getNbrCards() {
        return nbrCards;
    }

    public void setNbrCards(int nbrCards) {
        this.nbrCards = nbrCards;
    }

    public String getTsMrch() {
        return tsMrch;
    }

    public void setTsMrch(String tsMrch) {
        this.tsMrch = tsMrch;
    }

    public short getFlPchsLmt() {
        return flPchsLmt;
    }

    public void setFlPchsLmt(short flPchsLmt) {
        this.flPchsLmt = flPchsLmt;
    }

    public Character getDlyFlFlg() {
        return dlyFlFlg;
    }

    public void setDlyFlFlg(Character dlyFlFlg) {
        this.dlyFlFlg = dlyFlFlg;
    }

    public BigDecimal getDlyFlAmt() {
        return dlyFlAmt;
    }

    public void setDlyFlAmt(BigDecimal dlyFlAmt) {
        this.dlyFlAmt = dlyFlAmt;
    }

    public short getRcrngFlFlgs() {
        return rcrngFlFlgs;
    }

    public void setRcrngFlFlgs(short rcrngFlFlgs) {
        this.rcrngFlFlgs = rcrngFlFlgs;
    }

    public BigDecimal getRcrngFlAmt() {
        return rcrngFlAmt;
    }

    public void setRcrngFlAmt(BigDecimal rcrngFlAmt) {
        this.rcrngFlAmt = rcrngFlAmt;
    }

    public Character getOneTmFlFlg() {
        return oneTmFlFlg;
    }

    public void setOneTmFlFlg(Character oneTmFlFlg) {
        this.oneTmFlFlg = oneTmFlFlg;
    }

    public String getFlGalLmt() {
        return flGalLmt;
    }

    public void setFlGalLmt(String flGalLmt) {
        this.flGalLmt = flGalLmt;
    }

    public Character getMulpProfilesFlg() {
        return mulpProfilesFlg;
    }

    public void setMulpProfilesFlg(Character mulpProfilesFlg) {
        this.mulpProfilesFlg = mulpProfilesFlg;
    }

    public Character getOneTmPchsOptn() {
        return oneTmPchsOptn;
    }

    public void setOneTmPchsOptn(Character oneTmPchsOptn) {
        this.oneTmPchsOptn = oneTmPchsOptn;
    }

    public BigDecimal getCashLmt() {
        return cashLmt;
    }

    public void setCashLmt(BigDecimal cashLmt) {
        this.cashLmt = cashLmt;
    }

    public Character getDlyCash() {
        return dlyCash;
    }

    public void setDlyCash(Character dlyCash) {
        this.dlyCash = dlyCash;
    }

    public BigDecimal getDlyCashAmt() {
        return dlyCashAmt;
    }

    public void setDlyCashAmt(BigDecimal dlyCashAmt) {
        this.dlyCashAmt = dlyCashAmt;
    }

    public short getRcrngCashInteres() {
        return rcrngCashInteres;
    }

    public void setRcrngCashInteres(short rcrngCashInteres) {
        this.rcrngCashInteres = rcrngCashInteres;
    }

    public BigDecimal getRcrngCashAmt() {
        return rcrngCashAmt;
    }

    public void setRcrngCashAmt(BigDecimal rcrngCashAmt) {
        this.rcrngCashAmt = rcrngCashAmt;
    }

    public Character getOneTmCashFlg() {
        return oneTmCashFlg;
    }

    public void setOneTmCashFlg(Character oneTmCashFlg) {
        this.oneTmCashFlg = oneTmCashFlg;
    }

    public BigDecimal getOneTmCashAmt() {
        return oneTmCashAmt;
    }

    public void setOneTmCashAmt(BigDecimal oneTmCashAmt) {
        this.oneTmCashAmt = oneTmCashAmt;
    }

    public Character getVerifyUnitFlg() {
        return verifyUnitFlg;
    }

    public void setVerifyUnitFlg(Character verifyUnitFlg) {
        this.verifyUnitFlg = verifyUnitFlg;
    }

    public Character getHubCptrFlg() {
        return hubCptrFlg;
    }

    public void setHubCptrFlg(Character hubCptrFlg) {
        this.hubCptrFlg = hubCptrFlg;
    }

    public short getVerifyDrvNbr() {
        return verifyDrvNbr;
    }

    public void setVerifyDrvNbr(short verifyDrvNbr) {
        this.verifyDrvNbr = verifyDrvNbr;
    }

    public Character getPchsOrdFlg() {
        return pchsOrdFlg;
    }

    public void setPchsOrdFlg(Character pchsOrdFlg) {
        this.pchsOrdFlg = pchsOrdFlg;
    }

    public Character getOvrdHubFlg() {
        return ovrdHubFlg;
    }

    public void setOvrdHubFlg(Character ovrdHubFlg) {
        this.ovrdHubFlg = ovrdHubFlg;
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

    public String getHubMinMax() {
        return hubMinMax;
    }

    public void setHubMinMax(String hubMinMax) {
        this.hubMinMax = hubMinMax;
    }

    public String getTrlNbrEdit() {
        return trlNbrEdit;
    }

    public void setTrlNbrEdit(String trlNbrEdit) {
        this.trlNbrEdit = trlNbrEdit;
    }

    public Character getRfrFlBlkFlg() {
        return rfrFlBlkFlg;
    }

    public void setRfrFlBlkFlg(Character rfrFlBlkFlg) {
        this.rfrFlBlkFlg = rfrFlBlkFlg;
    }

    public Character getOilBlkFlg() {
        return oilBlkFlg;
    }

    public void setOilBlkFlg(Character oilBlkFlg) {
        this.oilBlkFlg = oilBlkFlg;
    }

    public Character getNbrOneBlkFlg() {
        return nbrOneBlkFlg;
    }

    public void setNbrOneBlkFlg(Character nbrOneBlkFlg) {
        this.nbrOneBlkFlg = nbrOneBlkFlg;
    }

    public String getMaxOilMinGas() {
        return maxOilMinGas;
    }

    public void setMaxOilMinGas(String maxOilMinGas) {
        this.maxOilMinGas = maxOilMinGas;
    }

    public Character getRfrOnlyFlg() {
        return rfrOnlyFlg;
    }

    public void setRfrOnlyFlg(Character rfrOnlyFlg) {
        this.rfrOnlyFlg = rfrOnlyFlg;
    }

    public Character getBlkBlnddFlg() {
        return blkBlnddFlg;
    }

    public void setBlkBlnddFlg(Character blkBlnddFlg) {
        this.blkBlnddFlg = blkBlnddFlg;
    }

    public Character getTripNbrFlg() {
        return tripNbrFlg;
    }

    public void setTripNbrFlg(Character tripNbrFlg) {
        this.tripNbrFlg = tripNbrFlg;
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
        hash += (prdCdnCmpltFltPK != null ? prdCdnCmpltFltPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdCdnCmpltFlt)) {
            return false;
        }
        PrdCdnCmpltFlt other = (PrdCdnCmpltFlt) object;
        if ((this.prdCdnCmpltFltPK == null && other.prdCdnCmpltFltPK != null) || (this.prdCdnCmpltFltPK != null && !this.prdCdnCmpltFltPK.equals(other.prdCdnCmpltFltPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCdnCmpltFlt[ prdCdnCmpltFltPK=" + prdCdnCmpltFltPK + " ]";
    }

}
