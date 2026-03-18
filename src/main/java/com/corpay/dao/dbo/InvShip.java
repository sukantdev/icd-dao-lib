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
@Table(name = "INV_SHIP", catalog = "", schema = "DBO")
public class InvShip implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvShipPK invShipPK;
    @Basic(optional = false)
    @Column(name = "CUST_CD")
    private String custCd;
    @Basic(optional = false)
    @Column(name = "COMMODITY_CD")
    private String commodityCd;
    @Basic(optional = false)
    @Column(name = "MISC_DESC_1")
    private String miscDesc1;

    @Basic(optional = false)
    @Column(name = "MISC_AMT_1")
    private BigDecimal miscAmt1;
    @Basic(optional = false)
    @Column(name = "MISC_AMT_1_SIGN")
    private Character miscAmt1Sign;
    @Basic(optional = false)
    @Column(name = "MISC_DESC_2")
    private String miscDesc2;
    @Basic(optional = false)
    @Column(name = "MISC_AMT_2")
    private BigDecimal miscAmt2;
    @Basic(optional = false)
    @Column(name = "MISC_AMT_2_SIGN")
    private Character miscAmt2Sign;
    @Basic(optional = false)
    @Column(name = "MISC_DESC_3")
    private String miscDesc3;
    @Basic(optional = false)
    @Column(name = "MISC_AMT_3")
    private BigDecimal miscAmt3;
    @Basic(optional = false)
    @Column(name = "MISC_AMT_3_SIGN")
    private Character miscAmt3Sign;
    @Basic(optional = false)
    @Column(name = "MISC_DESC_4")
    private String miscDesc4;
    @Basic(optional = false)
    @Column(name = "MISC_AMT_4")
    private BigDecimal miscAmt4;
    @Basic(optional = false)
    @Column(name = "MISC_AMT_4_SIGN")
    private Character miscAmt4Sign;
    @Basic(optional = false)
    @Column(name = "SVE_DESC_CD")
    private String sveDescCd;
    @Basic(optional = false)
    @Column(name = "TRACK_NR")
    private String trackNr;
    @Basic(optional = false)
    @Column(name = "SHPNET_AMT")
    private BigDecimal shpnetAmt;
    @Basic(optional = false)
    @Column(name = "SHPNET_AMT_SIGN")
    private Character shpnetAmtSign;
    @Basic(optional = false)
    @Column(name = "INCT_AMT")
    private BigDecimal inctAmt;
    @Basic(optional = false)
    @Column(name = "INCT_AMT_SIGN")
    private Character inctAmtSign;
    @Basic(optional = false)
    @Column(name = "PKUP_DT")
    private int pkupDt;
    @Basic(optional = false)
    @Column(name = "DLVR_DT")
    private int dlvrDt;
    @Basic(optional = false)
    @Column(name = "NR_PKG")
    private int nrPkg;
    @Basic(optional = false)
    @Column(name = "PCKG_WT")
    private String pckgWt;
    @Basic(optional = false)
    @Column(name = "UNIT_MSR")
    private String unitMsr;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_ID_1")
    private Character taxAmtId1;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_1")
    private BigDecimal taxAmt1;
    @Basic(optional = false)
    @Column(name = "TAX_RT_1")
    private BigDecimal taxRt1;
    @Basic(optional = false)
    @Column(name = "TAX_TYP_ID_1")
    private String taxTypId1;
    @Basic(optional = false)
    @Column(name = "CRD_ACCEPTANCE_1")
    private String crdAcceptance1;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_SIGN_1")
    private Character taxAmtSign1;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_ID_2")
    private Character taxAmtId2;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_2")
    private BigDecimal taxAmt2;
    @Basic(optional = false)
    @Column(name = "TAX_RT_2")
    private BigDecimal taxRt2;
    @Basic(optional = false)
    @Column(name = "TAX_TYP_ID_2")
    private String taxTypId2;
    @Basic(optional = false)
    @Column(name = "CRD_ACCEPTANCE_2")
    private String crdAcceptance2;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_SIGN_2")
    private Character taxAmtSign2;
    @Basic(optional = false)
    @Column(name = "BILL_TYP")
    private Character billTyp;
    @Basic(optional = false)
    @Column(name = "DELV_DESC_1")
    private Character delvDesc1;
    @Basic(optional = false)
    @Column(name = "DELV_CNTCT_1")
    private String delvCntct1;
    @Basic(optional = false)
    @Column(name = "DELV_DESC_2")
    private Character delvDesc2;
    @Basic(optional = false)
    @Column(name = "DELV_CNTCT_2")
    private String delvCntct2;
    @Basic(optional = false)
    @Column(name = "DELV_DESC_3")
    private Character delvDesc3;
    @Basic(optional = false)
    @Column(name = "DELV_CNTCT_3")
    private String delvCntct3;
    @Basic(optional = false)
    @Column(name = "DELV_DESC_4")
    private Character delvDesc4;
    @Basic(optional = false)
    @Column(name = "DELV_CNTCT_4")
    private String delvCntct4;
    @Basic(optional = false)
    @Column(name = "DELV_DESC_5")
    private Character delvDesc5;
    @Basic(optional = false)
    @Column(name = "DELV_CNTCT_5")
    private String delvCntct5;
    @Basic(optional = false)
    @Column(name = "SHPNG_NM_1")
    private String shpngNm1;
    @Basic(optional = false)
    @Column(name = "SHPNG_NM_2")
    private String shpngNm2;
    @Basic(optional = false)
    @Column(name = "SHPNG_NM_3")
    private String shpngNm3;
    @Basic(optional = false)
    @Column(name = "SHPNG_ADDR1")
    private String shpngAddr1;
    @Basic(optional = false)
    @Column(name = "SHPNG_ADDR2")
    private String shpngAddr2;
    @Basic(optional = false)
    @Column(name = "SHPNG_ADDR3")
    private String shpngAddr3;
    @Basic(optional = false)
    @Column(name = "SHPNG_ADDR4")
    private String shpngAddr4;
    @Basic(optional = false)
    @Column(name = "SHPNG_ADDR5")
    private String shpngAddr5;
    @Basic(optional = false)
    @Column(name = "SHPNG_ADDR6")
    private String shpngAddr6;
    @Basic(optional = false)
    @Column(name = "SHPNG_CITY")
    private String shpngCity;
    @Basic(optional = false)
    @Column(name = "SHPNG_ST")
    private String shpngSt;
    @Basic(optional = false)
    @Column(name = "SHPNG_CRTY")
    private String shpngCrty;
    @Basic(optional = false)
    @Column(name = "SHPNG_ZIP")
    private String shpngZip;
    @Basic(optional = false)
    @Column(name = "PARTY_DES_1")
    private Character partyDes1;
    @Basic(optional = false)
    @Column(name = "PARTY_CNT_1")
    private String partyCnt1;
    @Basic(optional = false)
    @Column(name = "PARTY_DES_2")
    private Character partyDes2;
    @Basic(optional = false)
    @Column(name = "PARTY_CNT_2")
    private String partyCnt2;
    @Basic(optional = false)
    @Column(name = "PARTY_DES_3")
    private Character partyDes3;
    @Basic(optional = false)
    @Column(name = "PARTY_CNT_3")
    private String partyCnt3;
    @Basic(optional = false)
    @Column(name = "PARTY_DES_4")
    private Character partyDes4;
    @Basic(optional = false)
    @Column(name = "PARTY_CNT_4")
    private String partyCnt4;
    @Basic(optional = false)
    @Column(name = "PARTY_DES_5")
    private Character partyDes5;
    @Basic(optional = false)
    @Column(name = "PARTY_CNT_5")
    private String partyCnt5;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_CITY")
    private String delvPrtyCity;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_ST")
    private String delvPrtySt;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_CRTY")
    private String delvPrtyCrty;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_ZIP")
    private String delvPrtyZip;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_NM_1")
    private String delvPrtyNm1;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_NM_2")
    private String delvPrtyNm2;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_NM_3")
    private String delvPrtyNm3;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_ADDR1")
    private String delvPrtyAddr1;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_ADDR2")
    private String delvPrtyAddr2;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_ADDR3")
    private String delvPrtyAddr3;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_ADDR4")
    private String delvPrtyAddr4;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_ADDR5")
    private String delvPrtyAddr5;
    @Basic(optional = false)
    @Column(name = "DELV_PRTY_ADDR6")
    private String delvPrtyAddr6;
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
    @Column(name = "TAX_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taxTs;
    @Basic(optional = false)
    @Column(name = "TAX_EXEMPT_IND")
    private Character taxExemptInd;

    public InvShip() {
    }

    public InvShip(InvShipPK invShipPK) {
        this.invShipPK = invShipPK;
    }

    public InvShip(InvShipPK invShipPK, String custCd, String commodityCd, String miscDesc1, BigDecimal miscAmt1, Character miscAmt1Sign, String miscDesc2, BigDecimal miscAmt2, Character miscAmt2Sign, String miscDesc3, BigDecimal miscAmt3, Character miscAmt3Sign, String miscDesc4, BigDecimal miscAmt4, Character miscAmt4Sign, String sveDescCd, String trackNr, BigDecimal shpnetAmt, Character shpnetAmtSign, BigDecimal inctAmt, Character inctAmtSign, int pkupDt, int dlvrDt, int nrPkg, String pckgWt, String unitMsr, Character taxAmtId1, BigDecimal taxAmt1, BigDecimal taxRt1, String taxTypId1, String crdAcceptance1, Character taxAmtSign1, Character taxAmtId2, BigDecimal taxAmt2, BigDecimal taxRt2, String taxTypId2, String crdAcceptance2, Character taxAmtSign2, Character billTyp, Character delvDesc1, String delvCntct1, Character delvDesc2, String delvCntct2, Character delvDesc3, String delvCntct3, Character delvDesc4, String delvCntct4, Character delvDesc5, String delvCntct5, String shpngNm1, String shpngNm2, String shpngNm3, String shpngAddr1, String shpngAddr2, String shpngAddr3, String shpngAddr4, String shpngAddr5, String shpngAddr6, String shpngCity, String shpngSt, String shpngCrty, String shpngZip, Character partyDes1, String partyCnt1, Character partyDes2, String partyCnt2, Character partyDes3, String partyCnt3, Character partyDes4, String partyCnt4, Character partyDes5, String partyCnt5, String delvPrtyCity, String delvPrtySt, String delvPrtyCrty, String delvPrtyZip, String delvPrtyNm1, String delvPrtyNm2, String delvPrtyNm3, String delvPrtyAddr1, String delvPrtyAddr2, String delvPrtyAddr3, String delvPrtyAddr4, String delvPrtyAddr5, String delvPrtyAddr6, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date taxTs, Character taxExemptInd) {
        this.invShipPK = invShipPK;
        this.custCd = custCd;
        this.commodityCd = commodityCd;
        this.miscDesc1 = miscDesc1;
        this.miscAmt1 = miscAmt1;
        this.miscAmt1Sign = miscAmt1Sign;
        this.miscDesc2 = miscDesc2;
        this.miscAmt2 = miscAmt2;
        this.miscAmt2Sign = miscAmt2Sign;
        this.miscDesc3 = miscDesc3;
        this.miscAmt3 = miscAmt3;
        this.miscAmt3Sign = miscAmt3Sign;
        this.miscDesc4 = miscDesc4;
        this.miscAmt4 = miscAmt4;
        this.miscAmt4Sign = miscAmt4Sign;
        this.sveDescCd = sveDescCd;
        this.trackNr = trackNr;
        this.shpnetAmt = shpnetAmt;
        this.shpnetAmtSign = shpnetAmtSign;
        this.inctAmt = inctAmt;
        this.inctAmtSign = inctAmtSign;
        this.pkupDt = pkupDt;
        this.dlvrDt = dlvrDt;
        this.nrPkg = nrPkg;
        this.pckgWt = pckgWt;
        this.unitMsr = unitMsr;
        this.taxAmtId1 = taxAmtId1;
        this.taxAmt1 = taxAmt1;
        this.taxRt1 = taxRt1;
        this.taxTypId1 = taxTypId1;
        this.crdAcceptance1 = crdAcceptance1;
        this.taxAmtSign1 = taxAmtSign1;
        this.taxAmtId2 = taxAmtId2;
        this.taxAmt2 = taxAmt2;
        this.taxRt2 = taxRt2;
        this.taxTypId2 = taxTypId2;
        this.crdAcceptance2 = crdAcceptance2;
        this.taxAmtSign2 = taxAmtSign2;
        this.billTyp = billTyp;
        this.delvDesc1 = delvDesc1;
        this.delvCntct1 = delvCntct1;
        this.delvDesc2 = delvDesc2;
        this.delvCntct2 = delvCntct2;
        this.delvDesc3 = delvDesc3;
        this.delvCntct3 = delvCntct3;
        this.delvDesc4 = delvDesc4;
        this.delvCntct4 = delvCntct4;
        this.delvDesc5 = delvDesc5;
        this.delvCntct5 = delvCntct5;
        this.shpngNm1 = shpngNm1;
        this.shpngNm2 = shpngNm2;
        this.shpngNm3 = shpngNm3;
        this.shpngAddr1 = shpngAddr1;
        this.shpngAddr2 = shpngAddr2;
        this.shpngAddr3 = shpngAddr3;
        this.shpngAddr4 = shpngAddr4;
        this.shpngAddr5 = shpngAddr5;
        this.shpngAddr6 = shpngAddr6;
        this.shpngCity = shpngCity;
        this.shpngSt = shpngSt;
        this.shpngCrty = shpngCrty;
        this.shpngZip = shpngZip;
        this.partyDes1 = partyDes1;
        this.partyCnt1 = partyCnt1;
        this.partyDes2 = partyDes2;
        this.partyCnt2 = partyCnt2;
        this.partyDes3 = partyDes3;
        this.partyCnt3 = partyCnt3;
        this.partyDes4 = partyDes4;
        this.partyCnt4 = partyCnt4;
        this.partyDes5 = partyDes5;
        this.partyCnt5 = partyCnt5;
        this.delvPrtyCity = delvPrtyCity;
        this.delvPrtySt = delvPrtySt;
        this.delvPrtyCrty = delvPrtyCrty;
        this.delvPrtyZip = delvPrtyZip;
        this.delvPrtyNm1 = delvPrtyNm1;
        this.delvPrtyNm2 = delvPrtyNm2;
        this.delvPrtyNm3 = delvPrtyNm3;
        this.delvPrtyAddr1 = delvPrtyAddr1;
        this.delvPrtyAddr2 = delvPrtyAddr2;
        this.delvPrtyAddr3 = delvPrtyAddr3;
        this.delvPrtyAddr4 = delvPrtyAddr4;
        this.delvPrtyAddr5 = delvPrtyAddr5;
        this.delvPrtyAddr6 = delvPrtyAddr6;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.taxTs = taxTs;
        this.taxExemptInd = taxExemptInd;
    }

    public InvShip(Date pstdDt, int trnsId, short seqNo) {
        this.invShipPK = new InvShipPK(pstdDt, trnsId, seqNo);
    }

    public InvShipPK getInvShipPK() {
        return invShipPK;
    }

    public void setInvShipPK(InvShipPK invShipPK) {
        this.invShipPK = invShipPK;
    }

    public String getCustCd() {
        return custCd;
    }

    public void setCustCd(String custCd) {
        this.custCd = custCd;
    }

    public String getCommodityCd() {
        return commodityCd;
    }

    public void setCommodityCd(String commodityCd) {
        this.commodityCd = commodityCd;
    }

    public String getMiscDesc1() {
        return miscDesc1;
    }

    public void setMiscDesc1(String miscDesc1) {
        this.miscDesc1 = miscDesc1;
    }

    public BigDecimal getMiscAmt1() {
        return miscAmt1;
    }

    public void setMiscAmt1(BigDecimal miscAmt1) {
        this.miscAmt1 = miscAmt1;
    }

    public Character getMiscAmt1Sign() {
        return miscAmt1Sign;
    }

    public void setMiscAmt1Sign(Character miscAmt1Sign) {
        this.miscAmt1Sign = miscAmt1Sign;
    }

    public String getMiscDesc2() {
        return miscDesc2;
    }

    public void setMiscDesc2(String miscDesc2) {
        this.miscDesc2 = miscDesc2;
    }

    public BigDecimal getMiscAmt2() {
        return miscAmt2;
    }

    public void setMiscAmt2(BigDecimal miscAmt2) {
        this.miscAmt2 = miscAmt2;
    }

    public Character getMiscAmt2Sign() {
        return miscAmt2Sign;
    }

    public void setMiscAmt2Sign(Character miscAmt2Sign) {
        this.miscAmt2Sign = miscAmt2Sign;
    }

    public String getMiscDesc3() {
        return miscDesc3;
    }

    public void setMiscDesc3(String miscDesc3) {
        this.miscDesc3 = miscDesc3;
    }

    public BigDecimal getMiscAmt3() {
        return miscAmt3;
    }

    public void setMiscAmt3(BigDecimal miscAmt3) {
        this.miscAmt3 = miscAmt3;
    }

    public Character getMiscAmt3Sign() {
        return miscAmt3Sign;
    }

    public void setMiscAmt3Sign(Character miscAmt3Sign) {
        this.miscAmt3Sign = miscAmt3Sign;
    }

    public String getMiscDesc4() {
        return miscDesc4;
    }

    public void setMiscDesc4(String miscDesc4) {
        this.miscDesc4 = miscDesc4;
    }

    public BigDecimal getMiscAmt4() {
        return miscAmt4;
    }

    public void setMiscAmt4(BigDecimal miscAmt4) {
        this.miscAmt4 = miscAmt4;
    }

    public Character getMiscAmt4Sign() {
        return miscAmt4Sign;
    }

    public void setMiscAmt4Sign(Character miscAmt4Sign) {
        this.miscAmt4Sign = miscAmt4Sign;
    }

    public String getSveDescCd() {
        return sveDescCd;
    }

    public void setSveDescCd(String sveDescCd) {
        this.sveDescCd = sveDescCd;
    }

    public String getTrackNr() {
        return trackNr;
    }

    public void setTrackNr(String trackNr) {
        this.trackNr = trackNr;
    }

    public BigDecimal getShpnetAmt() {
        return shpnetAmt;
    }

    public void setShpnetAmt(BigDecimal shpnetAmt) {
        this.shpnetAmt = shpnetAmt;
    }

    public Character getShpnetAmtSign() {
        return shpnetAmtSign;
    }

    public void setShpnetAmtSign(Character shpnetAmtSign) {
        this.shpnetAmtSign = shpnetAmtSign;
    }

    public BigDecimal getInctAmt() {
        return inctAmt;
    }

    public void setInctAmt(BigDecimal inctAmt) {
        this.inctAmt = inctAmt;
    }

    public Character getInctAmtSign() {
        return inctAmtSign;
    }

    public void setInctAmtSign(Character inctAmtSign) {
        this.inctAmtSign = inctAmtSign;
    }

    public int getPkupDt() {
        return pkupDt;
    }

    public void setPkupDt(int pkupDt) {
        this.pkupDt = pkupDt;
    }

    public int getDlvrDt() {
        return dlvrDt;
    }

    public void setDlvrDt(int dlvrDt) {
        this.dlvrDt = dlvrDt;
    }

    public int getNrPkg() {
        return nrPkg;
    }

    public void setNrPkg(int nrPkg) {
        this.nrPkg = nrPkg;
    }

    public String getPckgWt() {
        return pckgWt;
    }

    public void setPckgWt(String pckgWt) {
        this.pckgWt = pckgWt;
    }

    public String getUnitMsr() {
        return unitMsr;
    }

    public void setUnitMsr(String unitMsr) {
        this.unitMsr = unitMsr;
    }

    public Character getTaxAmtId1() {
        return taxAmtId1;
    }

    public void setTaxAmtId1(Character taxAmtId1) {
        this.taxAmtId1 = taxAmtId1;
    }

    public BigDecimal getTaxAmt1() {
        return taxAmt1;
    }

    public void setTaxAmt1(BigDecimal taxAmt1) {
        this.taxAmt1 = taxAmt1;
    }

    public BigDecimal getTaxRt1() {
        return taxRt1;
    }

    public void setTaxRt1(BigDecimal taxRt1) {
        this.taxRt1 = taxRt1;
    }

    public String getTaxTypId1() {
        return taxTypId1;
    }

    public void setTaxTypId1(String taxTypId1) {
        this.taxTypId1 = taxTypId1;
    }

    public String getCrdAcceptance1() {
        return crdAcceptance1;
    }

    public void setCrdAcceptance1(String crdAcceptance1) {
        this.crdAcceptance1 = crdAcceptance1;
    }

    public Character getTaxAmtSign1() {
        return taxAmtSign1;
    }

    public void setTaxAmtSign1(Character taxAmtSign1) {
        this.taxAmtSign1 = taxAmtSign1;
    }

    public Character getTaxAmtId2() {
        return taxAmtId2;
    }

    public void setTaxAmtId2(Character taxAmtId2) {
        this.taxAmtId2 = taxAmtId2;
    }

    public BigDecimal getTaxAmt2() {
        return taxAmt2;
    }

    public void setTaxAmt2(BigDecimal taxAmt2) {
        this.taxAmt2 = taxAmt2;
    }

    public BigDecimal getTaxRt2() {
        return taxRt2;
    }

    public void setTaxRt2(BigDecimal taxRt2) {
        this.taxRt2 = taxRt2;
    }

    public String getTaxTypId2() {
        return taxTypId2;
    }

    public void setTaxTypId2(String taxTypId2) {
        this.taxTypId2 = taxTypId2;
    }

    public String getCrdAcceptance2() {
        return crdAcceptance2;
    }

    public void setCrdAcceptance2(String crdAcceptance2) {
        this.crdAcceptance2 = crdAcceptance2;
    }

    public Character getTaxAmtSign2() {
        return taxAmtSign2;
    }

    public void setTaxAmtSign2(Character taxAmtSign2) {
        this.taxAmtSign2 = taxAmtSign2;
    }

    public Character getBillTyp() {
        return billTyp;
    }

    public void setBillTyp(Character billTyp) {
        this.billTyp = billTyp;
    }

    public Character getDelvDesc1() {
        return delvDesc1;
    }

    public void setDelvDesc1(Character delvDesc1) {
        this.delvDesc1 = delvDesc1;
    }

    public String getDelvCntct1() {
        return delvCntct1;
    }

    public void setDelvCntct1(String delvCntct1) {
        this.delvCntct1 = delvCntct1;
    }

    public Character getDelvDesc2() {
        return delvDesc2;
    }

    public void setDelvDesc2(Character delvDesc2) {
        this.delvDesc2 = delvDesc2;
    }

    public String getDelvCntct2() {
        return delvCntct2;
    }

    public void setDelvCntct2(String delvCntct2) {
        this.delvCntct2 = delvCntct2;
    }

    public Character getDelvDesc3() {
        return delvDesc3;
    }

    public void setDelvDesc3(Character delvDesc3) {
        this.delvDesc3 = delvDesc3;
    }

    public String getDelvCntct3() {
        return delvCntct3;
    }

    public void setDelvCntct3(String delvCntct3) {
        this.delvCntct3 = delvCntct3;
    }

    public Character getDelvDesc4() {
        return delvDesc4;
    }

    public void setDelvDesc4(Character delvDesc4) {
        this.delvDesc4 = delvDesc4;
    }

    public String getDelvCntct4() {
        return delvCntct4;
    }

    public void setDelvCntct4(String delvCntct4) {
        this.delvCntct4 = delvCntct4;
    }

    public Character getDelvDesc5() {
        return delvDesc5;
    }

    public void setDelvDesc5(Character delvDesc5) {
        this.delvDesc5 = delvDesc5;
    }

    public String getDelvCntct5() {
        return delvCntct5;
    }

    public void setDelvCntct5(String delvCntct5) {
        this.delvCntct5 = delvCntct5;
    }

    public String getShpngNm1() {
        return shpngNm1;
    }

    public void setShpngNm1(String shpngNm1) {
        this.shpngNm1 = shpngNm1;
    }

    public String getShpngNm2() {
        return shpngNm2;
    }

    public void setShpngNm2(String shpngNm2) {
        this.shpngNm2 = shpngNm2;
    }

    public String getShpngNm3() {
        return shpngNm3;
    }

    public void setShpngNm3(String shpngNm3) {
        this.shpngNm3 = shpngNm3;
    }

    public String getShpngAddr1() {
        return shpngAddr1;
    }

    public void setShpngAddr1(String shpngAddr1) {
        this.shpngAddr1 = shpngAddr1;
    }

    public String getShpngAddr2() {
        return shpngAddr2;
    }

    public void setShpngAddr2(String shpngAddr2) {
        this.shpngAddr2 = shpngAddr2;
    }

    public String getShpngAddr3() {
        return shpngAddr3;
    }

    public void setShpngAddr3(String shpngAddr3) {
        this.shpngAddr3 = shpngAddr3;
    }

    public String getShpngAddr4() {
        return shpngAddr4;
    }

    public void setShpngAddr4(String shpngAddr4) {
        this.shpngAddr4 = shpngAddr4;
    }

    public String getShpngAddr5() {
        return shpngAddr5;
    }

    public void setShpngAddr5(String shpngAddr5) {
        this.shpngAddr5 = shpngAddr5;
    }

    public String getShpngAddr6() {
        return shpngAddr6;
    }

    public void setShpngAddr6(String shpngAddr6) {
        this.shpngAddr6 = shpngAddr6;
    }

    public String getShpngCity() {
        return shpngCity;
    }

    public void setShpngCity(String shpngCity) {
        this.shpngCity = shpngCity;
    }

    public String getShpngSt() {
        return shpngSt;
    }

    public void setShpngSt(String shpngSt) {
        this.shpngSt = shpngSt;
    }

    public String getShpngCrty() {
        return shpngCrty;
    }

    public void setShpngCrty(String shpngCrty) {
        this.shpngCrty = shpngCrty;
    }

    public String getShpngZip() {
        return shpngZip;
    }

    public void setShpngZip(String shpngZip) {
        this.shpngZip = shpngZip;
    }

    public Character getPartyDes1() {
        return partyDes1;
    }

    public void setPartyDes1(Character partyDes1) {
        this.partyDes1 = partyDes1;
    }

    public String getPartyCnt1() {
        return partyCnt1;
    }

    public void setPartyCnt1(String partyCnt1) {
        this.partyCnt1 = partyCnt1;
    }

    public Character getPartyDes2() {
        return partyDes2;
    }

    public void setPartyDes2(Character partyDes2) {
        this.partyDes2 = partyDes2;
    }

    public String getPartyCnt2() {
        return partyCnt2;
    }

    public void setPartyCnt2(String partyCnt2) {
        this.partyCnt2 = partyCnt2;
    }

    public Character getPartyDes3() {
        return partyDes3;
    }

    public void setPartyDes3(Character partyDes3) {
        this.partyDes3 = partyDes3;
    }

    public String getPartyCnt3() {
        return partyCnt3;
    }

    public void setPartyCnt3(String partyCnt3) {
        this.partyCnt3 = partyCnt3;
    }

    public Character getPartyDes4() {
        return partyDes4;
    }

    public void setPartyDes4(Character partyDes4) {
        this.partyDes4 = partyDes4;
    }

    public String getPartyCnt4() {
        return partyCnt4;
    }

    public void setPartyCnt4(String partyCnt4) {
        this.partyCnt4 = partyCnt4;
    }

    public Character getPartyDes5() {
        return partyDes5;
    }

    public void setPartyDes5(Character partyDes5) {
        this.partyDes5 = partyDes5;
    }

    public String getPartyCnt5() {
        return partyCnt5;
    }

    public void setPartyCnt5(String partyCnt5) {
        this.partyCnt5 = partyCnt5;
    }

    public String getDelvPrtyCity() {
        return delvPrtyCity;
    }

    public void setDelvPrtyCity(String delvPrtyCity) {
        this.delvPrtyCity = delvPrtyCity;
    }

    public String getDelvPrtySt() {
        return delvPrtySt;
    }

    public void setDelvPrtySt(String delvPrtySt) {
        this.delvPrtySt = delvPrtySt;
    }

    public String getDelvPrtyCrty() {
        return delvPrtyCrty;
    }

    public void setDelvPrtyCrty(String delvPrtyCrty) {
        this.delvPrtyCrty = delvPrtyCrty;
    }

    public String getDelvPrtyZip() {
        return delvPrtyZip;
    }

    public void setDelvPrtyZip(String delvPrtyZip) {
        this.delvPrtyZip = delvPrtyZip;
    }

    public String getDelvPrtyNm1() {
        return delvPrtyNm1;
    }

    public void setDelvPrtyNm1(String delvPrtyNm1) {
        this.delvPrtyNm1 = delvPrtyNm1;
    }

    public String getDelvPrtyNm2() {
        return delvPrtyNm2;
    }

    public void setDelvPrtyNm2(String delvPrtyNm2) {
        this.delvPrtyNm2 = delvPrtyNm2;
    }

    public String getDelvPrtyNm3() {
        return delvPrtyNm3;
    }

    public void setDelvPrtyNm3(String delvPrtyNm3) {
        this.delvPrtyNm3 = delvPrtyNm3;
    }

    public String getDelvPrtyAddr1() {
        return delvPrtyAddr1;
    }

    public void setDelvPrtyAddr1(String delvPrtyAddr1) {
        this.delvPrtyAddr1 = delvPrtyAddr1;
    }

    public String getDelvPrtyAddr2() {
        return delvPrtyAddr2;
    }

    public void setDelvPrtyAddr2(String delvPrtyAddr2) {
        this.delvPrtyAddr2 = delvPrtyAddr2;
    }

    public String getDelvPrtyAddr3() {
        return delvPrtyAddr3;
    }

    public void setDelvPrtyAddr3(String delvPrtyAddr3) {
        this.delvPrtyAddr3 = delvPrtyAddr3;
    }

    public String getDelvPrtyAddr4() {
        return delvPrtyAddr4;
    }

    public void setDelvPrtyAddr4(String delvPrtyAddr4) {
        this.delvPrtyAddr4 = delvPrtyAddr4;
    }

    public String getDelvPrtyAddr5() {
        return delvPrtyAddr5;
    }

    public void setDelvPrtyAddr5(String delvPrtyAddr5) {
        this.delvPrtyAddr5 = delvPrtyAddr5;
    }

    public String getDelvPrtyAddr6() {
        return delvPrtyAddr6;
    }

    public void setDelvPrtyAddr6(String delvPrtyAddr6) {
        this.delvPrtyAddr6 = delvPrtyAddr6;
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

    public Date getTaxTs() {
        return taxTs;
    }

    public void setTaxTs(Date taxTs) {
        this.taxTs = taxTs;
    }

    public Character getTaxExemptInd() {
        return taxExemptInd;
    }

    public void setTaxExemptInd(Character taxExemptInd) {
        this.taxExemptInd = taxExemptInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invShipPK != null ? invShipPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvShip)) {
            return false;
        }
        InvShip other = (InvShip) object;
        if ((this.invShipPK == null && other.invShipPK != null) || (this.invShipPK != null && !this.invShipPK.equals(other.invShipPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvShip[ invShipPK=" + invShipPK + " ]";
    }

}
