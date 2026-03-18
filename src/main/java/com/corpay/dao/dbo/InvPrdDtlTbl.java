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
@Table(name = "INV_PRD_DTL_TBL", catalog = "", schema = "DBO")
public class InvPrdDtlTbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPrdDtlTblPK invPrdDtlTblPK;
    @Basic(optional = false)
    @Column(name = "PRTN_ID")
    private short prtnId;
    @Basic(optional = false)
    @Column(name = "PROD_DTL_CR_OR_DB")
    private Character prodDtlCrOrDb;
    @Basic(optional = false)
    @Column(name = "SRV_TYP")
    private Character srvTyp;
    @Basic(optional = false)
    @Column(name = "BLNG_FLG")
    private Character blngFlg;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "PRD_DESC")
    private String prdDesc;

    @Basic(optional = false)
    @Column(name = "PRD_QTY")
    private BigDecimal prdQty;
    @Basic(optional = false)
    @Column(name = "PRD_PRC")
    private BigDecimal prdPrc;
    @Basic(optional = false)
    @Column(name = "PRD_TOT_CST")
    private BigDecimal prdTotCst;
    @Basic(optional = false)
    @Column(name = "DISC_IND")
    private Character discInd;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "COM_CD")
    private String comCd;
    @Basic(optional = false)
    @Column(name = "TAX_EXPT_IND")
    private Character taxExptInd;
    @Basic(optional = false)
    @Column(name = "GRS_PRC")
    private BigDecimal grsPrc;
    @Basic(optional = false)
    @Column(name = "GRS_TOT_CST")
    private BigDecimal grsTotCst;
    @Basic(optional = false)
    @Column(name = "PRD_TYP_CD")
    private Character prdTypCd;
    @Basic(optional = false)
    @Column(name = "WETFUEL_BAS_PPU")
    private BigDecimal wetfuelBasPpu;
    @Basic(optional = false)
    @Column(name = "WET_FL_DELV_FEE")
    private BigDecimal wetFlDelvFee;
    @Basic(optional = false)
    @Column(name = "WET_FL_TOT_TAX_PPU")
    private BigDecimal wetFlTotTaxPpu;
    @Basic(optional = false)
    @Column(name = "ODM_RDNG")
    private int odmRdng;
    @Basic(optional = false)
    @Column(name = "PREV_ODM_RDNG")
    private int prevOdmRdng;
    @Basic(optional = false)
    @Column(name = "YR_TO_DT_MPG")
    private BigDecimal yrToDtMpg;
    @Basic(optional = false)
    @Column(name = "MPG_THIS_FILL_UP")
    private BigDecimal mpgThisFillUp;
    @Basic(optional = false)
    @Column(name = "MLS_DRVN")
    private int mlsDrvn;
    @Basic(optional = false)
    @Column(name = "CST_PER_MILE")
    private BigDecimal cstPerMile;
    @Basic(optional = false)
    @Column(name = "TRL_HUB_RDNG")
    private BigDecimal trlHubRdng;
    @Basic(optional = false)
    @Column(name = "ALT_TAX_ID")
    private String altTaxId;
    @Basic(optional = false)
    @Column(name = "ITM_DISC_RT")
    private BigDecimal itmDiscRt;
    @Basic(optional = false)
    @Column(name = "TYP_OF_SPLY")
    private short typOfSply;
    @Basic(optional = false)
    @Column(name = "UNIQ_VAT_NBR")
    private String uniqVatNbr;
    @Basic(optional = false)
    @Column(name = "CUST_MISC_NBR")
    private String custMiscNbr;
    @Basic(optional = false)
    @Column(name = "TANK_CAP_EXC")
    private Character tankCapExc;
    @Basic(optional = false)
    @Column(name = "MPG_EXC")
    private Character mpgExc;
    @Basic(optional = false)
    @Column(name = "CPG_EXC")
    private Character cpgExc;
    @Basic(optional = false)
    @Column(name = "PRD_CD_EXC")
    private Character prdCdExc;
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
    @Basic(optional = false)
    @Column(name = "UNIT_OF_MSR")
    private Character unitOfMsr;
    @Basic(optional = false)
    @Column(name = "OTH_FL_EXC")
    private Character othFlExc;
    @Basic(optional = false)
    @Column(name = "BIO_DSL_PRD_EXC")
    private Character bioDslPrdExc;
    @Basic(optional = false)
    @Column(name = "HIGH_GRADE_EXC")
    private Character highGradeExc;
    @Basic(optional = false)
    @Column(name = "NR1_SUB_PRD_CD")
    private String nr1SubPrdCd;
    @Basic(optional = false)
    @Column(name = "NR2_SUB_PRD_CD")
    private String nr2SubPrdCd;
    @Basic(optional = false)
    @Column(name = "RFR_SUB_PRD_CD")
    private String rfrSubPrdCd;
    @Basic(optional = false)
    @Column(name = "XCLSN_FLG")
    private Character xclsnFlg;
    @Basic(optional = false)
    @Column(name = "REB_IND")
    private Character rebInd;
    @Basic(optional = false)
    @Column(name = "REB_AMT")
    private BigDecimal rebAmt;
    @Basic(optional = false)
    @Column(name = "DISC_REB_DTL_NBR")
    private short discRebDtlNbr;
    @Basic(optional = false)
    @Column(name = "SHIP_DT")
    private int shipDt;
    @Basic(optional = false)
    @Column(name = "ORD_DT")
    private int ordDt;
    @Basic(optional = false)
    @Column(name = "MEDSRV_SHIPTO")
    private String medsrvShipto;
    @Basic(optional = false)
    @Column(name = "CONTACT_NBR")
    private String contactNbr;
    @Basic(optional = false)
    @Column(name = "MEDSRV_PRC_ADJ")
    private Character medsrvPrcAdj;
    @Basic(optional = false)
    @Column(name = "MEDSRV_PRD_NBR")
    private String medsrvPrdNbr;
    @Basic(optional = false)
    @Column(name = "ZERO_COST_IND")
    private Character zeroCostInd;
    @Basic(optional = false)
    @Column(name = "UNIQ_VAT_NBR17")
    private String uniqVatNbr17;
    @Basic(optional = false)
    @Column(name = "ADJ_PRD_QTY")
    private BigDecimal adjPrdQty;
    @Basic(optional = false)
    @Column(name = "ADJ_UNIT_OF_MSR")
    private Character adjUnitOfMsr;
    @Basic(optional = false)
    @Column(name = "ADJ_PRD_PRC")
    private BigDecimal adjPrdPrc;
    @Basic(optional = false)
    @Column(name = "ADJ_PRD_TOT_CST")
    private BigDecimal adjPrdTotCst;
    @Basic(optional = false)
    @Column(name = "LQID_NATL_GAS_EXC")
    private Character lqidNatlGasExc;
    @Basic(optional = false)
    @Column(name = "CMPRSSD_NATL_GAS_EXC")
    private Character cmprssdNatlGasExc;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_CLR_EXC")
    private Character flgBdslClrExc;
    @Basic(optional = false)
    @Column(name = "FLG_BDSL_DYED_EXC")
    private Character flgBdslDyedExc;
    @Basic(optional = false)
    @Column(name = "DSL_EXHAUST_FLD_EXC")
    private Character dslExhaustFldExc;
    @Basic(optional = false)
    @Column(name = "PROD_RETAIN_AMT")
    private BigDecimal prodRetainAmt;

    public InvPrdDtlTbl() {
    }

    public InvPrdDtlTbl(InvPrdDtlTblPK invPrdDtlTblPK) {
        this.invPrdDtlTblPK = invPrdDtlTblPK;
    }

    public InvPrdDtlTbl(InvPrdDtlTblPK invPrdDtlTblPK, short prtnId, Character prodDtlCrOrDb, Character srvTyp, Character blngFlg, String prdCd, String prdDesc, BigDecimal prdQty, BigDecimal prdPrc, BigDecimal prdTotCst, Character discInd, BigDecimal discAmt, String comCd, Character taxExptInd, BigDecimal grsPrc, BigDecimal grsTotCst, Character prdTypCd, BigDecimal wetfuelBasPpu, BigDecimal wetFlDelvFee, BigDecimal wetFlTotTaxPpu, int odmRdng, int prevOdmRdng, BigDecimal yrToDtMpg, BigDecimal mpgThisFillUp, int mlsDrvn, BigDecimal cstPerMile, BigDecimal trlHubRdng, String altTaxId, BigDecimal itmDiscRt, short typOfSply, String uniqVatNbr, String custMiscNbr, Character tankCapExc, Character mpgExc, Character cpgExc, Character prdCdExc, Date taxTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character unitOfMsr, Character othFlExc, Character bioDslPrdExc, Character highGradeExc, String nr1SubPrdCd, String nr2SubPrdCd, String rfrSubPrdCd, Character xclsnFlg, Character rebInd, BigDecimal rebAmt, short discRebDtlNbr, int shipDt, int ordDt, String medsrvShipto, String contactNbr, Character medsrvPrcAdj, String medsrvPrdNbr, Character zeroCostInd, String uniqVatNbr17, BigDecimal adjPrdQty, Character adjUnitOfMsr, BigDecimal adjPrdPrc, BigDecimal adjPrdTotCst, Character lqidNatlGasExc, Character cmprssdNatlGasExc, Character flgBdslClrExc, Character flgBdslDyedExc, Character dslExhaustFldExc, BigDecimal prodRetainAmt) {
        this.invPrdDtlTblPK = invPrdDtlTblPK;
        this.prtnId = prtnId;
        this.prodDtlCrOrDb = prodDtlCrOrDb;
        this.srvTyp = srvTyp;
        this.blngFlg = blngFlg;
        this.prdCd = prdCd;
        this.prdDesc = prdDesc;
        this.prdQty = prdQty;
        this.prdPrc = prdPrc;
        this.prdTotCst = prdTotCst;
        this.discInd = discInd;
        this.discAmt = discAmt;
        this.comCd = comCd;
        this.taxExptInd = taxExptInd;
        this.grsPrc = grsPrc;
        this.grsTotCst = grsTotCst;
        this.prdTypCd = prdTypCd;
        this.wetfuelBasPpu = wetfuelBasPpu;
        this.wetFlDelvFee = wetFlDelvFee;
        this.wetFlTotTaxPpu = wetFlTotTaxPpu;
        this.odmRdng = odmRdng;
        this.prevOdmRdng = prevOdmRdng;
        this.yrToDtMpg = yrToDtMpg;
        this.mpgThisFillUp = mpgThisFillUp;
        this.mlsDrvn = mlsDrvn;
        this.cstPerMile = cstPerMile;
        this.trlHubRdng = trlHubRdng;
        this.altTaxId = altTaxId;
        this.itmDiscRt = itmDiscRt;
        this.typOfSply = typOfSply;
        this.uniqVatNbr = uniqVatNbr;
        this.custMiscNbr = custMiscNbr;
        this.tankCapExc = tankCapExc;
        this.mpgExc = mpgExc;
        this.cpgExc = cpgExc;
        this.prdCdExc = prdCdExc;
        this.taxTs = taxTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.unitOfMsr = unitOfMsr;
        this.othFlExc = othFlExc;
        this.bioDslPrdExc = bioDslPrdExc;
        this.highGradeExc = highGradeExc;
        this.nr1SubPrdCd = nr1SubPrdCd;
        this.nr2SubPrdCd = nr2SubPrdCd;
        this.rfrSubPrdCd = rfrSubPrdCd;
        this.xclsnFlg = xclsnFlg;
        this.rebInd = rebInd;
        this.rebAmt = rebAmt;
        this.discRebDtlNbr = discRebDtlNbr;
        this.shipDt = shipDt;
        this.ordDt = ordDt;
        this.medsrvShipto = medsrvShipto;
        this.contactNbr = contactNbr;
        this.medsrvPrcAdj = medsrvPrcAdj;
        this.medsrvPrdNbr = medsrvPrdNbr;
        this.zeroCostInd = zeroCostInd;
        this.uniqVatNbr17 = uniqVatNbr17;
        this.adjPrdQty = adjPrdQty;
        this.adjUnitOfMsr = adjUnitOfMsr;
        this.adjPrdPrc = adjPrdPrc;
        this.adjPrdTotCst = adjPrdTotCst;
        this.lqidNatlGasExc = lqidNatlGasExc;
        this.cmprssdNatlGasExc = cmprssdNatlGasExc;
        this.flgBdslClrExc = flgBdslClrExc;
        this.flgBdslDyedExc = flgBdslDyedExc;
        this.dslExhaustFldExc = dslExhaustFldExc;
        this.prodRetainAmt = prodRetainAmt;
    }

    public InvPrdDtlTbl(Date pstdDt, int trnsId, int seqNbr) {
        this.invPrdDtlTblPK = new InvPrdDtlTblPK(pstdDt, trnsId, seqNbr);
    }

    public InvPrdDtlTblPK getInvPrdDtlTblPK() {
        return invPrdDtlTblPK;
    }

    public void setInvPrdDtlTblPK(InvPrdDtlTblPK invPrdDtlTblPK) {
        this.invPrdDtlTblPK = invPrdDtlTblPK;
    }

    public short getPrtnId() {
        return prtnId;
    }

    public void setPrtnId(short prtnId) {
        this.prtnId = prtnId;
    }

    public Character getProdDtlCrOrDb() {
        return prodDtlCrOrDb;
    }

    public void setProdDtlCrOrDb(Character prodDtlCrOrDb) {
        this.prodDtlCrOrDb = prodDtlCrOrDb;
    }

    public Character getSrvTyp() {
        return srvTyp;
    }

    public void setSrvTyp(Character srvTyp) {
        this.srvTyp = srvTyp;
    }

    public Character getBlngFlg() {
        return blngFlg;
    }

    public void setBlngFlg(Character blngFlg) {
        this.blngFlg = blngFlg;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public BigDecimal getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(BigDecimal prdQty) {
        this.prdQty = prdQty;
    }

    public BigDecimal getPrdPrc() {
        return prdPrc;
    }

    public void setPrdPrc(BigDecimal prdPrc) {
        this.prdPrc = prdPrc;
    }

    public BigDecimal getPrdTotCst() {
        return prdTotCst;
    }

    public void setPrdTotCst(BigDecimal prdTotCst) {
        this.prdTotCst = prdTotCst;
    }

    public Character getDiscInd() {
        return discInd;
    }

    public void setDiscInd(Character discInd) {
        this.discInd = discInd;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
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

    public BigDecimal getGrsPrc() {
        return grsPrc;
    }

    public void setGrsPrc(BigDecimal grsPrc) {
        this.grsPrc = grsPrc;
    }

    public BigDecimal getGrsTotCst() {
        return grsTotCst;
    }

    public void setGrsTotCst(BigDecimal grsTotCst) {
        this.grsTotCst = grsTotCst;
    }

    public Character getPrdTypCd() {
        return prdTypCd;
    }

    public void setPrdTypCd(Character prdTypCd) {
        this.prdTypCd = prdTypCd;
    }

    public BigDecimal getWetfuelBasPpu() {
        return wetfuelBasPpu;
    }

    public void setWetfuelBasPpu(BigDecimal wetfuelBasPpu) {
        this.wetfuelBasPpu = wetfuelBasPpu;
    }

    public BigDecimal getWetFlDelvFee() {
        return wetFlDelvFee;
    }

    public void setWetFlDelvFee(BigDecimal wetFlDelvFee) {
        this.wetFlDelvFee = wetFlDelvFee;
    }

    public BigDecimal getWetFlTotTaxPpu() {
        return wetFlTotTaxPpu;
    }

    public void setWetFlTotTaxPpu(BigDecimal wetFlTotTaxPpu) {
        this.wetFlTotTaxPpu = wetFlTotTaxPpu;
    }

    public int getOdmRdng() {
        return odmRdng;
    }

    public void setOdmRdng(int odmRdng) {
        this.odmRdng = odmRdng;
    }

    public int getPrevOdmRdng() {
        return prevOdmRdng;
    }

    public void setPrevOdmRdng(int prevOdmRdng) {
        this.prevOdmRdng = prevOdmRdng;
    }

    public BigDecimal getYrToDtMpg() {
        return yrToDtMpg;
    }

    public void setYrToDtMpg(BigDecimal yrToDtMpg) {
        this.yrToDtMpg = yrToDtMpg;
    }

    public BigDecimal getMpgThisFillUp() {
        return mpgThisFillUp;
    }

    public void setMpgThisFillUp(BigDecimal mpgThisFillUp) {
        this.mpgThisFillUp = mpgThisFillUp;
    }

    public int getMlsDrvn() {
        return mlsDrvn;
    }

    public void setMlsDrvn(int mlsDrvn) {
        this.mlsDrvn = mlsDrvn;
    }

    public BigDecimal getCstPerMile() {
        return cstPerMile;
    }

    public void setCstPerMile(BigDecimal cstPerMile) {
        this.cstPerMile = cstPerMile;
    }

    public BigDecimal getTrlHubRdng() {
        return trlHubRdng;
    }

    public void setTrlHubRdng(BigDecimal trlHubRdng) {
        this.trlHubRdng = trlHubRdng;
    }

    public String getAltTaxId() {
        return altTaxId;
    }

    public void setAltTaxId(String altTaxId) {
        this.altTaxId = altTaxId;
    }

    public BigDecimal getItmDiscRt() {
        return itmDiscRt;
    }

    public void setItmDiscRt(BigDecimal itmDiscRt) {
        this.itmDiscRt = itmDiscRt;
    }

    public short getTypOfSply() {
        return typOfSply;
    }

    public void setTypOfSply(short typOfSply) {
        this.typOfSply = typOfSply;
    }

    public String getUniqVatNbr() {
        return uniqVatNbr;
    }

    public void setUniqVatNbr(String uniqVatNbr) {
        this.uniqVatNbr = uniqVatNbr;
    }

    public String getCustMiscNbr() {
        return custMiscNbr;
    }

    public void setCustMiscNbr(String custMiscNbr) {
        this.custMiscNbr = custMiscNbr;
    }

    public Character getTankCapExc() {
        return tankCapExc;
    }

    public void setTankCapExc(Character tankCapExc) {
        this.tankCapExc = tankCapExc;
    }

    public Character getMpgExc() {
        return mpgExc;
    }

    public void setMpgExc(Character mpgExc) {
        this.mpgExc = mpgExc;
    }

    public Character getCpgExc() {
        return cpgExc;
    }

    public void setCpgExc(Character cpgExc) {
        this.cpgExc = cpgExc;
    }

    public Character getPrdCdExc() {
        return prdCdExc;
    }

    public void setPrdCdExc(Character prdCdExc) {
        this.prdCdExc = prdCdExc;
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

    public Character getUnitOfMsr() {
        return unitOfMsr;
    }

    public void setUnitOfMsr(Character unitOfMsr) {
        this.unitOfMsr = unitOfMsr;
    }

    public Character getOthFlExc() {
        return othFlExc;
    }

    public void setOthFlExc(Character othFlExc) {
        this.othFlExc = othFlExc;
    }

    public Character getBioDslPrdExc() {
        return bioDslPrdExc;
    }

    public void setBioDslPrdExc(Character bioDslPrdExc) {
        this.bioDslPrdExc = bioDslPrdExc;
    }

    public Character getHighGradeExc() {
        return highGradeExc;
    }

    public void setHighGradeExc(Character highGradeExc) {
        this.highGradeExc = highGradeExc;
    }

    public String getNr1SubPrdCd() {
        return nr1SubPrdCd;
    }

    public void setNr1SubPrdCd(String nr1SubPrdCd) {
        this.nr1SubPrdCd = nr1SubPrdCd;
    }

    public String getNr2SubPrdCd() {
        return nr2SubPrdCd;
    }

    public void setNr2SubPrdCd(String nr2SubPrdCd) {
        this.nr2SubPrdCd = nr2SubPrdCd;
    }

    public String getRfrSubPrdCd() {
        return rfrSubPrdCd;
    }

    public void setRfrSubPrdCd(String rfrSubPrdCd) {
        this.rfrSubPrdCd = rfrSubPrdCd;
    }

    public Character getXclsnFlg() {
        return xclsnFlg;
    }

    public void setXclsnFlg(Character xclsnFlg) {
        this.xclsnFlg = xclsnFlg;
    }

    public Character getRebInd() {
        return rebInd;
    }

    public void setRebInd(Character rebInd) {
        this.rebInd = rebInd;
    }

    public BigDecimal getRebAmt() {
        return rebAmt;
    }

    public void setRebAmt(BigDecimal rebAmt) {
        this.rebAmt = rebAmt;
    }

    public short getDiscRebDtlNbr() {
        return discRebDtlNbr;
    }

    public void setDiscRebDtlNbr(short discRebDtlNbr) {
        this.discRebDtlNbr = discRebDtlNbr;
    }

    public int getShipDt() {
        return shipDt;
    }

    public void setShipDt(int shipDt) {
        this.shipDt = shipDt;
    }

    public int getOrdDt() {
        return ordDt;
    }

    public void setOrdDt(int ordDt) {
        this.ordDt = ordDt;
    }

    public String getMedsrvShipto() {
        return medsrvShipto;
    }

    public void setMedsrvShipto(String medsrvShipto) {
        this.medsrvShipto = medsrvShipto;
    }

    public String getContactNbr() {
        return contactNbr;
    }

    public void setContactNbr(String contactNbr) {
        this.contactNbr = contactNbr;
    }

    public Character getMedsrvPrcAdj() {
        return medsrvPrcAdj;
    }

    public void setMedsrvPrcAdj(Character medsrvPrcAdj) {
        this.medsrvPrcAdj = medsrvPrcAdj;
    }

    public String getMedsrvPrdNbr() {
        return medsrvPrdNbr;
    }

    public void setMedsrvPrdNbr(String medsrvPrdNbr) {
        this.medsrvPrdNbr = medsrvPrdNbr;
    }

    public Character getZeroCostInd() {
        return zeroCostInd;
    }

    public void setZeroCostInd(Character zeroCostInd) {
        this.zeroCostInd = zeroCostInd;
    }

    public String getUniqVatNbr17() {
        return uniqVatNbr17;
    }

    public void setUniqVatNbr17(String uniqVatNbr17) {
        this.uniqVatNbr17 = uniqVatNbr17;
    }

    public BigDecimal getAdjPrdQty() {
        return adjPrdQty;
    }

    public void setAdjPrdQty(BigDecimal adjPrdQty) {
        this.adjPrdQty = adjPrdQty;
    }

    public Character getAdjUnitOfMsr() {
        return adjUnitOfMsr;
    }

    public void setAdjUnitOfMsr(Character adjUnitOfMsr) {
        this.adjUnitOfMsr = adjUnitOfMsr;
    }

    public BigDecimal getAdjPrdPrc() {
        return adjPrdPrc;
    }

    public void setAdjPrdPrc(BigDecimal adjPrdPrc) {
        this.adjPrdPrc = adjPrdPrc;
    }

    public BigDecimal getAdjPrdTotCst() {
        return adjPrdTotCst;
    }

    public void setAdjPrdTotCst(BigDecimal adjPrdTotCst) {
        this.adjPrdTotCst = adjPrdTotCst;
    }

    public Character getLqidNatlGasExc() {
        return lqidNatlGasExc;
    }

    public void setLqidNatlGasExc(Character lqidNatlGasExc) {
        this.lqidNatlGasExc = lqidNatlGasExc;
    }

    public Character getCmprssdNatlGasExc() {
        return cmprssdNatlGasExc;
    }

    public void setCmprssdNatlGasExc(Character cmprssdNatlGasExc) {
        this.cmprssdNatlGasExc = cmprssdNatlGasExc;
    }

    public Character getFlgBdslClrExc() {
        return flgBdslClrExc;
    }

    public void setFlgBdslClrExc(Character flgBdslClrExc) {
        this.flgBdslClrExc = flgBdslClrExc;
    }

    public Character getFlgBdslDyedExc() {
        return flgBdslDyedExc;
    }

    public void setFlgBdslDyedExc(Character flgBdslDyedExc) {
        this.flgBdslDyedExc = flgBdslDyedExc;
    }

    public Character getDslExhaustFldExc() {
        return dslExhaustFldExc;
    }

    public void setDslExhaustFldExc(Character dslExhaustFldExc) {
        this.dslExhaustFldExc = dslExhaustFldExc;
    }

    public BigDecimal getProdRetainAmt() {
        return prodRetainAmt;
    }

    public void setProdRetainAmt(BigDecimal prodRetainAmt) {
        this.prodRetainAmt = prodRetainAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invPrdDtlTblPK != null ? invPrdDtlTblPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvPrdDtlTbl)) {
            return false;
        }
        InvPrdDtlTbl other = (InvPrdDtlTbl) object;
        if ((this.invPrdDtlTblPK == null && other.invPrdDtlTblPK != null) || (this.invPrdDtlTblPK != null && !this.invPrdDtlTblPK.equals(other.invPrdDtlTblPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvPrdDtlTbl[ invPrdDtlTblPK=" + invPrdDtlTblPK + " ]";
    }

}
