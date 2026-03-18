package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_ADD_TRAVL_AGNCY", catalog = "", schema = "CXXCOW")
public class McAddTravlAgncy implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddTravlAgncyPK mcAddTravlAgncyPK;
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
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
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
    @Column(name = "P502S1_CUST_ID_TYP")
    private String p502s1CustIdTyp;
    @Basic(optional = false)
    @Column(name = "P502S2_CUST_ID_DTL")
    private String p502s2CustIdDtl;
    @Basic(optional = false)
    @Column(name = "P503_AGNCY_SEQ_NO")
    private String p503AgncySeqNo;

    @Basic(optional = false)
    @Column(name = "P504S1_FEE_AMT")
    private BigDecimal p504s1FeeAmt;
    @Basic(optional = false)
    @Column(name = "P504S2_FEE_AMT_EXP")
    private short p504s2FeeAmtExp;
    @Basic(optional = false)
    @Column(name = "P504S3_FEE_AMT_SGN")
    private Character p504s3FeeAmtSgn;
    @Basic(optional = false)
    @Column(name = "P504S4_FEE_AMT_RTE")
    private long p504s4FeeAmtRte;
    @Basic(optional = false)
    @Column(name = "P504S5_FEE_AMT_DSC")
    private String p504s5FeeAmtDsc;
    @Basic(optional = false)
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Basic(optional = false)
    @Column(name = "D63S1_LFCYC_SP_IND")
    private Character d63s1LfcycSpInd;
    @Basic(optional = false)
    @Column(name = "D63S2_TRACE_ID")
    private String d63s2TraceId;
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
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Basic(optional = false)
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Basic(optional = false)
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;

    public McAddTravlAgncy() {
    }

    public McAddTravlAgncy(McAddTravlAgncyPK mcAddTravlAgncyPK) {
        this.mcAddTravlAgncyPK = mcAddTravlAgncyPK;
    }

    public McAddTravlAgncy(McAddTravlAgncyPK mcAddTravlAgncyPK, short msgTyId, String bitMapPri, String d1BitMapSec, short d24FuncCd, long d32AcqInstIdCd, long d33FwdngInstCd, String d48AddtlDat, short p191OrMsgFmt, short p501s1UsageCd, short p501s2IndstyRec, String p502s1CustIdTyp, String p502s2CustIdDtl, String p503AgncySeqNo, BigDecimal p504s1FeeAmt, short p504s2FeeAmtExp, Character p504s3FeeAmtSgn, long p504s4FeeAmtRte, String p504s5FeeAmtDsc, String d62AddtlData2, Character d63s1LfcycSpInd, String d63s2TraceId, long d93TrDestInst, long d94TrOrgInst, long d100RecvInstId, String d123AddtlDat3, String d124AddtlDat4, String d125AddtlDat5) {
        this.mcAddTravlAgncyPK = mcAddTravlAgncyPK;
        this.msgTyId = msgTyId;
        this.bitMapPri = bitMapPri;
        this.d1BitMapSec = d1BitMapSec;
        this.d24FuncCd = d24FuncCd;
        this.d32AcqInstIdCd = d32AcqInstIdCd;
        this.d33FwdngInstCd = d33FwdngInstCd;
        this.d48AddtlDat = d48AddtlDat;
        this.p191OrMsgFmt = p191OrMsgFmt;
        this.p501s1UsageCd = p501s1UsageCd;
        this.p501s2IndstyRec = p501s2IndstyRec;
        this.p502s1CustIdTyp = p502s1CustIdTyp;
        this.p502s2CustIdDtl = p502s2CustIdDtl;
        this.p503AgncySeqNo = p503AgncySeqNo;
        this.p504s1FeeAmt = p504s1FeeAmt;
        this.p504s2FeeAmtExp = p504s2FeeAmtExp;
        this.p504s3FeeAmtSgn = p504s3FeeAmtSgn;
        this.p504s4FeeAmtRte = p504s4FeeAmtRte;
        this.p504s5FeeAmtDsc = p504s5FeeAmtDsc;
        this.d62AddtlData2 = d62AddtlData2;
        this.d63s1LfcycSpInd = d63s1LfcycSpInd;
        this.d63s2TraceId = d63s2TraceId;
        this.d93TrDestInst = d93TrDestInst;
        this.d94TrOrgInst = d94TrOrgInst;
        this.d100RecvInstId = d100RecvInstId;
        this.d123AddtlDat3 = d123AddtlDat3;
        this.d124AddtlDat4 = d124AddtlDat4;
        this.d125AddtlDat5 = d125AddtlDat5;
    }

    public McAddTravlAgncy(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddTravlAgncyPK = new McAddTravlAgncyPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddTravlAgncyPK getMcAddTravlAgncyPK() {
        return mcAddTravlAgncyPK;
    }

    public void setMcAddTravlAgncyPK(McAddTravlAgncyPK mcAddTravlAgncyPK) {
        this.mcAddTravlAgncyPK = mcAddTravlAgncyPK;
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

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
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

    public String getP502s1CustIdTyp() {
        return p502s1CustIdTyp;
    }

    public void setP502s1CustIdTyp(String p502s1CustIdTyp) {
        this.p502s1CustIdTyp = p502s1CustIdTyp;
    }

    public String getP502s2CustIdDtl() {
        return p502s2CustIdDtl;
    }

    public void setP502s2CustIdDtl(String p502s2CustIdDtl) {
        this.p502s2CustIdDtl = p502s2CustIdDtl;
    }

    public String getP503AgncySeqNo() {
        return p503AgncySeqNo;
    }

    public void setP503AgncySeqNo(String p503AgncySeqNo) {
        this.p503AgncySeqNo = p503AgncySeqNo;
    }

    public BigDecimal getP504s1FeeAmt() {
        return p504s1FeeAmt;
    }

    public void setP504s1FeeAmt(BigDecimal p504s1FeeAmt) {
        this.p504s1FeeAmt = p504s1FeeAmt;
    }

    public short getP504s2FeeAmtExp() {
        return p504s2FeeAmtExp;
    }

    public void setP504s2FeeAmtExp(short p504s2FeeAmtExp) {
        this.p504s2FeeAmtExp = p504s2FeeAmtExp;
    }

    public Character getP504s3FeeAmtSgn() {
        return p504s3FeeAmtSgn;
    }

    public void setP504s3FeeAmtSgn(Character p504s3FeeAmtSgn) {
        this.p504s3FeeAmtSgn = p504s3FeeAmtSgn;
    }

    public long getP504s4FeeAmtRte() {
        return p504s4FeeAmtRte;
    }

    public void setP504s4FeeAmtRte(long p504s4FeeAmtRte) {
        this.p504s4FeeAmtRte = p504s4FeeAmtRte;
    }

    public String getP504s5FeeAmtDsc() {
        return p504s5FeeAmtDsc;
    }

    public void setP504s5FeeAmtDsc(String p504s5FeeAmtDsc) {
        this.p504s5FeeAmtDsc = p504s5FeeAmtDsc;
    }

    public String getD62AddtlData2() {
        return d62AddtlData2;
    }

    public void setD62AddtlData2(String d62AddtlData2) {
        this.d62AddtlData2 = d62AddtlData2;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddTravlAgncyPK != null ? mcAddTravlAgncyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddTravlAgncy)) {
            return false;
        }
        McAddTravlAgncy other = (McAddTravlAgncy) object;
        if ((this.mcAddTravlAgncyPK == null && other.mcAddTravlAgncyPK != null) || (this.mcAddTravlAgncyPK != null && !this.mcAddTravlAgncyPK.equals(other.mcAddTravlAgncyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddTravlAgncy[ mcAddTravlAgncyPK=" + mcAddTravlAgncyPK + " ]";
    }

}
