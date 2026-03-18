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
@Table(name = "CR_LMTS", catalog = "", schema = "DBO")
public class CrLmts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CL_CO_CD")
    private String clCoCd;
    @Basic(optional = false)
    @Column(name = "CL_TIE_CD")
    private int clTieCd;
    @Basic(optional = false)
    @Column(name = "CL_CO_FULL_NM")
    private String clCoFullNm;
    @Basic(optional = false)
    @Column(name = "CL_XMIT_LMT")
    private int clXmitLmt;

    @Basic(optional = false)
    @Column(name = "CL_UPD")
    private BigDecimal clUpd;
    @Basic(optional = false)
    @Column(name = "CL_WTD_XMIT")
    private BigDecimal clWtdXmit;
    @Basic(optional = false)
    @Column(name = "CL_CUR_DY_XMIT")
    private BigDecimal clCurDyXmit;
    @Basic(optional = false)
    @Column(name = "CL_Q_BLK")
    private Character clQBlk;
    @Basic(optional = false)
    @Column(name = "CL_USI_FLG")
    private Character clUsiFlg;
    @Basic(optional = false)
    @Column(name = "CL_RT_DISC_FCTR_R")
    private short clRtDiscFctrR;
    @Basic(optional = false)
    @Column(name = "CL_XMIT_OVR_1K")
    private Character clXmitOvr1k;
    @Basic(optional = false)
    @Column(name = "CL_XMIT_CD")
    private Character clXmitCd;
    @Basic(optional = false)
    @Column(name = "CL_CSH_RCVD")
    private BigDecimal clCshRcvd;
    @Basic(optional = false)
    @Column(name = "CL_DPST_DT")
    @Temporal(TemporalType.DATE)
    private Date clDpstDt;
    @Basic(optional = false)
    @Column(name = "CL_CO_RT_CD")
    private Character clCoRtCd;
    @Basic(optional = false)
    @Column(name = "CL_YTD_PMT_DLY")
    private BigDecimal clYtdPmtDly;
    @Basic(optional = false)
    @Column(name = "CL_WTD_CSH_RCVD")
    private BigDecimal clWtdCshRcvd;
    @Basic(optional = false)
    @Column(name = "CL_OVRD_CD")
    private Character clOvrdCd;
    @Basic(optional = false)
    @Column(name = "CL_KM_RRN_1")
    private int clKmRrn1;
    @Basic(optional = false)
    @Column(name = "CL_KM_RRN_2")
    private int clKmRrn2;
    @Basic(optional = false)
    @Column(name = "CL_KM_RRN_3")
    private int clKmRrn3;
    @Basic(optional = false)
    @Column(name = "CL_KM_RRN_4")
    private int clKmRrn4;
    @Basic(optional = false)
    @Column(name = "CL_DISC_RT_A")
    private short clDiscRtA;
    @Basic(optional = false)
    @Column(name = "CL_AVG_OPEN")
    private BigDecimal clAvgOpen;
    @Basic(optional = false)
    @Column(name = "CL_NR_G_XMIT")
    private short clNrGXmit;
    @Basic(optional = false)
    @Column(name = "CL_NR_H_XMIT")
    private short clNrHXmit;
    @Basic(optional = false)
    @Column(name = "CL_TEMP_XMIT_LMT")
    private String clTempXmitLmt;
    @Basic(optional = false)
    @Column(name = "CL_LST_WK_NR_TRNS")
    private int clLstWkNrTrns;
    @Basic(optional = false)
    @Column(name = "CL_FP_RT_CD")
    private Character clFpRtCd;
    @Basic(optional = false)
    @Column(name = "CL_FP_OVRD")
    private Character clFpOvrd;
    @Basic(optional = false)
    @Column(name = "CL_PMT_DLY")
    private BigDecimal clPmtDly;
    @Basic(optional = false)
    @Column(name = "CL_AVG_RVNU")
    private BigDecimal clAvgRvnu;
    @Basic(optional = false)
    @Column(name = "CL_OVR_LMT_CNT")
    private short clOvrLmtCnt;
    @Basic(optional = false)
    @Column(name = "CL_DY_60")
    private BigDecimal clDy60;
    @Basic(optional = false)
    @Column(name = "CL_DY_90")
    private BigDecimal clDy90;
    @Basic(optional = false)
    @Column(name = "CL_DY_120")
    private BigDecimal clDy120;
    @Basic(optional = false)
    @Column(name = "CL_VCD")
    private Character clVcd;
    @Basic(optional = false)
    @Column(name = "CL_PREV_DY_RVNU")
    private BigDecimal clPrevDyRvnu;
    @Basic(optional = false)
    @Column(name = "CL_YR_TO_DT_RVNU")
    private BigDecimal clYrToDtRvnu;
    @Basic(optional = false)
    @Column(name = "CL_XMIT_LMT_US")
    private int clXmitLmtUs;
    @Basic(optional = false)
    @Column(name = "CL_UPD_US")
    private BigDecimal clUpdUs;
    @Basic(optional = false)
    @Column(name = "CL_CUR_DY_XMIT_US")
    private BigDecimal clCurDyXmitUs;
    @Basic(optional = false)
    @Column(name = "CL_CSH_RCVD_US")
    private BigDecimal clCshRcvdUs;
    @Basic(optional = false)
    @Column(name = "CL_DPST_DT_US")
    @Temporal(TemporalType.DATE)
    private Date clDpstDtUs;
    @Basic(optional = false)
    @Column(name = "CL_PREV_DY_RVNU_US")
    private BigDecimal clPrevDyRvnuUs;
    @Basic(optional = false)
    @Column(name = "CL_YR_TO_DT_RVNU_US")
    private BigDecimal clYrToDtRvnuUs;
    @Basic(optional = false)
    @Column(name = "CL_WTD_XMIT_US")
    private BigDecimal clWtdXmitUs;
    @Basic(optional = false)
    @Column(name = "CL_WTD_CSH_RCVD_US")
    private BigDecimal clWtdCshRcvdUs;
    @Basic(optional = false)
    @Column(name = "CL_DY_60_US")
    private BigDecimal clDy60Us;
    @Basic(optional = false)
    @Column(name = "CL_DY_90_US")
    private BigDecimal clDy90Us;
    @Basic(optional = false)
    @Column(name = "CL_DY_120_US")
    private BigDecimal clDy120Us;
    @Basic(optional = false)
    @Column(name = "CL_XMIT_LMT_CAN")
    private int clXmitLmtCan;
    @Basic(optional = false)
    @Column(name = "CL_UPD_CAN")
    private BigDecimal clUpdCan;
    @Basic(optional = false)
    @Column(name = "CL_CUR_DY_XMIT_CAN")
    private BigDecimal clCurDyXmitCan;
    @Basic(optional = false)
    @Column(name = "CL_CSH_RCVD_CAN")
    private BigDecimal clCshRcvdCan;
    @Basic(optional = false)
    @Column(name = "CL_DPST_DT_CAN")
    @Temporal(TemporalType.DATE)
    private Date clDpstDtCan;
    @Basic(optional = false)
    @Column(name = "CL_PREV_DY_RVNU_CAN")
    private BigDecimal clPrevDyRvnuCan;
    @Basic(optional = false)
    @Column(name = "CL_YR_TO_DT_RVNU_CAN")
    private BigDecimal clYrToDtRvnuCan;
    @Basic(optional = false)
    @Column(name = "CL_WTD_XMIT_CAN")
    private BigDecimal clWtdXmitCan;
    @Basic(optional = false)
    @Column(name = "CL_WTD_CSH_RCVD_CAN")
    private BigDecimal clWtdCshRcvdCan;
    @Basic(optional = false)
    @Column(name = "CL_DY_60_CAN")
    private BigDecimal clDy60Can;
    @Basic(optional = false)
    @Column(name = "CL_DY_90_CAN")
    private BigDecimal clDy90Can;
    @Basic(optional = false)
    @Column(name = "CL_DY_120_CAN")
    private BigDecimal clDy120Can;
    @Basic(optional = false)
    @Column(name = "CL_XMIT_LMT_MEX")
    private int clXmitLmtMex;
    @Basic(optional = false)
    @Column(name = "CL_UPD_MEX")
    private BigDecimal clUpdMex;
    @Basic(optional = false)
    @Column(name = "CL_CUR_DY_XMIT_MEX")
    private BigDecimal clCurDyXmitMex;
    @Basic(optional = false)
    @Column(name = "CL_CSH_RCVD_MEX")
    private BigDecimal clCshRcvdMex;
    @Basic(optional = false)
    @Column(name = "CL_DPST_DT_MEX")
    @Temporal(TemporalType.DATE)
    private Date clDpstDtMex;
    @Basic(optional = false)
    @Column(name = "CL_PREV_DY_RVNU_MEX")
    private BigDecimal clPrevDyRvnuMex;
    @Basic(optional = false)
    @Column(name = "CL_YR_TO_DT_RVNU_MEX")
    private BigDecimal clYrToDtRvnuMex;
    @Basic(optional = false)
    @Column(name = "CL_WTD_XMIT_MEX")
    private BigDecimal clWtdXmitMex;
    @Basic(optional = false)
    @Column(name = "CL_WTD_CSH_RCVD_MEX")
    private BigDecimal clWtdCshRcvdMex;
    @Basic(optional = false)
    @Column(name = "CL_DY_60_MEX")
    private BigDecimal clDy60Mex;
    @Basic(optional = false)
    @Column(name = "CL_DY_90_MEX")
    private BigDecimal clDy90Mex;
    @Basic(optional = false)
    @Column(name = "CL_DY_120_MEX")
    private BigDecimal clDy120Mex;
    @Basic(optional = false)
    @Column(name = "CL_XMIT_LMT_F1")
    private int clXmitLmtF1;
    @Basic(optional = false)
    @Column(name = "CL_UPD_F1")
    private BigDecimal clUpdF1;
    @Basic(optional = false)
    @Column(name = "CL_CUR_DY_XMIT_F1")
    private BigDecimal clCurDyXmitF1;
    @Basic(optional = false)
    @Column(name = "CL_CSH_RCVD_F1")
    private BigDecimal clCshRcvdF1;
    @Basic(optional = false)
    @Column(name = "CL_DPST_DT_F1")
    @Temporal(TemporalType.DATE)
    private Date clDpstDtF1;
    @Basic(optional = false)
    @Column(name = "CL_PREV_DY_RVNU_F1")
    private BigDecimal clPrevDyRvnuF1;
    @Basic(optional = false)
    @Column(name = "CL_YR_TO_DT_RVNU_F1")
    private BigDecimal clYrToDtRvnuF1;
    @Basic(optional = false)
    @Column(name = "CL_WTD_XMIT_F1")
    private BigDecimal clWtdXmitF1;
    @Basic(optional = false)
    @Column(name = "CL_WTD_CSH_RCVD_F1")
    private BigDecimal clWtdCshRcvdF1;
    @Basic(optional = false)
    @Column(name = "CL_DY_60_F1")
    private BigDecimal clDy60F1;
    @Basic(optional = false)
    @Column(name = "CL_DY_90_F1")
    private BigDecimal clDy90F1;
    @Basic(optional = false)
    @Column(name = "CL_DY_120_F1")
    private BigDecimal clDy120F1;
    @Basic(optional = false)
    @Column(name = "CL_XMIT_LMT_F2")
    private int clXmitLmtF2;
    @Basic(optional = false)
    @Column(name = "CL_UPD_F2")
    private BigDecimal clUpdF2;
    @Basic(optional = false)
    @Column(name = "CL_CUR_DY_XMIT_F2")
    private BigDecimal clCurDyXmitF2;
    @Basic(optional = false)
    @Column(name = "CL_CSH_RCVD_F2")
    private BigDecimal clCshRcvdF2;
    @Basic(optional = false)
    @Column(name = "CL_DPST_DT_F2")
    @Temporal(TemporalType.DATE)
    private Date clDpstDtF2;
    @Basic(optional = false)
    @Column(name = "CL_PREV_DY_RVNU_F2")
    private BigDecimal clPrevDyRvnuF2;
    @Basic(optional = false)
    @Column(name = "CL_YR_TO_DT_RVNU_F2")
    private BigDecimal clYrToDtRvnuF2;
    @Basic(optional = false)
    @Column(name = "CL_WTD_XMIT_F2")
    private BigDecimal clWtdXmitF2;
    @Basic(optional = false)
    @Column(name = "CL_WTD_CSH_RCVD_F2")
    private BigDecimal clWtdCshRcvdF2;
    @Basic(optional = false)
    @Column(name = "CL_DY_60_F2")
    private BigDecimal clDy60F2;
    @Basic(optional = false)
    @Column(name = "CL_DY_90_F2")
    private BigDecimal clDy90F2;
    @Basic(optional = false)
    @Column(name = "CL_DY_120_F2")
    private BigDecimal clDy120F2;
    @Basic(optional = false)
    @Column(name = "CL_HARD_CR_HOLD")
    private Character clHardCrHold;
    @Basic(optional = false)
    @Column(name = "CL_TRTOY")
    private String clTrtoy;
    @Basic(optional = false)
    @Column(name = "CL_AR_SERV_BAL")
    private BigDecimal clArServBal;
    @Basic(optional = false)
    @Column(name = "CL_L_C_CSH_CD")
    private String clLCCshCd;
    @Basic(optional = false)
    @Column(name = "CL_L_C_NBR")
    private String clLCNbr;
    @Basic(optional = false)
    @Column(name = "CL_L_C_AMT")
    private BigDecimal clLCAmt;
    @Basic(optional = false)
    @Column(name = "CL_TEMP_XMIT_LMT_NEW")
    private int clTempXmitLmtNew;
    @Basic(optional = false)
    @Column(name = "CL_PREAUTH_AMT")
    private BigDecimal clPreauthAmt;
    @Basic(optional = false)
    @Column(name = "CL_UNBILLED_AMT")
    private BigDecimal clUnbilledAmt;
    @Basic(optional = false)
    @Column(name = "CL_CUST_REINSTATED")
    private Character clCustReinstated;
    @Basic(optional = false)
    @Column(name = "CL_CUST_OVR_LMT")
    private Character clCustOvrLmt;
    @Basic(optional = false)
    @Column(name = "CL_INSTANT_CR_NOTIFY_FL")
    private Character clInstantCrNotifyFl;
    @Basic(optional = false)
    @Column(name = "CL_RLSHP_FLG")
    private Character clRlshpFlg;
    @Basic(optional = false)
    @Column(name = "CL_DPST_SRCE_CD")
    private String clDpstSrceCd;
    @Basic(optional = false)
    @Column(name = "CL_CUR_DY_XMIT_DT")
    @Temporal(TemporalType.DATE)
    private Date clCurDyXmitDt;
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
    @Column(name = "CL_CUR_DY_TMP_AMT")
    private BigDecimal clCurDyTmpAmt;
    @Basic(optional = false)
    @Column(name = "CL_OTB_LMT_AMT")
    private BigDecimal clOtbLmtAmt;
    @Basic(optional = false)
    @Column(name = "CL_OTB_USED_AMT")
    private BigDecimal clOtbUsedAmt;
    @Basic(optional = false)
    @Column(name = "CL_OTB_HOLD_AMT")
    private BigDecimal clOtbHoldAmt;
    @Basic(optional = false)
    @Column(name = "CL_OTB_LST_UPD_DT")
    @Temporal(TemporalType.DATE)
    private Date clOtbLstUpdDt;
    @Basic(optional = false)
    @Column(name = "CL_CUR_DY_TMP_EXP_DT")
    @Temporal(TemporalType.DATE)
    private Date clCurDyTmpExpDt;

    public CrLmts() {
    }

    public CrLmts(String clCoCd) {
        this.clCoCd = clCoCd;
    }

    public CrLmts(String clCoCd, int clTieCd, String clCoFullNm, int clXmitLmt, BigDecimal clUpd, BigDecimal clWtdXmit, BigDecimal clCurDyXmit, Character clQBlk, Character clUsiFlg, short clRtDiscFctrR, Character clXmitOvr1k, Character clXmitCd, BigDecimal clCshRcvd, Date clDpstDt, Character clCoRtCd, BigDecimal clYtdPmtDly, BigDecimal clWtdCshRcvd, Character clOvrdCd, int clKmRrn1, int clKmRrn2, int clKmRrn3, int clKmRrn4, short clDiscRtA, BigDecimal clAvgOpen, short clNrGXmit, short clNrHXmit, String clTempXmitLmt, int clLstWkNrTrns, Character clFpRtCd, Character clFpOvrd, BigDecimal clPmtDly, BigDecimal clAvgRvnu, short clOvrLmtCnt, BigDecimal clDy60, BigDecimal clDy90, BigDecimal clDy120, Character clVcd, BigDecimal clPrevDyRvnu, BigDecimal clYrToDtRvnu, int clXmitLmtUs, BigDecimal clUpdUs, BigDecimal clCurDyXmitUs, BigDecimal clCshRcvdUs, Date clDpstDtUs, BigDecimal clPrevDyRvnuUs, BigDecimal clYrToDtRvnuUs, BigDecimal clWtdXmitUs, BigDecimal clWtdCshRcvdUs, BigDecimal clDy60Us, BigDecimal clDy90Us, BigDecimal clDy120Us, int clXmitLmtCan, BigDecimal clUpdCan, BigDecimal clCurDyXmitCan, BigDecimal clCshRcvdCan, Date clDpstDtCan, BigDecimal clPrevDyRvnuCan, BigDecimal clYrToDtRvnuCan, BigDecimal clWtdXmitCan, BigDecimal clWtdCshRcvdCan, BigDecimal clDy60Can, BigDecimal clDy90Can, BigDecimal clDy120Can, int clXmitLmtMex, BigDecimal clUpdMex, BigDecimal clCurDyXmitMex, BigDecimal clCshRcvdMex, Date clDpstDtMex, BigDecimal clPrevDyRvnuMex, BigDecimal clYrToDtRvnuMex, BigDecimal clWtdXmitMex, BigDecimal clWtdCshRcvdMex, BigDecimal clDy60Mex, BigDecimal clDy90Mex, BigDecimal clDy120Mex, int clXmitLmtF1, BigDecimal clUpdF1, BigDecimal clCurDyXmitF1, BigDecimal clCshRcvdF1, Date clDpstDtF1, BigDecimal clPrevDyRvnuF1, BigDecimal clYrToDtRvnuF1, BigDecimal clWtdXmitF1, BigDecimal clWtdCshRcvdF1, BigDecimal clDy60F1, BigDecimal clDy90F1, BigDecimal clDy120F1, int clXmitLmtF2, BigDecimal clUpdF2, BigDecimal clCurDyXmitF2, BigDecimal clCshRcvdF2, Date clDpstDtF2, BigDecimal clPrevDyRvnuF2, BigDecimal clYrToDtRvnuF2, BigDecimal clWtdXmitF2, BigDecimal clWtdCshRcvdF2, BigDecimal clDy60F2, BigDecimal clDy90F2, BigDecimal clDy120F2, Character clHardCrHold, String clTrtoy, BigDecimal clArServBal, String clLCCshCd, String clLCNbr, BigDecimal clLCAmt, int clTempXmitLmtNew, BigDecimal clPreauthAmt, BigDecimal clUnbilledAmt, Character clCustReinstated, Character clCustOvrLmt, Character clInstantCrNotifyFl, Character clRlshpFlg, String clDpstSrceCd, Date clCurDyXmitDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal clCurDyTmpAmt, BigDecimal clOtbLmtAmt, BigDecimal clOtbUsedAmt, BigDecimal clOtbHoldAmt, Date clOtbLstUpdDt, Date clCurDyTmpExpDt) {
        this.clCoCd = clCoCd;
        this.clTieCd = clTieCd;
        this.clCoFullNm = clCoFullNm;
        this.clXmitLmt = clXmitLmt;
        this.clUpd = clUpd;
        this.clWtdXmit = clWtdXmit;
        this.clCurDyXmit = clCurDyXmit;
        this.clQBlk = clQBlk;
        this.clUsiFlg = clUsiFlg;
        this.clRtDiscFctrR = clRtDiscFctrR;
        this.clXmitOvr1k = clXmitOvr1k;
        this.clXmitCd = clXmitCd;
        this.clCshRcvd = clCshRcvd;
        this.clDpstDt = clDpstDt;
        this.clCoRtCd = clCoRtCd;
        this.clYtdPmtDly = clYtdPmtDly;
        this.clWtdCshRcvd = clWtdCshRcvd;
        this.clOvrdCd = clOvrdCd;
        this.clKmRrn1 = clKmRrn1;
        this.clKmRrn2 = clKmRrn2;
        this.clKmRrn3 = clKmRrn3;
        this.clKmRrn4 = clKmRrn4;
        this.clDiscRtA = clDiscRtA;
        this.clAvgOpen = clAvgOpen;
        this.clNrGXmit = clNrGXmit;
        this.clNrHXmit = clNrHXmit;
        this.clTempXmitLmt = clTempXmitLmt;
        this.clLstWkNrTrns = clLstWkNrTrns;
        this.clFpRtCd = clFpRtCd;
        this.clFpOvrd = clFpOvrd;
        this.clPmtDly = clPmtDly;
        this.clAvgRvnu = clAvgRvnu;
        this.clOvrLmtCnt = clOvrLmtCnt;
        this.clDy60 = clDy60;
        this.clDy90 = clDy90;
        this.clDy120 = clDy120;
        this.clVcd = clVcd;
        this.clPrevDyRvnu = clPrevDyRvnu;
        this.clYrToDtRvnu = clYrToDtRvnu;
        this.clXmitLmtUs = clXmitLmtUs;
        this.clUpdUs = clUpdUs;
        this.clCurDyXmitUs = clCurDyXmitUs;
        this.clCshRcvdUs = clCshRcvdUs;
        this.clDpstDtUs = clDpstDtUs;
        this.clPrevDyRvnuUs = clPrevDyRvnuUs;
        this.clYrToDtRvnuUs = clYrToDtRvnuUs;
        this.clWtdXmitUs = clWtdXmitUs;
        this.clWtdCshRcvdUs = clWtdCshRcvdUs;
        this.clDy60Us = clDy60Us;
        this.clDy90Us = clDy90Us;
        this.clDy120Us = clDy120Us;
        this.clXmitLmtCan = clXmitLmtCan;
        this.clUpdCan = clUpdCan;
        this.clCurDyXmitCan = clCurDyXmitCan;
        this.clCshRcvdCan = clCshRcvdCan;
        this.clDpstDtCan = clDpstDtCan;
        this.clPrevDyRvnuCan = clPrevDyRvnuCan;
        this.clYrToDtRvnuCan = clYrToDtRvnuCan;
        this.clWtdXmitCan = clWtdXmitCan;
        this.clWtdCshRcvdCan = clWtdCshRcvdCan;
        this.clDy60Can = clDy60Can;
        this.clDy90Can = clDy90Can;
        this.clDy120Can = clDy120Can;
        this.clXmitLmtMex = clXmitLmtMex;
        this.clUpdMex = clUpdMex;
        this.clCurDyXmitMex = clCurDyXmitMex;
        this.clCshRcvdMex = clCshRcvdMex;
        this.clDpstDtMex = clDpstDtMex;
        this.clPrevDyRvnuMex = clPrevDyRvnuMex;
        this.clYrToDtRvnuMex = clYrToDtRvnuMex;
        this.clWtdXmitMex = clWtdXmitMex;
        this.clWtdCshRcvdMex = clWtdCshRcvdMex;
        this.clDy60Mex = clDy60Mex;
        this.clDy90Mex = clDy90Mex;
        this.clDy120Mex = clDy120Mex;
        this.clXmitLmtF1 = clXmitLmtF1;
        this.clUpdF1 = clUpdF1;
        this.clCurDyXmitF1 = clCurDyXmitF1;
        this.clCshRcvdF1 = clCshRcvdF1;
        this.clDpstDtF1 = clDpstDtF1;
        this.clPrevDyRvnuF1 = clPrevDyRvnuF1;
        this.clYrToDtRvnuF1 = clYrToDtRvnuF1;
        this.clWtdXmitF1 = clWtdXmitF1;
        this.clWtdCshRcvdF1 = clWtdCshRcvdF1;
        this.clDy60F1 = clDy60F1;
        this.clDy90F1 = clDy90F1;
        this.clDy120F1 = clDy120F1;
        this.clXmitLmtF2 = clXmitLmtF2;
        this.clUpdF2 = clUpdF2;
        this.clCurDyXmitF2 = clCurDyXmitF2;
        this.clCshRcvdF2 = clCshRcvdF2;
        this.clDpstDtF2 = clDpstDtF2;
        this.clPrevDyRvnuF2 = clPrevDyRvnuF2;
        this.clYrToDtRvnuF2 = clYrToDtRvnuF2;
        this.clWtdXmitF2 = clWtdXmitF2;
        this.clWtdCshRcvdF2 = clWtdCshRcvdF2;
        this.clDy60F2 = clDy60F2;
        this.clDy90F2 = clDy90F2;
        this.clDy120F2 = clDy120F2;
        this.clHardCrHold = clHardCrHold;
        this.clTrtoy = clTrtoy;
        this.clArServBal = clArServBal;
        this.clLCCshCd = clLCCshCd;
        this.clLCNbr = clLCNbr;
        this.clLCAmt = clLCAmt;
        this.clTempXmitLmtNew = clTempXmitLmtNew;
        this.clPreauthAmt = clPreauthAmt;
        this.clUnbilledAmt = clUnbilledAmt;
        this.clCustReinstated = clCustReinstated;
        this.clCustOvrLmt = clCustOvrLmt;
        this.clInstantCrNotifyFl = clInstantCrNotifyFl;
        this.clRlshpFlg = clRlshpFlg;
        this.clDpstSrceCd = clDpstSrceCd;
        this.clCurDyXmitDt = clCurDyXmitDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.clCurDyTmpAmt = clCurDyTmpAmt;
        this.clOtbLmtAmt = clOtbLmtAmt;
        this.clOtbUsedAmt = clOtbUsedAmt;
        this.clOtbHoldAmt = clOtbHoldAmt;
        this.clOtbLstUpdDt = clOtbLstUpdDt;
        this.clCurDyTmpExpDt = clCurDyTmpExpDt;
    }

    public String getClCoCd() {
        return clCoCd;
    }

    public void setClCoCd(String clCoCd) {
        this.clCoCd = clCoCd;
    }

    public int getClTieCd() {
        return clTieCd;
    }

    public void setClTieCd(int clTieCd) {
        this.clTieCd = clTieCd;
    }

    public String getClCoFullNm() {
        return clCoFullNm;
    }

    public void setClCoFullNm(String clCoFullNm) {
        this.clCoFullNm = clCoFullNm;
    }

    public int getClXmitLmt() {
        return clXmitLmt;
    }

    public void setClXmitLmt(int clXmitLmt) {
        this.clXmitLmt = clXmitLmt;
    }

    public BigDecimal getClUpd() {
        return clUpd;
    }

    public void setClUpd(BigDecimal clUpd) {
        this.clUpd = clUpd;
    }

    public BigDecimal getClWtdXmit() {
        return clWtdXmit;
    }

    public void setClWtdXmit(BigDecimal clWtdXmit) {
        this.clWtdXmit = clWtdXmit;
    }

    public BigDecimal getClCurDyXmit() {
        return clCurDyXmit;
    }

    public void setClCurDyXmit(BigDecimal clCurDyXmit) {
        this.clCurDyXmit = clCurDyXmit;
    }

    public Character getClQBlk() {
        return clQBlk;
    }

    public void setClQBlk(Character clQBlk) {
        this.clQBlk = clQBlk;
    }

    public Character getClUsiFlg() {
        return clUsiFlg;
    }

    public void setClUsiFlg(Character clUsiFlg) {
        this.clUsiFlg = clUsiFlg;
    }

    public short getClRtDiscFctrR() {
        return clRtDiscFctrR;
    }

    public void setClRtDiscFctrR(short clRtDiscFctrR) {
        this.clRtDiscFctrR = clRtDiscFctrR;
    }

    public Character getClXmitOvr1k() {
        return clXmitOvr1k;
    }

    public void setClXmitOvr1k(Character clXmitOvr1k) {
        this.clXmitOvr1k = clXmitOvr1k;
    }

    public Character getClXmitCd() {
        return clXmitCd;
    }

    public void setClXmitCd(Character clXmitCd) {
        this.clXmitCd = clXmitCd;
    }

    public BigDecimal getClCshRcvd() {
        return clCshRcvd;
    }

    public void setClCshRcvd(BigDecimal clCshRcvd) {
        this.clCshRcvd = clCshRcvd;
    }

    public Date getClDpstDt() {
        return clDpstDt;
    }

    public void setClDpstDt(Date clDpstDt) {
        this.clDpstDt = clDpstDt;
    }

    public Character getClCoRtCd() {
        return clCoRtCd;
    }

    public void setClCoRtCd(Character clCoRtCd) {
        this.clCoRtCd = clCoRtCd;
    }

    public BigDecimal getClYtdPmtDly() {
        return clYtdPmtDly;
    }

    public void setClYtdPmtDly(BigDecimal clYtdPmtDly) {
        this.clYtdPmtDly = clYtdPmtDly;
    }

    public BigDecimal getClWtdCshRcvd() {
        return clWtdCshRcvd;
    }

    public void setClWtdCshRcvd(BigDecimal clWtdCshRcvd) {
        this.clWtdCshRcvd = clWtdCshRcvd;
    }

    public Character getClOvrdCd() {
        return clOvrdCd;
    }

    public void setClOvrdCd(Character clOvrdCd) {
        this.clOvrdCd = clOvrdCd;
    }

    public int getClKmRrn1() {
        return clKmRrn1;
    }

    public void setClKmRrn1(int clKmRrn1) {
        this.clKmRrn1 = clKmRrn1;
    }

    public int getClKmRrn2() {
        return clKmRrn2;
    }

    public void setClKmRrn2(int clKmRrn2) {
        this.clKmRrn2 = clKmRrn2;
    }

    public int getClKmRrn3() {
        return clKmRrn3;
    }

    public void setClKmRrn3(int clKmRrn3) {
        this.clKmRrn3 = clKmRrn3;
    }

    public int getClKmRrn4() {
        return clKmRrn4;
    }

    public void setClKmRrn4(int clKmRrn4) {
        this.clKmRrn4 = clKmRrn4;
    }

    public short getClDiscRtA() {
        return clDiscRtA;
    }

    public void setClDiscRtA(short clDiscRtA) {
        this.clDiscRtA = clDiscRtA;
    }

    public BigDecimal getClAvgOpen() {
        return clAvgOpen;
    }

    public void setClAvgOpen(BigDecimal clAvgOpen) {
        this.clAvgOpen = clAvgOpen;
    }

    public short getClNrGXmit() {
        return clNrGXmit;
    }

    public void setClNrGXmit(short clNrGXmit) {
        this.clNrGXmit = clNrGXmit;
    }

    public short getClNrHXmit() {
        return clNrHXmit;
    }

    public void setClNrHXmit(short clNrHXmit) {
        this.clNrHXmit = clNrHXmit;
    }

    public String getClTempXmitLmt() {
        return clTempXmitLmt;
    }

    public void setClTempXmitLmt(String clTempXmitLmt) {
        this.clTempXmitLmt = clTempXmitLmt;
    }

    public int getClLstWkNrTrns() {
        return clLstWkNrTrns;
    }

    public void setClLstWkNrTrns(int clLstWkNrTrns) {
        this.clLstWkNrTrns = clLstWkNrTrns;
    }

    public Character getClFpRtCd() {
        return clFpRtCd;
    }

    public void setClFpRtCd(Character clFpRtCd) {
        this.clFpRtCd = clFpRtCd;
    }

    public Character getClFpOvrd() {
        return clFpOvrd;
    }

    public void setClFpOvrd(Character clFpOvrd) {
        this.clFpOvrd = clFpOvrd;
    }

    public BigDecimal getClPmtDly() {
        return clPmtDly;
    }

    public void setClPmtDly(BigDecimal clPmtDly) {
        this.clPmtDly = clPmtDly;
    }

    public BigDecimal getClAvgRvnu() {
        return clAvgRvnu;
    }

    public void setClAvgRvnu(BigDecimal clAvgRvnu) {
        this.clAvgRvnu = clAvgRvnu;
    }

    public short getClOvrLmtCnt() {
        return clOvrLmtCnt;
    }

    public void setClOvrLmtCnt(short clOvrLmtCnt) {
        this.clOvrLmtCnt = clOvrLmtCnt;
    }

    public BigDecimal getClDy60() {
        return clDy60;
    }

    public void setClDy60(BigDecimal clDy60) {
        this.clDy60 = clDy60;
    }

    public BigDecimal getClDy90() {
        return clDy90;
    }

    public void setClDy90(BigDecimal clDy90) {
        this.clDy90 = clDy90;
    }

    public BigDecimal getClDy120() {
        return clDy120;
    }

    public void setClDy120(BigDecimal clDy120) {
        this.clDy120 = clDy120;
    }

    public Character getClVcd() {
        return clVcd;
    }

    public void setClVcd(Character clVcd) {
        this.clVcd = clVcd;
    }

    public BigDecimal getClPrevDyRvnu() {
        return clPrevDyRvnu;
    }

    public void setClPrevDyRvnu(BigDecimal clPrevDyRvnu) {
        this.clPrevDyRvnu = clPrevDyRvnu;
    }

    public BigDecimal getClYrToDtRvnu() {
        return clYrToDtRvnu;
    }

    public void setClYrToDtRvnu(BigDecimal clYrToDtRvnu) {
        this.clYrToDtRvnu = clYrToDtRvnu;
    }

    public int getClXmitLmtUs() {
        return clXmitLmtUs;
    }

    public void setClXmitLmtUs(int clXmitLmtUs) {
        this.clXmitLmtUs = clXmitLmtUs;
    }

    public BigDecimal getClUpdUs() {
        return clUpdUs;
    }

    public void setClUpdUs(BigDecimal clUpdUs) {
        this.clUpdUs = clUpdUs;
    }

    public BigDecimal getClCurDyXmitUs() {
        return clCurDyXmitUs;
    }

    public void setClCurDyXmitUs(BigDecimal clCurDyXmitUs) {
        this.clCurDyXmitUs = clCurDyXmitUs;
    }

    public BigDecimal getClCshRcvdUs() {
        return clCshRcvdUs;
    }

    public void setClCshRcvdUs(BigDecimal clCshRcvdUs) {
        this.clCshRcvdUs = clCshRcvdUs;
    }

    public Date getClDpstDtUs() {
        return clDpstDtUs;
    }

    public void setClDpstDtUs(Date clDpstDtUs) {
        this.clDpstDtUs = clDpstDtUs;
    }

    public BigDecimal getClPrevDyRvnuUs() {
        return clPrevDyRvnuUs;
    }

    public void setClPrevDyRvnuUs(BigDecimal clPrevDyRvnuUs) {
        this.clPrevDyRvnuUs = clPrevDyRvnuUs;
    }

    public BigDecimal getClYrToDtRvnuUs() {
        return clYrToDtRvnuUs;
    }

    public void setClYrToDtRvnuUs(BigDecimal clYrToDtRvnuUs) {
        this.clYrToDtRvnuUs = clYrToDtRvnuUs;
    }

    public BigDecimal getClWtdXmitUs() {
        return clWtdXmitUs;
    }

    public void setClWtdXmitUs(BigDecimal clWtdXmitUs) {
        this.clWtdXmitUs = clWtdXmitUs;
    }

    public BigDecimal getClWtdCshRcvdUs() {
        return clWtdCshRcvdUs;
    }

    public void setClWtdCshRcvdUs(BigDecimal clWtdCshRcvdUs) {
        this.clWtdCshRcvdUs = clWtdCshRcvdUs;
    }

    public BigDecimal getClDy60Us() {
        return clDy60Us;
    }

    public void setClDy60Us(BigDecimal clDy60Us) {
        this.clDy60Us = clDy60Us;
    }

    public BigDecimal getClDy90Us() {
        return clDy90Us;
    }

    public void setClDy90Us(BigDecimal clDy90Us) {
        this.clDy90Us = clDy90Us;
    }

    public BigDecimal getClDy120Us() {
        return clDy120Us;
    }

    public void setClDy120Us(BigDecimal clDy120Us) {
        this.clDy120Us = clDy120Us;
    }

    public int getClXmitLmtCan() {
        return clXmitLmtCan;
    }

    public void setClXmitLmtCan(int clXmitLmtCan) {
        this.clXmitLmtCan = clXmitLmtCan;
    }

    public BigDecimal getClUpdCan() {
        return clUpdCan;
    }

    public void setClUpdCan(BigDecimal clUpdCan) {
        this.clUpdCan = clUpdCan;
    }

    public BigDecimal getClCurDyXmitCan() {
        return clCurDyXmitCan;
    }

    public void setClCurDyXmitCan(BigDecimal clCurDyXmitCan) {
        this.clCurDyXmitCan = clCurDyXmitCan;
    }

    public BigDecimal getClCshRcvdCan() {
        return clCshRcvdCan;
    }

    public void setClCshRcvdCan(BigDecimal clCshRcvdCan) {
        this.clCshRcvdCan = clCshRcvdCan;
    }

    public Date getClDpstDtCan() {
        return clDpstDtCan;
    }

    public void setClDpstDtCan(Date clDpstDtCan) {
        this.clDpstDtCan = clDpstDtCan;
    }

    public BigDecimal getClPrevDyRvnuCan() {
        return clPrevDyRvnuCan;
    }

    public void setClPrevDyRvnuCan(BigDecimal clPrevDyRvnuCan) {
        this.clPrevDyRvnuCan = clPrevDyRvnuCan;
    }

    public BigDecimal getClYrToDtRvnuCan() {
        return clYrToDtRvnuCan;
    }

    public void setClYrToDtRvnuCan(BigDecimal clYrToDtRvnuCan) {
        this.clYrToDtRvnuCan = clYrToDtRvnuCan;
    }

    public BigDecimal getClWtdXmitCan() {
        return clWtdXmitCan;
    }

    public void setClWtdXmitCan(BigDecimal clWtdXmitCan) {
        this.clWtdXmitCan = clWtdXmitCan;
    }

    public BigDecimal getClWtdCshRcvdCan() {
        return clWtdCshRcvdCan;
    }

    public void setClWtdCshRcvdCan(BigDecimal clWtdCshRcvdCan) {
        this.clWtdCshRcvdCan = clWtdCshRcvdCan;
    }

    public BigDecimal getClDy60Can() {
        return clDy60Can;
    }

    public void setClDy60Can(BigDecimal clDy60Can) {
        this.clDy60Can = clDy60Can;
    }

    public BigDecimal getClDy90Can() {
        return clDy90Can;
    }

    public void setClDy90Can(BigDecimal clDy90Can) {
        this.clDy90Can = clDy90Can;
    }

    public BigDecimal getClDy120Can() {
        return clDy120Can;
    }

    public void setClDy120Can(BigDecimal clDy120Can) {
        this.clDy120Can = clDy120Can;
    }

    public int getClXmitLmtMex() {
        return clXmitLmtMex;
    }

    public void setClXmitLmtMex(int clXmitLmtMex) {
        this.clXmitLmtMex = clXmitLmtMex;
    }

    public BigDecimal getClUpdMex() {
        return clUpdMex;
    }

    public void setClUpdMex(BigDecimal clUpdMex) {
        this.clUpdMex = clUpdMex;
    }

    public BigDecimal getClCurDyXmitMex() {
        return clCurDyXmitMex;
    }

    public void setClCurDyXmitMex(BigDecimal clCurDyXmitMex) {
        this.clCurDyXmitMex = clCurDyXmitMex;
    }

    public BigDecimal getClCshRcvdMex() {
        return clCshRcvdMex;
    }

    public void setClCshRcvdMex(BigDecimal clCshRcvdMex) {
        this.clCshRcvdMex = clCshRcvdMex;
    }

    public Date getClDpstDtMex() {
        return clDpstDtMex;
    }

    public void setClDpstDtMex(Date clDpstDtMex) {
        this.clDpstDtMex = clDpstDtMex;
    }

    public BigDecimal getClPrevDyRvnuMex() {
        return clPrevDyRvnuMex;
    }

    public void setClPrevDyRvnuMex(BigDecimal clPrevDyRvnuMex) {
        this.clPrevDyRvnuMex = clPrevDyRvnuMex;
    }

    public BigDecimal getClYrToDtRvnuMex() {
        return clYrToDtRvnuMex;
    }

    public void setClYrToDtRvnuMex(BigDecimal clYrToDtRvnuMex) {
        this.clYrToDtRvnuMex = clYrToDtRvnuMex;
    }

    public BigDecimal getClWtdXmitMex() {
        return clWtdXmitMex;
    }

    public void setClWtdXmitMex(BigDecimal clWtdXmitMex) {
        this.clWtdXmitMex = clWtdXmitMex;
    }

    public BigDecimal getClWtdCshRcvdMex() {
        return clWtdCshRcvdMex;
    }

    public void setClWtdCshRcvdMex(BigDecimal clWtdCshRcvdMex) {
        this.clWtdCshRcvdMex = clWtdCshRcvdMex;
    }

    public BigDecimal getClDy60Mex() {
        return clDy60Mex;
    }

    public void setClDy60Mex(BigDecimal clDy60Mex) {
        this.clDy60Mex = clDy60Mex;
    }

    public BigDecimal getClDy90Mex() {
        return clDy90Mex;
    }

    public void setClDy90Mex(BigDecimal clDy90Mex) {
        this.clDy90Mex = clDy90Mex;
    }

    public BigDecimal getClDy120Mex() {
        return clDy120Mex;
    }

    public void setClDy120Mex(BigDecimal clDy120Mex) {
        this.clDy120Mex = clDy120Mex;
    }

    public int getClXmitLmtF1() {
        return clXmitLmtF1;
    }

    public void setClXmitLmtF1(int clXmitLmtF1) {
        this.clXmitLmtF1 = clXmitLmtF1;
    }

    public BigDecimal getClUpdF1() {
        return clUpdF1;
    }

    public void setClUpdF1(BigDecimal clUpdF1) {
        this.clUpdF1 = clUpdF1;
    }

    public BigDecimal getClCurDyXmitF1() {
        return clCurDyXmitF1;
    }

    public void setClCurDyXmitF1(BigDecimal clCurDyXmitF1) {
        this.clCurDyXmitF1 = clCurDyXmitF1;
    }

    public BigDecimal getClCshRcvdF1() {
        return clCshRcvdF1;
    }

    public void setClCshRcvdF1(BigDecimal clCshRcvdF1) {
        this.clCshRcvdF1 = clCshRcvdF1;
    }

    public Date getClDpstDtF1() {
        return clDpstDtF1;
    }

    public void setClDpstDtF1(Date clDpstDtF1) {
        this.clDpstDtF1 = clDpstDtF1;
    }

    public BigDecimal getClPrevDyRvnuF1() {
        return clPrevDyRvnuF1;
    }

    public void setClPrevDyRvnuF1(BigDecimal clPrevDyRvnuF1) {
        this.clPrevDyRvnuF1 = clPrevDyRvnuF1;
    }

    public BigDecimal getClYrToDtRvnuF1() {
        return clYrToDtRvnuF1;
    }

    public void setClYrToDtRvnuF1(BigDecimal clYrToDtRvnuF1) {
        this.clYrToDtRvnuF1 = clYrToDtRvnuF1;
    }

    public BigDecimal getClWtdXmitF1() {
        return clWtdXmitF1;
    }

    public void setClWtdXmitF1(BigDecimal clWtdXmitF1) {
        this.clWtdXmitF1 = clWtdXmitF1;
    }

    public BigDecimal getClWtdCshRcvdF1() {
        return clWtdCshRcvdF1;
    }

    public void setClWtdCshRcvdF1(BigDecimal clWtdCshRcvdF1) {
        this.clWtdCshRcvdF1 = clWtdCshRcvdF1;
    }

    public BigDecimal getClDy60F1() {
        return clDy60F1;
    }

    public void setClDy60F1(BigDecimal clDy60F1) {
        this.clDy60F1 = clDy60F1;
    }

    public BigDecimal getClDy90F1() {
        return clDy90F1;
    }

    public void setClDy90F1(BigDecimal clDy90F1) {
        this.clDy90F1 = clDy90F1;
    }

    public BigDecimal getClDy120F1() {
        return clDy120F1;
    }

    public void setClDy120F1(BigDecimal clDy120F1) {
        this.clDy120F1 = clDy120F1;
    }

    public int getClXmitLmtF2() {
        return clXmitLmtF2;
    }

    public void setClXmitLmtF2(int clXmitLmtF2) {
        this.clXmitLmtF2 = clXmitLmtF2;
    }

    public BigDecimal getClUpdF2() {
        return clUpdF2;
    }

    public void setClUpdF2(BigDecimal clUpdF2) {
        this.clUpdF2 = clUpdF2;
    }

    public BigDecimal getClCurDyXmitF2() {
        return clCurDyXmitF2;
    }

    public void setClCurDyXmitF2(BigDecimal clCurDyXmitF2) {
        this.clCurDyXmitF2 = clCurDyXmitF2;
    }

    public BigDecimal getClCshRcvdF2() {
        return clCshRcvdF2;
    }

    public void setClCshRcvdF2(BigDecimal clCshRcvdF2) {
        this.clCshRcvdF2 = clCshRcvdF2;
    }

    public Date getClDpstDtF2() {
        return clDpstDtF2;
    }

    public void setClDpstDtF2(Date clDpstDtF2) {
        this.clDpstDtF2 = clDpstDtF2;
    }

    public BigDecimal getClPrevDyRvnuF2() {
        return clPrevDyRvnuF2;
    }

    public void setClPrevDyRvnuF2(BigDecimal clPrevDyRvnuF2) {
        this.clPrevDyRvnuF2 = clPrevDyRvnuF2;
    }

    public BigDecimal getClYrToDtRvnuF2() {
        return clYrToDtRvnuF2;
    }

    public void setClYrToDtRvnuF2(BigDecimal clYrToDtRvnuF2) {
        this.clYrToDtRvnuF2 = clYrToDtRvnuF2;
    }

    public BigDecimal getClWtdXmitF2() {
        return clWtdXmitF2;
    }

    public void setClWtdXmitF2(BigDecimal clWtdXmitF2) {
        this.clWtdXmitF2 = clWtdXmitF2;
    }

    public BigDecimal getClWtdCshRcvdF2() {
        return clWtdCshRcvdF2;
    }

    public void setClWtdCshRcvdF2(BigDecimal clWtdCshRcvdF2) {
        this.clWtdCshRcvdF2 = clWtdCshRcvdF2;
    }

    public BigDecimal getClDy60F2() {
        return clDy60F2;
    }

    public void setClDy60F2(BigDecimal clDy60F2) {
        this.clDy60F2 = clDy60F2;
    }

    public BigDecimal getClDy90F2() {
        return clDy90F2;
    }

    public void setClDy90F2(BigDecimal clDy90F2) {
        this.clDy90F2 = clDy90F2;
    }

    public BigDecimal getClDy120F2() {
        return clDy120F2;
    }

    public void setClDy120F2(BigDecimal clDy120F2) {
        this.clDy120F2 = clDy120F2;
    }

    public Character getClHardCrHold() {
        return clHardCrHold;
    }

    public void setClHardCrHold(Character clHardCrHold) {
        this.clHardCrHold = clHardCrHold;
    }

    public String getClTrtoy() {
        return clTrtoy;
    }

    public void setClTrtoy(String clTrtoy) {
        this.clTrtoy = clTrtoy;
    }

    public BigDecimal getClArServBal() {
        return clArServBal;
    }

    public void setClArServBal(BigDecimal clArServBal) {
        this.clArServBal = clArServBal;
    }

    public String getClLCCshCd() {
        return clLCCshCd;
    }

    public void setClLCCshCd(String clLCCshCd) {
        this.clLCCshCd = clLCCshCd;
    }

    public String getClLCNbr() {
        return clLCNbr;
    }

    public void setClLCNbr(String clLCNbr) {
        this.clLCNbr = clLCNbr;
    }

    public BigDecimal getClLCAmt() {
        return clLCAmt;
    }

    public void setClLCAmt(BigDecimal clLCAmt) {
        this.clLCAmt = clLCAmt;
    }

    public int getClTempXmitLmtNew() {
        return clTempXmitLmtNew;
    }

    public void setClTempXmitLmtNew(int clTempXmitLmtNew) {
        this.clTempXmitLmtNew = clTempXmitLmtNew;
    }

    public BigDecimal getClPreauthAmt() {
        return clPreauthAmt;
    }

    public void setClPreauthAmt(BigDecimal clPreauthAmt) {
        this.clPreauthAmt = clPreauthAmt;
    }

    public BigDecimal getClUnbilledAmt() {
        return clUnbilledAmt;
    }

    public void setClUnbilledAmt(BigDecimal clUnbilledAmt) {
        this.clUnbilledAmt = clUnbilledAmt;
    }

    public Character getClCustReinstated() {
        return clCustReinstated;
    }

    public void setClCustReinstated(Character clCustReinstated) {
        this.clCustReinstated = clCustReinstated;
    }

    public Character getClCustOvrLmt() {
        return clCustOvrLmt;
    }

    public void setClCustOvrLmt(Character clCustOvrLmt) {
        this.clCustOvrLmt = clCustOvrLmt;
    }

    public Character getClInstantCrNotifyFl() {
        return clInstantCrNotifyFl;
    }

    public void setClInstantCrNotifyFl(Character clInstantCrNotifyFl) {
        this.clInstantCrNotifyFl = clInstantCrNotifyFl;
    }

    public Character getClRlshpFlg() {
        return clRlshpFlg;
    }

    public void setClRlshpFlg(Character clRlshpFlg) {
        this.clRlshpFlg = clRlshpFlg;
    }

    public String getClDpstSrceCd() {
        return clDpstSrceCd;
    }

    public void setClDpstSrceCd(String clDpstSrceCd) {
        this.clDpstSrceCd = clDpstSrceCd;
    }

    public Date getClCurDyXmitDt() {
        return clCurDyXmitDt;
    }

    public void setClCurDyXmitDt(Date clCurDyXmitDt) {
        this.clCurDyXmitDt = clCurDyXmitDt;
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

    public BigDecimal getClCurDyTmpAmt() {
        return clCurDyTmpAmt;
    }

    public void setClCurDyTmpAmt(BigDecimal clCurDyTmpAmt) {
        this.clCurDyTmpAmt = clCurDyTmpAmt;
    }

    public BigDecimal getClOtbLmtAmt() {
        return clOtbLmtAmt;
    }

    public void setClOtbLmtAmt(BigDecimal clOtbLmtAmt) {
        this.clOtbLmtAmt = clOtbLmtAmt;
    }

    public BigDecimal getClOtbUsedAmt() {
        return clOtbUsedAmt;
    }

    public void setClOtbUsedAmt(BigDecimal clOtbUsedAmt) {
        this.clOtbUsedAmt = clOtbUsedAmt;
    }

    public BigDecimal getClOtbHoldAmt() {
        return clOtbHoldAmt;
    }

    public void setClOtbHoldAmt(BigDecimal clOtbHoldAmt) {
        this.clOtbHoldAmt = clOtbHoldAmt;
    }

    public Date getClOtbLstUpdDt() {
        return clOtbLstUpdDt;
    }

    public void setClOtbLstUpdDt(Date clOtbLstUpdDt) {
        this.clOtbLstUpdDt = clOtbLstUpdDt;
    }

    public Date getClCurDyTmpExpDt() {
        return clCurDyTmpExpDt;
    }

    public void setClCurDyTmpExpDt(Date clCurDyTmpExpDt) {
        this.clCurDyTmpExpDt = clCurDyTmpExpDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clCoCd != null ? clCoCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrLmts)) {
            return false;
        }
        CrLmts other = (CrLmts) object;
        if ((this.clCoCd == null && other.clCoCd != null) || (this.clCoCd != null && !this.clCoCd.equals(other.clCoCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrLmts[ clCoCd=" + clCoCd + " ]";
    }

}
