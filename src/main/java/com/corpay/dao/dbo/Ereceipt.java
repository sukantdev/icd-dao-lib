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
@Table(name = "ERECEIPT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Ereceipt.findAll", query = "SELECT e FROM Ereceipt e")})
public class Ereceipt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EreceiptPK ereceiptPK;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "MRCH_INV_NBR")
    private String mrchInvNbr;
    @Basic(optional = false)
    @Column(name = "PMT_MTHD_CD")
    private String pmtMthdCd;
    @Basic(optional = false)
    @Column(name = "RECPT_IMG_FILE_NM")
    private String recptImgFileNm;
    @Basic(optional = false)
    @Column(name = "BOL_FILE_NM")
    private String bolFileNm;
    @Basic(optional = false)
    @Column(name = "POD_FILE_NM")
    private String podFileNm;
    @Basic(optional = false)
    @Column(name = "POS_PH_NBR")
    private String posPhNbr;
    @Basic(optional = false)
    @Column(name = "POS_EMAIL_ADDR")
    private String posEmailAddr;
    @Basic(optional = false)
    @Column(name = "VNDR_NM")
    private String vndrNm;
    @Basic(optional = false)
    @Column(name = "TOT_CASE_CNT")
    private int totCaseCnt;
    @Basic(optional = false)
    @Column(name = "TOT_FINISHED_PALLETS")
    private int totFinishedPallets;
    @Basic(optional = false)
    @Column(name = "TOT_WT")
    private int totWt;
    @Basic(optional = false)
    @Column(name = "DOOR_NBR")
    private String doorNbr;
    @Basic(optional = false)
    @Column(name = "BILL_CD")
    private String billCd;
    @Basic(optional = false)
    @Column(name = "DOCK_NBR")
    private String dockNbr;
    @Basic(optional = false)
    @Column(name = "PCHS_ORD_NBR")
    private String pchsOrdNbr;
    @Basic(optional = false)
    @Column(name = "RCVR_NM")
    private String rcvrNm;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private String tripNbr;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "DRV_NBR")
    private String drvNbr;
    @Basic(optional = false)
    @Column(name = "TRL_NBR")
    private String trlNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "HUB_RDNG")
    private BigDecimal hubRdng;
    @Basic(optional = false)
    @Column(name = "TRL_HUB_RDNG")
    private BigDecimal trlHubRdng;
    @Basic(optional = false)
    @Column(name = "TRL_HRS")
    private String trlHrs;
    @Basic(optional = false)
    @Column(name = "DL_NBR")
    private String dlNbr;
    @Basic(optional = false)
    @Column(name = "DL_ST_CD")
    private String dlStCd;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "CNVNCE_FEE_AMT")
    private BigDecimal cnvnceFeeAmt;
    @Basic(optional = false)
    @Column(name = "TOT_TAXES_AMT")
    private BigDecimal totTaxesAmt;
    @Basic(optional = false)
    @Column(name = "FED_TAX_AMT")
    private BigDecimal fedTaxAmt;
    @Basic(optional = false)
    @Column(name = "ST_TAX_AMT")
    private BigDecimal stTaxAmt;
    @Basic(optional = false)
    @Column(name = "CTY_TAX_AMT")
    private BigDecimal ctyTaxAmt;
    @Basic(optional = false)
    @Column(name = "LCL_TAX_AMT")
    private BigDecimal lclTaxAmt;
    @Basic(optional = false)
    @Column(name = "CMNTS")
    private String cmnts;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_1")
    private String udfLbl1;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_1")
    private String udfVal1;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_2")
    private String udfLbl2;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_2")
    private String udfVal2;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_3")
    private String udfLbl3;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_3")
    private String udfVal3;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_4")
    private String udfLbl4;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_4")
    private String udfVal4;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_5")
    private String udfLbl5;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_5")
    private String udfVal5;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_6")
    private String udfLbl6;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_6")
    private String udfVal6;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_7")
    private String udfLbl7;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_7")
    private String udfVal7;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_8")
    private String udfLbl8;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_8")
    private String udfVal8;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_9")
    private String udfLbl9;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_9")
    private String udfVal9;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_10")
    private String udfLbl10;
    @Basic(optional = false)
    @Column(name = "UDF_VAL_10")
    private String udfVal10;
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
    @Column(name = "CRECPT_IMG_FILE_NM")
    private String crecptImgFileNm;
    @Basic(optional = false)
    @Column(name = "CDN_ERECEIPT_FEE")
    private BigDecimal cdnEreceiptFee;
    @Basic(optional = false)
    @Column(name = "TRANSFLO_FLG_001")
    private Character transfloFlg001;
    @Basic(optional = false)
    @Column(name = "TRANSFLO_FLG_002")
    private Character transfloFlg002;
    @Basic(optional = false)
    @Column(name = "TRANSFLO_FLG_003")
    private Character transfloFlg003;
    @Basic(optional = false)
    @Column(name = "TRANSFLO_FLG_004")
    private Character transfloFlg004;
    @Column(name = "PHOTON_KEY")
    private String photonKey;
    @Column(name = "HARVESTED_STATUS_FLG")
    private Character harvestedStatusFlg;
    @Column(name = "TRNS_TM")
    private String trnsTm;

    public Ereceipt() {
    }

    public Ereceipt(EreceiptPK ereceiptPK) {
        this.ereceiptPK = ereceiptPK;
    }

    public Ereceipt(EreceiptPK ereceiptPK, String usrId, String acctNbr, String custId, String mrchInvNbr, String pmtMthdCd, String recptImgFileNm, String bolFileNm, String podFileNm, String posPhNbr, String posEmailAddr, String vndrNm, int totCaseCnt, int totFinishedPallets, int totWt, String doorNbr, String billCd, String dockNbr, String pchsOrdNbr, String rcvrNm, String tripNbr, String unitNbr, String drvNbr, String trlNbr, BigDecimal hubRdng, BigDecimal trlHubRdng, String trlHrs, String dlNbr, String dlStCd, String lstNm, String fstNm, BigDecimal cnvnceFeeAmt, BigDecimal totTaxesAmt, BigDecimal fedTaxAmt, BigDecimal stTaxAmt, BigDecimal ctyTaxAmt, BigDecimal lclTaxAmt, String cmnts, String udfLbl1, String udfVal1, String udfLbl2, String udfVal2, String udfLbl3, String udfVal3, String udfLbl4, String udfVal4, String udfLbl5, String udfVal5, String udfLbl6, String udfVal6, String udfLbl7, String udfVal7, String udfLbl8, String udfVal8, String udfLbl9, String udfVal9, String udfLbl10, String udfVal10, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String crecptImgFileNm, BigDecimal cdnEreceiptFee, Character transfloFlg001, Character transfloFlg002, Character transfloFlg003, Character transfloFlg004) {
        this.ereceiptPK = ereceiptPK;
        this.usrId = usrId;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.mrchInvNbr = mrchInvNbr;
        this.pmtMthdCd = pmtMthdCd;
        this.recptImgFileNm = recptImgFileNm;
        this.bolFileNm = bolFileNm;
        this.podFileNm = podFileNm;
        this.posPhNbr = posPhNbr;
        this.posEmailAddr = posEmailAddr;
        this.vndrNm = vndrNm;
        this.totCaseCnt = totCaseCnt;
        this.totFinishedPallets = totFinishedPallets;
        this.totWt = totWt;
        this.doorNbr = doorNbr;
        this.billCd = billCd;
        this.dockNbr = dockNbr;
        this.pchsOrdNbr = pchsOrdNbr;
        this.rcvrNm = rcvrNm;
        this.tripNbr = tripNbr;
        this.unitNbr = unitNbr;
        this.drvNbr = drvNbr;
        this.trlNbr = trlNbr;
        this.hubRdng = hubRdng;
        this.trlHubRdng = trlHubRdng;
        this.trlHrs = trlHrs;
        this.dlNbr = dlNbr;
        this.dlStCd = dlStCd;
        this.lstNm = lstNm;
        this.fstNm = fstNm;
        this.cnvnceFeeAmt = cnvnceFeeAmt;
        this.totTaxesAmt = totTaxesAmt;
        this.fedTaxAmt = fedTaxAmt;
        this.stTaxAmt = stTaxAmt;
        this.ctyTaxAmt = ctyTaxAmt;
        this.lclTaxAmt = lclTaxAmt;
        this.cmnts = cmnts;
        this.udfLbl1 = udfLbl1;
        this.udfVal1 = udfVal1;
        this.udfLbl2 = udfLbl2;
        this.udfVal2 = udfVal2;
        this.udfLbl3 = udfLbl3;
        this.udfVal3 = udfVal3;
        this.udfLbl4 = udfLbl4;
        this.udfVal4 = udfVal4;
        this.udfLbl5 = udfLbl5;
        this.udfVal5 = udfVal5;
        this.udfLbl6 = udfLbl6;
        this.udfVal6 = udfVal6;
        this.udfLbl7 = udfLbl7;
        this.udfVal7 = udfVal7;
        this.udfLbl8 = udfLbl8;
        this.udfVal8 = udfVal8;
        this.udfLbl9 = udfLbl9;
        this.udfVal9 = udfVal9;
        this.udfLbl10 = udfLbl10;
        this.udfVal10 = udfVal10;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crecptImgFileNm = crecptImgFileNm;
        this.cdnEreceiptFee = cdnEreceiptFee;
        this.transfloFlg001 = transfloFlg001;
        this.transfloFlg002 = transfloFlg002;
        this.transfloFlg003 = transfloFlg003;
        this.transfloFlg004 = transfloFlg004;
    }

    public Ereceipt(Date trnsDt, int ctlNbr, String mrchSiteId) {
        this.ereceiptPK = new EreceiptPK(trnsDt, ctlNbr, mrchSiteId);
    }

    public EreceiptPK getEreceiptPK() {
        return ereceiptPK;
    }

    public void setEreceiptPK(EreceiptPK ereceiptPK) {
        this.ereceiptPK = ereceiptPK;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getMrchInvNbr() {
        return mrchInvNbr;
    }

    public void setMrchInvNbr(String mrchInvNbr) {
        this.mrchInvNbr = mrchInvNbr;
    }

    public String getPmtMthdCd() {
        return pmtMthdCd;
    }

    public void setPmtMthdCd(String pmtMthdCd) {
        this.pmtMthdCd = pmtMthdCd;
    }

    public String getRecptImgFileNm() {
        return recptImgFileNm;
    }

    public void setRecptImgFileNm(String recptImgFileNm) {
        this.recptImgFileNm = recptImgFileNm;
    }

    public String getBolFileNm() {
        return bolFileNm;
    }

    public void setBolFileNm(String bolFileNm) {
        this.bolFileNm = bolFileNm;
    }

    public String getPodFileNm() {
        return podFileNm;
    }

    public void setPodFileNm(String podFileNm) {
        this.podFileNm = podFileNm;
    }

    public String getPosPhNbr() {
        return posPhNbr;
    }

    public void setPosPhNbr(String posPhNbr) {
        this.posPhNbr = posPhNbr;
    }

    public String getPosEmailAddr() {
        return posEmailAddr;
    }

    public void setPosEmailAddr(String posEmailAddr) {
        this.posEmailAddr = posEmailAddr;
    }

    public String getVndrNm() {
        return vndrNm;
    }

    public void setVndrNm(String vndrNm) {
        this.vndrNm = vndrNm;
    }

    public int getTotCaseCnt() {
        return totCaseCnt;
    }

    public void setTotCaseCnt(int totCaseCnt) {
        this.totCaseCnt = totCaseCnt;
    }

    public int getTotFinishedPallets() {
        return totFinishedPallets;
    }

    public void setTotFinishedPallets(int totFinishedPallets) {
        this.totFinishedPallets = totFinishedPallets;
    }

    public int getTotWt() {
        return totWt;
    }

    public void setTotWt(int totWt) {
        this.totWt = totWt;
    }

    public String getDoorNbr() {
        return doorNbr;
    }

    public void setDoorNbr(String doorNbr) {
        this.doorNbr = doorNbr;
    }

    public String getBillCd() {
        return billCd;
    }

    public void setBillCd(String billCd) {
        this.billCd = billCd;
    }

    public String getDockNbr() {
        return dockNbr;
    }

    public void setDockNbr(String dockNbr) {
        this.dockNbr = dockNbr;
    }

    public String getPchsOrdNbr() {
        return pchsOrdNbr;
    }

    public void setPchsOrdNbr(String pchsOrdNbr) {
        this.pchsOrdNbr = pchsOrdNbr;
    }

    public String getRcvrNm() {
        return rcvrNm;
    }

    public void setRcvrNm(String rcvrNm) {
        this.rcvrNm = rcvrNm;
    }

    public String getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(String tripNbr) {
        this.tripNbr = tripNbr;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getDrvNbr() {
        return drvNbr;
    }

    public void setDrvNbr(String drvNbr) {
        this.drvNbr = drvNbr;
    }

    public String getTrlNbr() {
        return trlNbr;
    }

    public void setTrlNbr(String trlNbr) {
        this.trlNbr = trlNbr;
    }

    public BigDecimal getHubRdng() {
        return hubRdng;
    }

    public void setHubRdng(BigDecimal hubRdng) {
        this.hubRdng = hubRdng;
    }

    public BigDecimal getTrlHubRdng() {
        return trlHubRdng;
    }

    public void setTrlHubRdng(BigDecimal trlHubRdng) {
        this.trlHubRdng = trlHubRdng;
    }

    public String getTrlHrs() {
        return trlHrs;
    }

    public void setTrlHrs(String trlHrs) {
        this.trlHrs = trlHrs;
    }

    public String getDlNbr() {
        return dlNbr;
    }

    public void setDlNbr(String dlNbr) {
        this.dlNbr = dlNbr;
    }

    public String getDlStCd() {
        return dlStCd;
    }

    public void setDlStCd(String dlStCd) {
        this.dlStCd = dlStCd;
    }

    public String getLstNm() {
        return lstNm;
    }

    public void setLstNm(String lstNm) {
        this.lstNm = lstNm;
    }

    public String getFstNm() {
        return fstNm;
    }

    public void setFstNm(String fstNm) {
        this.fstNm = fstNm;
    }

    public BigDecimal getCnvnceFeeAmt() {
        return cnvnceFeeAmt;
    }

    public void setCnvnceFeeAmt(BigDecimal cnvnceFeeAmt) {
        this.cnvnceFeeAmt = cnvnceFeeAmt;
    }

    public BigDecimal getTotTaxesAmt() {
        return totTaxesAmt;
    }

    public void setTotTaxesAmt(BigDecimal totTaxesAmt) {
        this.totTaxesAmt = totTaxesAmt;
    }

    public BigDecimal getFedTaxAmt() {
        return fedTaxAmt;
    }

    public void setFedTaxAmt(BigDecimal fedTaxAmt) {
        this.fedTaxAmt = fedTaxAmt;
    }

    public BigDecimal getStTaxAmt() {
        return stTaxAmt;
    }

    public void setStTaxAmt(BigDecimal stTaxAmt) {
        this.stTaxAmt = stTaxAmt;
    }

    public BigDecimal getCtyTaxAmt() {
        return ctyTaxAmt;
    }

    public void setCtyTaxAmt(BigDecimal ctyTaxAmt) {
        this.ctyTaxAmt = ctyTaxAmt;
    }

    public BigDecimal getLclTaxAmt() {
        return lclTaxAmt;
    }

    public void setLclTaxAmt(BigDecimal lclTaxAmt) {
        this.lclTaxAmt = lclTaxAmt;
    }

    public String getCmnts() {
        return cmnts;
    }

    public void setCmnts(String cmnts) {
        this.cmnts = cmnts;
    }

    public String getUdfLbl1() {
        return udfLbl1;
    }

    public void setUdfLbl1(String udfLbl1) {
        this.udfLbl1 = udfLbl1;
    }

    public String getUdfVal1() {
        return udfVal1;
    }

    public void setUdfVal1(String udfVal1) {
        this.udfVal1 = udfVal1;
    }

    public String getUdfLbl2() {
        return udfLbl2;
    }

    public void setUdfLbl2(String udfLbl2) {
        this.udfLbl2 = udfLbl2;
    }

    public String getUdfVal2() {
        return udfVal2;
    }

    public void setUdfVal2(String udfVal2) {
        this.udfVal2 = udfVal2;
    }

    public String getUdfLbl3() {
        return udfLbl3;
    }

    public void setUdfLbl3(String udfLbl3) {
        this.udfLbl3 = udfLbl3;
    }

    public String getUdfVal3() {
        return udfVal3;
    }

    public void setUdfVal3(String udfVal3) {
        this.udfVal3 = udfVal3;
    }

    public String getUdfLbl4() {
        return udfLbl4;
    }

    public void setUdfLbl4(String udfLbl4) {
        this.udfLbl4 = udfLbl4;
    }

    public String getUdfVal4() {
        return udfVal4;
    }

    public void setUdfVal4(String udfVal4) {
        this.udfVal4 = udfVal4;
    }

    public String getUdfLbl5() {
        return udfLbl5;
    }

    public void setUdfLbl5(String udfLbl5) {
        this.udfLbl5 = udfLbl5;
    }

    public String getUdfVal5() {
        return udfVal5;
    }

    public void setUdfVal5(String udfVal5) {
        this.udfVal5 = udfVal5;
    }

    public String getUdfLbl6() {
        return udfLbl6;
    }

    public void setUdfLbl6(String udfLbl6) {
        this.udfLbl6 = udfLbl6;
    }

    public String getUdfVal6() {
        return udfVal6;
    }

    public void setUdfVal6(String udfVal6) {
        this.udfVal6 = udfVal6;
    }

    public String getUdfLbl7() {
        return udfLbl7;
    }

    public void setUdfLbl7(String udfLbl7) {
        this.udfLbl7 = udfLbl7;
    }

    public String getUdfVal7() {
        return udfVal7;
    }

    public void setUdfVal7(String udfVal7) {
        this.udfVal7 = udfVal7;
    }

    public String getUdfLbl8() {
        return udfLbl8;
    }

    public void setUdfLbl8(String udfLbl8) {
        this.udfLbl8 = udfLbl8;
    }

    public String getUdfVal8() {
        return udfVal8;
    }

    public void setUdfVal8(String udfVal8) {
        this.udfVal8 = udfVal8;
    }

    public String getUdfLbl9() {
        return udfLbl9;
    }

    public void setUdfLbl9(String udfLbl9) {
        this.udfLbl9 = udfLbl9;
    }

    public String getUdfVal9() {
        return udfVal9;
    }

    public void setUdfVal9(String udfVal9) {
        this.udfVal9 = udfVal9;
    }

    public String getUdfLbl10() {
        return udfLbl10;
    }

    public void setUdfLbl10(String udfLbl10) {
        this.udfLbl10 = udfLbl10;
    }

    public String getUdfVal10() {
        return udfVal10;
    }

    public void setUdfVal10(String udfVal10) {
        this.udfVal10 = udfVal10;
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

    public String getCrecptImgFileNm() {
        return crecptImgFileNm;
    }

    public void setCrecptImgFileNm(String crecptImgFileNm) {
        this.crecptImgFileNm = crecptImgFileNm;
    }

    public BigDecimal getCdnEreceiptFee() {
        return cdnEreceiptFee;
    }

    public void setCdnEreceiptFee(BigDecimal cdnEreceiptFee) {
        this.cdnEreceiptFee = cdnEreceiptFee;
    }

    public Character getTransfloFlg001() {
        return transfloFlg001;
    }

    public void setTransfloFlg001(Character transfloFlg001) {
        this.transfloFlg001 = transfloFlg001;
    }

    public Character getTransfloFlg002() {
        return transfloFlg002;
    }

    public void setTransfloFlg002(Character transfloFlg002) {
        this.transfloFlg002 = transfloFlg002;
    }

    public Character getTransfloFlg003() {
        return transfloFlg003;
    }

    public void setTransfloFlg003(Character transfloFlg003) {
        this.transfloFlg003 = transfloFlg003;
    }

    public Character getTransfloFlg004() {
        return transfloFlg004;
    }

    public void setTransfloFlg004(Character transfloFlg004) {
        this.transfloFlg004 = transfloFlg004;
    }

    public String getPhotonKey() {
        return photonKey;
    }

    public void setPhotonKey(String photonKey) {
        this.photonKey = photonKey;
    }

    public Character getHarvestedStatusFlg() {
        return harvestedStatusFlg;
    }

    public void setHarvestedStatusFlg(Character harvestedStatusFlg) {
        this.harvestedStatusFlg = harvestedStatusFlg;
    }

    public String getTrnsTm() {
        return trnsTm;
    }

    public void setTrnsTm(String trnsTm) {
        this.trnsTm = trnsTm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ereceiptPK != null ? ereceiptPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ereceipt)) {
            return false;
        }
        Ereceipt other = (Ereceipt) object;
        if ((this.ereceiptPK == null && other.ereceiptPK != null) || (this.ereceiptPK != null && !this.ereceiptPK.equals(other.ereceiptPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Ereceipt[ ereceiptPK=" + ereceiptPK + " ]";
    }
    
}
