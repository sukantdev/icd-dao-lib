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
@Table(name = "EXC_LMT", catalog = "", schema = "DBO")
public class ExcLmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcLmtPK excLmtPK;
    @Basic(optional = false)
    @Column(name = "FLG_DLY_DLR")
    private short flgDlyDlr;

    @Basic(optional = false)
    @Column(name = "MAX_DLY_DLR_LMT")
    private BigDecimal maxDlyDlrLmt;
    @Basic(optional = false)
    @Column(name = "FLG_DLY_TRNS")
    private short flgDlyTrns;
    @Basic(optional = false)
    @Column(name = "MAX_DLY_TRNS")
    private int maxDlyTrns;
    @Basic(optional = false)
    @Column(name = "FLG_WKND_SRV")
    private short flgWkndSrv;
    @Basic(optional = false)
    @Column(name = "FLG_DUP")
    private short flgDup;
    @Basic(optional = false)
    @Column(name = "FLG_TANK_CAP")
    private short flgTankCap;
    @Basic(optional = false)
    @Column(name = "EXCD_TANK_CAP_LMT")
    private int excdTankCapLmt;
    @Basic(optional = false)
    @Column(name = "FLG_MPG")
    private short flgMpg;
    @Basic(optional = false)
    @Column(name = "MAX_MPG")
    private BigDecimal maxMpg;
    @Basic(optional = false)
    @Column(name = "FLG_CPG")
    private short flgCpg;
    @Basic(optional = false)
    @Column(name = "MAX_CPG")
    private BigDecimal maxCpg;
    @Basic(optional = false)
    @Column(name = "FLG_HIGH_GRD_FL")
    private short flgHighGrdFl;
    @Basic(optional = false)
    @Column(name = "FLG_AVN_FL")
    private short flgAvnFl;
    @Basic(optional = false)
    @Column(name = "FLG_MRNE_FL")
    private short flgMrneFl;
    @Basic(optional = false)
    @Column(name = "FLG_KRSN")
    private short flgKrsn;
    @Basic(optional = false)
    @Column(name = "FLG_PPNE")
    private short flgPpne;
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
    @Column(name = "FLG_AFT_HR")
    private short flgAftHr;
    @Basic(optional = false)
    @Column(name = "FLG_UNLDED_REGL")
    private short flgUnldedRegl;
    @Basic(optional = false)
    @Column(name = "FLG_UNLDED_MIDGRAD")
    private short flgUnldedMidgrad;
    @Basic(optional = false)
    @Column(name = "FLG_UNLDED_PREMIUM")
    private short flgUnldedPremium;
    @Basic(optional = false)
    @Column(name = "FLG_UNLDED_SUPER")
    private short flgUnldedSuper;
    @Basic(optional = false)
    @Column(name = "FLG_NBR_TWO_DSL")
    private short flgNbrTwoDsl;
    @Basic(optional = false)
    @Column(name = "FLG_PREMIUM_DSL")
    private short flgPremiumDsl;
    @Basic(optional = false)
    @Column(name = "FLG_ETHANOL")
    private short flgEthanol;
    @Basic(optional = false)
    @Column(name = "FLG_METHANOL")
    private short flgMethanol;
    @Basic(optional = false)
    @Column(name = "FLG_OTH_FL")
    private short flgOthFl;
    @Basic(optional = false)
    @Column(name = "FLG_SAT_PCHS")
    private short flgSatPchs;
    @Basic(optional = false)
    @Column(name = "FLG_SUN_PCHS")
    private short flgSunPchs;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_CLR_2PCT")
    private short flgBdslClr2pct;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_CLR_5PCT")
    private short flgBdslClr5pct;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_CLR_20PCT")
    private short flgBdslClr20pct;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYDLS_2PC")
    private short flgBdslDydls2pc;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYDLS_5PC")
    private short flgBdslDydls5pc;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYDLS_20P")
    private short flgBdslDydls20p;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYDHS_2PC")
    private short flgBdslDydhs2pc;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYDHS_5PC")
    private short flgBdslDydhs5pc;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYDHS_20P")
    private short flgBdslDydhs20p;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_CLR_100PC")
    private short flgBdslClr100pc;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_C_10PC_BL")
    private short flgBdslC10pcBl;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_C_11PC_BL")
    private short flgBdslC11pcBl;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_C_15PC_BL")
    private short flgBdslC15pcBl;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYED_100P")
    private short flgBdslDyed100p;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DLS_10P_B")
    private short flgBdslDls10pB;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DLS_11P_B")
    private short flgBdslDls11pB;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DLS_15P_B")
    private short flgBdslDls15pB;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DHS_10P_B")
    private short flgBdslDhs10pB;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DHS_11P_B")
    private short flgBdslDhs11pB;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DHS_15P_B")
    private short flgBdslDhs15pB;
    @Basic(optional = false)
    @Column(name = "FLG_DSL_EXHAUST_FLD")
    private short flgDslExhaustFld;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_CLR")
    private short flgBdslClr;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYED")
    private short flgBdslDyed;
    @Basic(optional = false)
    @Column(name = "LQID_NATL_GAS")
    private short lqidNatlGas;
    @Basic(optional = false)
    @Column(name = "CMPRSSD_NATL_GAS")
    private short cmprssdNatlGas;

    public ExcLmt() {
    }

    public ExcLmt(ExcLmtPK excLmtPK) {
        this.excLmtPK = excLmtPK;
    }

    public ExcLmt(ExcLmtPK excLmtPK, short flgDlyDlr, BigDecimal maxDlyDlrLmt, short flgDlyTrns, int maxDlyTrns, short flgWkndSrv, short flgDup, short flgTankCap, int excdTankCapLmt, short flgMpg, BigDecimal maxMpg, short flgCpg, BigDecimal maxCpg, short flgHighGrdFl, short flgAvnFl, short flgMrneFl, short flgKrsn, short flgPpne, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, short flgAftHr, short flgUnldedRegl, short flgUnldedMidgrad, short flgUnldedPremium, short flgUnldedSuper, short flgNbrTwoDsl, short flgPremiumDsl, short flgEthanol, short flgMethanol, short flgOthFl, short flgSatPchs, short flgSunPchs, short flgBdslClr2pct, short flgBdslClr5pct, short flgBdslClr20pct, short flgBdslDydls2pc, short flgBdslDydls5pc, short flgBdslDydls20p, short flgBdslDydhs2pc, short flgBdslDydhs5pc, short flgBdslDydhs20p, short flgBdslClr100pc, short flgBdslC10pcBl, short flgBdslC11pcBl, short flgBdslC15pcBl, short flgBdslDyed100p, short flgBdslDls10pB, short flgBdslDls11pB, short flgBdslDls15pB, short flgBdslDhs10pB, short flgBdslDhs11pB, short flgBdslDhs15pB, short flgDslExhaustFld, short flgBdslClr, short flgBdslDyed, short lqidNatlGas, short cmprssdNatlGas) {
        this.excLmtPK = excLmtPK;
        this.flgDlyDlr = flgDlyDlr;
        this.maxDlyDlrLmt = maxDlyDlrLmt;
        this.flgDlyTrns = flgDlyTrns;
        this.maxDlyTrns = maxDlyTrns;
        this.flgWkndSrv = flgWkndSrv;
        this.flgDup = flgDup;
        this.flgTankCap = flgTankCap;
        this.excdTankCapLmt = excdTankCapLmt;
        this.flgMpg = flgMpg;
        this.maxMpg = maxMpg;
        this.flgCpg = flgCpg;
        this.maxCpg = maxCpg;
        this.flgHighGrdFl = flgHighGrdFl;
        this.flgAvnFl = flgAvnFl;
        this.flgMrneFl = flgMrneFl;
        this.flgKrsn = flgKrsn;
        this.flgPpne = flgPpne;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.flgAftHr = flgAftHr;
        this.flgUnldedRegl = flgUnldedRegl;
        this.flgUnldedMidgrad = flgUnldedMidgrad;
        this.flgUnldedPremium = flgUnldedPremium;
        this.flgUnldedSuper = flgUnldedSuper;
        this.flgNbrTwoDsl = flgNbrTwoDsl;
        this.flgPremiumDsl = flgPremiumDsl;
        this.flgEthanol = flgEthanol;
        this.flgMethanol = flgMethanol;
        this.flgOthFl = flgOthFl;
        this.flgSatPchs = flgSatPchs;
        this.flgSunPchs = flgSunPchs;
        this.flgBdslClr2pct = flgBdslClr2pct;
        this.flgBdslClr5pct = flgBdslClr5pct;
        this.flgBdslClr20pct = flgBdslClr20pct;
        this.flgBdslDydls2pc = flgBdslDydls2pc;
        this.flgBdslDydls5pc = flgBdslDydls5pc;
        this.flgBdslDydls20p = flgBdslDydls20p;
        this.flgBdslDydhs2pc = flgBdslDydhs2pc;
        this.flgBdslDydhs5pc = flgBdslDydhs5pc;
        this.flgBdslDydhs20p = flgBdslDydhs20p;
        this.flgBdslClr100pc = flgBdslClr100pc;
        this.flgBdslC10pcBl = flgBdslC10pcBl;
        this.flgBdslC11pcBl = flgBdslC11pcBl;
        this.flgBdslC15pcBl = flgBdslC15pcBl;
        this.flgBdslDyed100p = flgBdslDyed100p;
        this.flgBdslDls10pB = flgBdslDls10pB;
        this.flgBdslDls11pB = flgBdslDls11pB;
        this.flgBdslDls15pB = flgBdslDls15pB;
        this.flgBdslDhs10pB = flgBdslDhs10pB;
        this.flgBdslDhs11pB = flgBdslDhs11pB;
        this.flgBdslDhs15pB = flgBdslDhs15pB;
        this.flgDslExhaustFld = flgDslExhaustFld;
        this.flgBdslClr = flgBdslClr;
        this.flgBdslDyed = flgBdslDyed;
        this.lqidNatlGas = lqidNatlGas;
        this.cmprssdNatlGas = cmprssdNatlGas;
    }

    public ExcLmt(String acctStru, Character acctId) {
        this.excLmtPK = new ExcLmtPK(acctStru, acctId);
    }

    public ExcLmtPK getExcLmtPK() {
        return excLmtPK;
    }

    public void setExcLmtPK(ExcLmtPK excLmtPK) {
        this.excLmtPK = excLmtPK;
    }

    public short getFlgDlyDlr() {
        return flgDlyDlr;
    }

    public void setFlgDlyDlr(short flgDlyDlr) {
        this.flgDlyDlr = flgDlyDlr;
    }

    public BigDecimal getMaxDlyDlrLmt() {
        return maxDlyDlrLmt;
    }

    public void setMaxDlyDlrLmt(BigDecimal maxDlyDlrLmt) {
        this.maxDlyDlrLmt = maxDlyDlrLmt;
    }

    public short getFlgDlyTrns() {
        return flgDlyTrns;
    }

    public void setFlgDlyTrns(short flgDlyTrns) {
        this.flgDlyTrns = flgDlyTrns;
    }

    public int getMaxDlyTrns() {
        return maxDlyTrns;
    }

    public void setMaxDlyTrns(int maxDlyTrns) {
        this.maxDlyTrns = maxDlyTrns;
    }

    public short getFlgWkndSrv() {
        return flgWkndSrv;
    }

    public void setFlgWkndSrv(short flgWkndSrv) {
        this.flgWkndSrv = flgWkndSrv;
    }

    public short getFlgDup() {
        return flgDup;
    }

    public void setFlgDup(short flgDup) {
        this.flgDup = flgDup;
    }

    public short getFlgTankCap() {
        return flgTankCap;
    }

    public void setFlgTankCap(short flgTankCap) {
        this.flgTankCap = flgTankCap;
    }

    public int getExcdTankCapLmt() {
        return excdTankCapLmt;
    }

    public void setExcdTankCapLmt(int excdTankCapLmt) {
        this.excdTankCapLmt = excdTankCapLmt;
    }

    public short getFlgMpg() {
        return flgMpg;
    }

    public void setFlgMpg(short flgMpg) {
        this.flgMpg = flgMpg;
    }

    public BigDecimal getMaxMpg() {
        return maxMpg;
    }

    public void setMaxMpg(BigDecimal maxMpg) {
        this.maxMpg = maxMpg;
    }

    public short getFlgCpg() {
        return flgCpg;
    }

    public void setFlgCpg(short flgCpg) {
        this.flgCpg = flgCpg;
    }

    public BigDecimal getMaxCpg() {
        return maxCpg;
    }

    public void setMaxCpg(BigDecimal maxCpg) {
        this.maxCpg = maxCpg;
    }

    public short getFlgHighGrdFl() {
        return flgHighGrdFl;
    }

    public void setFlgHighGrdFl(short flgHighGrdFl) {
        this.flgHighGrdFl = flgHighGrdFl;
    }

    public short getFlgAvnFl() {
        return flgAvnFl;
    }

    public void setFlgAvnFl(short flgAvnFl) {
        this.flgAvnFl = flgAvnFl;
    }

    public short getFlgMrneFl() {
        return flgMrneFl;
    }

    public void setFlgMrneFl(short flgMrneFl) {
        this.flgMrneFl = flgMrneFl;
    }

    public short getFlgKrsn() {
        return flgKrsn;
    }

    public void setFlgKrsn(short flgKrsn) {
        this.flgKrsn = flgKrsn;
    }

    public short getFlgPpne() {
        return flgPpne;
    }

    public void setFlgPpne(short flgPpne) {
        this.flgPpne = flgPpne;
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

    public short getFlgAftHr() {
        return flgAftHr;
    }

    public void setFlgAftHr(short flgAftHr) {
        this.flgAftHr = flgAftHr;
    }

    public short getFlgUnldedRegl() {
        return flgUnldedRegl;
    }

    public void setFlgUnldedRegl(short flgUnldedRegl) {
        this.flgUnldedRegl = flgUnldedRegl;
    }

    public short getFlgUnldedMidgrad() {
        return flgUnldedMidgrad;
    }

    public void setFlgUnldedMidgrad(short flgUnldedMidgrad) {
        this.flgUnldedMidgrad = flgUnldedMidgrad;
    }

    public short getFlgUnldedPremium() {
        return flgUnldedPremium;
    }

    public void setFlgUnldedPremium(short flgUnldedPremium) {
        this.flgUnldedPremium = flgUnldedPremium;
    }

    public short getFlgUnldedSuper() {
        return flgUnldedSuper;
    }

    public void setFlgUnldedSuper(short flgUnldedSuper) {
        this.flgUnldedSuper = flgUnldedSuper;
    }

    public short getFlgNbrTwoDsl() {
        return flgNbrTwoDsl;
    }

    public void setFlgNbrTwoDsl(short flgNbrTwoDsl) {
        this.flgNbrTwoDsl = flgNbrTwoDsl;
    }

    public short getFlgPremiumDsl() {
        return flgPremiumDsl;
    }

    public void setFlgPremiumDsl(short flgPremiumDsl) {
        this.flgPremiumDsl = flgPremiumDsl;
    }

    public short getFlgEthanol() {
        return flgEthanol;
    }

    public void setFlgEthanol(short flgEthanol) {
        this.flgEthanol = flgEthanol;
    }

    public short getFlgMethanol() {
        return flgMethanol;
    }

    public void setFlgMethanol(short flgMethanol) {
        this.flgMethanol = flgMethanol;
    }

    public short getFlgOthFl() {
        return flgOthFl;
    }

    public void setFlgOthFl(short flgOthFl) {
        this.flgOthFl = flgOthFl;
    }

    public short getFlgSatPchs() {
        return flgSatPchs;
    }

    public void setFlgSatPchs(short flgSatPchs) {
        this.flgSatPchs = flgSatPchs;
    }

    public short getFlgSunPchs() {
        return flgSunPchs;
    }

    public void setFlgSunPchs(short flgSunPchs) {
        this.flgSunPchs = flgSunPchs;
    }

    public short getFlgBdslClr2pct() {
        return flgBdslClr2pct;
    }

    public void setFlgBdslClr2pct(short flgBdslClr2pct) {
        this.flgBdslClr2pct = flgBdslClr2pct;
    }

    public short getFlgBdslClr5pct() {
        return flgBdslClr5pct;
    }

    public void setFlgBdslClr5pct(short flgBdslClr5pct) {
        this.flgBdslClr5pct = flgBdslClr5pct;
    }

    public short getFlgBdslClr20pct() {
        return flgBdslClr20pct;
    }

    public void setFlgBdslClr20pct(short flgBdslClr20pct) {
        this.flgBdslClr20pct = flgBdslClr20pct;
    }

    public short getFlgBdslDydls2pc() {
        return flgBdslDydls2pc;
    }

    public void setFlgBdslDydls2pc(short flgBdslDydls2pc) {
        this.flgBdslDydls2pc = flgBdslDydls2pc;
    }

    public short getFlgBdslDydls5pc() {
        return flgBdslDydls5pc;
    }

    public void setFlgBdslDydls5pc(short flgBdslDydls5pc) {
        this.flgBdslDydls5pc = flgBdslDydls5pc;
    }

    public short getFlgBdslDydls20p() {
        return flgBdslDydls20p;
    }

    public void setFlgBdslDydls20p(short flgBdslDydls20p) {
        this.flgBdslDydls20p = flgBdslDydls20p;
    }

    public short getFlgBdslDydhs2pc() {
        return flgBdslDydhs2pc;
    }

    public void setFlgBdslDydhs2pc(short flgBdslDydhs2pc) {
        this.flgBdslDydhs2pc = flgBdslDydhs2pc;
    }

    public short getFlgBdslDydhs5pc() {
        return flgBdslDydhs5pc;
    }

    public void setFlgBdslDydhs5pc(short flgBdslDydhs5pc) {
        this.flgBdslDydhs5pc = flgBdslDydhs5pc;
    }

    public short getFlgBdslDydhs20p() {
        return flgBdslDydhs20p;
    }

    public void setFlgBdslDydhs20p(short flgBdslDydhs20p) {
        this.flgBdslDydhs20p = flgBdslDydhs20p;
    }

    public short getFlgBdslClr100pc() {
        return flgBdslClr100pc;
    }

    public void setFlgBdslClr100pc(short flgBdslClr100pc) {
        this.flgBdslClr100pc = flgBdslClr100pc;
    }

    public short getFlgBdslC10pcBl() {
        return flgBdslC10pcBl;
    }

    public void setFlgBdslC10pcBl(short flgBdslC10pcBl) {
        this.flgBdslC10pcBl = flgBdslC10pcBl;
    }

    public short getFlgBdslC11pcBl() {
        return flgBdslC11pcBl;
    }

    public void setFlgBdslC11pcBl(short flgBdslC11pcBl) {
        this.flgBdslC11pcBl = flgBdslC11pcBl;
    }

    public short getFlgBdslC15pcBl() {
        return flgBdslC15pcBl;
    }

    public void setFlgBdslC15pcBl(short flgBdslC15pcBl) {
        this.flgBdslC15pcBl = flgBdslC15pcBl;
    }

    public short getFlgBdslDyed100p() {
        return flgBdslDyed100p;
    }

    public void setFlgBdslDyed100p(short flgBdslDyed100p) {
        this.flgBdslDyed100p = flgBdslDyed100p;
    }

    public short getFlgBdslDls10pB() {
        return flgBdslDls10pB;
    }

    public void setFlgBdslDls10pB(short flgBdslDls10pB) {
        this.flgBdslDls10pB = flgBdslDls10pB;
    }

    public short getFlgBdslDls11pB() {
        return flgBdslDls11pB;
    }

    public void setFlgBdslDls11pB(short flgBdslDls11pB) {
        this.flgBdslDls11pB = flgBdslDls11pB;
    }

    public short getFlgBdslDls15pB() {
        return flgBdslDls15pB;
    }

    public void setFlgBdslDls15pB(short flgBdslDls15pB) {
        this.flgBdslDls15pB = flgBdslDls15pB;
    }

    public short getFlgBdslDhs10pB() {
        return flgBdslDhs10pB;
    }

    public void setFlgBdslDhs10pB(short flgBdslDhs10pB) {
        this.flgBdslDhs10pB = flgBdslDhs10pB;
    }

    public short getFlgBdslDhs11pB() {
        return flgBdslDhs11pB;
    }

    public void setFlgBdslDhs11pB(short flgBdslDhs11pB) {
        this.flgBdslDhs11pB = flgBdslDhs11pB;
    }

    public short getFlgBdslDhs15pB() {
        return flgBdslDhs15pB;
    }

    public void setFlgBdslDhs15pB(short flgBdslDhs15pB) {
        this.flgBdslDhs15pB = flgBdslDhs15pB;
    }

    public short getFlgDslExhaustFld() {
        return flgDslExhaustFld;
    }

    public void setFlgDslExhaustFld(short flgDslExhaustFld) {
        this.flgDslExhaustFld = flgDslExhaustFld;
    }

    public short getFlgBdslClr() {
        return flgBdslClr;
    }

    public void setFlgBdslClr(short flgBdslClr) {
        this.flgBdslClr = flgBdslClr;
    }

    public short getFlgBdslDyed() {
        return flgBdslDyed;
    }

    public void setFlgBdslDyed(short flgBdslDyed) {
        this.flgBdslDyed = flgBdslDyed;
    }

    public short getLqidNatlGas() {
        return lqidNatlGas;
    }

    public void setLqidNatlGas(short lqidNatlGas) {
        this.lqidNatlGas = lqidNatlGas;
    }

    public short getCmprssdNatlGas() {
        return cmprssdNatlGas;
    }

    public void setCmprssdNatlGas(short cmprssdNatlGas) {
        this.cmprssdNatlGas = cmprssdNatlGas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excLmtPK != null ? excLmtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ExcLmt)) {
            return false;
        }
        ExcLmt other = (ExcLmt) object;
        if ((this.excLmtPK == null && other.excLmtPK != null) || (this.excLmtPK != null && !this.excLmtPK.equals(other.excLmtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExcLmt[ excLmtPK=" + excLmtPK + " ]";
    }

}
