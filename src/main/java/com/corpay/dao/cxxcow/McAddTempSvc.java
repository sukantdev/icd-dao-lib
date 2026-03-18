package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_ADD_TEMP_SVC", catalog = "", schema = "CXXCOW")
public class McAddTempSvc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddTempSvcPK mcAddTempSvcPK;
    @Basic(optional = false)
    @Column(name = "MSG_TY_ID")
    private short msgTyId;
    @Basic(optional = false)
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Basic(optional = false)
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Basic(optional = false)
    @Column(name = "D24_FUNC_CD")
    private short d24FuncCd;
    @Basic(optional = false)
    @Column(name = "D32_ACQ_INST_ID_CD")
    private long d32AcqInstIdCd;
    @Basic(optional = false)
    @Column(name = "D33_FWDNG_INST_CD")
    private long d33FwdngInstCd;
    @Basic(optional = false)
    @Column(name = "P191_OR_MSG_FMT")
    private short p191OrMsgFmt;
    @Basic(optional = false)
    @Column(name = "P501S1_USAGE_CD")
    private short p501s1UsageCd;
    @Basic(optional = false)
    @Column(name = "P501S2_INDSTY_REC")
    private short p501s2IndstyRec;
    @Basic(optional = false)
    @Column(name = "P501S3_OCC_IND")
    private short p501s3OccInd;
    @Basic(optional = false)
    @Column(name = "P501S4_MSG_NO")
    private int p501s4MsgNo;
    @Basic(optional = false)
    @Column(name = "P508_CUST_CD")
    private String p508CustCd;

    @Basic(optional = false)
    @Column(name = "P597S1_TTX_AMT")
    private BigDecimal p597s1TtxAmt;
    @Basic(optional = false)
    @Column(name = "P597S2_TTX_AMT_EXP")
    private short p597s2TtxAmtExp;
    @Basic(optional = false)
    @Column(name = "P597S3_TTX_AMT_SIG")
    private Character p597s3TtxAmtSig;
    @Basic(optional = false)
    @Column(name = "P598_TAX_CLTN_IND")
    private Character p598TaxCltnInd;
    @Basic(optional = false)
    @Column(name = "P679_COMMODITY")
    private String p679Commodity;
    @Basic(optional = false)
    @Column(name = "P686_TAX_EXEMPT")
    private Character p686TaxExempt;
    @Basic(optional = false)
    @Column(name = "P718_EMP_TMP_NME")
    private String p718EmpTmpNme;
    @Basic(optional = false)
    @Column(name = "P719_EMP_SSNR")
    private String p719EmpSsnr;
    @Basic(optional = false)
    @Column(name = "P720_JOB_DESC")
    private String p720JobDesc;
    @Basic(optional = false)
    @Column(name = "P721_JOB_CD")
    private String p721JobCd;
    @Basic(optional = false)
    @Column(name = "P722_FLT_RTE_IND")
    private Character p722FltRteInd;
    @Basic(optional = false)
    @Column(name = "P723S1_RG_HR_WRK")
    private BigDecimal p723s1RgHrWrk;
    @Basic(optional = false)
    @Column(name = "P723S2_RG_HR_WR_EX")
    private Character p723s2RgHrWrEx;
    @Basic(optional = false)
    @Column(name = "P724S1_RG_HR_RT")
    private BigDecimal p724s1RgHrRt;
    @Basic(optional = false)
    @Column(name = "P724S2_RG_HR_RT_EX")
    private Character p724s2RgHrRtEx;
    @Basic(optional = false)
    @Column(name = "P725S1_OT_HRS_WRK")
    private BigDecimal p725s1OtHrsWrk;
    @Basic(optional = false)
    @Column(name = "P725S2_OT_HRS_EXP")
    private Character p725s2OtHrsExp;
    @Basic(optional = false)
    @Column(name = "P726S1_OT_HRS_RT")
    private BigDecimal p726s1OtHrsRt;
    @Basic(optional = false)
    @Column(name = "P726S2_OT_HRS_EXP")
    private Character p726s2OtHrsExp;
    @Basic(optional = false)
    @Column(name = "P727_TMP_STA_DT")
    private int p727TmpStaDt;
    @Basic(optional = false)
    @Column(name = "P728_TMP_WK_END")
    private int p728TmpWkEnd;
    @Basic(optional = false)
    @Column(name = "P729_REQ_NME_ID")
    private String p729ReqNmeId;
    @Basic(optional = false)
    @Column(name = "P730_RPT_TO")
    private String p730RptTo;
    @Basic(optional = false)
    @Column(name = "P731_TM_SHT_NR")
    private String p731TmShtNr;
    @Basic(optional = false)
    @Column(name = "P732S1_DISC_AMT")
    private BigDecimal p732s1DiscAmt;
    @Basic(optional = false)
    @Column(name = "P732S2_DISC_AMT_EX")
    private short p732s2DiscAmtEx;
    @Basic(optional = false)
    @Column(name = "P732S3_DISC_AMT_SI")
    private Character p732s3DiscAmtSi;
    @Basic(optional = false)
    @Column(name = "P732S4_DISC_TP")
    private String p732s4DiscTp;
    @Basic(optional = false)
    @Column(name = "P733S1_SBTL_AM")
    private BigDecimal p733s1SbtlAm;
    @Basic(optional = false)
    @Column(name = "P733S2_SBTL_AMT_EX")
    private short p733s2SbtlAmtEx;
    @Basic(optional = false)
    @Column(name = "P733S3_SBTL_AMT_SG")
    private Character p733s3SbtlAmtSg;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_TS")
    private String taxAmtTs;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_682_IND")
    private Character taxAmt682Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_683_IND")
    private Character taxAmt683Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_684_IND")
    private Character taxAmt684Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_751_IND")
    private Character taxAmt751Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_752_IND")
    private Character taxAmt752Ind;
    @Basic(optional = false)
    @Column(name = "TAX_AMT_753_IND")
    private Character taxAmt753Ind;
    @Basic(optional = false)
    @Column(name = "D63S1_LFCYC_SP_IND")
    private Character d63s1LfcycSpInd;
    @Basic(optional = false)
    @Column(name = "D63S2_TRACE_ID")
    private String d63s2TraceId;
    @Basic(optional = false)
    @Column(name = "D63S3_VALIDN_CD")
    private String d63s3ValidnCd;
    @Basic(optional = false)
    @Column(name = "D63S4_LFCYCTR_SEQ")
    private String d63s4LfcyctrSeq;
    @Basic(optional = false)
    @Column(name = "D63S5_LFCYCTR_TOT")
    private String d63s5LfcyctrTot;
    @Basic(optional = false)
    @Column(name = "D93_TR_DEST_INST")
    private long d93TrDestInst;
    @Basic(optional = false)
    @Column(name = "D94_TR_ORG_INST")
    private long d94TrOrgInst;
    @Basic(optional = false)
    @Column(name = "D100_RECV_INST_ID")
    private long d100RecvInstId;
    @Basic(optional = false)
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Basic(optional = false)
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Basic(optional = false)
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Basic(optional = false)
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Basic(optional = false)
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;
    @Basic(optional = false)
    @Column(name = "A597S1_TTX_AMT")
    private BigDecimal a597s1TtxAmt;
    @Basic(optional = false)
    @Column(name = "A733S1_SBTL_AMT")
    private BigDecimal a733s1SbtlAmt;

    public McAddTempSvc() {
    }

    public McAddTempSvc(McAddTempSvcPK mcAddTempSvcPK) {
        this.mcAddTempSvcPK = mcAddTempSvcPK;
    }

    public McAddTempSvc(McAddTempSvcPK mcAddTempSvcPK, short msgTyId, String bitMapPri, String d1BitMapSec, short d24FuncCd, long d32AcqInstIdCd, long d33FwdngInstCd, short p191OrMsgFmt, short p501s1UsageCd, short p501s2IndstyRec, short p501s3OccInd, int p501s4MsgNo, String p508CustCd, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, Character p598TaxCltnInd, String p679Commodity, Character p686TaxExempt, String p718EmpTmpNme, String p719EmpSsnr, String p720JobDesc, String p721JobCd, Character p722FltRteInd, BigDecimal p723s1RgHrWrk, Character p723s2RgHrWrEx, BigDecimal p724s1RgHrRt, Character p724s2RgHrRtEx, BigDecimal p725s1OtHrsWrk, Character p725s2OtHrsExp, BigDecimal p726s1OtHrsRt, Character p726s2OtHrsExp, int p727TmpStaDt, int p728TmpWkEnd, String p729ReqNmeId, String p730RptTo, String p731TmShtNr, BigDecimal p732s1DiscAmt, short p732s2DiscAmtEx, Character p732s3DiscAmtSi, String p732s4DiscTp, BigDecimal p733s1SbtlAm, short p733s2SbtlAmtEx, Character p733s3SbtlAmtSg, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, Character d63s1LfcycSpInd, String d63s2TraceId, String d63s3ValidnCd, String d63s4LfcyctrSeq, String d63s5LfcyctrTot, long d93TrDestInst, long d94TrOrgInst, long d100RecvInstId, String d48AddtlDat, String d62AddtlData2, String d123AddtlDat3, String d124AddtlDat4, String d125AddtlDat5, BigDecimal a597s1TtxAmt, BigDecimal a733s1SbtlAmt) {
        this.mcAddTempSvcPK = mcAddTempSvcPK;
        this.msgTyId = msgTyId;
        this.bitMapPri = bitMapPri;
        this.d1BitMapSec = d1BitMapSec;
        this.d24FuncCd = d24FuncCd;
        this.d32AcqInstIdCd = d32AcqInstIdCd;
        this.d33FwdngInstCd = d33FwdngInstCd;
        this.p191OrMsgFmt = p191OrMsgFmt;
        this.p501s1UsageCd = p501s1UsageCd;
        this.p501s2IndstyRec = p501s2IndstyRec;
        this.p501s3OccInd = p501s3OccInd;
        this.p501s4MsgNo = p501s4MsgNo;
        this.p508CustCd = p508CustCd;
        this.p597s1TtxAmt = p597s1TtxAmt;
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
        this.p598TaxCltnInd = p598TaxCltnInd;
        this.p679Commodity = p679Commodity;
        this.p686TaxExempt = p686TaxExempt;
        this.p718EmpTmpNme = p718EmpTmpNme;
        this.p719EmpSsnr = p719EmpSsnr;
        this.p720JobDesc = p720JobDesc;
        this.p721JobCd = p721JobCd;
        this.p722FltRteInd = p722FltRteInd;
        this.p723s1RgHrWrk = p723s1RgHrWrk;
        this.p723s2RgHrWrEx = p723s2RgHrWrEx;
        this.p724s1RgHrRt = p724s1RgHrRt;
        this.p724s2RgHrRtEx = p724s2RgHrRtEx;
        this.p725s1OtHrsWrk = p725s1OtHrsWrk;
        this.p725s2OtHrsExp = p725s2OtHrsExp;
        this.p726s1OtHrsRt = p726s1OtHrsRt;
        this.p726s2OtHrsExp = p726s2OtHrsExp;
        this.p727TmpStaDt = p727TmpStaDt;
        this.p728TmpWkEnd = p728TmpWkEnd;
        this.p729ReqNmeId = p729ReqNmeId;
        this.p730RptTo = p730RptTo;
        this.p731TmShtNr = p731TmShtNr;
        this.p732s1DiscAmt = p732s1DiscAmt;
        this.p732s2DiscAmtEx = p732s2DiscAmtEx;
        this.p732s3DiscAmtSi = p732s3DiscAmtSi;
        this.p732s4DiscTp = p732s4DiscTp;
        this.p733s1SbtlAm = p733s1SbtlAm;
        this.p733s2SbtlAmtEx = p733s2SbtlAmtEx;
        this.p733s3SbtlAmtSg = p733s3SbtlAmtSg;
        this.taxAmtTs = taxAmtTs;
        this.taxAmt682Ind = taxAmt682Ind;
        this.taxAmt683Ind = taxAmt683Ind;
        this.taxAmt684Ind = taxAmt684Ind;
        this.taxAmt751Ind = taxAmt751Ind;
        this.taxAmt752Ind = taxAmt752Ind;
        this.taxAmt753Ind = taxAmt753Ind;
        this.d63s1LfcycSpInd = d63s1LfcycSpInd;
        this.d63s2TraceId = d63s2TraceId;
        this.d63s3ValidnCd = d63s3ValidnCd;
        this.d63s4LfcyctrSeq = d63s4LfcyctrSeq;
        this.d63s5LfcyctrTot = d63s5LfcyctrTot;
        this.d93TrDestInst = d93TrDestInst;
        this.d94TrOrgInst = d94TrOrgInst;
        this.d100RecvInstId = d100RecvInstId;
        this.d48AddtlDat = d48AddtlDat;
        this.d62AddtlData2 = d62AddtlData2;
        this.d123AddtlDat3 = d123AddtlDat3;
        this.d124AddtlDat4 = d124AddtlDat4;
        this.d125AddtlDat5 = d125AddtlDat5;
        this.a597s1TtxAmt = a597s1TtxAmt;
        this.a733s1SbtlAmt = a733s1SbtlAmt;
    }

    public McAddTempSvc(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcAddTempSvcPK = new McAddTempSvcPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McAddTempSvcPK getMcAddTempSvcPK() {
        return mcAddTempSvcPK;
    }

    public void setMcAddTempSvcPK(McAddTempSvcPK mcAddTempSvcPK) {
        this.mcAddTempSvcPK = mcAddTempSvcPK;
    }

    public short getMsgTyId() {
        return msgTyId;
    }

    public void setMsgTyId(short msgTyId) {
        this.msgTyId = msgTyId;
    }

    public String getBitMapPri() {
        return bitMapPri;
    }

    public void setBitMapPri(String bitMapPri) {
        this.bitMapPri = bitMapPri;
    }

    public String getD1BitMapSec() {
        return d1BitMapSec;
    }

    public void setD1BitMapSec(String d1BitMapSec) {
        this.d1BitMapSec = d1BitMapSec;
    }

    public short getD24FuncCd() {
        return d24FuncCd;
    }

    public void setD24FuncCd(short d24FuncCd) {
        this.d24FuncCd = d24FuncCd;
    }

    public long getD32AcqInstIdCd() {
        return d32AcqInstIdCd;
    }

    public void setD32AcqInstIdCd(long d32AcqInstIdCd) {
        this.d32AcqInstIdCd = d32AcqInstIdCd;
    }

    public long getD33FwdngInstCd() {
        return d33FwdngInstCd;
    }

    public void setD33FwdngInstCd(long d33FwdngInstCd) {
        this.d33FwdngInstCd = d33FwdngInstCd;
    }

    public short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
    }

    public short getP501s1UsageCd() {
        return p501s1UsageCd;
    }

    public void setP501s1UsageCd(short p501s1UsageCd) {
        this.p501s1UsageCd = p501s1UsageCd;
    }

    public short getP501s2IndstyRec() {
        return p501s2IndstyRec;
    }

    public void setP501s2IndstyRec(short p501s2IndstyRec) {
        this.p501s2IndstyRec = p501s2IndstyRec;
    }

    public short getP501s3OccInd() {
        return p501s3OccInd;
    }

    public void setP501s3OccInd(short p501s3OccInd) {
        this.p501s3OccInd = p501s3OccInd;
    }

    public int getP501s4MsgNo() {
        return p501s4MsgNo;
    }

    public void setP501s4MsgNo(int p501s4MsgNo) {
        this.p501s4MsgNo = p501s4MsgNo;
    }

    public String getP508CustCd() {
        return p508CustCd;
    }

    public void setP508CustCd(String p508CustCd) {
        this.p508CustCd = p508CustCd;
    }

    public BigDecimal getP597s1TtxAmt() {
        return p597s1TtxAmt;
    }

    public void setP597s1TtxAmt(BigDecimal p597s1TtxAmt) {
        this.p597s1TtxAmt = p597s1TtxAmt;
    }

    public short getP597s2TtxAmtExp() {
        return p597s2TtxAmtExp;
    }

    public void setP597s2TtxAmtExp(short p597s2TtxAmtExp) {
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
    }

    public Character getP597s3TtxAmtSig() {
        return p597s3TtxAmtSig;
    }

    public void setP597s3TtxAmtSig(Character p597s3TtxAmtSig) {
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
    }

    public Character getP598TaxCltnInd() {
        return p598TaxCltnInd;
    }

    public void setP598TaxCltnInd(Character p598TaxCltnInd) {
        this.p598TaxCltnInd = p598TaxCltnInd;
    }

    public String getP679Commodity() {
        return p679Commodity;
    }

    public void setP679Commodity(String p679Commodity) {
        this.p679Commodity = p679Commodity;
    }

    public Character getP686TaxExempt() {
        return p686TaxExempt;
    }

    public void setP686TaxExempt(Character p686TaxExempt) {
        this.p686TaxExempt = p686TaxExempt;
    }

    public String getP718EmpTmpNme() {
        return p718EmpTmpNme;
    }

    public void setP718EmpTmpNme(String p718EmpTmpNme) {
        this.p718EmpTmpNme = p718EmpTmpNme;
    }

    public String getP719EmpSsnr() {
        return p719EmpSsnr;
    }

    public void setP719EmpSsnr(String p719EmpSsnr) {
        this.p719EmpSsnr = p719EmpSsnr;
    }

    public String getP720JobDesc() {
        return p720JobDesc;
    }

    public void setP720JobDesc(String p720JobDesc) {
        this.p720JobDesc = p720JobDesc;
    }

    public String getP721JobCd() {
        return p721JobCd;
    }

    public void setP721JobCd(String p721JobCd) {
        this.p721JobCd = p721JobCd;
    }

    public Character getP722FltRteInd() {
        return p722FltRteInd;
    }

    public void setP722FltRteInd(Character p722FltRteInd) {
        this.p722FltRteInd = p722FltRteInd;
    }

    public BigDecimal getP723s1RgHrWrk() {
        return p723s1RgHrWrk;
    }

    public void setP723s1RgHrWrk(BigDecimal p723s1RgHrWrk) {
        this.p723s1RgHrWrk = p723s1RgHrWrk;
    }

    public Character getP723s2RgHrWrEx() {
        return p723s2RgHrWrEx;
    }

    public void setP723s2RgHrWrEx(Character p723s2RgHrWrEx) {
        this.p723s2RgHrWrEx = p723s2RgHrWrEx;
    }

    public BigDecimal getP724s1RgHrRt() {
        return p724s1RgHrRt;
    }

    public void setP724s1RgHrRt(BigDecimal p724s1RgHrRt) {
        this.p724s1RgHrRt = p724s1RgHrRt;
    }

    public Character getP724s2RgHrRtEx() {
        return p724s2RgHrRtEx;
    }

    public void setP724s2RgHrRtEx(Character p724s2RgHrRtEx) {
        this.p724s2RgHrRtEx = p724s2RgHrRtEx;
    }

    public BigDecimal getP725s1OtHrsWrk() {
        return p725s1OtHrsWrk;
    }

    public void setP725s1OtHrsWrk(BigDecimal p725s1OtHrsWrk) {
        this.p725s1OtHrsWrk = p725s1OtHrsWrk;
    }

    public Character getP725s2OtHrsExp() {
        return p725s2OtHrsExp;
    }

    public void setP725s2OtHrsExp(Character p725s2OtHrsExp) {
        this.p725s2OtHrsExp = p725s2OtHrsExp;
    }

    public BigDecimal getP726s1OtHrsRt() {
        return p726s1OtHrsRt;
    }

    public void setP726s1OtHrsRt(BigDecimal p726s1OtHrsRt) {
        this.p726s1OtHrsRt = p726s1OtHrsRt;
    }

    public Character getP726s2OtHrsExp() {
        return p726s2OtHrsExp;
    }

    public void setP726s2OtHrsExp(Character p726s2OtHrsExp) {
        this.p726s2OtHrsExp = p726s2OtHrsExp;
    }

    public int getP727TmpStaDt() {
        return p727TmpStaDt;
    }

    public void setP727TmpStaDt(int p727TmpStaDt) {
        this.p727TmpStaDt = p727TmpStaDt;
    }

    public int getP728TmpWkEnd() {
        return p728TmpWkEnd;
    }

    public void setP728TmpWkEnd(int p728TmpWkEnd) {
        this.p728TmpWkEnd = p728TmpWkEnd;
    }

    public String getP729ReqNmeId() {
        return p729ReqNmeId;
    }

    public void setP729ReqNmeId(String p729ReqNmeId) {
        this.p729ReqNmeId = p729ReqNmeId;
    }

    public String getP730RptTo() {
        return p730RptTo;
    }

    public void setP730RptTo(String p730RptTo) {
        this.p730RptTo = p730RptTo;
    }

    public String getP731TmShtNr() {
        return p731TmShtNr;
    }

    public void setP731TmShtNr(String p731TmShtNr) {
        this.p731TmShtNr = p731TmShtNr;
    }

    public BigDecimal getP732s1DiscAmt() {
        return p732s1DiscAmt;
    }

    public void setP732s1DiscAmt(BigDecimal p732s1DiscAmt) {
        this.p732s1DiscAmt = p732s1DiscAmt;
    }

    public short getP732s2DiscAmtEx() {
        return p732s2DiscAmtEx;
    }

    public void setP732s2DiscAmtEx(short p732s2DiscAmtEx) {
        this.p732s2DiscAmtEx = p732s2DiscAmtEx;
    }

    public Character getP732s3DiscAmtSi() {
        return p732s3DiscAmtSi;
    }

    public void setP732s3DiscAmtSi(Character p732s3DiscAmtSi) {
        this.p732s3DiscAmtSi = p732s3DiscAmtSi;
    }

    public String getP732s4DiscTp() {
        return p732s4DiscTp;
    }

    public void setP732s4DiscTp(String p732s4DiscTp) {
        this.p732s4DiscTp = p732s4DiscTp;
    }

    public BigDecimal getP733s1SbtlAm() {
        return p733s1SbtlAm;
    }

    public void setP733s1SbtlAm(BigDecimal p733s1SbtlAm) {
        this.p733s1SbtlAm = p733s1SbtlAm;
    }

    public short getP733s2SbtlAmtEx() {
        return p733s2SbtlAmtEx;
    }

    public void setP733s2SbtlAmtEx(short p733s2SbtlAmtEx) {
        this.p733s2SbtlAmtEx = p733s2SbtlAmtEx;
    }

    public Character getP733s3SbtlAmtSg() {
        return p733s3SbtlAmtSg;
    }

    public void setP733s3SbtlAmtSg(Character p733s3SbtlAmtSg) {
        this.p733s3SbtlAmtSg = p733s3SbtlAmtSg;
    }

    public String getTaxAmtTs() {
        return taxAmtTs;
    }

    public void setTaxAmtTs(String taxAmtTs) {
        this.taxAmtTs = taxAmtTs;
    }

    public Character getTaxAmt682Ind() {
        return taxAmt682Ind;
    }

    public void setTaxAmt682Ind(Character taxAmt682Ind) {
        this.taxAmt682Ind = taxAmt682Ind;
    }

    public Character getTaxAmt683Ind() {
        return taxAmt683Ind;
    }

    public void setTaxAmt683Ind(Character taxAmt683Ind) {
        this.taxAmt683Ind = taxAmt683Ind;
    }

    public Character getTaxAmt684Ind() {
        return taxAmt684Ind;
    }

    public void setTaxAmt684Ind(Character taxAmt684Ind) {
        this.taxAmt684Ind = taxAmt684Ind;
    }

    public Character getTaxAmt751Ind() {
        return taxAmt751Ind;
    }

    public void setTaxAmt751Ind(Character taxAmt751Ind) {
        this.taxAmt751Ind = taxAmt751Ind;
    }

    public Character getTaxAmt752Ind() {
        return taxAmt752Ind;
    }

    public void setTaxAmt752Ind(Character taxAmt752Ind) {
        this.taxAmt752Ind = taxAmt752Ind;
    }

    public Character getTaxAmt753Ind() {
        return taxAmt753Ind;
    }

    public void setTaxAmt753Ind(Character taxAmt753Ind) {
        this.taxAmt753Ind = taxAmt753Ind;
    }

    public Character getD63s1LfcycSpInd() {
        return d63s1LfcycSpInd;
    }

    public void setD63s1LfcycSpInd(Character d63s1LfcycSpInd) {
        this.d63s1LfcycSpInd = d63s1LfcycSpInd;
    }

    public String getD63s2TraceId() {
        return d63s2TraceId;
    }

    public void setD63s2TraceId(String d63s2TraceId) {
        this.d63s2TraceId = d63s2TraceId;
    }

    public String getD63s3ValidnCd() {
        return d63s3ValidnCd;
    }

    public void setD63s3ValidnCd(String d63s3ValidnCd) {
        this.d63s3ValidnCd = d63s3ValidnCd;
    }

    public String getD63s4LfcyctrSeq() {
        return d63s4LfcyctrSeq;
    }

    public void setD63s4LfcyctrSeq(String d63s4LfcyctrSeq) {
        this.d63s4LfcyctrSeq = d63s4LfcyctrSeq;
    }

    public String getD63s5LfcyctrTot() {
        return d63s5LfcyctrTot;
    }

    public void setD63s5LfcyctrTot(String d63s5LfcyctrTot) {
        this.d63s5LfcyctrTot = d63s5LfcyctrTot;
    }

    public long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
    }

    public long getD94TrOrgInst() {
        return d94TrOrgInst;
    }

    public void setD94TrOrgInst(long d94TrOrgInst) {
        this.d94TrOrgInst = d94TrOrgInst;
    }

    public long getD100RecvInstId() {
        return d100RecvInstId;
    }

    public void setD100RecvInstId(long d100RecvInstId) {
        this.d100RecvInstId = d100RecvInstId;
    }

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
    }

    public String getD62AddtlData2() {
        return d62AddtlData2;
    }

    public void setD62AddtlData2(String d62AddtlData2) {
        this.d62AddtlData2 = d62AddtlData2;
    }

    public String getD123AddtlDat3() {
        return d123AddtlDat3;
    }

    public void setD123AddtlDat3(String d123AddtlDat3) {
        this.d123AddtlDat3 = d123AddtlDat3;
    }

    public String getD124AddtlDat4() {
        return d124AddtlDat4;
    }

    public void setD124AddtlDat4(String d124AddtlDat4) {
        this.d124AddtlDat4 = d124AddtlDat4;
    }

    public String getD125AddtlDat5() {
        return d125AddtlDat5;
    }

    public void setD125AddtlDat5(String d125AddtlDat5) {
        this.d125AddtlDat5 = d125AddtlDat5;
    }

    public BigDecimal getA597s1TtxAmt() {
        return a597s1TtxAmt;
    }

    public void setA597s1TtxAmt(BigDecimal a597s1TtxAmt) {
        this.a597s1TtxAmt = a597s1TtxAmt;
    }

    public BigDecimal getA733s1SbtlAmt() {
        return a733s1SbtlAmt;
    }

    public void setA733s1SbtlAmt(BigDecimal a733s1SbtlAmt) {
        this.a733s1SbtlAmt = a733s1SbtlAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddTempSvcPK != null ? mcAddTempSvcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddTempSvc)) {
            return false;
        }
        McAddTempSvc other = (McAddTempSvc) object;
        if ((this.mcAddTempSvcPK == null && other.mcAddTempSvcPK != null) || (this.mcAddTempSvcPK != null && !this.mcAddTempSvcPK.equals(other.mcAddTempSvcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddTempSvc[ mcAddTempSvcPK=" + mcAddTempSvcPK + " ]";
    }

}
