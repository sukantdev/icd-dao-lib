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
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "KBYTE_LAYOUT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "KbyteLayout.findAll", query = "SELECT k FROM KbyteLayout k")})
public class KbyteLayout implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KbyteLayoutPK kbyteLayoutPK;
    @Basic(optional = false)
    @Column(name = "PARTITION_ID")
    private short partitionId;
    @Basic(optional = false)
    @Column(name = "EXP_CASH_BLNG_FLG")
    private Character expCashBlngFlg;
    @Basic(optional = false)
    @Column(name = "EXP_CASH_LOAD_PKUP")
    private Character expCashLoadPkup;
    @Basic(optional = false)
    @Column(name = "TRNS_NBR_IND")
    private Character trnsNbrInd;
    @Basic(optional = false)
    @Column(name = "REC_ID")
    private String recId;
    @Basic(optional = false)
    @Column(name = "TRNS_DY")
    private String trnsDy;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "TRUCK_STP_CD")
    private String truckStpCd;
    @Basic(optional = false)
    @Column(name = "TRUCK_STP_NM")
    private String truckStpNm;
    @Basic(optional = false)
    @Column(name = "TRUCK_STP_CTY")
    private String truckStpCty;
    @Basic(optional = false)
    @Column(name = "TRUCK_STP_ST")
    private String truckStpSt;
    @Basic(optional = false)
    @Column(name = "TRUCK_STP_INV_NBR")
    private String truckStpInvNbr;
    @Basic(optional = false)
    @Column(name = "TL_AMT_FEE")
    private String tlAmtFee;
    @Basic(optional = false)
    @Column(name = "FL_OIL_PRD_FEES")
    private String flOilPrdFees;
    @Basic(optional = false)
    @Column(name = "CHPR_FL_AVBLTY_FLG")
    private Character chprFlAvbltyFlg;
    @Basic(optional = false)
    @Column(name = "SRV_USED")
    private Character srvUsed;
    @Basic(optional = false)
    @Column(name = "NBR_TRACTOR_GALLON")
    private String nbrTractorGallon;
    @Basic(optional = false)
    @Column(name = "TRACTOR_FL_PRC_PER")
    private String tractorFlPrcPer;
    @Basic(optional = false)
    @Column(name = "CST_TRACTOR_FL")
    private String cstTractorFl;
    @Basic(optional = false)
    @Column(name = "NBR_OF_RFR_GALLON")
    private String nbrOfRfrGallon;
    @Basic(optional = false)
    @Column(name = "RFR_PRC_PER_GALLON")
    private String rfrPrcPerGallon;
    @Basic(optional = false)
    @Column(name = "CST_OF_RFR_FL")
    private String cstOfRfrFl;
    @Basic(optional = false)
    @Column(name = "NBR_OF_QUARTS_OF_O")
    private String nbrOfQuartsOfO;
    @Basic(optional = false)
    @Column(name = "TL_CST_OF_OIL")
    private String tlCstOfOil;
    @Basic(optional = false)
    @Column(name = "TRACTOR_FL_BLNG_FL")
    private Character tractorFlBlngFl;
    @Basic(optional = false)
    @Column(name = "RFR_FL_BLNG_FLG")
    private Character rfrFlBlngFlg;
    @Basic(optional = false)
    @Column(name = "OIL_BLNG_FLG")
    private Character oilBlngFlg;
    @Basic(optional = false)
    @Column(name = "HDR_ID")
    private String hdrId;
    @Basic(optional = false)
    @Column(name = "CASH_ADV_AMT")
    private String cashAdvAmt;
    @Basic(optional = false)
    @Column(name = "CHGS_FOR_CASH_ADV")
    private String chgsForCashAdv;
    @Basic(optional = false)
    @Column(name = "DRIVERS_NM")
    private String driversNm;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private String tripNbr;
    @Basic(optional = false)
    @Column(name = "CNV_RT")
    private String cnvRt;
    @Basic(optional = false)
    @Column(name = "HUBOMETER_RDNG")
    private String hubometerRdng;
    @Basic(optional = false)
    @Column(name = "YR_TO_DT_MPG")
    private String yrToDtMpg;
    @Basic(optional = false)
    @Column(name = "MPG_FOR_THIS_FILL")
    private String mpgForThisFill;
    @Basic(optional = false)
    @Column(name = "FL_CRD_ID_NBR")
    private String flCrdIdNbr;
    @Basic(optional = false)
    @Column(name = "BILLABLE_CURR")
    private Character billableCurr;
    @Basic(optional = false)
    @Column(name = "COMCHEK_CRD_NBR")
    private String comchekCrdNbr;
    @Basic(optional = false)
    @Column(name = "EMP_NBR")
    private String empNbr;
    @Basic(optional = false)
    @Column(name = "NON_FUNDED_ITM")
    private Character nonFundedItm;
    @Basic(optional = false)
    @Column(name = "NOT_LTD_NTWK_LOC_F")
    private Character notLtdNtwkLocF;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private Character prdCd;
    @Basic(optional = false)
    @Column(name = "PRD_AMT")
    private String prdAmt;
    @Basic(optional = false)
    @Column(name = "PRD_CD_2")
    private Character prdCd2;
    @Basic(optional = false)
    @Column(name = "PRD_AMT_2")
    private String prdAmt2;
    @Basic(optional = false)
    @Column(name = "PRD_CD_3")
    private Character prdCd3;
    @Basic(optional = false)
    @Column(name = "PRD_AMT_3")
    private String prdAmt3;
    @Basic(optional = false)
    @Column(name = "ALNC_SEL_FOCUS_REB")
    private String alncSelFocusReb;
    @Basic(optional = false)
    @Column(name = "ALNC_LOC_FLG")
    private Character alncLocFlg;
    @Basic(optional = false)
    @Column(name = "CASH_BLNG_FLG")
    private Character cashBlngFlg;
    @Basic(optional = false)
    @Column(name = "PRD_1_BLNG_FLG")
    private Character prd1BlngFlg;
    @Basic(optional = false)
    @Column(name = "PRD_2_BLNG_FLG")
    private Character prd2BlngFlg;
    @Basic(optional = false)
    @Column(name = "PRD_3_BLNG_FLG")
    private Character prd3BlngFlg;
    @Basic(optional = false)
    @Column(name = "HDR_IDENTIFER")
    private String hdrIdentifer;
    @Basic(optional = false)
    @Column(name = "DRIVERS_LIC_ST")
    private String driversLicSt;
    @Basic(optional = false)
    @Column(name = "DRIVERS_LIC_NBR")
    private String driversLicNbr;
    @Basic(optional = false)
    @Column(name = "PCHS_ORD_NBR")
    private String pchsOrdNbr;
    @Basic(optional = false)
    @Column(name = "TRL_NBR")
    private String trlNbr;
    @Basic(optional = false)
    @Column(name = "PREV_HUB_RDNG")
    private String prevHubRdng;
    @Basic(optional = false)
    @Column(name = "DT_OF_ORGL_TRNS")
    private String dtOfOrglTrns;
    @Basic(optional = false)
    @Column(name = "SRV_CNTR_CHAIN_CD")
    private String srvCntrChainCd;
    @Basic(optional = false)
    @Column(name = "REBATE_IND")
    private Character rebateInd;
    @Basic(optional = false)
    @Column(name = "TRL_HUB_RDNG")
    private String trlHubRdng;
    @Basic(optional = false)
    @Column(name = "AUTO_TRNS")
    private Character autoTrns;
    @Basic(optional = false)
    @Column(name = "BULK_FL_FLG")
    private Character bulkFlFlg;
    @Basic(optional = false)
    @Column(name = "SRV_CNTR_BRIDGE_TR")
    private Character srvCntrBridgeTr;
    @Basic(optional = false)
    @Column(name = "NBR_1_FL_GALLONS")
    private String nbr1FlGallons;
    @Basic(optional = false)
    @Column(name = "NBR_1_FL_PPG")
    private String nbr1FlPpg;
    @Basic(optional = false)
    @Column(name = "NBR_1_FL_CST")
    private String nbr1FlCst;
    @Basic(optional = false)
    @Column(name = "OTH_FL_GALLONS")
    private String othFlGallons;
    @Basic(optional = false)
    @Column(name = "OTH_FL_PPG")
    private String othFlPpg;
    @Basic(optional = false)
    @Column(name = "OTH_FL_CST")
    private String othFlCst;
    @Basic(optional = false)
    @Column(name = "FOCUS_OR_SEL_DISC")
    private Character focusOrSelDisc;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_AMT_CAN_DO")
    private String canTaxAmtCanDo;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_AMT_US_DOL")
    private String canTaxAmtUsDol;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_PAID_FLG")
    private Character canTaxPaidFlg;
    @Basic(optional = false)
    @Column(name = "RACK_TYP")
    private Character rackTyp;
    @Basic(optional = false)
    @Column(name = "OPIS_RACK_CTY_NBR")
    private String opisRackCtyNbr;
    @Basic(optional = false)
    @Column(name = "OPIS_SUPL_NBR")
    private String opisSuplNbr;
    @Basic(optional = false)
    @Column(name = "OPIS_RACK_CTY_DESC")
    private String opisRackCtyDesc;
    @Basic(optional = false)
    @Column(name = "OPIS_RACK_ST")
    private String opisRackSt;
    @Basic(optional = false)
    @Column(name = "OPIS_SUPL_NM")
    private String opisSuplNm;
    @Basic(optional = false)
    @Column(name = "RACK_PRC_2_DIESEL")
    private String rackPrc2Diesel;
    @Basic(optional = false)
    @Column(name = "RACK_PRC_1_DIESEL")
    private String rackPrc1Diesel;
    @Basic(optional = false)
    @Column(name = "RACK_DATE")
    private String rackDate;
    @Basic(optional = false)
    @Column(name = "DSL_FED_TAX_PPG")
    private String dslFedTaxPpg;
    @Basic(optional = false)
    @Column(name = "DSL_ST_TAX_PPG")
    private String dslStTaxPpg;
    @Basic(optional = false)
    @Column(name = "DSL_ST_SUPERFUND_R")
    private String dslStSuperfundR;
    @Basic(optional = false)
    @Column(name = "DSL_LUST_RT_PPG")
    private String dslLustRtPpg;
    @Basic(optional = false)
    @Column(name = "DSL_TRANSP_RT_PPG")
    private String dslTranspRtPpg;
    @Basic(optional = false)
    @Column(name = "DSL_MISC_RT_PPG")
    private String dslMiscRtPpg;
    @Basic(optional = false)
    @Column(name = "RFR_FED_TAX_PPG")
    private String rfrFedTaxPpg;
    @Basic(optional = false)
    @Column(name = "RFR_ST_TAX_PPG")
    private String rfrStTaxPpg;
    @Basic(optional = false)
    @Column(name = "RFR_ST_SPFND_RT_PP")
    private String rfrStSpfndRtPp;
    @Basic(optional = false)
    @Column(name = "RFR_LUST_RT_PPG")
    private String rfrLustRtPpg;
    @Basic(optional = false)
    @Column(name = "RFR_TRANSP_RT_PPG")
    private String rfrTranspRtPpg;
    @Basic(optional = false)
    @Column(name = "RFR_MISC_RT_PPG")
    private String rfrMiscRtPpg;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_APLYS_RA")
    private Character dslSlstxAplysRa;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_APLYS_FE")
    private Character dslSlstxAplysFe;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_APLYS_ST")
    private Character dslSlstxAplysSt;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_APLYS_SP")
    private Character dslSlstxAplysSp;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_APLYS_LU")
    private Character dslSlstxAplysLu;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_APLYS_TR")
    private Character dslSlstxAplysTr;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_APLYS_MI")
    private Character dslSlstxAplysMi;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_APLYS_MK")
    private Character dslSlstxAplysMk;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_APLYS_RA")
    private Character rfrSlstxAplysRa;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_APLYS_FE")
    private Character rfrSlstxAplysFe;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_APLYS_ST")
    private Character rfrSlstxAplysSt;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_APLYS_SP")
    private Character rfrSlstxAplysSp;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_APLYS_LU")
    private Character rfrSlstxAplysLu;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_APLYS_TR")
    private Character rfrSlstxAplysTr;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_APLYS_MI")
    private Character rfrSlstxAplysMi;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_APLYS_MK")
    private Character rfrSlstxAplysMk;
    @Basic(optional = false)
    @Column(name = "DSL_SLSTX_RT_PERCE")
    private String dslSlstxRtPerce;
    @Basic(optional = false)
    @Column(name = "RFR_SLSTX_RT_PERCE")
    private String rfrSlstxRtPerce;
    @Basic(optional = false)
    @Column(name = "MISC_RT_DESC")
    private String miscRtDesc;
    @Basic(optional = false)
    @Column(name = "TRUCK_STP_MKUP_PPG")
    private String truckStpMkupPpg;
    @Basic(optional = false)
    @Column(name = "OTH_MKUP_PPG")
    private String othMkupPpg;
    @Basic(optional = false)
    @Column(name = "CST_PLUS_RLSHP_TYP")
    private Character cstPlusRlshpTyp;
    @Basic(optional = false)
    @Column(name = "CST_PLUS_PRC_2_DSL")
    private String cstPlusPrc2Dsl;
    @Basic(optional = false)
    @Column(name = "CST_PLUS_PRC_1_DSL")
    private String cstPlusPrc1Dsl;
    @Basic(optional = false)
    @Column(name = "RFR_CST_PLUS_PRC")
    private String rfrCstPlusPrc;
    @Basic(optional = false)
    @Column(name = "TL_CST_PLUS_PRC_2")
    private String tlCstPlusPrc2;
    @Basic(optional = false)
    @Column(name = "TL_CST_PLUS_PRC_1")
    private String tlCstPlusPrc1;
    @Basic(optional = false)
    @Column(name = "RFR_TL_CST_PLUS_PR")
    private String rfrTlCstPlusPr;
    @Basic(optional = false)
    @Column(name = "DSL_RTL_PPG_2")
    private String dslRtlPpg2;
    @Basic(optional = false)
    @Column(name = "DSL_RTL_PPG_1")
    private String dslRtlPpg1;
    @Basic(optional = false)
    @Column(name = "RFR_RTL_PPG")
    private String rfrRtlPpg;
    @Basic(optional = false)
    @Column(name = "TRNS_DT_Y2K")
    private String trnsDtY2k;
    @Basic(optional = false)
    @Column(name = "ADJD_TRNS_NBR")
    private String adjdTrnsNbr;
    @Basic(optional = false)
    @Column(name = "TL_AMT_DUE_CDN")
    private String tlAmtDueCdn;
    @Basic(optional = false)
    @Column(name = "DSL_GALLONS_2")
    private String dslGallons2;
    @Basic(optional = false)
    @Column(name = "DSL_CST_2")
    private String dslCst2;
    @Basic(optional = false)
    @Column(name = "DSL_CST_2_NET_CST")
    private String dslCst2NetCst;
    @Basic(optional = false)
    @Column(name = "DSL_CST_1_NET_CST")
    private String dslCst1NetCst;
    @Basic(optional = false)
    @Column(name = "RFR_CST_NET_CST")
    private String rfrCstNetCst;
    @Basic(optional = false)
    @Column(name = "OTH_FL_CST_NET_CST")
    private String othFlCstNetCst;
    @Basic(optional = false)
    @Column(name = "OIL_CST_NET_CST")
    private String oilCstNetCst;
    @Basic(optional = false)
    @Column(name = "CATG_CD")
    private String catgCd;
    @Basic(optional = false)
    @Column(name = "CRD_USED_OFF_HRS")
    private Character crdUsedOffHrs;
    @Basic(optional = false)
    @Column(name = "VIN_NBR")
    private String vinNbr;
    @Basic(optional = false)
    @Column(name = "VEHS_DESC")
    private String vehsDesc;
    @Basic(optional = false)
    @Column(name = "LIC_PLATE_NBR")
    private String licPlateNbr;
    @Basic(optional = false)
    @Column(name = "REG_EXPR")
    private String regExpr;
    @Basic(optional = false)
    @Column(name = "MISC_1")
    private String misc1;
    @Basic(optional = false)
    @Column(name = "MISC_2")
    private String misc2;
    @Basic(optional = false)
    @Column(name = "SRV_CNTR_CTY")
    private String srvCntrCty;
    @Basic(optional = false)
    @Column(name = "DSL_2")
    private String dsl2;
    @Basic(optional = false)
    @Column(name = "DSL_1")
    private String dsl1;
    @Basic(optional = false)
    @Column(name = "RFR_CST")
    private String rfrCst;
    @Basic(optional = false)
    @Column(name = "OTH_FL_CST_2")
    private String othFlCst2;
    @Basic(optional = false)
    @Column(name = "SRV_CNTR_ADDR")
    private String srvCntrAddr;
    @Basic(optional = false)
    @Column(name = "SRV_CNTR_ZIP_CD")
    private String srvCntrZipCd;
    @Basic(optional = false)
    @Column(name = "ATM_RESPONSE_CD")
    private String atmResponseCd;
    @Basic(optional = false)
    @Column(name = "XTND_LOC_NM")
    private String xtndLocNm;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR_2")
    private String unitNbr2;
    @Basic(optional = false)
    @Column(name = "PRD_1_NET_CST")
    private String prd1NetCst;
    @Basic(optional = false)
    @Column(name = "PRD_2_NET_CST")
    private String prd2NetCst;
    @Basic(optional = false)
    @Column(name = "PRD_3_NET_CST")
    private String prd3NetCst;
    @Basic(optional = false)
    @Column(name = "CORP_CD")
    private String corpCd;
    @Basic(optional = false)
    @Column(name = "OTH_FL_TYP")
    private String othFlTyp;
    @Basic(optional = false)
    @Column(name = "FP_FLNG_DT")
    private String fpFlngDt;
    @Basic(optional = false)
    @Column(name = "FP_FLNG_TM")
    private String fpFlngTm;
    @Basic(optional = false)
    @Column(name = "PRD_9_TYP_1")
    private String prd9Typ1;
    @Basic(optional = false)
    @Column(name = "PRD_9_TYP_2")
    private String prd9Typ2;
    @Basic(optional = false)
    @Column(name = "PRD_9_TYP_3")
    private String prd9Typ3;
    @Basic(optional = false)
    @Column(name = "NR2_SUB_PROD_CD")
    private String nr2SubProdCd;
    @Basic(optional = false)
    @Column(name = "NR1_SUB_PROD_CD")
    private String nr1SubProdCd;
    @Basic(optional = false)
    @Column(name = "RFR_SUB_PROD_CD")
    private String rfrSubProdCd;
    @Basic(optional = false)
    @Column(name = "MISC_3")
    private String misc3;
    @Basic(optional = false)
    @Column(name = "VEH_TANK_CAP")
    private String vehTankCap;

    public KbyteLayout() {
    }

    public KbyteLayout(KbyteLayoutPK kbyteLayoutPK) {
        this.kbyteLayoutPK = kbyteLayoutPK;
    }

    public KbyteLayout(KbyteLayoutPK kbyteLayoutPK, short partitionId, Character expCashBlngFlg, Character expCashLoadPkup, Character trnsNbrInd, String recId, String trnsDy, String unitNbr, String truckStpCd, String truckStpNm, String truckStpCty, String truckStpSt, String truckStpInvNbr, String tlAmtFee, String flOilPrdFees, Character chprFlAvbltyFlg, Character srvUsed, String nbrTractorGallon, String tractorFlPrcPer, String cstTractorFl, String nbrOfRfrGallon, String rfrPrcPerGallon, String cstOfRfrFl, String nbrOfQuartsOfO, String tlCstOfOil, Character tractorFlBlngFl, Character rfrFlBlngFlg, Character oilBlngFlg, String hdrId, String cashAdvAmt, String chgsForCashAdv, String driversNm, String tripNbr, String cnvRt, String hubometerRdng, String yrToDtMpg, String mpgForThisFill, String flCrdIdNbr, Character billableCurr, String comchekCrdNbr, String empNbr, Character nonFundedItm, Character notLtdNtwkLocF, Character prdCd, String prdAmt, Character prdCd2, String prdAmt2, Character prdCd3, String prdAmt3, String alncSelFocusReb, Character alncLocFlg, Character cashBlngFlg, Character prd1BlngFlg, Character prd2BlngFlg, Character prd3BlngFlg, String hdrIdentifer, String driversLicSt, String driversLicNbr, String pchsOrdNbr, String trlNbr, String prevHubRdng, String dtOfOrglTrns, String srvCntrChainCd, Character rebateInd, String trlHubRdng, Character autoTrns, Character bulkFlFlg, Character srvCntrBridgeTr, String nbr1FlGallons, String nbr1FlPpg, String nbr1FlCst, String othFlGallons, String othFlPpg, String othFlCst, Character focusOrSelDisc, String canTaxAmtCanDo, String canTaxAmtUsDol, Character canTaxPaidFlg, Character rackTyp, String opisRackCtyNbr, String opisSuplNbr, String opisRackCtyDesc, String opisRackSt, String opisSuplNm, String rackPrc2Diesel, String rackPrc1Diesel, String rackDate, String dslFedTaxPpg, String dslStTaxPpg, String dslStSuperfundR, String dslLustRtPpg, String dslTranspRtPpg, String dslMiscRtPpg, String rfrFedTaxPpg, String rfrStTaxPpg, String rfrStSpfndRtPp, String rfrLustRtPpg, String rfrTranspRtPpg, String rfrMiscRtPpg, Character dslSlstxAplysRa, Character dslSlstxAplysFe, Character dslSlstxAplysSt, Character dslSlstxAplysSp, Character dslSlstxAplysLu, Character dslSlstxAplysTr, Character dslSlstxAplysMi, Character dslSlstxAplysMk, Character rfrSlstxAplysRa, Character rfrSlstxAplysFe, Character rfrSlstxAplysSt, Character rfrSlstxAplysSp, Character rfrSlstxAplysLu, Character rfrSlstxAplysTr, Character rfrSlstxAplysMi, Character rfrSlstxAplysMk, String dslSlstxRtPerce, String rfrSlstxRtPerce, String miscRtDesc, String truckStpMkupPpg, String othMkupPpg, Character cstPlusRlshpTyp, String cstPlusPrc2Dsl, String cstPlusPrc1Dsl, String rfrCstPlusPrc, String tlCstPlusPrc2, String tlCstPlusPrc1, String rfrTlCstPlusPr, String dslRtlPpg2, String dslRtlPpg1, String rfrRtlPpg, String trnsDtY2k, String adjdTrnsNbr, String tlAmtDueCdn, String dslGallons2, String dslCst2, String dslCst2NetCst, String dslCst1NetCst, String rfrCstNetCst, String othFlCstNetCst, String oilCstNetCst, String catgCd, Character crdUsedOffHrs, String vinNbr, String vehsDesc, String licPlateNbr, String regExpr, String misc1, String misc2, String srvCntrCty, String dsl2, String dsl1, String rfrCst, String othFlCst2, String srvCntrAddr, String srvCntrZipCd, String atmResponseCd, String xtndLocNm, String unitNbr2, String prd1NetCst, String prd2NetCst, String prd3NetCst, String corpCd, String othFlTyp, String fpFlngDt, String fpFlngTm, String prd9Typ1, String prd9Typ2, String prd9Typ3, String nr2SubProdCd, String nr1SubProdCd, String rfrSubProdCd, String misc3, String vehTankCap) {
        this.kbyteLayoutPK = kbyteLayoutPK;
        this.partitionId = partitionId;
        this.expCashBlngFlg = expCashBlngFlg;
        this.expCashLoadPkup = expCashLoadPkup;
        this.trnsNbrInd = trnsNbrInd;
        this.recId = recId;
        this.trnsDy = trnsDy;
        this.unitNbr = unitNbr;
        this.truckStpCd = truckStpCd;
        this.truckStpNm = truckStpNm;
        this.truckStpCty = truckStpCty;
        this.truckStpSt = truckStpSt;
        this.truckStpInvNbr = truckStpInvNbr;
        this.tlAmtFee = tlAmtFee;
        this.flOilPrdFees = flOilPrdFees;
        this.chprFlAvbltyFlg = chprFlAvbltyFlg;
        this.srvUsed = srvUsed;
        this.nbrTractorGallon = nbrTractorGallon;
        this.tractorFlPrcPer = tractorFlPrcPer;
        this.cstTractorFl = cstTractorFl;
        this.nbrOfRfrGallon = nbrOfRfrGallon;
        this.rfrPrcPerGallon = rfrPrcPerGallon;
        this.cstOfRfrFl = cstOfRfrFl;
        this.nbrOfQuartsOfO = nbrOfQuartsOfO;
        this.tlCstOfOil = tlCstOfOil;
        this.tractorFlBlngFl = tractorFlBlngFl;
        this.rfrFlBlngFlg = rfrFlBlngFlg;
        this.oilBlngFlg = oilBlngFlg;
        this.hdrId = hdrId;
        this.cashAdvAmt = cashAdvAmt;
        this.chgsForCashAdv = chgsForCashAdv;
        this.driversNm = driversNm;
        this.tripNbr = tripNbr;
        this.cnvRt = cnvRt;
        this.hubometerRdng = hubometerRdng;
        this.yrToDtMpg = yrToDtMpg;
        this.mpgForThisFill = mpgForThisFill;
        this.flCrdIdNbr = flCrdIdNbr;
        this.billableCurr = billableCurr;
        this.comchekCrdNbr = comchekCrdNbr;
        this.empNbr = empNbr;
        this.nonFundedItm = nonFundedItm;
        this.notLtdNtwkLocF = notLtdNtwkLocF;
        this.prdCd = prdCd;
        this.prdAmt = prdAmt;
        this.prdCd2 = prdCd2;
        this.prdAmt2 = prdAmt2;
        this.prdCd3 = prdCd3;
        this.prdAmt3 = prdAmt3;
        this.alncSelFocusReb = alncSelFocusReb;
        this.alncLocFlg = alncLocFlg;
        this.cashBlngFlg = cashBlngFlg;
        this.prd1BlngFlg = prd1BlngFlg;
        this.prd2BlngFlg = prd2BlngFlg;
        this.prd3BlngFlg = prd3BlngFlg;
        this.hdrIdentifer = hdrIdentifer;
        this.driversLicSt = driversLicSt;
        this.driversLicNbr = driversLicNbr;
        this.pchsOrdNbr = pchsOrdNbr;
        this.trlNbr = trlNbr;
        this.prevHubRdng = prevHubRdng;
        this.dtOfOrglTrns = dtOfOrglTrns;
        this.srvCntrChainCd = srvCntrChainCd;
        this.rebateInd = rebateInd;
        this.trlHubRdng = trlHubRdng;
        this.autoTrns = autoTrns;
        this.bulkFlFlg = bulkFlFlg;
        this.srvCntrBridgeTr = srvCntrBridgeTr;
        this.nbr1FlGallons = nbr1FlGallons;
        this.nbr1FlPpg = nbr1FlPpg;
        this.nbr1FlCst = nbr1FlCst;
        this.othFlGallons = othFlGallons;
        this.othFlPpg = othFlPpg;
        this.othFlCst = othFlCst;
        this.focusOrSelDisc = focusOrSelDisc;
        this.canTaxAmtCanDo = canTaxAmtCanDo;
        this.canTaxAmtUsDol = canTaxAmtUsDol;
        this.canTaxPaidFlg = canTaxPaidFlg;
        this.rackTyp = rackTyp;
        this.opisRackCtyNbr = opisRackCtyNbr;
        this.opisSuplNbr = opisSuplNbr;
        this.opisRackCtyDesc = opisRackCtyDesc;
        this.opisRackSt = opisRackSt;
        this.opisSuplNm = opisSuplNm;
        this.rackPrc2Diesel = rackPrc2Diesel;
        this.rackPrc1Diesel = rackPrc1Diesel;
        this.rackDate = rackDate;
        this.dslFedTaxPpg = dslFedTaxPpg;
        this.dslStTaxPpg = dslStTaxPpg;
        this.dslStSuperfundR = dslStSuperfundR;
        this.dslLustRtPpg = dslLustRtPpg;
        this.dslTranspRtPpg = dslTranspRtPpg;
        this.dslMiscRtPpg = dslMiscRtPpg;
        this.rfrFedTaxPpg = rfrFedTaxPpg;
        this.rfrStTaxPpg = rfrStTaxPpg;
        this.rfrStSpfndRtPp = rfrStSpfndRtPp;
        this.rfrLustRtPpg = rfrLustRtPpg;
        this.rfrTranspRtPpg = rfrTranspRtPpg;
        this.rfrMiscRtPpg = rfrMiscRtPpg;
        this.dslSlstxAplysRa = dslSlstxAplysRa;
        this.dslSlstxAplysFe = dslSlstxAplysFe;
        this.dslSlstxAplysSt = dslSlstxAplysSt;
        this.dslSlstxAplysSp = dslSlstxAplysSp;
        this.dslSlstxAplysLu = dslSlstxAplysLu;
        this.dslSlstxAplysTr = dslSlstxAplysTr;
        this.dslSlstxAplysMi = dslSlstxAplysMi;
        this.dslSlstxAplysMk = dslSlstxAplysMk;
        this.rfrSlstxAplysRa = rfrSlstxAplysRa;
        this.rfrSlstxAplysFe = rfrSlstxAplysFe;
        this.rfrSlstxAplysSt = rfrSlstxAplysSt;
        this.rfrSlstxAplysSp = rfrSlstxAplysSp;
        this.rfrSlstxAplysLu = rfrSlstxAplysLu;
        this.rfrSlstxAplysTr = rfrSlstxAplysTr;
        this.rfrSlstxAplysMi = rfrSlstxAplysMi;
        this.rfrSlstxAplysMk = rfrSlstxAplysMk;
        this.dslSlstxRtPerce = dslSlstxRtPerce;
        this.rfrSlstxRtPerce = rfrSlstxRtPerce;
        this.miscRtDesc = miscRtDesc;
        this.truckStpMkupPpg = truckStpMkupPpg;
        this.othMkupPpg = othMkupPpg;
        this.cstPlusRlshpTyp = cstPlusRlshpTyp;
        this.cstPlusPrc2Dsl = cstPlusPrc2Dsl;
        this.cstPlusPrc1Dsl = cstPlusPrc1Dsl;
        this.rfrCstPlusPrc = rfrCstPlusPrc;
        this.tlCstPlusPrc2 = tlCstPlusPrc2;
        this.tlCstPlusPrc1 = tlCstPlusPrc1;
        this.rfrTlCstPlusPr = rfrTlCstPlusPr;
        this.dslRtlPpg2 = dslRtlPpg2;
        this.dslRtlPpg1 = dslRtlPpg1;
        this.rfrRtlPpg = rfrRtlPpg;
        this.trnsDtY2k = trnsDtY2k;
        this.adjdTrnsNbr = adjdTrnsNbr;
        this.tlAmtDueCdn = tlAmtDueCdn;
        this.dslGallons2 = dslGallons2;
        this.dslCst2 = dslCst2;
        this.dslCst2NetCst = dslCst2NetCst;
        this.dslCst1NetCst = dslCst1NetCst;
        this.rfrCstNetCst = rfrCstNetCst;
        this.othFlCstNetCst = othFlCstNetCst;
        this.oilCstNetCst = oilCstNetCst;
        this.catgCd = catgCd;
        this.crdUsedOffHrs = crdUsedOffHrs;
        this.vinNbr = vinNbr;
        this.vehsDesc = vehsDesc;
        this.licPlateNbr = licPlateNbr;
        this.regExpr = regExpr;
        this.misc1 = misc1;
        this.misc2 = misc2;
        this.srvCntrCty = srvCntrCty;
        this.dsl2 = dsl2;
        this.dsl1 = dsl1;
        this.rfrCst = rfrCst;
        this.othFlCst2 = othFlCst2;
        this.srvCntrAddr = srvCntrAddr;
        this.srvCntrZipCd = srvCntrZipCd;
        this.atmResponseCd = atmResponseCd;
        this.xtndLocNm = xtndLocNm;
        this.unitNbr2 = unitNbr2;
        this.prd1NetCst = prd1NetCst;
        this.prd2NetCst = prd2NetCst;
        this.prd3NetCst = prd3NetCst;
        this.corpCd = corpCd;
        this.othFlTyp = othFlTyp;
        this.fpFlngDt = fpFlngDt;
        this.fpFlngTm = fpFlngTm;
        this.prd9Typ1 = prd9Typ1;
        this.prd9Typ2 = prd9Typ2;
        this.prd9Typ3 = prd9Typ3;
        this.nr2SubProdCd = nr2SubProdCd;
        this.nr1SubProdCd = nr1SubProdCd;
        this.rfrSubProdCd = rfrSubProdCd;
        this.misc3 = misc3;
        this.vehTankCap = vehTankCap;
    }

    public KbyteLayout(String acctNbr, String custId, Date trnsDt, String trnsNbr, String trnsTm, Character cancelFlg) {
        this.kbyteLayoutPK = new KbyteLayoutPK(acctNbr, custId, trnsDt, trnsNbr, trnsTm, cancelFlg);
    }

    public KbyteLayoutPK getKbyteLayoutPK() {
        return kbyteLayoutPK;
    }

    public void setKbyteLayoutPK(KbyteLayoutPK kbyteLayoutPK) {
        this.kbyteLayoutPK = kbyteLayoutPK;
    }

    public short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(short partitionId) {
        this.partitionId = partitionId;
    }

    public Character getExpCashBlngFlg() {
        return expCashBlngFlg;
    }

    public void setExpCashBlngFlg(Character expCashBlngFlg) {
        this.expCashBlngFlg = expCashBlngFlg;
    }

    public Character getExpCashLoadPkup() {
        return expCashLoadPkup;
    }

    public void setExpCashLoadPkup(Character expCashLoadPkup) {
        this.expCashLoadPkup = expCashLoadPkup;
    }

    public Character getTrnsNbrInd() {
        return trnsNbrInd;
    }

    public void setTrnsNbrInd(Character trnsNbrInd) {
        this.trnsNbrInd = trnsNbrInd;
    }

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public String getTrnsDy() {
        return trnsDy;
    }

    public void setTrnsDy(String trnsDy) {
        this.trnsDy = trnsDy;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getTruckStpCd() {
        return truckStpCd;
    }

    public void setTruckStpCd(String truckStpCd) {
        this.truckStpCd = truckStpCd;
    }

    public String getTruckStpNm() {
        return truckStpNm;
    }

    public void setTruckStpNm(String truckStpNm) {
        this.truckStpNm = truckStpNm;
    }

    public String getTruckStpCty() {
        return truckStpCty;
    }

    public void setTruckStpCty(String truckStpCty) {
        this.truckStpCty = truckStpCty;
    }

    public String getTruckStpSt() {
        return truckStpSt;
    }

    public void setTruckStpSt(String truckStpSt) {
        this.truckStpSt = truckStpSt;
    }

    public String getTruckStpInvNbr() {
        return truckStpInvNbr;
    }

    public void setTruckStpInvNbr(String truckStpInvNbr) {
        this.truckStpInvNbr = truckStpInvNbr;
    }

    public String getTlAmtFee() {
        return tlAmtFee;
    }

    public void setTlAmtFee(String tlAmtFee) {
        this.tlAmtFee = tlAmtFee;
    }

    public String getFlOilPrdFees() {
        return flOilPrdFees;
    }

    public void setFlOilPrdFees(String flOilPrdFees) {
        this.flOilPrdFees = flOilPrdFees;
    }

    public Character getChprFlAvbltyFlg() {
        return chprFlAvbltyFlg;
    }

    public void setChprFlAvbltyFlg(Character chprFlAvbltyFlg) {
        this.chprFlAvbltyFlg = chprFlAvbltyFlg;
    }

    public Character getSrvUsed() {
        return srvUsed;
    }

    public void setSrvUsed(Character srvUsed) {
        this.srvUsed = srvUsed;
    }

    public String getNbrTractorGallon() {
        return nbrTractorGallon;
    }

    public void setNbrTractorGallon(String nbrTractorGallon) {
        this.nbrTractorGallon = nbrTractorGallon;
    }

    public String getTractorFlPrcPer() {
        return tractorFlPrcPer;
    }

    public void setTractorFlPrcPer(String tractorFlPrcPer) {
        this.tractorFlPrcPer = tractorFlPrcPer;
    }

    public String getCstTractorFl() {
        return cstTractorFl;
    }

    public void setCstTractorFl(String cstTractorFl) {
        this.cstTractorFl = cstTractorFl;
    }

    public String getNbrOfRfrGallon() {
        return nbrOfRfrGallon;
    }

    public void setNbrOfRfrGallon(String nbrOfRfrGallon) {
        this.nbrOfRfrGallon = nbrOfRfrGallon;
    }

    public String getRfrPrcPerGallon() {
        return rfrPrcPerGallon;
    }

    public void setRfrPrcPerGallon(String rfrPrcPerGallon) {
        this.rfrPrcPerGallon = rfrPrcPerGallon;
    }

    public String getCstOfRfrFl() {
        return cstOfRfrFl;
    }

    public void setCstOfRfrFl(String cstOfRfrFl) {
        this.cstOfRfrFl = cstOfRfrFl;
    }

    public String getNbrOfQuartsOfO() {
        return nbrOfQuartsOfO;
    }

    public void setNbrOfQuartsOfO(String nbrOfQuartsOfO) {
        this.nbrOfQuartsOfO = nbrOfQuartsOfO;
    }

    public String getTlCstOfOil() {
        return tlCstOfOil;
    }

    public void setTlCstOfOil(String tlCstOfOil) {
        this.tlCstOfOil = tlCstOfOil;
    }

    public Character getTractorFlBlngFl() {
        return tractorFlBlngFl;
    }

    public void setTractorFlBlngFl(Character tractorFlBlngFl) {
        this.tractorFlBlngFl = tractorFlBlngFl;
    }

    public Character getRfrFlBlngFlg() {
        return rfrFlBlngFlg;
    }

    public void setRfrFlBlngFlg(Character rfrFlBlngFlg) {
        this.rfrFlBlngFlg = rfrFlBlngFlg;
    }

    public Character getOilBlngFlg() {
        return oilBlngFlg;
    }

    public void setOilBlngFlg(Character oilBlngFlg) {
        this.oilBlngFlg = oilBlngFlg;
    }

    public String getHdrId() {
        return hdrId;
    }

    public void setHdrId(String hdrId) {
        this.hdrId = hdrId;
    }

    public String getCashAdvAmt() {
        return cashAdvAmt;
    }

    public void setCashAdvAmt(String cashAdvAmt) {
        this.cashAdvAmt = cashAdvAmt;
    }

    public String getChgsForCashAdv() {
        return chgsForCashAdv;
    }

    public void setChgsForCashAdv(String chgsForCashAdv) {
        this.chgsForCashAdv = chgsForCashAdv;
    }

    public String getDriversNm() {
        return driversNm;
    }

    public void setDriversNm(String driversNm) {
        this.driversNm = driversNm;
    }

    public String getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(String tripNbr) {
        this.tripNbr = tripNbr;
    }

    public String getCnvRt() {
        return cnvRt;
    }

    public void setCnvRt(String cnvRt) {
        this.cnvRt = cnvRt;
    }

    public String getHubometerRdng() {
        return hubometerRdng;
    }

    public void setHubometerRdng(String hubometerRdng) {
        this.hubometerRdng = hubometerRdng;
    }

    public String getYrToDtMpg() {
        return yrToDtMpg;
    }

    public void setYrToDtMpg(String yrToDtMpg) {
        this.yrToDtMpg = yrToDtMpg;
    }

    public String getMpgForThisFill() {
        return mpgForThisFill;
    }

    public void setMpgForThisFill(String mpgForThisFill) {
        this.mpgForThisFill = mpgForThisFill;
    }

    public String getFlCrdIdNbr() {
        return flCrdIdNbr;
    }

    public void setFlCrdIdNbr(String flCrdIdNbr) {
        this.flCrdIdNbr = flCrdIdNbr;
    }

    public Character getBillableCurr() {
        return billableCurr;
    }

    public void setBillableCurr(Character billableCurr) {
        this.billableCurr = billableCurr;
    }

    public String getComchekCrdNbr() {
        return comchekCrdNbr;
    }

    public void setComchekCrdNbr(String comchekCrdNbr) {
        this.comchekCrdNbr = comchekCrdNbr;
    }

    public String getEmpNbr() {
        return empNbr;
    }

    public void setEmpNbr(String empNbr) {
        this.empNbr = empNbr;
    }

    public Character getNonFundedItm() {
        return nonFundedItm;
    }

    public void setNonFundedItm(Character nonFundedItm) {
        this.nonFundedItm = nonFundedItm;
    }

    public Character getNotLtdNtwkLocF() {
        return notLtdNtwkLocF;
    }

    public void setNotLtdNtwkLocF(Character notLtdNtwkLocF) {
        this.notLtdNtwkLocF = notLtdNtwkLocF;
    }

    public Character getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(Character prdCd) {
        this.prdCd = prdCd;
    }

    public String getPrdAmt() {
        return prdAmt;
    }

    public void setPrdAmt(String prdAmt) {
        this.prdAmt = prdAmt;
    }

    public Character getPrdCd2() {
        return prdCd2;
    }

    public void setPrdCd2(Character prdCd2) {
        this.prdCd2 = prdCd2;
    }

    public String getPrdAmt2() {
        return prdAmt2;
    }

    public void setPrdAmt2(String prdAmt2) {
        this.prdAmt2 = prdAmt2;
    }

    public Character getPrdCd3() {
        return prdCd3;
    }

    public void setPrdCd3(Character prdCd3) {
        this.prdCd3 = prdCd3;
    }

    public String getPrdAmt3() {
        return prdAmt3;
    }

    public void setPrdAmt3(String prdAmt3) {
        this.prdAmt3 = prdAmt3;
    }

    public String getAlncSelFocusReb() {
        return alncSelFocusReb;
    }

    public void setAlncSelFocusReb(String alncSelFocusReb) {
        this.alncSelFocusReb = alncSelFocusReb;
    }

    public Character getAlncLocFlg() {
        return alncLocFlg;
    }

    public void setAlncLocFlg(Character alncLocFlg) {
        this.alncLocFlg = alncLocFlg;
    }

    public Character getCashBlngFlg() {
        return cashBlngFlg;
    }

    public void setCashBlngFlg(Character cashBlngFlg) {
        this.cashBlngFlg = cashBlngFlg;
    }

    public Character getPrd1BlngFlg() {
        return prd1BlngFlg;
    }

    public void setPrd1BlngFlg(Character prd1BlngFlg) {
        this.prd1BlngFlg = prd1BlngFlg;
    }

    public Character getPrd2BlngFlg() {
        return prd2BlngFlg;
    }

    public void setPrd2BlngFlg(Character prd2BlngFlg) {
        this.prd2BlngFlg = prd2BlngFlg;
    }

    public Character getPrd3BlngFlg() {
        return prd3BlngFlg;
    }

    public void setPrd3BlngFlg(Character prd3BlngFlg) {
        this.prd3BlngFlg = prd3BlngFlg;
    }

    public String getHdrIdentifer() {
        return hdrIdentifer;
    }

    public void setHdrIdentifer(String hdrIdentifer) {
        this.hdrIdentifer = hdrIdentifer;
    }

    public String getDriversLicSt() {
        return driversLicSt;
    }

    public void setDriversLicSt(String driversLicSt) {
        this.driversLicSt = driversLicSt;
    }

    public String getDriversLicNbr() {
        return driversLicNbr;
    }

    public void setDriversLicNbr(String driversLicNbr) {
        this.driversLicNbr = driversLicNbr;
    }

    public String getPchsOrdNbr() {
        return pchsOrdNbr;
    }

    public void setPchsOrdNbr(String pchsOrdNbr) {
        this.pchsOrdNbr = pchsOrdNbr;
    }

    public String getTrlNbr() {
        return trlNbr;
    }

    public void setTrlNbr(String trlNbr) {
        this.trlNbr = trlNbr;
    }

    public String getPrevHubRdng() {
        return prevHubRdng;
    }

    public void setPrevHubRdng(String prevHubRdng) {
        this.prevHubRdng = prevHubRdng;
    }

    public String getDtOfOrglTrns() {
        return dtOfOrglTrns;
    }

    public void setDtOfOrglTrns(String dtOfOrglTrns) {
        this.dtOfOrglTrns = dtOfOrglTrns;
    }

    public String getSrvCntrChainCd() {
        return srvCntrChainCd;
    }

    public void setSrvCntrChainCd(String srvCntrChainCd) {
        this.srvCntrChainCd = srvCntrChainCd;
    }

    public Character getRebateInd() {
        return rebateInd;
    }

    public void setRebateInd(Character rebateInd) {
        this.rebateInd = rebateInd;
    }

    public String getTrlHubRdng() {
        return trlHubRdng;
    }

    public void setTrlHubRdng(String trlHubRdng) {
        this.trlHubRdng = trlHubRdng;
    }

    public Character getAutoTrns() {
        return autoTrns;
    }

    public void setAutoTrns(Character autoTrns) {
        this.autoTrns = autoTrns;
    }

    public Character getBulkFlFlg() {
        return bulkFlFlg;
    }

    public void setBulkFlFlg(Character bulkFlFlg) {
        this.bulkFlFlg = bulkFlFlg;
    }

    public Character getSrvCntrBridgeTr() {
        return srvCntrBridgeTr;
    }

    public void setSrvCntrBridgeTr(Character srvCntrBridgeTr) {
        this.srvCntrBridgeTr = srvCntrBridgeTr;
    }

    public String getNbr1FlGallons() {
        return nbr1FlGallons;
    }

    public void setNbr1FlGallons(String nbr1FlGallons) {
        this.nbr1FlGallons = nbr1FlGallons;
    }

    public String getNbr1FlPpg() {
        return nbr1FlPpg;
    }

    public void setNbr1FlPpg(String nbr1FlPpg) {
        this.nbr1FlPpg = nbr1FlPpg;
    }

    public String getNbr1FlCst() {
        return nbr1FlCst;
    }

    public void setNbr1FlCst(String nbr1FlCst) {
        this.nbr1FlCst = nbr1FlCst;
    }

    public String getOthFlGallons() {
        return othFlGallons;
    }

    public void setOthFlGallons(String othFlGallons) {
        this.othFlGallons = othFlGallons;
    }

    public String getOthFlPpg() {
        return othFlPpg;
    }

    public void setOthFlPpg(String othFlPpg) {
        this.othFlPpg = othFlPpg;
    }

    public String getOthFlCst() {
        return othFlCst;
    }

    public void setOthFlCst(String othFlCst) {
        this.othFlCst = othFlCst;
    }

    public Character getFocusOrSelDisc() {
        return focusOrSelDisc;
    }

    public void setFocusOrSelDisc(Character focusOrSelDisc) {
        this.focusOrSelDisc = focusOrSelDisc;
    }

    public String getCanTaxAmtCanDo() {
        return canTaxAmtCanDo;
    }

    public void setCanTaxAmtCanDo(String canTaxAmtCanDo) {
        this.canTaxAmtCanDo = canTaxAmtCanDo;
    }

    public String getCanTaxAmtUsDol() {
        return canTaxAmtUsDol;
    }

    public void setCanTaxAmtUsDol(String canTaxAmtUsDol) {
        this.canTaxAmtUsDol = canTaxAmtUsDol;
    }

    public Character getCanTaxPaidFlg() {
        return canTaxPaidFlg;
    }

    public void setCanTaxPaidFlg(Character canTaxPaidFlg) {
        this.canTaxPaidFlg = canTaxPaidFlg;
    }

    public Character getRackTyp() {
        return rackTyp;
    }

    public void setRackTyp(Character rackTyp) {
        this.rackTyp = rackTyp;
    }

    public String getOpisRackCtyNbr() {
        return opisRackCtyNbr;
    }

    public void setOpisRackCtyNbr(String opisRackCtyNbr) {
        this.opisRackCtyNbr = opisRackCtyNbr;
    }

    public String getOpisSuplNbr() {
        return opisSuplNbr;
    }

    public void setOpisSuplNbr(String opisSuplNbr) {
        this.opisSuplNbr = opisSuplNbr;
    }

    public String getOpisRackCtyDesc() {
        return opisRackCtyDesc;
    }

    public void setOpisRackCtyDesc(String opisRackCtyDesc) {
        this.opisRackCtyDesc = opisRackCtyDesc;
    }

    public String getOpisRackSt() {
        return opisRackSt;
    }

    public void setOpisRackSt(String opisRackSt) {
        this.opisRackSt = opisRackSt;
    }

    public String getOpisSuplNm() {
        return opisSuplNm;
    }

    public void setOpisSuplNm(String opisSuplNm) {
        this.opisSuplNm = opisSuplNm;
    }

    public String getRackPrc2Diesel() {
        return rackPrc2Diesel;
    }

    public void setRackPrc2Diesel(String rackPrc2Diesel) {
        this.rackPrc2Diesel = rackPrc2Diesel;
    }

    public String getRackPrc1Diesel() {
        return rackPrc1Diesel;
    }

    public void setRackPrc1Diesel(String rackPrc1Diesel) {
        this.rackPrc1Diesel = rackPrc1Diesel;
    }

    public String getRackDate() {
        return rackDate;
    }

    public void setRackDate(String rackDate) {
        this.rackDate = rackDate;
    }

    public String getDslFedTaxPpg() {
        return dslFedTaxPpg;
    }

    public void setDslFedTaxPpg(String dslFedTaxPpg) {
        this.dslFedTaxPpg = dslFedTaxPpg;
    }

    public String getDslStTaxPpg() {
        return dslStTaxPpg;
    }

    public void setDslStTaxPpg(String dslStTaxPpg) {
        this.dslStTaxPpg = dslStTaxPpg;
    }

    public String getDslStSuperfundR() {
        return dslStSuperfundR;
    }

    public void setDslStSuperfundR(String dslStSuperfundR) {
        this.dslStSuperfundR = dslStSuperfundR;
    }

    public String getDslLustRtPpg() {
        return dslLustRtPpg;
    }

    public void setDslLustRtPpg(String dslLustRtPpg) {
        this.dslLustRtPpg = dslLustRtPpg;
    }

    public String getDslTranspRtPpg() {
        return dslTranspRtPpg;
    }

    public void setDslTranspRtPpg(String dslTranspRtPpg) {
        this.dslTranspRtPpg = dslTranspRtPpg;
    }

    public String getDslMiscRtPpg() {
        return dslMiscRtPpg;
    }

    public void setDslMiscRtPpg(String dslMiscRtPpg) {
        this.dslMiscRtPpg = dslMiscRtPpg;
    }

    public String getRfrFedTaxPpg() {
        return rfrFedTaxPpg;
    }

    public void setRfrFedTaxPpg(String rfrFedTaxPpg) {
        this.rfrFedTaxPpg = rfrFedTaxPpg;
    }

    public String getRfrStTaxPpg() {
        return rfrStTaxPpg;
    }

    public void setRfrStTaxPpg(String rfrStTaxPpg) {
        this.rfrStTaxPpg = rfrStTaxPpg;
    }

    public String getRfrStSpfndRtPp() {
        return rfrStSpfndRtPp;
    }

    public void setRfrStSpfndRtPp(String rfrStSpfndRtPp) {
        this.rfrStSpfndRtPp = rfrStSpfndRtPp;
    }

    public String getRfrLustRtPpg() {
        return rfrLustRtPpg;
    }

    public void setRfrLustRtPpg(String rfrLustRtPpg) {
        this.rfrLustRtPpg = rfrLustRtPpg;
    }

    public String getRfrTranspRtPpg() {
        return rfrTranspRtPpg;
    }

    public void setRfrTranspRtPpg(String rfrTranspRtPpg) {
        this.rfrTranspRtPpg = rfrTranspRtPpg;
    }

    public String getRfrMiscRtPpg() {
        return rfrMiscRtPpg;
    }

    public void setRfrMiscRtPpg(String rfrMiscRtPpg) {
        this.rfrMiscRtPpg = rfrMiscRtPpg;
    }

    public Character getDslSlstxAplysRa() {
        return dslSlstxAplysRa;
    }

    public void setDslSlstxAplysRa(Character dslSlstxAplysRa) {
        this.dslSlstxAplysRa = dslSlstxAplysRa;
    }

    public Character getDslSlstxAplysFe() {
        return dslSlstxAplysFe;
    }

    public void setDslSlstxAplysFe(Character dslSlstxAplysFe) {
        this.dslSlstxAplysFe = dslSlstxAplysFe;
    }

    public Character getDslSlstxAplysSt() {
        return dslSlstxAplysSt;
    }

    public void setDslSlstxAplysSt(Character dslSlstxAplysSt) {
        this.dslSlstxAplysSt = dslSlstxAplysSt;
    }

    public Character getDslSlstxAplysSp() {
        return dslSlstxAplysSp;
    }

    public void setDslSlstxAplysSp(Character dslSlstxAplysSp) {
        this.dslSlstxAplysSp = dslSlstxAplysSp;
    }

    public Character getDslSlstxAplysLu() {
        return dslSlstxAplysLu;
    }

    public void setDslSlstxAplysLu(Character dslSlstxAplysLu) {
        this.dslSlstxAplysLu = dslSlstxAplysLu;
    }

    public Character getDslSlstxAplysTr() {
        return dslSlstxAplysTr;
    }

    public void setDslSlstxAplysTr(Character dslSlstxAplysTr) {
        this.dslSlstxAplysTr = dslSlstxAplysTr;
    }

    public Character getDslSlstxAplysMi() {
        return dslSlstxAplysMi;
    }

    public void setDslSlstxAplysMi(Character dslSlstxAplysMi) {
        this.dslSlstxAplysMi = dslSlstxAplysMi;
    }

    public Character getDslSlstxAplysMk() {
        return dslSlstxAplysMk;
    }

    public void setDslSlstxAplysMk(Character dslSlstxAplysMk) {
        this.dslSlstxAplysMk = dslSlstxAplysMk;
    }

    public Character getRfrSlstxAplysRa() {
        return rfrSlstxAplysRa;
    }

    public void setRfrSlstxAplysRa(Character rfrSlstxAplysRa) {
        this.rfrSlstxAplysRa = rfrSlstxAplysRa;
    }

    public Character getRfrSlstxAplysFe() {
        return rfrSlstxAplysFe;
    }

    public void setRfrSlstxAplysFe(Character rfrSlstxAplysFe) {
        this.rfrSlstxAplysFe = rfrSlstxAplysFe;
    }

    public Character getRfrSlstxAplysSt() {
        return rfrSlstxAplysSt;
    }

    public void setRfrSlstxAplysSt(Character rfrSlstxAplysSt) {
        this.rfrSlstxAplysSt = rfrSlstxAplysSt;
    }

    public Character getRfrSlstxAplysSp() {
        return rfrSlstxAplysSp;
    }

    public void setRfrSlstxAplysSp(Character rfrSlstxAplysSp) {
        this.rfrSlstxAplysSp = rfrSlstxAplysSp;
    }

    public Character getRfrSlstxAplysLu() {
        return rfrSlstxAplysLu;
    }

    public void setRfrSlstxAplysLu(Character rfrSlstxAplysLu) {
        this.rfrSlstxAplysLu = rfrSlstxAplysLu;
    }

    public Character getRfrSlstxAplysTr() {
        return rfrSlstxAplysTr;
    }

    public void setRfrSlstxAplysTr(Character rfrSlstxAplysTr) {
        this.rfrSlstxAplysTr = rfrSlstxAplysTr;
    }

    public Character getRfrSlstxAplysMi() {
        return rfrSlstxAplysMi;
    }

    public void setRfrSlstxAplysMi(Character rfrSlstxAplysMi) {
        this.rfrSlstxAplysMi = rfrSlstxAplysMi;
    }

    public Character getRfrSlstxAplysMk() {
        return rfrSlstxAplysMk;
    }

    public void setRfrSlstxAplysMk(Character rfrSlstxAplysMk) {
        this.rfrSlstxAplysMk = rfrSlstxAplysMk;
    }

    public String getDslSlstxRtPerce() {
        return dslSlstxRtPerce;
    }

    public void setDslSlstxRtPerce(String dslSlstxRtPerce) {
        this.dslSlstxRtPerce = dslSlstxRtPerce;
    }

    public String getRfrSlstxRtPerce() {
        return rfrSlstxRtPerce;
    }

    public void setRfrSlstxRtPerce(String rfrSlstxRtPerce) {
        this.rfrSlstxRtPerce = rfrSlstxRtPerce;
    }

    public String getMiscRtDesc() {
        return miscRtDesc;
    }

    public void setMiscRtDesc(String miscRtDesc) {
        this.miscRtDesc = miscRtDesc;
    }

    public String getTruckStpMkupPpg() {
        return truckStpMkupPpg;
    }

    public void setTruckStpMkupPpg(String truckStpMkupPpg) {
        this.truckStpMkupPpg = truckStpMkupPpg;
    }

    public String getOthMkupPpg() {
        return othMkupPpg;
    }

    public void setOthMkupPpg(String othMkupPpg) {
        this.othMkupPpg = othMkupPpg;
    }

    public Character getCstPlusRlshpTyp() {
        return cstPlusRlshpTyp;
    }

    public void setCstPlusRlshpTyp(Character cstPlusRlshpTyp) {
        this.cstPlusRlshpTyp = cstPlusRlshpTyp;
    }

    public String getCstPlusPrc2Dsl() {
        return cstPlusPrc2Dsl;
    }

    public void setCstPlusPrc2Dsl(String cstPlusPrc2Dsl) {
        this.cstPlusPrc2Dsl = cstPlusPrc2Dsl;
    }

    public String getCstPlusPrc1Dsl() {
        return cstPlusPrc1Dsl;
    }

    public void setCstPlusPrc1Dsl(String cstPlusPrc1Dsl) {
        this.cstPlusPrc1Dsl = cstPlusPrc1Dsl;
    }

    public String getRfrCstPlusPrc() {
        return rfrCstPlusPrc;
    }

    public void setRfrCstPlusPrc(String rfrCstPlusPrc) {
        this.rfrCstPlusPrc = rfrCstPlusPrc;
    }

    public String getTlCstPlusPrc2() {
        return tlCstPlusPrc2;
    }

    public void setTlCstPlusPrc2(String tlCstPlusPrc2) {
        this.tlCstPlusPrc2 = tlCstPlusPrc2;
    }

    public String getTlCstPlusPrc1() {
        return tlCstPlusPrc1;
    }

    public void setTlCstPlusPrc1(String tlCstPlusPrc1) {
        this.tlCstPlusPrc1 = tlCstPlusPrc1;
    }

    public String getRfrTlCstPlusPr() {
        return rfrTlCstPlusPr;
    }

    public void setRfrTlCstPlusPr(String rfrTlCstPlusPr) {
        this.rfrTlCstPlusPr = rfrTlCstPlusPr;
    }

    public String getDslRtlPpg2() {
        return dslRtlPpg2;
    }

    public void setDslRtlPpg2(String dslRtlPpg2) {
        this.dslRtlPpg2 = dslRtlPpg2;
    }

    public String getDslRtlPpg1() {
        return dslRtlPpg1;
    }

    public void setDslRtlPpg1(String dslRtlPpg1) {
        this.dslRtlPpg1 = dslRtlPpg1;
    }

    public String getRfrRtlPpg() {
        return rfrRtlPpg;
    }

    public void setRfrRtlPpg(String rfrRtlPpg) {
        this.rfrRtlPpg = rfrRtlPpg;
    }

    public String getTrnsDtY2k() {
        return trnsDtY2k;
    }

    public void setTrnsDtY2k(String trnsDtY2k) {
        this.trnsDtY2k = trnsDtY2k;
    }

    public String getAdjdTrnsNbr() {
        return adjdTrnsNbr;
    }

    public void setAdjdTrnsNbr(String adjdTrnsNbr) {
        this.adjdTrnsNbr = adjdTrnsNbr;
    }

    public String getTlAmtDueCdn() {
        return tlAmtDueCdn;
    }

    public void setTlAmtDueCdn(String tlAmtDueCdn) {
        this.tlAmtDueCdn = tlAmtDueCdn;
    }

    public String getDslGallons2() {
        return dslGallons2;
    }

    public void setDslGallons2(String dslGallons2) {
        this.dslGallons2 = dslGallons2;
    }

    public String getDslCst2() {
        return dslCst2;
    }

    public void setDslCst2(String dslCst2) {
        this.dslCst2 = dslCst2;
    }

    public String getDslCst2NetCst() {
        return dslCst2NetCst;
    }

    public void setDslCst2NetCst(String dslCst2NetCst) {
        this.dslCst2NetCst = dslCst2NetCst;
    }

    public String getDslCst1NetCst() {
        return dslCst1NetCst;
    }

    public void setDslCst1NetCst(String dslCst1NetCst) {
        this.dslCst1NetCst = dslCst1NetCst;
    }

    public String getRfrCstNetCst() {
        return rfrCstNetCst;
    }

    public void setRfrCstNetCst(String rfrCstNetCst) {
        this.rfrCstNetCst = rfrCstNetCst;
    }

    public String getOthFlCstNetCst() {
        return othFlCstNetCst;
    }

    public void setOthFlCstNetCst(String othFlCstNetCst) {
        this.othFlCstNetCst = othFlCstNetCst;
    }

    public String getOilCstNetCst() {
        return oilCstNetCst;
    }

    public void setOilCstNetCst(String oilCstNetCst) {
        this.oilCstNetCst = oilCstNetCst;
    }

    public String getCatgCd() {
        return catgCd;
    }

    public void setCatgCd(String catgCd) {
        this.catgCd = catgCd;
    }

    public Character getCrdUsedOffHrs() {
        return crdUsedOffHrs;
    }

    public void setCrdUsedOffHrs(Character crdUsedOffHrs) {
        this.crdUsedOffHrs = crdUsedOffHrs;
    }

    public String getVinNbr() {
        return vinNbr;
    }

    public void setVinNbr(String vinNbr) {
        this.vinNbr = vinNbr;
    }

    public String getVehsDesc() {
        return vehsDesc;
    }

    public void setVehsDesc(String vehsDesc) {
        this.vehsDesc = vehsDesc;
    }

    public String getLicPlateNbr() {
        return licPlateNbr;
    }

    public void setLicPlateNbr(String licPlateNbr) {
        this.licPlateNbr = licPlateNbr;
    }

    public String getRegExpr() {
        return regExpr;
    }

    public void setRegExpr(String regExpr) {
        this.regExpr = regExpr;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
    }

    public String getSrvCntrCty() {
        return srvCntrCty;
    }

    public void setSrvCntrCty(String srvCntrCty) {
        this.srvCntrCty = srvCntrCty;
    }

    public String getDsl2() {
        return dsl2;
    }

    public void setDsl2(String dsl2) {
        this.dsl2 = dsl2;
    }

    public String getDsl1() {
        return dsl1;
    }

    public void setDsl1(String dsl1) {
        this.dsl1 = dsl1;
    }

    public String getRfrCst() {
        return rfrCst;
    }

    public void setRfrCst(String rfrCst) {
        this.rfrCst = rfrCst;
    }

    public String getOthFlCst2() {
        return othFlCst2;
    }

    public void setOthFlCst2(String othFlCst2) {
        this.othFlCst2 = othFlCst2;
    }

    public String getSrvCntrAddr() {
        return srvCntrAddr;
    }

    public void setSrvCntrAddr(String srvCntrAddr) {
        this.srvCntrAddr = srvCntrAddr;
    }

    public String getSrvCntrZipCd() {
        return srvCntrZipCd;
    }

    public void setSrvCntrZipCd(String srvCntrZipCd) {
        this.srvCntrZipCd = srvCntrZipCd;
    }

    public String getAtmResponseCd() {
        return atmResponseCd;
    }

    public void setAtmResponseCd(String atmResponseCd) {
        this.atmResponseCd = atmResponseCd;
    }

    public String getXtndLocNm() {
        return xtndLocNm;
    }

    public void setXtndLocNm(String xtndLocNm) {
        this.xtndLocNm = xtndLocNm;
    }

    public String getUnitNbr2() {
        return unitNbr2;
    }

    public void setUnitNbr2(String unitNbr2) {
        this.unitNbr2 = unitNbr2;
    }

    public String getPrd1NetCst() {
        return prd1NetCst;
    }

    public void setPrd1NetCst(String prd1NetCst) {
        this.prd1NetCst = prd1NetCst;
    }

    public String getPrd2NetCst() {
        return prd2NetCst;
    }

    public void setPrd2NetCst(String prd2NetCst) {
        this.prd2NetCst = prd2NetCst;
    }

    public String getPrd3NetCst() {
        return prd3NetCst;
    }

    public void setPrd3NetCst(String prd3NetCst) {
        this.prd3NetCst = prd3NetCst;
    }

    public String getCorpCd() {
        return corpCd;
    }

    public void setCorpCd(String corpCd) {
        this.corpCd = corpCd;
    }

    public String getOthFlTyp() {
        return othFlTyp;
    }

    public void setOthFlTyp(String othFlTyp) {
        this.othFlTyp = othFlTyp;
    }

    public String getFpFlngDt() {
        return fpFlngDt;
    }

    public void setFpFlngDt(String fpFlngDt) {
        this.fpFlngDt = fpFlngDt;
    }

    public String getFpFlngTm() {
        return fpFlngTm;
    }

    public void setFpFlngTm(String fpFlngTm) {
        this.fpFlngTm = fpFlngTm;
    }

    public String getPrd9Typ1() {
        return prd9Typ1;
    }

    public void setPrd9Typ1(String prd9Typ1) {
        this.prd9Typ1 = prd9Typ1;
    }

    public String getPrd9Typ2() {
        return prd9Typ2;
    }

    public void setPrd9Typ2(String prd9Typ2) {
        this.prd9Typ2 = prd9Typ2;
    }

    public String getPrd9Typ3() {
        return prd9Typ3;
    }

    public void setPrd9Typ3(String prd9Typ3) {
        this.prd9Typ3 = prd9Typ3;
    }

    public String getNr2SubProdCd() {
        return nr2SubProdCd;
    }

    public void setNr2SubProdCd(String nr2SubProdCd) {
        this.nr2SubProdCd = nr2SubProdCd;
    }

    public String getNr1SubProdCd() {
        return nr1SubProdCd;
    }

    public void setNr1SubProdCd(String nr1SubProdCd) {
        this.nr1SubProdCd = nr1SubProdCd;
    }

    public String getRfrSubProdCd() {
        return rfrSubProdCd;
    }

    public void setRfrSubProdCd(String rfrSubProdCd) {
        this.rfrSubProdCd = rfrSubProdCd;
    }

    public String getMisc3() {
        return misc3;
    }

    public void setMisc3(String misc3) {
        this.misc3 = misc3;
    }

    public String getVehTankCap() {
        return vehTankCap;
    }

    public void setVehTankCap(String vehTankCap) {
        this.vehTankCap = vehTankCap;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kbyteLayoutPK != null ? kbyteLayoutPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KbyteLayout)) {
            return false;
        }
        KbyteLayout other = (KbyteLayout) object;
        if ((this.kbyteLayoutPK == null && other.kbyteLayoutPK != null) || (this.kbyteLayoutPK != null && !this.kbyteLayoutPK.equals(other.kbyteLayoutPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.KbyteLayout[ kbyteLayoutPK=" + kbyteLayoutPK + " ]";
    }
    
}
