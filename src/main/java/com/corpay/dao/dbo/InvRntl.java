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
@Table(name = "INV_RNTL", catalog = "", schema = "DBO")
public class InvRntl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvRntlPK invRntlPK;
    @Basic(optional = false)
    @Column(name = "RNTL_CR_OR_DB")
    private Character rntlCrOrDb;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "RNTL_AGMT_NBR")
    private String rntlAgmtNbr;
    @Basic(optional = false)
    @Column(name = "RNTR_NM")
    private String rntrNm;
    @Basic(optional = false)
    @Column(name = "RTN_CITY")
    private String rtnCity;
    @Basic(optional = false)
    @Column(name = "RTN_ST")
    private String rtnSt;
    @Basic(optional = false)
    @Column(name = "RNTL_RTN_CRTY")
    private String rntlRtnCrty;
    @Basic(optional = false)
    @Column(name = "RTN_DT")
    @Temporal(TemporalType.DATE)
    private Date rtnDt;
    @Basic(optional = false)
    @Column(name = "RTN_LOC_ID")
    private String rtnLocId;
    @Basic(optional = false)
    @Column(name = "CHKT_DT")
    @Temporal(TemporalType.DATE)
    private Date chktDt;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_NBR")
    private String custSrvNbr;
    @Basic(optional = false)
    @Column(name = "RNTL_RT_IND")
    private Character rntlRtInd;

    @Basic(optional = false)
    @Column(name = "RNTL_RT")
    private BigDecimal rntlRt;
    @Basic(optional = false)
    @Column(name = "RT_P_MILE_OR_KILOS")
    private BigDecimal rtPMileOrKilos;
    @Basic(optional = false)
    @Column(name = "MLS_OR_KILO_IND")
    private String mlsOrKiloInd;
    @Basic(optional = false)
    @Column(name = "MAX_FREE_MLS")
    private String maxFreeMls;
    @Basic(optional = false)
    @Column(name = "MLS_KILO_IND")
    private Character mlsKiloInd;
    @Basic(optional = false)
    @Column(name = "INS_IND")
    private Character insInd;
    @Basic(optional = false)
    @Column(name = "VEH_INS_CHGS")
    private BigDecimal vehInsChgs;
    @Basic(optional = false)
    @Column(name = "ADJD_AMT")
    private BigDecimal adjdAmt;
    @Basic(optional = false)
    @Column(name = "ADJD_AMT_IND")
    private Character adjdAmtInd;
    @Basic(optional = false)
    @Column(name = "PGM_CD")
    private String pgmCd;
    @Basic(optional = false)
    @Column(name = "RNTL_LOC_CITY")
    private String rntlLocCity;
    @Basic(optional = false)
    @Column(name = "RNTL_LOC_ST")
    private String rntlLocSt;
    @Basic(optional = false)
    @Column(name = "RNTL_LOC_CRTY")
    private String rntlLocCrty;
    @Basic(optional = false)
    @Column(name = "RNTL_LOC_ID")
    private String rntlLocId;
    @Basic(optional = false)
    @Column(name = "RNTL_CLS_ID")
    private String rntlClsId;
    @Basic(optional = false)
    @Column(name = "COM_CD")
    private String comCd;
    @Basic(optional = false)
    @Column(name = "TAX_EXPT_IND")
    private Character taxExptInd;
    @Basic(optional = false)
    @Column(name = "NO_SHOW_IND")
    private Character noShowInd;
    @Basic(optional = false)
    @Column(name = "DYS_RTD")
    private String dysRtd;
    @Basic(optional = false)
    @Column(name = "WKLY_RNTL_AMT")
    private BigDecimal wklyRntlAmt;
    @Basic(optional = false)
    @Column(name = "TOT_ATHD_AMT")
    private BigDecimal totAthdAmt;
    @Basic(optional = false)
    @Column(name = "ONE_WAY_DROP_OFF_C")
    private BigDecimal oneWayDropOffC;
    @Basic(optional = false)
    @Column(name = "REGL_MILA_CHRG")
    private BigDecimal reglMilaChrg;
    @Basic(optional = false)
    @Column(name = "EXT_MILA_CHRG")
    private BigDecimal extMilaChrg;
    @Basic(optional = false)
    @Column(name = "LATE_CHRG")
    private BigDecimal lateChrg;
    @Basic(optional = false)
    @Column(name = "FL_CHRG")
    private BigDecimal flChrg;
    @Basic(optional = false)
    @Column(name = "TOW_CHGS")
    private BigDecimal towChgs;
    @Basic(optional = false)
    @Column(name = "EXT_CHGS")
    private BigDecimal extChgs;
    @Basic(optional = false)
    @Column(name = "OTH_CHGS")
    private BigDecimal othChgs;
    @Basic(optional = false)
    @Column(name = "TAX_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taxTs;
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

    public InvRntl() {
    }

    public InvRntl(InvRntlPK invRntlPK) {
        this.invRntlPK = invRntlPK;
    }

    public InvRntl(InvRntlPK invRntlPK, Character rntlCrOrDb, Character blngTyp, String rntlAgmtNbr, String rntrNm, String rtnCity, String rtnSt, String rntlRtnCrty, Date rtnDt, String rtnLocId, Date chktDt, String custSrvNbr, Character rntlRtInd, BigDecimal rntlRt, BigDecimal rtPMileOrKilos, String mlsOrKiloInd, String maxFreeMls, Character mlsKiloInd, Character insInd, BigDecimal vehInsChgs, BigDecimal adjdAmt, Character adjdAmtInd, String pgmCd, String rntlLocCity, String rntlLocSt, String rntlLocCrty, String rntlLocId, String rntlClsId, String comCd, Character taxExptInd, Character noShowInd, String dysRtd, BigDecimal wklyRntlAmt, BigDecimal totAthdAmt, BigDecimal oneWayDropOffC, BigDecimal reglMilaChrg, BigDecimal extMilaChrg, BigDecimal lateChrg, BigDecimal flChrg, BigDecimal towChgs, BigDecimal extChgs, BigDecimal othChgs, Date taxTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invRntlPK = invRntlPK;
        this.rntlCrOrDb = rntlCrOrDb;
        this.blngTyp = blngTyp;
        this.rntlAgmtNbr = rntlAgmtNbr;
        this.rntrNm = rntrNm;
        this.rtnCity = rtnCity;
        this.rtnSt = rtnSt;
        this.rntlRtnCrty = rntlRtnCrty;
        this.rtnDt = rtnDt;
        this.rtnLocId = rtnLocId;
        this.chktDt = chktDt;
        this.custSrvNbr = custSrvNbr;
        this.rntlRtInd = rntlRtInd;
        this.rntlRt = rntlRt;
        this.rtPMileOrKilos = rtPMileOrKilos;
        this.mlsOrKiloInd = mlsOrKiloInd;
        this.maxFreeMls = maxFreeMls;
        this.mlsKiloInd = mlsKiloInd;
        this.insInd = insInd;
        this.vehInsChgs = vehInsChgs;
        this.adjdAmt = adjdAmt;
        this.adjdAmtInd = adjdAmtInd;
        this.pgmCd = pgmCd;
        this.rntlLocCity = rntlLocCity;
        this.rntlLocSt = rntlLocSt;
        this.rntlLocCrty = rntlLocCrty;
        this.rntlLocId = rntlLocId;
        this.rntlClsId = rntlClsId;
        this.comCd = comCd;
        this.taxExptInd = taxExptInd;
        this.noShowInd = noShowInd;
        this.dysRtd = dysRtd;
        this.wklyRntlAmt = wklyRntlAmt;
        this.totAthdAmt = totAthdAmt;
        this.oneWayDropOffC = oneWayDropOffC;
        this.reglMilaChrg = reglMilaChrg;
        this.extMilaChrg = extMilaChrg;
        this.lateChrg = lateChrg;
        this.flChrg = flChrg;
        this.towChgs = towChgs;
        this.extChgs = extChgs;
        this.othChgs = othChgs;
        this.taxTs = taxTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvRntl(Date pstdDt, int trnsId) {
        this.invRntlPK = new InvRntlPK(pstdDt, trnsId);
    }

    public InvRntlPK getInvRntlPK() {
        return invRntlPK;
    }

    public void setInvRntlPK(InvRntlPK invRntlPK) {
        this.invRntlPK = invRntlPK;
    }

    public Character getRntlCrOrDb() {
        return rntlCrOrDb;
    }

    public void setRntlCrOrDb(Character rntlCrOrDb) {
        this.rntlCrOrDb = rntlCrOrDb;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getRntlAgmtNbr() {
        return rntlAgmtNbr;
    }

    public void setRntlAgmtNbr(String rntlAgmtNbr) {
        this.rntlAgmtNbr = rntlAgmtNbr;
    }

    public String getRntrNm() {
        return rntrNm;
    }

    public void setRntrNm(String rntrNm) {
        this.rntrNm = rntrNm;
    }

    public String getRtnCity() {
        return rtnCity;
    }

    public void setRtnCity(String rtnCity) {
        this.rtnCity = rtnCity;
    }

    public String getRtnSt() {
        return rtnSt;
    }

    public void setRtnSt(String rtnSt) {
        this.rtnSt = rtnSt;
    }

    public String getRntlRtnCrty() {
        return rntlRtnCrty;
    }

    public void setRntlRtnCrty(String rntlRtnCrty) {
        this.rntlRtnCrty = rntlRtnCrty;
    }

    public Date getRtnDt() {
        return rtnDt;
    }

    public void setRtnDt(Date rtnDt) {
        this.rtnDt = rtnDt;
    }

    public String getRtnLocId() {
        return rtnLocId;
    }

    public void setRtnLocId(String rtnLocId) {
        this.rtnLocId = rtnLocId;
    }

    public Date getChktDt() {
        return chktDt;
    }

    public void setChktDt(Date chktDt) {
        this.chktDt = chktDt;
    }

    public String getCustSrvNbr() {
        return custSrvNbr;
    }

    public void setCustSrvNbr(String custSrvNbr) {
        this.custSrvNbr = custSrvNbr;
    }

    public Character getRntlRtInd() {
        return rntlRtInd;
    }

    public void setRntlRtInd(Character rntlRtInd) {
        this.rntlRtInd = rntlRtInd;
    }

    public BigDecimal getRntlRt() {
        return rntlRt;
    }

    public void setRntlRt(BigDecimal rntlRt) {
        this.rntlRt = rntlRt;
    }

    public BigDecimal getRtPMileOrKilos() {
        return rtPMileOrKilos;
    }

    public void setRtPMileOrKilos(BigDecimal rtPMileOrKilos) {
        this.rtPMileOrKilos = rtPMileOrKilos;
    }

    public String getMlsOrKiloInd() {
        return mlsOrKiloInd;
    }

    public void setMlsOrKiloInd(String mlsOrKiloInd) {
        this.mlsOrKiloInd = mlsOrKiloInd;
    }

    public String getMaxFreeMls() {
        return maxFreeMls;
    }

    public void setMaxFreeMls(String maxFreeMls) {
        this.maxFreeMls = maxFreeMls;
    }

    public Character getMlsKiloInd() {
        return mlsKiloInd;
    }

    public void setMlsKiloInd(Character mlsKiloInd) {
        this.mlsKiloInd = mlsKiloInd;
    }

    public Character getInsInd() {
        return insInd;
    }

    public void setInsInd(Character insInd) {
        this.insInd = insInd;
    }

    public BigDecimal getVehInsChgs() {
        return vehInsChgs;
    }

    public void setVehInsChgs(BigDecimal vehInsChgs) {
        this.vehInsChgs = vehInsChgs;
    }

    public BigDecimal getAdjdAmt() {
        return adjdAmt;
    }

    public void setAdjdAmt(BigDecimal adjdAmt) {
        this.adjdAmt = adjdAmt;
    }

    public Character getAdjdAmtInd() {
        return adjdAmtInd;
    }

    public void setAdjdAmtInd(Character adjdAmtInd) {
        this.adjdAmtInd = adjdAmtInd;
    }

    public String getPgmCd() {
        return pgmCd;
    }

    public void setPgmCd(String pgmCd) {
        this.pgmCd = pgmCd;
    }

    public String getRntlLocCity() {
        return rntlLocCity;
    }

    public void setRntlLocCity(String rntlLocCity) {
        this.rntlLocCity = rntlLocCity;
    }

    public String getRntlLocSt() {
        return rntlLocSt;
    }

    public void setRntlLocSt(String rntlLocSt) {
        this.rntlLocSt = rntlLocSt;
    }

    public String getRntlLocCrty() {
        return rntlLocCrty;
    }

    public void setRntlLocCrty(String rntlLocCrty) {
        this.rntlLocCrty = rntlLocCrty;
    }

    public String getRntlLocId() {
        return rntlLocId;
    }

    public void setRntlLocId(String rntlLocId) {
        this.rntlLocId = rntlLocId;
    }

    public String getRntlClsId() {
        return rntlClsId;
    }

    public void setRntlClsId(String rntlClsId) {
        this.rntlClsId = rntlClsId;
    }

    public String getComCd() {
        return comCd;
    }

    public void setComCd(String comCd) {
        this.comCd = comCd;
    }

    public Character getTaxExptInd() {
        return taxExptInd;
    }

    public void setTaxExptInd(Character taxExptInd) {
        this.taxExptInd = taxExptInd;
    }

    public Character getNoShowInd() {
        return noShowInd;
    }

    public void setNoShowInd(Character noShowInd) {
        this.noShowInd = noShowInd;
    }

    public String getDysRtd() {
        return dysRtd;
    }

    public void setDysRtd(String dysRtd) {
        this.dysRtd = dysRtd;
    }

    public BigDecimal getWklyRntlAmt() {
        return wklyRntlAmt;
    }

    public void setWklyRntlAmt(BigDecimal wklyRntlAmt) {
        this.wklyRntlAmt = wklyRntlAmt;
    }

    public BigDecimal getTotAthdAmt() {
        return totAthdAmt;
    }

    public void setTotAthdAmt(BigDecimal totAthdAmt) {
        this.totAthdAmt = totAthdAmt;
    }

    public BigDecimal getOneWayDropOffC() {
        return oneWayDropOffC;
    }

    public void setOneWayDropOffC(BigDecimal oneWayDropOffC) {
        this.oneWayDropOffC = oneWayDropOffC;
    }

    public BigDecimal getReglMilaChrg() {
        return reglMilaChrg;
    }

    public void setReglMilaChrg(BigDecimal reglMilaChrg) {
        this.reglMilaChrg = reglMilaChrg;
    }

    public BigDecimal getExtMilaChrg() {
        return extMilaChrg;
    }

    public void setExtMilaChrg(BigDecimal extMilaChrg) {
        this.extMilaChrg = extMilaChrg;
    }

    public BigDecimal getLateChrg() {
        return lateChrg;
    }

    public void setLateChrg(BigDecimal lateChrg) {
        this.lateChrg = lateChrg;
    }

    public BigDecimal getFlChrg() {
        return flChrg;
    }

    public void setFlChrg(BigDecimal flChrg) {
        this.flChrg = flChrg;
    }

    public BigDecimal getTowChgs() {
        return towChgs;
    }

    public void setTowChgs(BigDecimal towChgs) {
        this.towChgs = towChgs;
    }

    public BigDecimal getExtChgs() {
        return extChgs;
    }

    public void setExtChgs(BigDecimal extChgs) {
        this.extChgs = extChgs;
    }

    public BigDecimal getOthChgs() {
        return othChgs;
    }

    public void setOthChgs(BigDecimal othChgs) {
        this.othChgs = othChgs;
    }

    public Date getTaxTs() {
        return taxTs;
    }

    public void setTaxTs(Date taxTs) {
        this.taxTs = taxTs;
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
        hash += (invRntlPK != null ? invRntlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvRntl)) {
            return false;
        }
        InvRntl other = (InvRntl) object;
        if ((this.invRntlPK == null && other.invRntlPK != null) || (this.invRntlPK != null && !this.invRntlPK.equals(other.invRntlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvRntl[ invRntlPK=" + invRntlPK + " ]";
    }

}
