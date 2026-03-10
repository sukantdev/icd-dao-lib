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
@Table(name = "PRD_MS_EQPMNT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdMsEqpmnt.findAll", query = "SELECT p FROM PrdMsEqpmnt p")})
public class PrdMsEqpmnt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdMsEqpmntPK prdMsEqpmntPK;
    @Basic(optional = false)
    @Column(name = "NBR_UNITS")
    private int nbrUnits;
    @Basic(optional = false)
    @Column(name = "TRNDR_CD")
    private String trndrCd;
    @Basic(optional = false)
    @Column(name = "TRNDR_CST_FLGS")
    private short trndrCstFlgs;
    @Basic(optional = false)
    @Column(name = "REQ_TYP_FLGS")
    private short reqTypFlgs;
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
    @Column(name = "CPU_FLG")
    private Character cpuFlg;
    @Basic(optional = false)
    @Column(name = "CASH_DRAWER_FLG")
    private Character cashDrawerFlg;
    @Basic(optional = false)
    @Column(name = "CRD_RDR_FLG")
    private short crdRdrFlg;
    @Basic(optional = false)
    @Column(name = "PRTR_FLGS")
    private short prtrFlgs;
    @Basic(optional = false)
    @Column(name = "BTRY_UPS")
    private Character btryUps;
    @Basic(optional = false)
    @Column(name = "SFTWR_FLGS")
    private short sftwrFlgs;
    @Basic(optional = false)
    @Column(name = "MNTR_FLGS")
    private short mntrFlgs;
    @Basic(optional = false)
    @Column(name = "KBRD_FLGS")
    private short kbrdFlgs;
    @Basic(optional = false)
    @Column(name = "COMM_FLG")
    private Character commFlg;
    @Basic(optional = false)
    @Column(name = "SCNG_FLGS")
    private short scngFlgs;
    @Basic(optional = false)
    @Column(name = "SMART_FL_FLGS")
    private short smartFlFlgs;
    @Basic(optional = false)
    @Column(name = "PUMP_NTRFC_FLGS")
    private short pumpNtrfcFlgs;
    @Basic(optional = false)
    @Column(name = "MISC_EQPMNT_FLGS")
    private short miscEqpmntFlgs;
    @Basic(optional = false)
    @Column(name = "RPLCMNT_PART1")
    private String rplcmntPart1;
    @Basic(optional = false)
    @Column(name = "RPLCMNT_PART2")
    private String rplcmntPart2;
    @Basic(optional = false)
    @Column(name = "OWNRSHP_FLGS")
    private short ownrshpFlgs;
    @Basic(optional = false)
    @Column(name = "TRNDR_SYS_DESC")
    private String trndrSysDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PCHS_PRC")
    private BigDecimal pchsPrc;
    @Basic(optional = false)
    @Column(name = "MAINT_AMT")
    private BigDecimal maintAmt;
    @Basic(optional = false)
    @Column(name = "SPT_AMT")
    private BigDecimal sptAmt;
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
    @Column(name = "TRNDR_CTL")
    private Character trndrCtl;
    @Basic(optional = false)
    @Column(name = "MST_DSL_PUMP_CNT")
    private int mstDslPumpCnt;
    @Basic(optional = false)
    @Column(name = "SLAVE_PUMP_FLG")
    private Character slavePumpFlg;
    @Basic(optional = false)
    @Column(name = "GAS_PUMP_FLG")
    private Character gasPumpFlg;
    @Basic(optional = false)
    @Column(name = "MULP_DSPNSRS_FLG")
    private Character mulpDspnsrsFlg;
    @Basic(optional = false)
    @Column(name = "AFLATN_FLG")
    private Character aflatnFlg;
    @Basic(optional = false)
    @Column(name = "PUMP_BRD_FLGS")
    private short pumpBrdFlgs;
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
    @Column(name = "PIN_PAD")
    private String pinPad;
    @Basic(optional = false)
    @Column(name = "ANDI_BOX")
    private String andiBox;

    public PrdMsEqpmnt() {
    }

    public PrdMsEqpmnt(PrdMsEqpmntPK prdMsEqpmntPK) {
        this.prdMsEqpmntPK = prdMsEqpmntPK;
    }

    public PrdMsEqpmnt(PrdMsEqpmntPK prdMsEqpmntPK, int nbrUnits, String trndrCd, short trndrCstFlgs, short reqTypFlgs, String tsNm, Date shpDt, Date nstlDt, Character cpuFlg, Character cashDrawerFlg, short crdRdrFlg, short prtrFlgs, Character btryUps, short sftwrFlgs, short mntrFlgs, short kbrdFlgs, Character commFlg, short scngFlgs, short smartFlFlgs, short pumpNtrfcFlgs, short miscEqpmntFlgs, String rplcmntPart1, String rplcmntPart2, short ownrshpFlgs, String trndrSysDesc, BigDecimal pchsPrc, BigDecimal maintAmt, BigDecimal sptAmt, BigDecimal nstlChrg, BigDecimal rntlAmt, int nbrMonths, Character trndrCtl, int mstDslPumpCnt, Character slavePumpFlg, Character gasPumpFlg, Character mulpDspnsrsFlg, Character aflatnFlg, short pumpBrdFlgs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String pinPad, String andiBox) {
        this.prdMsEqpmntPK = prdMsEqpmntPK;
        this.nbrUnits = nbrUnits;
        this.trndrCd = trndrCd;
        this.trndrCstFlgs = trndrCstFlgs;
        this.reqTypFlgs = reqTypFlgs;
        this.tsNm = tsNm;
        this.shpDt = shpDt;
        this.nstlDt = nstlDt;
        this.cpuFlg = cpuFlg;
        this.cashDrawerFlg = cashDrawerFlg;
        this.crdRdrFlg = crdRdrFlg;
        this.prtrFlgs = prtrFlgs;
        this.btryUps = btryUps;
        this.sftwrFlgs = sftwrFlgs;
        this.mntrFlgs = mntrFlgs;
        this.kbrdFlgs = kbrdFlgs;
        this.commFlg = commFlg;
        this.scngFlgs = scngFlgs;
        this.smartFlFlgs = smartFlFlgs;
        this.pumpNtrfcFlgs = pumpNtrfcFlgs;
        this.miscEqpmntFlgs = miscEqpmntFlgs;
        this.rplcmntPart1 = rplcmntPart1;
        this.rplcmntPart2 = rplcmntPart2;
        this.ownrshpFlgs = ownrshpFlgs;
        this.trndrSysDesc = trndrSysDesc;
        this.pchsPrc = pchsPrc;
        this.maintAmt = maintAmt;
        this.sptAmt = sptAmt;
        this.nstlChrg = nstlChrg;
        this.rntlAmt = rntlAmt;
        this.nbrMonths = nbrMonths;
        this.trndrCtl = trndrCtl;
        this.mstDslPumpCnt = mstDslPumpCnt;
        this.slavePumpFlg = slavePumpFlg;
        this.gasPumpFlg = gasPumpFlg;
        this.mulpDspnsrsFlg = mulpDspnsrsFlg;
        this.aflatnFlg = aflatnFlg;
        this.pumpBrdFlgs = pumpBrdFlgs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.pinPad = pinPad;
        this.andiBox = andiBox;
    }

    public PrdMsEqpmnt(String applNbr, String childTyp) {
        this.prdMsEqpmntPK = new PrdMsEqpmntPK(applNbr, childTyp);
    }

    public PrdMsEqpmntPK getPrdMsEqpmntPK() {
        return prdMsEqpmntPK;
    }

    public void setPrdMsEqpmntPK(PrdMsEqpmntPK prdMsEqpmntPK) {
        this.prdMsEqpmntPK = prdMsEqpmntPK;
    }

    public int getNbrUnits() {
        return nbrUnits;
    }

    public void setNbrUnits(int nbrUnits) {
        this.nbrUnits = nbrUnits;
    }

    public String getTrndrCd() {
        return trndrCd;
    }

    public void setTrndrCd(String trndrCd) {
        this.trndrCd = trndrCd;
    }

    public short getTrndrCstFlgs() {
        return trndrCstFlgs;
    }

    public void setTrndrCstFlgs(short trndrCstFlgs) {
        this.trndrCstFlgs = trndrCstFlgs;
    }

    public short getReqTypFlgs() {
        return reqTypFlgs;
    }

    public void setReqTypFlgs(short reqTypFlgs) {
        this.reqTypFlgs = reqTypFlgs;
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

    public Character getCpuFlg() {
        return cpuFlg;
    }

    public void setCpuFlg(Character cpuFlg) {
        this.cpuFlg = cpuFlg;
    }

    public Character getCashDrawerFlg() {
        return cashDrawerFlg;
    }

    public void setCashDrawerFlg(Character cashDrawerFlg) {
        this.cashDrawerFlg = cashDrawerFlg;
    }

    public short getCrdRdrFlg() {
        return crdRdrFlg;
    }

    public void setCrdRdrFlg(short crdRdrFlg) {
        this.crdRdrFlg = crdRdrFlg;
    }

    public short getPrtrFlgs() {
        return prtrFlgs;
    }

    public void setPrtrFlgs(short prtrFlgs) {
        this.prtrFlgs = prtrFlgs;
    }

    public Character getBtryUps() {
        return btryUps;
    }

    public void setBtryUps(Character btryUps) {
        this.btryUps = btryUps;
    }

    public short getSftwrFlgs() {
        return sftwrFlgs;
    }

    public void setSftwrFlgs(short sftwrFlgs) {
        this.sftwrFlgs = sftwrFlgs;
    }

    public short getMntrFlgs() {
        return mntrFlgs;
    }

    public void setMntrFlgs(short mntrFlgs) {
        this.mntrFlgs = mntrFlgs;
    }

    public short getKbrdFlgs() {
        return kbrdFlgs;
    }

    public void setKbrdFlgs(short kbrdFlgs) {
        this.kbrdFlgs = kbrdFlgs;
    }

    public Character getCommFlg() {
        return commFlg;
    }

    public void setCommFlg(Character commFlg) {
        this.commFlg = commFlg;
    }

    public short getScngFlgs() {
        return scngFlgs;
    }

    public void setScngFlgs(short scngFlgs) {
        this.scngFlgs = scngFlgs;
    }

    public short getSmartFlFlgs() {
        return smartFlFlgs;
    }

    public void setSmartFlFlgs(short smartFlFlgs) {
        this.smartFlFlgs = smartFlFlgs;
    }

    public short getPumpNtrfcFlgs() {
        return pumpNtrfcFlgs;
    }

    public void setPumpNtrfcFlgs(short pumpNtrfcFlgs) {
        this.pumpNtrfcFlgs = pumpNtrfcFlgs;
    }

    public short getMiscEqpmntFlgs() {
        return miscEqpmntFlgs;
    }

    public void setMiscEqpmntFlgs(short miscEqpmntFlgs) {
        this.miscEqpmntFlgs = miscEqpmntFlgs;
    }

    public String getRplcmntPart1() {
        return rplcmntPart1;
    }

    public void setRplcmntPart1(String rplcmntPart1) {
        this.rplcmntPart1 = rplcmntPart1;
    }

    public String getRplcmntPart2() {
        return rplcmntPart2;
    }

    public void setRplcmntPart2(String rplcmntPart2) {
        this.rplcmntPart2 = rplcmntPart2;
    }

    public short getOwnrshpFlgs() {
        return ownrshpFlgs;
    }

    public void setOwnrshpFlgs(short ownrshpFlgs) {
        this.ownrshpFlgs = ownrshpFlgs;
    }

    public String getTrndrSysDesc() {
        return trndrSysDesc;
    }

    public void setTrndrSysDesc(String trndrSysDesc) {
        this.trndrSysDesc = trndrSysDesc;
    }

    public BigDecimal getPchsPrc() {
        return pchsPrc;
    }

    public void setPchsPrc(BigDecimal pchsPrc) {
        this.pchsPrc = pchsPrc;
    }

    public BigDecimal getMaintAmt() {
        return maintAmt;
    }

    public void setMaintAmt(BigDecimal maintAmt) {
        this.maintAmt = maintAmt;
    }

    public BigDecimal getSptAmt() {
        return sptAmt;
    }

    public void setSptAmt(BigDecimal sptAmt) {
        this.sptAmt = sptAmt;
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

    public Character getTrndrCtl() {
        return trndrCtl;
    }

    public void setTrndrCtl(Character trndrCtl) {
        this.trndrCtl = trndrCtl;
    }

    public int getMstDslPumpCnt() {
        return mstDslPumpCnt;
    }

    public void setMstDslPumpCnt(int mstDslPumpCnt) {
        this.mstDslPumpCnt = mstDslPumpCnt;
    }

    public Character getSlavePumpFlg() {
        return slavePumpFlg;
    }

    public void setSlavePumpFlg(Character slavePumpFlg) {
        this.slavePumpFlg = slavePumpFlg;
    }

    public Character getGasPumpFlg() {
        return gasPumpFlg;
    }

    public void setGasPumpFlg(Character gasPumpFlg) {
        this.gasPumpFlg = gasPumpFlg;
    }

    public Character getMulpDspnsrsFlg() {
        return mulpDspnsrsFlg;
    }

    public void setMulpDspnsrsFlg(Character mulpDspnsrsFlg) {
        this.mulpDspnsrsFlg = mulpDspnsrsFlg;
    }

    public Character getAflatnFlg() {
        return aflatnFlg;
    }

    public void setAflatnFlg(Character aflatnFlg) {
        this.aflatnFlg = aflatnFlg;
    }

    public short getPumpBrdFlgs() {
        return pumpBrdFlgs;
    }

    public void setPumpBrdFlgs(short pumpBrdFlgs) {
        this.pumpBrdFlgs = pumpBrdFlgs;
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

    public String getPinPad() {
        return pinPad;
    }

    public void setPinPad(String pinPad) {
        this.pinPad = pinPad;
    }

    public String getAndiBox() {
        return andiBox;
    }

    public void setAndiBox(String andiBox) {
        this.andiBox = andiBox;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdMsEqpmntPK != null ? prdMsEqpmntPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdMsEqpmnt)) {
            return false;
        }
        PrdMsEqpmnt other = (PrdMsEqpmnt) object;
        if ((this.prdMsEqpmntPK == null && other.prdMsEqpmntPK != null) || (this.prdMsEqpmntPK != null && !this.prdMsEqpmntPK.equals(other.prdMsEqpmntPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdMsEqpmnt[ prdMsEqpmntPK=" + prdMsEqpmntPK + " ]";
    }
    
}
