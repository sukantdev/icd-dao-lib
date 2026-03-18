package com.corpay.dao.cxxcow;

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
@Table(name = "PRICING_XTN_WRK_DTL", catalog = "", schema = "CXXCOW")
public class PricingXtnWrkDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PricingXtnWrkDtlPK pricingXtnWrkDtlPK;
    @Basic(optional = false)
    @Column(name = "XWD_SEQ_NBR")
    private int xwdSeqNbr;
    @Basic(optional = false)
    @Column(name = "XWD_XD_LI_PRD_CD")
    private short xwdXdLiPrdCd;

    @Basic(optional = false)
    @Column(name = "XWD_XD_LI_QTY")
    private BigDecimal xwdXdLiQty;
    @Basic(optional = false)
    @Column(name = "XWD_XD_LI_PPU")
    private BigDecimal xwdXdLiPpu;
    @Basic(optional = false)
    @Column(name = "XWD_XD_LI_COST")
    private BigDecimal xwdXdLiCost;
    @Basic(optional = false)
    @Column(name = "XWD_XD_LI_CR_DB_IND")
    private Character xwdXdLiCrDbInd;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_IND")
    private Character xwdSvcDiscInd;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_PRIORITY")
    private short xwdSvcDiscPriority;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_GRP_ID")
    private int xwdSvcDiscGrpId;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_GRP_DESC")
    private String xwdSvcDiscGrpDesc;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_RM_TYPE")
    private Character xwdSvcDiscRmType;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_RM_FROM_VAL")
    private BigDecimal xwdSvcDiscRmFromVal;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_RM_TO_VAL")
    private BigDecimal xwdSvcDiscRmToVal;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_RT")
    private BigDecimal xwdSvcDiscRt;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_RT_TYPE")
    private Character xwdSvcDiscRtType;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_AMT")
    private BigDecimal xwdSvcDiscAmt;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_MKTR_ID")
    private String xwdSvcDiscMktrId;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_MKTR_NM")
    private String xwdSvcDiscMktrNm;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DISC_MKTR_BLNG_ID")
    private String xwdSvcDiscMktrBlngId;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_IND")
    private Character xwdSvcRebInd;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_PRIORITY")
    private short xwdSvcRebPriority;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_GRP_ID")
    private int xwdSvcRebGrpId;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_GRP_DESC")
    private String xwdSvcRebGrpDesc;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_RM_TYPE")
    private Character xwdSvcRebRmType;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_RM_FROM_VAL")
    private BigDecimal xwdSvcRebRmFromVal;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_RM_TO_VAL")
    private BigDecimal xwdSvcRebRmToVal;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_RT")
    private BigDecimal xwdSvcRebRt;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_RT_TYPE")
    private Character xwdSvcRebRtType;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_AMT")
    private BigDecimal xwdSvcRebAmt;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_MKTR_ID")
    private String xwdSvcRebMktrId;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_MKTR_NM")
    private String xwdSvcRebMktrNm;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_REB_MKTR_BLNG_ID")
    private String xwdSvcRebMktrBlngId;
    @Basic(optional = false)
    @Column(name = "XWD_SVC_DIFF_FND_IND")
    private Character xwdSvcDiffFndInd;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_IND")
    private Character xwdCdnDiscInd;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_PRIORITY")
    private short xwdCdnDiscPriority;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_GRP_ID")
    private int xwdCdnDiscGrpId;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_GRP_DESC")
    private String xwdCdnDiscGrpDesc;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_RM_TYPE")
    private Character xwdCdnDiscRmType;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_RM_FROM_VAL")
    private BigDecimal xwdCdnDiscRmFromVal;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_RM_TO_VAL")
    private BigDecimal xwdCdnDiscRmToVal;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_RT")
    private BigDecimal xwdCdnDiscRt;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_RT_TYPE")
    private Character xwdCdnDiscRtType;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_AMT")
    private BigDecimal xwdCdnDiscAmt;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_MKTR_ID")
    private String xwdCdnDiscMktrId;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_MKTR_NM")
    private String xwdCdnDiscMktrNm;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_DISC_MKTR_BLNG_ID")
    private String xwdCdnDiscMktrBlngId;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_IND")
    private Character xwdCdnRebInd;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_PRIORITY")
    private short xwdCdnRebPriority;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_GRP_ID")
    private int xwdCdnRebGrpId;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_GRP_DESC")
    private String xwdCdnRebGrpDesc;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_RM_TYPE")
    private Character xwdCdnRebRmType;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_RM_FROM_VAL")
    private BigDecimal xwdCdnRebRmFromVal;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_RM_TO_VAL")
    private BigDecimal xwdCdnRebRmToVal;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_RT")
    private BigDecimal xwdCdnRebRt;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_RT_TYPE")
    private Character xwdCdnRebRtType;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_AMT")
    private BigDecimal xwdCdnRebAmt;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_MKTR_ID")
    private String xwdCdnRebMktrId;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_MKTR_NM")
    private String xwdCdnRebMktrNm;
    @Basic(optional = false)
    @Column(name = "XWD_CDN_REB_MKTR_BLNG_ID")
    private String xwdCdnRebMktrBlngId;
    @Basic(optional = false)
    @Column(name = "XWD_XD_LI_MIGR_TYPE")
    private Character xwdXdLiMigrType;
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

    public PricingXtnWrkDtl() {
    }

    public PricingXtnWrkDtl(PricingXtnWrkDtlPK pricingXtnWrkDtlPK) {
        this.pricingXtnWrkDtlPK = pricingXtnWrkDtlPK;
    }

    public PricingXtnWrkDtl(PricingXtnWrkDtlPK pricingXtnWrkDtlPK, int xwdSeqNbr, short xwdXdLiPrdCd, BigDecimal xwdXdLiQty, BigDecimal xwdXdLiPpu, BigDecimal xwdXdLiCost, Character xwdXdLiCrDbInd, Character xwdSvcDiscInd, short xwdSvcDiscPriority, int xwdSvcDiscGrpId, String xwdSvcDiscGrpDesc, Character xwdSvcDiscRmType, BigDecimal xwdSvcDiscRmFromVal, BigDecimal xwdSvcDiscRmToVal, BigDecimal xwdSvcDiscRt, Character xwdSvcDiscRtType, BigDecimal xwdSvcDiscAmt, String xwdSvcDiscMktrId, String xwdSvcDiscMktrNm, String xwdSvcDiscMktrBlngId, Character xwdSvcRebInd, short xwdSvcRebPriority, int xwdSvcRebGrpId, String xwdSvcRebGrpDesc, Character xwdSvcRebRmType, BigDecimal xwdSvcRebRmFromVal, BigDecimal xwdSvcRebRmToVal, BigDecimal xwdSvcRebRt, Character xwdSvcRebRtType, BigDecimal xwdSvcRebAmt, String xwdSvcRebMktrId, String xwdSvcRebMktrNm, String xwdSvcRebMktrBlngId, Character xwdSvcDiffFndInd, Character xwdCdnDiscInd, short xwdCdnDiscPriority, int xwdCdnDiscGrpId, String xwdCdnDiscGrpDesc, Character xwdCdnDiscRmType, BigDecimal xwdCdnDiscRmFromVal, BigDecimal xwdCdnDiscRmToVal, BigDecimal xwdCdnDiscRt, Character xwdCdnDiscRtType, BigDecimal xwdCdnDiscAmt, String xwdCdnDiscMktrId, String xwdCdnDiscMktrNm, String xwdCdnDiscMktrBlngId, Character xwdCdnRebInd, short xwdCdnRebPriority, int xwdCdnRebGrpId, String xwdCdnRebGrpDesc, Character xwdCdnRebRmType, BigDecimal xwdCdnRebRmFromVal, BigDecimal xwdCdnRebRmToVal, BigDecimal xwdCdnRebRt, Character xwdCdnRebRtType, BigDecimal xwdCdnRebAmt, String xwdCdnRebMktrId, String xwdCdnRebMktrNm, String xwdCdnRebMktrBlngId, Character xwdXdLiMigrType, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.pricingXtnWrkDtlPK = pricingXtnWrkDtlPK;
        this.xwdSeqNbr = xwdSeqNbr;
        this.xwdXdLiPrdCd = xwdXdLiPrdCd;
        this.xwdXdLiQty = xwdXdLiQty;
        this.xwdXdLiPpu = xwdXdLiPpu;
        this.xwdXdLiCost = xwdXdLiCost;
        this.xwdXdLiCrDbInd = xwdXdLiCrDbInd;
        this.xwdSvcDiscInd = xwdSvcDiscInd;
        this.xwdSvcDiscPriority = xwdSvcDiscPriority;
        this.xwdSvcDiscGrpId = xwdSvcDiscGrpId;
        this.xwdSvcDiscGrpDesc = xwdSvcDiscGrpDesc;
        this.xwdSvcDiscRmType = xwdSvcDiscRmType;
        this.xwdSvcDiscRmFromVal = xwdSvcDiscRmFromVal;
        this.xwdSvcDiscRmToVal = xwdSvcDiscRmToVal;
        this.xwdSvcDiscRt = xwdSvcDiscRt;
        this.xwdSvcDiscRtType = xwdSvcDiscRtType;
        this.xwdSvcDiscAmt = xwdSvcDiscAmt;
        this.xwdSvcDiscMktrId = xwdSvcDiscMktrId;
        this.xwdSvcDiscMktrNm = xwdSvcDiscMktrNm;
        this.xwdSvcDiscMktrBlngId = xwdSvcDiscMktrBlngId;
        this.xwdSvcRebInd = xwdSvcRebInd;
        this.xwdSvcRebPriority = xwdSvcRebPriority;
        this.xwdSvcRebGrpId = xwdSvcRebGrpId;
        this.xwdSvcRebGrpDesc = xwdSvcRebGrpDesc;
        this.xwdSvcRebRmType = xwdSvcRebRmType;
        this.xwdSvcRebRmFromVal = xwdSvcRebRmFromVal;
        this.xwdSvcRebRmToVal = xwdSvcRebRmToVal;
        this.xwdSvcRebRt = xwdSvcRebRt;
        this.xwdSvcRebRtType = xwdSvcRebRtType;
        this.xwdSvcRebAmt = xwdSvcRebAmt;
        this.xwdSvcRebMktrId = xwdSvcRebMktrId;
        this.xwdSvcRebMktrNm = xwdSvcRebMktrNm;
        this.xwdSvcRebMktrBlngId = xwdSvcRebMktrBlngId;
        this.xwdSvcDiffFndInd = xwdSvcDiffFndInd;
        this.xwdCdnDiscInd = xwdCdnDiscInd;
        this.xwdCdnDiscPriority = xwdCdnDiscPriority;
        this.xwdCdnDiscGrpId = xwdCdnDiscGrpId;
        this.xwdCdnDiscGrpDesc = xwdCdnDiscGrpDesc;
        this.xwdCdnDiscRmType = xwdCdnDiscRmType;
        this.xwdCdnDiscRmFromVal = xwdCdnDiscRmFromVal;
        this.xwdCdnDiscRmToVal = xwdCdnDiscRmToVal;
        this.xwdCdnDiscRt = xwdCdnDiscRt;
        this.xwdCdnDiscRtType = xwdCdnDiscRtType;
        this.xwdCdnDiscAmt = xwdCdnDiscAmt;
        this.xwdCdnDiscMktrId = xwdCdnDiscMktrId;
        this.xwdCdnDiscMktrNm = xwdCdnDiscMktrNm;
        this.xwdCdnDiscMktrBlngId = xwdCdnDiscMktrBlngId;
        this.xwdCdnRebInd = xwdCdnRebInd;
        this.xwdCdnRebPriority = xwdCdnRebPriority;
        this.xwdCdnRebGrpId = xwdCdnRebGrpId;
        this.xwdCdnRebGrpDesc = xwdCdnRebGrpDesc;
        this.xwdCdnRebRmType = xwdCdnRebRmType;
        this.xwdCdnRebRmFromVal = xwdCdnRebRmFromVal;
        this.xwdCdnRebRmToVal = xwdCdnRebRmToVal;
        this.xwdCdnRebRt = xwdCdnRebRt;
        this.xwdCdnRebRtType = xwdCdnRebRtType;
        this.xwdCdnRebAmt = xwdCdnRebAmt;
        this.xwdCdnRebMktrId = xwdCdnRebMktrId;
        this.xwdCdnRebMktrNm = xwdCdnRebMktrNm;
        this.xwdCdnRebMktrBlngId = xwdCdnRebMktrBlngId;
        this.xwdXdLiMigrType = xwdXdLiMigrType;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PricingXtnWrkDtl(short xwdTiP105s1FileTy, int xwdTiP105s2FileRDt, long xwdTiP105s3ProcId, int xwdTiP105s4FileSeqNo, int xwdTiD71MsgNo, String xwdRecordType, int xwdRecordOccInd) {
        this.pricingXtnWrkDtlPK = new PricingXtnWrkDtlPK(xwdTiP105s1FileTy, xwdTiP105s2FileRDt, xwdTiP105s3ProcId, xwdTiP105s4FileSeqNo, xwdTiD71MsgNo, xwdRecordType, xwdRecordOccInd);
    }

    public PricingXtnWrkDtlPK getPricingXtnWrkDtlPK() {
        return pricingXtnWrkDtlPK;
    }

    public void setPricingXtnWrkDtlPK(PricingXtnWrkDtlPK pricingXtnWrkDtlPK) {
        this.pricingXtnWrkDtlPK = pricingXtnWrkDtlPK;
    }

    public int getXwdSeqNbr() {
        return xwdSeqNbr;
    }

    public void setXwdSeqNbr(int xwdSeqNbr) {
        this.xwdSeqNbr = xwdSeqNbr;
    }

    public short getXwdXdLiPrdCd() {
        return xwdXdLiPrdCd;
    }

    public void setXwdXdLiPrdCd(short xwdXdLiPrdCd) {
        this.xwdXdLiPrdCd = xwdXdLiPrdCd;
    }

    public BigDecimal getXwdXdLiQty() {
        return xwdXdLiQty;
    }

    public void setXwdXdLiQty(BigDecimal xwdXdLiQty) {
        this.xwdXdLiQty = xwdXdLiQty;
    }

    public BigDecimal getXwdXdLiPpu() {
        return xwdXdLiPpu;
    }

    public void setXwdXdLiPpu(BigDecimal xwdXdLiPpu) {
        this.xwdXdLiPpu = xwdXdLiPpu;
    }

    public BigDecimal getXwdXdLiCost() {
        return xwdXdLiCost;
    }

    public void setXwdXdLiCost(BigDecimal xwdXdLiCost) {
        this.xwdXdLiCost = xwdXdLiCost;
    }

    public Character getXwdXdLiCrDbInd() {
        return xwdXdLiCrDbInd;
    }

    public void setXwdXdLiCrDbInd(Character xwdXdLiCrDbInd) {
        this.xwdXdLiCrDbInd = xwdXdLiCrDbInd;
    }

    public Character getXwdSvcDiscInd() {
        return xwdSvcDiscInd;
    }

    public void setXwdSvcDiscInd(Character xwdSvcDiscInd) {
        this.xwdSvcDiscInd = xwdSvcDiscInd;
    }

    public short getXwdSvcDiscPriority() {
        return xwdSvcDiscPriority;
    }

    public void setXwdSvcDiscPriority(short xwdSvcDiscPriority) {
        this.xwdSvcDiscPriority = xwdSvcDiscPriority;
    }

    public int getXwdSvcDiscGrpId() {
        return xwdSvcDiscGrpId;
    }

    public void setXwdSvcDiscGrpId(int xwdSvcDiscGrpId) {
        this.xwdSvcDiscGrpId = xwdSvcDiscGrpId;
    }

    public String getXwdSvcDiscGrpDesc() {
        return xwdSvcDiscGrpDesc;
    }

    public void setXwdSvcDiscGrpDesc(String xwdSvcDiscGrpDesc) {
        this.xwdSvcDiscGrpDesc = xwdSvcDiscGrpDesc;
    }

    public Character getXwdSvcDiscRmType() {
        return xwdSvcDiscRmType;
    }

    public void setXwdSvcDiscRmType(Character xwdSvcDiscRmType) {
        this.xwdSvcDiscRmType = xwdSvcDiscRmType;
    }

    public BigDecimal getXwdSvcDiscRmFromVal() {
        return xwdSvcDiscRmFromVal;
    }

    public void setXwdSvcDiscRmFromVal(BigDecimal xwdSvcDiscRmFromVal) {
        this.xwdSvcDiscRmFromVal = xwdSvcDiscRmFromVal;
    }

    public BigDecimal getXwdSvcDiscRmToVal() {
        return xwdSvcDiscRmToVal;
    }

    public void setXwdSvcDiscRmToVal(BigDecimal xwdSvcDiscRmToVal) {
        this.xwdSvcDiscRmToVal = xwdSvcDiscRmToVal;
    }

    public BigDecimal getXwdSvcDiscRt() {
        return xwdSvcDiscRt;
    }

    public void setXwdSvcDiscRt(BigDecimal xwdSvcDiscRt) {
        this.xwdSvcDiscRt = xwdSvcDiscRt;
    }

    public Character getXwdSvcDiscRtType() {
        return xwdSvcDiscRtType;
    }

    public void setXwdSvcDiscRtType(Character xwdSvcDiscRtType) {
        this.xwdSvcDiscRtType = xwdSvcDiscRtType;
    }

    public BigDecimal getXwdSvcDiscAmt() {
        return xwdSvcDiscAmt;
    }

    public void setXwdSvcDiscAmt(BigDecimal xwdSvcDiscAmt) {
        this.xwdSvcDiscAmt = xwdSvcDiscAmt;
    }

    public String getXwdSvcDiscMktrId() {
        return xwdSvcDiscMktrId;
    }

    public void setXwdSvcDiscMktrId(String xwdSvcDiscMktrId) {
        this.xwdSvcDiscMktrId = xwdSvcDiscMktrId;
    }

    public String getXwdSvcDiscMktrNm() {
        return xwdSvcDiscMktrNm;
    }

    public void setXwdSvcDiscMktrNm(String xwdSvcDiscMktrNm) {
        this.xwdSvcDiscMktrNm = xwdSvcDiscMktrNm;
    }

    public String getXwdSvcDiscMktrBlngId() {
        return xwdSvcDiscMktrBlngId;
    }

    public void setXwdSvcDiscMktrBlngId(String xwdSvcDiscMktrBlngId) {
        this.xwdSvcDiscMktrBlngId = xwdSvcDiscMktrBlngId;
    }

    public Character getXwdSvcRebInd() {
        return xwdSvcRebInd;
    }

    public void setXwdSvcRebInd(Character xwdSvcRebInd) {
        this.xwdSvcRebInd = xwdSvcRebInd;
    }

    public short getXwdSvcRebPriority() {
        return xwdSvcRebPriority;
    }

    public void setXwdSvcRebPriority(short xwdSvcRebPriority) {
        this.xwdSvcRebPriority = xwdSvcRebPriority;
    }

    public int getXwdSvcRebGrpId() {
        return xwdSvcRebGrpId;
    }

    public void setXwdSvcRebGrpId(int xwdSvcRebGrpId) {
        this.xwdSvcRebGrpId = xwdSvcRebGrpId;
    }

    public String getXwdSvcRebGrpDesc() {
        return xwdSvcRebGrpDesc;
    }

    public void setXwdSvcRebGrpDesc(String xwdSvcRebGrpDesc) {
        this.xwdSvcRebGrpDesc = xwdSvcRebGrpDesc;
    }

    public Character getXwdSvcRebRmType() {
        return xwdSvcRebRmType;
    }

    public void setXwdSvcRebRmType(Character xwdSvcRebRmType) {
        this.xwdSvcRebRmType = xwdSvcRebRmType;
    }

    public BigDecimal getXwdSvcRebRmFromVal() {
        return xwdSvcRebRmFromVal;
    }

    public void setXwdSvcRebRmFromVal(BigDecimal xwdSvcRebRmFromVal) {
        this.xwdSvcRebRmFromVal = xwdSvcRebRmFromVal;
    }

    public BigDecimal getXwdSvcRebRmToVal() {
        return xwdSvcRebRmToVal;
    }

    public void setXwdSvcRebRmToVal(BigDecimal xwdSvcRebRmToVal) {
        this.xwdSvcRebRmToVal = xwdSvcRebRmToVal;
    }

    public BigDecimal getXwdSvcRebRt() {
        return xwdSvcRebRt;
    }

    public void setXwdSvcRebRt(BigDecimal xwdSvcRebRt) {
        this.xwdSvcRebRt = xwdSvcRebRt;
    }

    public Character getXwdSvcRebRtType() {
        return xwdSvcRebRtType;
    }

    public void setXwdSvcRebRtType(Character xwdSvcRebRtType) {
        this.xwdSvcRebRtType = xwdSvcRebRtType;
    }

    public BigDecimal getXwdSvcRebAmt() {
        return xwdSvcRebAmt;
    }

    public void setXwdSvcRebAmt(BigDecimal xwdSvcRebAmt) {
        this.xwdSvcRebAmt = xwdSvcRebAmt;
    }

    public String getXwdSvcRebMktrId() {
        return xwdSvcRebMktrId;
    }

    public void setXwdSvcRebMktrId(String xwdSvcRebMktrId) {
        this.xwdSvcRebMktrId = xwdSvcRebMktrId;
    }

    public String getXwdSvcRebMktrNm() {
        return xwdSvcRebMktrNm;
    }

    public void setXwdSvcRebMktrNm(String xwdSvcRebMktrNm) {
        this.xwdSvcRebMktrNm = xwdSvcRebMktrNm;
    }

    public String getXwdSvcRebMktrBlngId() {
        return xwdSvcRebMktrBlngId;
    }

    public void setXwdSvcRebMktrBlngId(String xwdSvcRebMktrBlngId) {
        this.xwdSvcRebMktrBlngId = xwdSvcRebMktrBlngId;
    }

    public Character getXwdSvcDiffFndInd() {
        return xwdSvcDiffFndInd;
    }

    public void setXwdSvcDiffFndInd(Character xwdSvcDiffFndInd) {
        this.xwdSvcDiffFndInd = xwdSvcDiffFndInd;
    }

    public Character getXwdCdnDiscInd() {
        return xwdCdnDiscInd;
    }

    public void setXwdCdnDiscInd(Character xwdCdnDiscInd) {
        this.xwdCdnDiscInd = xwdCdnDiscInd;
    }

    public short getXwdCdnDiscPriority() {
        return xwdCdnDiscPriority;
    }

    public void setXwdCdnDiscPriority(short xwdCdnDiscPriority) {
        this.xwdCdnDiscPriority = xwdCdnDiscPriority;
    }

    public int getXwdCdnDiscGrpId() {
        return xwdCdnDiscGrpId;
    }

    public void setXwdCdnDiscGrpId(int xwdCdnDiscGrpId) {
        this.xwdCdnDiscGrpId = xwdCdnDiscGrpId;
    }

    public String getXwdCdnDiscGrpDesc() {
        return xwdCdnDiscGrpDesc;
    }

    public void setXwdCdnDiscGrpDesc(String xwdCdnDiscGrpDesc) {
        this.xwdCdnDiscGrpDesc = xwdCdnDiscGrpDesc;
    }

    public Character getXwdCdnDiscRmType() {
        return xwdCdnDiscRmType;
    }

    public void setXwdCdnDiscRmType(Character xwdCdnDiscRmType) {
        this.xwdCdnDiscRmType = xwdCdnDiscRmType;
    }

    public BigDecimal getXwdCdnDiscRmFromVal() {
        return xwdCdnDiscRmFromVal;
    }

    public void setXwdCdnDiscRmFromVal(BigDecimal xwdCdnDiscRmFromVal) {
        this.xwdCdnDiscRmFromVal = xwdCdnDiscRmFromVal;
    }

    public BigDecimal getXwdCdnDiscRmToVal() {
        return xwdCdnDiscRmToVal;
    }

    public void setXwdCdnDiscRmToVal(BigDecimal xwdCdnDiscRmToVal) {
        this.xwdCdnDiscRmToVal = xwdCdnDiscRmToVal;
    }

    public BigDecimal getXwdCdnDiscRt() {
        return xwdCdnDiscRt;
    }

    public void setXwdCdnDiscRt(BigDecimal xwdCdnDiscRt) {
        this.xwdCdnDiscRt = xwdCdnDiscRt;
    }

    public Character getXwdCdnDiscRtType() {
        return xwdCdnDiscRtType;
    }

    public void setXwdCdnDiscRtType(Character xwdCdnDiscRtType) {
        this.xwdCdnDiscRtType = xwdCdnDiscRtType;
    }

    public BigDecimal getXwdCdnDiscAmt() {
        return xwdCdnDiscAmt;
    }

    public void setXwdCdnDiscAmt(BigDecimal xwdCdnDiscAmt) {
        this.xwdCdnDiscAmt = xwdCdnDiscAmt;
    }

    public String getXwdCdnDiscMktrId() {
        return xwdCdnDiscMktrId;
    }

    public void setXwdCdnDiscMktrId(String xwdCdnDiscMktrId) {
        this.xwdCdnDiscMktrId = xwdCdnDiscMktrId;
    }

    public String getXwdCdnDiscMktrNm() {
        return xwdCdnDiscMktrNm;
    }

    public void setXwdCdnDiscMktrNm(String xwdCdnDiscMktrNm) {
        this.xwdCdnDiscMktrNm = xwdCdnDiscMktrNm;
    }

    public String getXwdCdnDiscMktrBlngId() {
        return xwdCdnDiscMktrBlngId;
    }

    public void setXwdCdnDiscMktrBlngId(String xwdCdnDiscMktrBlngId) {
        this.xwdCdnDiscMktrBlngId = xwdCdnDiscMktrBlngId;
    }

    public Character getXwdCdnRebInd() {
        return xwdCdnRebInd;
    }

    public void setXwdCdnRebInd(Character xwdCdnRebInd) {
        this.xwdCdnRebInd = xwdCdnRebInd;
    }

    public short getXwdCdnRebPriority() {
        return xwdCdnRebPriority;
    }

    public void setXwdCdnRebPriority(short xwdCdnRebPriority) {
        this.xwdCdnRebPriority = xwdCdnRebPriority;
    }

    public int getXwdCdnRebGrpId() {
        return xwdCdnRebGrpId;
    }

    public void setXwdCdnRebGrpId(int xwdCdnRebGrpId) {
        this.xwdCdnRebGrpId = xwdCdnRebGrpId;
    }

    public String getXwdCdnRebGrpDesc() {
        return xwdCdnRebGrpDesc;
    }

    public void setXwdCdnRebGrpDesc(String xwdCdnRebGrpDesc) {
        this.xwdCdnRebGrpDesc = xwdCdnRebGrpDesc;
    }

    public Character getXwdCdnRebRmType() {
        return xwdCdnRebRmType;
    }

    public void setXwdCdnRebRmType(Character xwdCdnRebRmType) {
        this.xwdCdnRebRmType = xwdCdnRebRmType;
    }

    public BigDecimal getXwdCdnRebRmFromVal() {
        return xwdCdnRebRmFromVal;
    }

    public void setXwdCdnRebRmFromVal(BigDecimal xwdCdnRebRmFromVal) {
        this.xwdCdnRebRmFromVal = xwdCdnRebRmFromVal;
    }

    public BigDecimal getXwdCdnRebRmToVal() {
        return xwdCdnRebRmToVal;
    }

    public void setXwdCdnRebRmToVal(BigDecimal xwdCdnRebRmToVal) {
        this.xwdCdnRebRmToVal = xwdCdnRebRmToVal;
    }

    public BigDecimal getXwdCdnRebRt() {
        return xwdCdnRebRt;
    }

    public void setXwdCdnRebRt(BigDecimal xwdCdnRebRt) {
        this.xwdCdnRebRt = xwdCdnRebRt;
    }

    public Character getXwdCdnRebRtType() {
        return xwdCdnRebRtType;
    }

    public void setXwdCdnRebRtType(Character xwdCdnRebRtType) {
        this.xwdCdnRebRtType = xwdCdnRebRtType;
    }

    public BigDecimal getXwdCdnRebAmt() {
        return xwdCdnRebAmt;
    }

    public void setXwdCdnRebAmt(BigDecimal xwdCdnRebAmt) {
        this.xwdCdnRebAmt = xwdCdnRebAmt;
    }

    public String getXwdCdnRebMktrId() {
        return xwdCdnRebMktrId;
    }

    public void setXwdCdnRebMktrId(String xwdCdnRebMktrId) {
        this.xwdCdnRebMktrId = xwdCdnRebMktrId;
    }

    public String getXwdCdnRebMktrNm() {
        return xwdCdnRebMktrNm;
    }

    public void setXwdCdnRebMktrNm(String xwdCdnRebMktrNm) {
        this.xwdCdnRebMktrNm = xwdCdnRebMktrNm;
    }

    public String getXwdCdnRebMktrBlngId() {
        return xwdCdnRebMktrBlngId;
    }

    public void setXwdCdnRebMktrBlngId(String xwdCdnRebMktrBlngId) {
        this.xwdCdnRebMktrBlngId = xwdCdnRebMktrBlngId;
    }

    public Character getXwdXdLiMigrType() {
        return xwdXdLiMigrType;
    }

    public void setXwdXdLiMigrType(Character xwdXdLiMigrType) {
        this.xwdXdLiMigrType = xwdXdLiMigrType;
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
        hash += (pricingXtnWrkDtlPK != null ? pricingXtnWrkDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PricingXtnWrkDtl)) {
            return false;
        }
        PricingXtnWrkDtl other = (PricingXtnWrkDtl) object;
        if ((this.pricingXtnWrkDtlPK == null && other.pricingXtnWrkDtlPK != null) || (this.pricingXtnWrkDtlPK != null && !this.pricingXtnWrkDtlPK.equals(other.pricingXtnWrkDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PricingXtnWrkDtl[ pricingXtnWrkDtlPK=" + pricingXtnWrkDtlPK + " ]";
    }

}
