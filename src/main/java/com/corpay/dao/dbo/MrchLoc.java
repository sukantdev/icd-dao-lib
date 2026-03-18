package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MRCH_LOC", catalog = "", schema = "DBO")
public class MrchLoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;
    @Basic(optional = false)
    @Column(name = "DESC")
    private String desc;
    @Basic(optional = false)
    @Column(name = "OIL_COMP_BRD")
    private String oilCompBrd;
    @Basic(optional = false)
    @Column(name = "ADDR")
    private String addr;
    @Basic(optional = false)
    @Column(name = "CTY")
    private String cty;
    @Basic(optional = false)
    @Column(name = "ST")
    private String st;
    @Basic(optional = false)
    @Column(name = "ZIP")
    private String zip;
    @Basic(optional = false)
    @Column(name = "CRTY_CD")
    private int crtyCd;
    @Basic(optional = false)
    @Column(name = "PH_NBR")
    private String phNbr;
    @Basic(optional = false)
    @Column(name = "ACQ_INST_ID_CD")
    private long acqInstIdCd;
    @Basic(optional = false)
    @Column(name = "ACPT_ID")
    private String acptId;
    @Basic(optional = false)
    @Column(name = "PROMPT_OUT")
    private Character promptOut;
    @Basic(optional = false)
    @Column(name = "PROMPT_IN")
    private Character promptIn;
    @Basic(optional = false)
    @Column(name = "PROMPT_STLMT")
    private Character promptStlmt;
    @Basic(optional = false)
    @Column(name = "DTL_LVL")
    private int dtlLvl;
    @Basic(optional = false)
    @Column(name = "MCC_CD")
    private String mccCd;
    @Basic(optional = false)
    @Column(name = "PAY_PUMP_AVL")
    private Character payPumpAvl;
    @Basic(optional = false)
    @Column(name = "TERM_ID")
    private String termId;
    @Basic(optional = false)
    @Column(name = "STR_NBR")
    private String strNbr;
    @Basic(optional = false)
    @Column(name = "FUELMAN_SITE_ID")
    private String fuelmanSiteId;
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
    @Column(name = "LAT_NBR")
    private BigDecimal latNbr;
    @Basic(optional = false)
    @Column(name = "LONG_NBR")
    private BigDecimal longNbr;
    @Basic(optional = false)
    @Column(name = "RETRY_FLG")
    private Character retryFlg;
    @Basic(optional = false)
    @Column(name = "MANUAL_FLG")
    private Character manualFlg;
    @Basic(optional = false)
    @Column(name = "GEO_PRCSN_NM")
    private String geoPrcsnNm;
    @Basic(optional = false)
    @Column(name = "MBR_LOC_FLG")
    private Character mbrLocFlg;

    public MrchLoc() {
    }

    public MrchLoc(String locId) {
        this.locId = locId;
    }

    public MrchLoc(String locId, String desc, String oilCompBrd, String addr, String cty, String st, String zip, int crtyCd, String phNbr, long acqInstIdCd, String acptId, Character promptOut, Character promptIn, Character promptStlmt, int dtlLvl, String mccCd, Character payPumpAvl, String termId, String strNbr, String fuelmanSiteId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal latNbr, BigDecimal longNbr, Character retryFlg, Character manualFlg, String geoPrcsnNm, Character mbrLocFlg) {
        this.locId = locId;
        this.desc = desc;
        this.oilCompBrd = oilCompBrd;
        this.addr = addr;
        this.cty = cty;
        this.st = st;
        this.zip = zip;
        this.crtyCd = crtyCd;
        this.phNbr = phNbr;
        this.acqInstIdCd = acqInstIdCd;
        this.acptId = acptId;
        this.promptOut = promptOut;
        this.promptIn = promptIn;
        this.promptStlmt = promptStlmt;
        this.dtlLvl = dtlLvl;
        this.mccCd = mccCd;
        this.payPumpAvl = payPumpAvl;
        this.termId = termId;
        this.strNbr = strNbr;
        this.fuelmanSiteId = fuelmanSiteId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.latNbr = latNbr;
        this.longNbr = longNbr;
        this.retryFlg = retryFlg;
        this.manualFlg = manualFlg;
        this.geoPrcsnNm = geoPrcsnNm;
        this.mbrLocFlg = mbrLocFlg;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getOilCompBrd() {
        return oilCompBrd;
    }

    public void setOilCompBrd(String oilCompBrd) {
        this.oilCompBrd = oilCompBrd;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(int crtyCd) {
        this.crtyCd = crtyCd;
    }

    public String getPhNbr() {
        return phNbr;
    }

    public void setPhNbr(String phNbr) {
        this.phNbr = phNbr;
    }

    public long getAcqInstIdCd() {
        return acqInstIdCd;
    }

    public void setAcqInstIdCd(long acqInstIdCd) {
        this.acqInstIdCd = acqInstIdCd;
    }

    public String getAcptId() {
        return acptId;
    }

    public void setAcptId(String acptId) {
        this.acptId = acptId;
    }

    public Character getPromptOut() {
        return promptOut;
    }

    public void setPromptOut(Character promptOut) {
        this.promptOut = promptOut;
    }

    public Character getPromptIn() {
        return promptIn;
    }

    public void setPromptIn(Character promptIn) {
        this.promptIn = promptIn;
    }

    public Character getPromptStlmt() {
        return promptStlmt;
    }

    public void setPromptStlmt(Character promptStlmt) {
        this.promptStlmt = promptStlmt;
    }

    public int getDtlLvl() {
        return dtlLvl;
    }

    public void setDtlLvl(int dtlLvl) {
        this.dtlLvl = dtlLvl;
    }

    public String getMccCd() {
        return mccCd;
    }

    public void setMccCd(String mccCd) {
        this.mccCd = mccCd;
    }

    public Character getPayPumpAvl() {
        return payPumpAvl;
    }

    public void setPayPumpAvl(Character payPumpAvl) {
        this.payPumpAvl = payPumpAvl;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getStrNbr() {
        return strNbr;
    }

    public void setStrNbr(String strNbr) {
        this.strNbr = strNbr;
    }

    public String getFuelmanSiteId() {
        return fuelmanSiteId;
    }

    public void setFuelmanSiteId(String fuelmanSiteId) {
        this.fuelmanSiteId = fuelmanSiteId;
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

    public BigDecimal getLatNbr() {
        return latNbr;
    }

    public void setLatNbr(BigDecimal latNbr) {
        this.latNbr = latNbr;
    }

    public BigDecimal getLongNbr() {
        return longNbr;
    }

    public void setLongNbr(BigDecimal longNbr) {
        this.longNbr = longNbr;
    }

    public Character getRetryFlg() {
        return retryFlg;
    }

    public void setRetryFlg(Character retryFlg) {
        this.retryFlg = retryFlg;
    }

    public Character getManualFlg() {
        return manualFlg;
    }

    public void setManualFlg(Character manualFlg) {
        this.manualFlg = manualFlg;
    }

    public String getGeoPrcsnNm() {
        return geoPrcsnNm;
    }

    public void setGeoPrcsnNm(String geoPrcsnNm) {
        this.geoPrcsnNm = geoPrcsnNm;
    }

    public Character getMbrLocFlg() {
        return mbrLocFlg;
    }

    public void setMbrLocFlg(Character mbrLocFlg) {
        this.mbrLocFlg = mbrLocFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locId != null ? locId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLoc)) {
            return false;
        }
        MrchLoc other = (MrchLoc) object;
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLoc[ locId=" + locId + " ]";
    }

}
