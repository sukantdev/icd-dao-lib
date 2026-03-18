package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_ADD_TEL_BILL", catalog = "", schema = "CXXCOW")
public class McAddTelBill implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddTelBillPK mcAddTelBillPK;
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
    @Column(name = "P619_USR_NM")
    private String p619UsrNm;
    @Basic(optional = false)
    @Column(name = "P624_USR_ACCT_NBR")
    private String p624UsrAcctNbr;
    @Basic(optional = false)
    @Column(name = "P625_USR_PH_NBR")
    private String p625UsrPhNbr;
    @Basic(optional = false)
    @Column(name = "P626S1_BILL_STMT_S")
    private int p626s1BillStmtS;
    @Basic(optional = false)
    @Column(name = "P626S2_BILL_STMT_E")
    private int p626s2BillStmtE;
    @Basic(optional = false)
    @Column(name = "P755S1_LITM_TOT_AM")
    private BigDecimal p755s1LitmTotAm;
    @Basic(optional = false)
    @Column(name = "P755S2_LITM_TOT_EX")
    private short p755s2LitmTotEx;
    @Basic(optional = false)
    @Column(name = "P755S3_LITM_TOT_SG")
    private Character p755s3LitmTotSg;
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
    @Column(name = "A755S1_LITM_TOT_AMT")
    private BigDecimal a755s1LitmTotAmt;

    public McAddTelBill() {
    }

    public McAddTelBill(McAddTelBillPK mcAddTelBillPK) {
        this.mcAddTelBillPK = mcAddTelBillPK;
    }

    public McAddTelBill(McAddTelBillPK mcAddTelBillPK, short msgTyId, String bitMapPri, String d1BitMapSec, short d24FuncCd, long d32AcqInstIdCd, long d33FwdngInstCd, short p191OrMsgFmt, short p501s1UsageCd, short p501s2IndstyRec, short p501s3OccInd, int p501s4MsgNo, BigDecimal p597s1TtxAmt, short p597s2TtxAmtExp, Character p597s3TtxAmtSig, Character p598TaxCltnInd, String p619UsrNm, String p624UsrAcctNbr, String p625UsrPhNbr, int p626s1BillStmtS, int p626s2BillStmtE, BigDecimal p755s1LitmTotAm, short p755s2LitmTotEx, Character p755s3LitmTotSg, String taxAmtTs, Character taxAmt682Ind, Character taxAmt683Ind, Character taxAmt684Ind, Character taxAmt751Ind, Character taxAmt752Ind, Character taxAmt753Ind, Character d63s1LfcycSpInd, String d63s2TraceId, String d63s3ValidnCd, String d63s4LfcyctrSeq, String d63s5LfcyctrTot, long d93TrDestInst, long d94TrOrgInst, long d100RecvInstId, String d48AddtlDat, String d62AddtlData2, String d123AddtlDat3, String d124AddtlDat4, String d125AddtlDat5, BigDecimal a597s1TtxAmt, BigDecimal a755s1LitmTotAmt) {
        this.mcAddTelBillPK = mcAddTelBillPK;
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
        this.p597s1TtxAmt = p597s1TtxAmt;
        this.p597s2TtxAmtExp = p597s2TtxAmtExp;
        this.p597s3TtxAmtSig = p597s3TtxAmtSig;
        this.p598TaxCltnInd = p598TaxCltnInd;
        this.p619UsrNm = p619UsrNm;
        this.p624UsrAcctNbr = p624UsrAcctNbr;
        this.p625UsrPhNbr = p625UsrPhNbr;
        this.p626s1BillStmtS = p626s1BillStmtS;
        this.p626s2BillStmtE = p626s2BillStmtE;
        this.p755s1LitmTotAm = p755s1LitmTotAm;
        this.p755s2LitmTotEx = p755s2LitmTotEx;
        this.p755s3LitmTotSg = p755s3LitmTotSg;
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
        this.a755s1LitmTotAmt = a755s1LitmTotAmt;
    }

    public McAddTelBill(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcAddTelBillPK = new McAddTelBillPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McAddTelBillPK getMcAddTelBillPK() {
        return mcAddTelBillPK;
    }

    public void setMcAddTelBillPK(McAddTelBillPK mcAddTelBillPK) {
        this.mcAddTelBillPK = mcAddTelBillPK;
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

    public String getP619UsrNm() {
        return p619UsrNm;
    }

    public void setP619UsrNm(String p619UsrNm) {
        this.p619UsrNm = p619UsrNm;
    }

    public String getP624UsrAcctNbr() {
        return p624UsrAcctNbr;
    }

    public void setP624UsrAcctNbr(String p624UsrAcctNbr) {
        this.p624UsrAcctNbr = p624UsrAcctNbr;
    }

    public String getP625UsrPhNbr() {
        return p625UsrPhNbr;
    }

    public void setP625UsrPhNbr(String p625UsrPhNbr) {
        this.p625UsrPhNbr = p625UsrPhNbr;
    }

    public int getP626s1BillStmtS() {
        return p626s1BillStmtS;
    }

    public void setP626s1BillStmtS(int p626s1BillStmtS) {
        this.p626s1BillStmtS = p626s1BillStmtS;
    }

    public int getP626s2BillStmtE() {
        return p626s2BillStmtE;
    }

    public void setP626s2BillStmtE(int p626s2BillStmtE) {
        this.p626s2BillStmtE = p626s2BillStmtE;
    }

    public BigDecimal getP755s1LitmTotAm() {
        return p755s1LitmTotAm;
    }

    public void setP755s1LitmTotAm(BigDecimal p755s1LitmTotAm) {
        this.p755s1LitmTotAm = p755s1LitmTotAm;
    }

    public short getP755s2LitmTotEx() {
        return p755s2LitmTotEx;
    }

    public void setP755s2LitmTotEx(short p755s2LitmTotEx) {
        this.p755s2LitmTotEx = p755s2LitmTotEx;
    }

    public Character getP755s3LitmTotSg() {
        return p755s3LitmTotSg;
    }

    public void setP755s3LitmTotSg(Character p755s3LitmTotSg) {
        this.p755s3LitmTotSg = p755s3LitmTotSg;
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

    public BigDecimal getA755s1LitmTotAmt() {
        return a755s1LitmTotAmt;
    }

    public void setA755s1LitmTotAmt(BigDecimal a755s1LitmTotAmt) {
        this.a755s1LitmTotAmt = a755s1LitmTotAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddTelBillPK != null ? mcAddTelBillPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddTelBill)) {
            return false;
        }
        McAddTelBill other = (McAddTelBill) object;
        if ((this.mcAddTelBillPK == null && other.mcAddTelBillPK != null) || (this.mcAddTelBillPK != null && !this.mcAddTelBillPK.equals(other.mcAddTelBillPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddTelBill[ mcAddTelBillPK=" + mcAddTelBillPK + " ]";
    }

}
