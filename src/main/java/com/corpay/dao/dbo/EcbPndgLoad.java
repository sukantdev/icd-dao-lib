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
@Table(name = "ECB_PNDG_LOAD", catalog = "", schema = "DBO")
public class EcbPndgLoad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EcbPndgLoadPK ecbPndgLoadPK;
    @Basic(optional = false)
    @Column(name = "BCH_STAT")
    private Character bchStat;
    @Basic(optional = false)
    @Column(name = "REF_NBR")
    private int refNbr;
    @Basic(optional = false)
    @Column(name = "AVL_DT")
    @Temporal(TemporalType.DATE)
    private Date avlDt;
    @Basic(optional = false)
    @Column(name = "AVL_TM")
    @Temporal(TemporalType.TIME)
    private Date avlTm;

    @Basic(optional = false)
    @Column(name = "LOAD_AMT")
    private BigDecimal loadAmt;
    @Basic(optional = false)
    @Column(name = "PRDCTN_FLG")
    private Character prdctnFlg;
    @Basic(optional = false)
    @Column(name = "PLUS_LESS_FLG")
    private Character plusLessFlg;
    @Basic(optional = false)
    @Column(name = "CHGS")
    private BigDecimal chgs;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "CODEWORD")
    private String codeword;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private String tripNbr;
    @Basic(optional = false)
    @Column(name = "MISC_DATA")
    private String miscData;
    @Basic(optional = false)
    @Column(name = "CRTY_CD")
    private String crtyCd;
    @Basic(optional = false)
    @Column(name = "BANK_ROUTING_NBR")
    private int bankRoutingNbr;
    @Basic(optional = false)
    @Column(name = "BANK_ACCT_NBR")
    private String bankAcctNbr;
    @Basic(optional = false)
    @Column(name = "ALT_LOAD_FEE_SW")
    private Character altLoadFeeSw;
    @Basic(optional = false)
    @Column(name = "BANK_LOAD_FLG")
    private Character bankLoadFlg;
    @Basic(optional = false)
    @Column(name = "ERR_MSG")
    private String errMsg;
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
    @Column(name = "ORIG_STAT")
    private Character origStat;

    public EcbPndgLoad() {
    }

    public EcbPndgLoad(EcbPndgLoadPK ecbPndgLoadPK) {
        this.ecbPndgLoadPK = ecbPndgLoadPK;
    }

    public EcbPndgLoad(EcbPndgLoadPK ecbPndgLoadPK, Character bchStat, int refNbr, Date avlDt, Date avlTm, BigDecimal loadAmt, Character prdctnFlg, Character plusLessFlg, BigDecimal chgs, Character blngTyp, String codeword, String tripNbr, String miscData, String crtyCd, int bankRoutingNbr, String bankAcctNbr, Character altLoadFeeSw, Character bankLoadFlg, String errMsg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character origStat) {
        this.ecbPndgLoadPK = ecbPndgLoadPK;
        this.bchStat = bchStat;
        this.refNbr = refNbr;
        this.avlDt = avlDt;
        this.avlTm = avlTm;
        this.loadAmt = loadAmt;
        this.prdctnFlg = prdctnFlg;
        this.plusLessFlg = plusLessFlg;
        this.chgs = chgs;
        this.blngTyp = blngTyp;
        this.codeword = codeword;
        this.tripNbr = tripNbr;
        this.miscData = miscData;
        this.crtyCd = crtyCd;
        this.bankRoutingNbr = bankRoutingNbr;
        this.bankAcctNbr = bankAcctNbr;
        this.altLoadFeeSw = altLoadFeeSw;
        this.bankLoadFlg = bankLoadFlg;
        this.errMsg = errMsg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.origStat = origStat;
    }

    public EcbPndgLoad(String acctNbr, String custId, String crdNbr, Date loadDt, Date loadTm, short dupCtr) {
        this.ecbPndgLoadPK = new EcbPndgLoadPK(acctNbr, custId, crdNbr, loadDt, loadTm, dupCtr);
    }

    public EcbPndgLoadPK getEcbPndgLoadPK() {
        return ecbPndgLoadPK;
    }

    public void setEcbPndgLoadPK(EcbPndgLoadPK ecbPndgLoadPK) {
        this.ecbPndgLoadPK = ecbPndgLoadPK;
    }

    public Character getBchStat() {
        return bchStat;
    }

    public void setBchStat(Character bchStat) {
        this.bchStat = bchStat;
    }

    public int getRefNbr() {
        return refNbr;
    }

    public void setRefNbr(int refNbr) {
        this.refNbr = refNbr;
    }

    public Date getAvlDt() {
        return avlDt;
    }

    public void setAvlDt(Date avlDt) {
        this.avlDt = avlDt;
    }

    public Date getAvlTm() {
        return avlTm;
    }

    public void setAvlTm(Date avlTm) {
        this.avlTm = avlTm;
    }

    public BigDecimal getLoadAmt() {
        return loadAmt;
    }

    public void setLoadAmt(BigDecimal loadAmt) {
        this.loadAmt = loadAmt;
    }

    public Character getPrdctnFlg() {
        return prdctnFlg;
    }

    public void setPrdctnFlg(Character prdctnFlg) {
        this.prdctnFlg = prdctnFlg;
    }

    public Character getPlusLessFlg() {
        return plusLessFlg;
    }

    public void setPlusLessFlg(Character plusLessFlg) {
        this.plusLessFlg = plusLessFlg;
    }

    public BigDecimal getChgs() {
        return chgs;
    }

    public void setChgs(BigDecimal chgs) {
        this.chgs = chgs;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getCodeword() {
        return codeword;
    }

    public void setCodeword(String codeword) {
        this.codeword = codeword;
    }

    public String getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(String tripNbr) {
        this.tripNbr = tripNbr;
    }

    public String getMiscData() {
        return miscData;
    }

    public void setMiscData(String miscData) {
        this.miscData = miscData;
    }

    public String getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(String crtyCd) {
        this.crtyCd = crtyCd;
    }

    public int getBankRoutingNbr() {
        return bankRoutingNbr;
    }

    public void setBankRoutingNbr(int bankRoutingNbr) {
        this.bankRoutingNbr = bankRoutingNbr;
    }

    public String getBankAcctNbr() {
        return bankAcctNbr;
    }

    public void setBankAcctNbr(String bankAcctNbr) {
        this.bankAcctNbr = bankAcctNbr;
    }

    public Character getAltLoadFeeSw() {
        return altLoadFeeSw;
    }

    public void setAltLoadFeeSw(Character altLoadFeeSw) {
        this.altLoadFeeSw = altLoadFeeSw;
    }

    public Character getBankLoadFlg() {
        return bankLoadFlg;
    }

    public void setBankLoadFlg(Character bankLoadFlg) {
        this.bankLoadFlg = bankLoadFlg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
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

    public Character getOrigStat() {
        return origStat;
    }

    public void setOrigStat(Character origStat) {
        this.origStat = origStat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ecbPndgLoadPK != null ? ecbPndgLoadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof EcbPndgLoad)) {
            return false;
        }
        EcbPndgLoad other = (EcbPndgLoad) object;
        if ((this.ecbPndgLoadPK == null && other.ecbPndgLoadPK != null) || (this.ecbPndgLoadPK != null && !this.ecbPndgLoadPK.equals(other.ecbPndgLoadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EcbPndgLoad[ ecbPndgLoadPK=" + ecbPndgLoadPK + " ]";
    }

}
