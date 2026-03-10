/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_ADD_HEALTHCARE", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McAddHealthcare.findAll", query = "SELECT m FROM McAddHealthcare m"),
    @NamedQuery(name = "McAddHealthcare.findByP105s1FileTy", query = "SELECT m FROM McAddHealthcare m WHERE m.mcAddHealthcarePK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McAddHealthcare.findByP105s2FileRDt", query = "SELECT m FROM McAddHealthcare m WHERE m.mcAddHealthcarePK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McAddHealthcare.findByP105s3ProcId", query = "SELECT m FROM McAddHealthcare m WHERE m.mcAddHealthcarePK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McAddHealthcare.findByP105s4FileSeqNo", query = "SELECT m FROM McAddHealthcare m WHERE m.mcAddHealthcarePK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McAddHealthcare.findByP501s4MsgNo", query = "SELECT m FROM McAddHealthcare m WHERE m.mcAddHealthcarePK.p501s4MsgNo = :p501s4MsgNo"),
    @NamedQuery(name = "McAddHealthcare.findByP501s3OccInd", query = "SELECT m FROM McAddHealthcare m WHERE m.mcAddHealthcarePK.p501s3OccInd = :p501s3OccInd"),
    @NamedQuery(name = "McAddHealthcare.findByD71MsgNo", query = "SELECT m FROM McAddHealthcare m WHERE m.mcAddHealthcarePK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McAddHealthcare.findByMsgTyId", query = "SELECT m FROM McAddHealthcare m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McAddHealthcare.findByBitMapPri", query = "SELECT m FROM McAddHealthcare m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McAddHealthcare.findByD1BitMapSec", query = "SELECT m FROM McAddHealthcare m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McAddHealthcare.findByD24FuncCd", query = "SELECT m FROM McAddHealthcare m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McAddHealthcare.findByD32AcqInstIdCd", query = "SELECT m FROM McAddHealthcare m WHERE m.d32AcqInstIdCd = :d32AcqInstIdCd"),
    @NamedQuery(name = "McAddHealthcare.findByD33FwdngInstCd", query = "SELECT m FROM McAddHealthcare m WHERE m.d33FwdngInstCd = :d33FwdngInstCd"),
    @NamedQuery(name = "McAddHealthcare.findByP191OrMsgFmt", query = "SELECT m FROM McAddHealthcare m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McAddHealthcare.findByP501s1UsageCd", query = "SELECT m FROM McAddHealthcare m WHERE m.p501s1UsageCd = :p501s1UsageCd"),
    @NamedQuery(name = "McAddHealthcare.findByP501s2IndstyRec", query = "SELECT m FROM McAddHealthcare m WHERE m.p501s2IndstyRec = :p501s2IndstyRec"),
    @NamedQuery(name = "McAddHealthcare.findByP642ItmDesc", query = "SELECT m FROM McAddHealthcare m WHERE m.p642ItmDesc = :p642ItmDesc"),
    @NamedQuery(name = "McAddHealthcare.findByA642ItmDesc", query = "SELECT m FROM McAddHealthcare m WHERE m.a642ItmDesc = :a642ItmDesc"),
    @NamedQuery(name = "McAddHealthcare.findByP643s1ItmQty", query = "SELECT m FROM McAddHealthcare m WHERE m.p643s1ItmQty = :p643s1ItmQty"),
    @NamedQuery(name = "McAddHealthcare.findByA643s1ItmQty", query = "SELECT m FROM McAddHealthcare m WHERE m.a643s1ItmQty = :a643s1ItmQty"),
    @NamedQuery(name = "McAddHealthcare.findByP643s2ItmQtyExp", query = "SELECT m FROM McAddHealthcare m WHERE m.p643s2ItmQtyExp = :p643s2ItmQtyExp"),
    @NamedQuery(name = "McAddHealthcare.findByP646s1UnitPrc", query = "SELECT m FROM McAddHealthcare m WHERE m.p646s1UnitPrc = :p646s1UnitPrc"),
    @NamedQuery(name = "McAddHealthcare.findByA646s1UnitPrc", query = "SELECT m FROM McAddHealthcare m WHERE m.a646s1UnitPrc = :a646s1UnitPrc"),
    @NamedQuery(name = "McAddHealthcare.findByP646s2UnitPrcExp", query = "SELECT m FROM McAddHealthcare m WHERE m.p646s2UnitPrcExp = :p646s2UnitPrcExp"),
    @NamedQuery(name = "McAddHealthcare.findByP764HlthcrEligStInd", query = "SELECT m FROM McAddHealthcare m WHERE m.p764HlthcrEligStInd = :p764HlthcrEligStInd"),
    @NamedQuery(name = "McAddHealthcare.findByD63s1LfcycSpInd", query = "SELECT m FROM McAddHealthcare m WHERE m.d63s1LfcycSpInd = :d63s1LfcycSpInd"),
    @NamedQuery(name = "McAddHealthcare.findByD63s2TraceId", query = "SELECT m FROM McAddHealthcare m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McAddHealthcare.findByD63s3ValidnCd", query = "SELECT m FROM McAddHealthcare m WHERE m.d63s3ValidnCd = :d63s3ValidnCd"),
    @NamedQuery(name = "McAddHealthcare.findByD63s4LfcyctrSeq", query = "SELECT m FROM McAddHealthcare m WHERE m.d63s4LfcyctrSeq = :d63s4LfcyctrSeq"),
    @NamedQuery(name = "McAddHealthcare.findByD63s5LfcyctrTot", query = "SELECT m FROM McAddHealthcare m WHERE m.d63s5LfcyctrTot = :d63s5LfcyctrTot"),
    @NamedQuery(name = "McAddHealthcare.findByD93TrDestInst", query = "SELECT m FROM McAddHealthcare m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McAddHealthcare.findByD94TrOrgInst", query = "SELECT m FROM McAddHealthcare m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McAddHealthcare.findByD100RecvInstId", query = "SELECT m FROM McAddHealthcare m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McAddHealthcare.findByD48AddtlDat", query = "SELECT m FROM McAddHealthcare m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McAddHealthcare.findByD62AddtlDat2", query = "SELECT m FROM McAddHealthcare m WHERE m.d62AddtlDat2 = :d62AddtlDat2"),
    @NamedQuery(name = "McAddHealthcare.findByD123AddtlDat3", query = "SELECT m FROM McAddHealthcare m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McAddHealthcare.findByD124AddtlDat4", query = "SELECT m FROM McAddHealthcare m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McAddHealthcare.findByD125AddtlDat5", query = "SELECT m FROM McAddHealthcare m WHERE m.d125AddtlDat5 = :d125AddtlDat5")})
public class McAddHealthcare implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddHealthcarePK mcAddHealthcarePK;
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
    @Column(name = "P642_ITM_DESC")
    private String p642ItmDesc;
    @Basic(optional = false)
    @Column(name = "A642_ITM_DESC")
    private String a642ItmDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "P643S1_ITM_QTY")
    private BigDecimal p643s1ItmQty;
    @Basic(optional = false)
    @Column(name = "A643S1_ITM_QTY")
    private BigDecimal a643s1ItmQty;
    @Basic(optional = false)
    @Column(name = "P643S2_ITM_QTY_EXP")
    private Character p643s2ItmQtyExp;
    @Basic(optional = false)
    @Column(name = "P646S1_UNIT_PRC")
    private BigDecimal p646s1UnitPrc;
    @Basic(optional = false)
    @Column(name = "A646S1_UNIT_PRC")
    private BigDecimal a646s1UnitPrc;
    @Basic(optional = false)
    @Column(name = "P646S2_UNIT_PRC_EXP")
    private Character p646s2UnitPrcExp;
    @Basic(optional = false)
    @Column(name = "P764_HLTHCR_ELIG_ST_IND")
    private Character p764HlthcrEligStInd;
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
    @Column(name = "D62_ADDTL_DAT_2")
    private String d62AddtlDat2;
    @Basic(optional = false)
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Basic(optional = false)
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Basic(optional = false)
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;

    public McAddHealthcare() {
    }

    public McAddHealthcare(McAddHealthcarePK mcAddHealthcarePK) {
        this.mcAddHealthcarePK = mcAddHealthcarePK;
    }

    public McAddHealthcare(McAddHealthcarePK mcAddHealthcarePK, short msgTyId, String bitMapPri, String d1BitMapSec, short d24FuncCd, long d32AcqInstIdCd, long d33FwdngInstCd, short p191OrMsgFmt, short p501s1UsageCd, short p501s2IndstyRec, String p642ItmDesc, String a642ItmDesc, BigDecimal p643s1ItmQty, BigDecimal a643s1ItmQty, Character p643s2ItmQtyExp, BigDecimal p646s1UnitPrc, BigDecimal a646s1UnitPrc, Character p646s2UnitPrcExp, Character p764HlthcrEligStInd, Character d63s1LfcycSpInd, String d63s2TraceId, String d63s3ValidnCd, String d63s4LfcyctrSeq, String d63s5LfcyctrTot, long d93TrDestInst, long d94TrOrgInst, long d100RecvInstId, String d48AddtlDat, String d62AddtlDat2, String d123AddtlDat3, String d124AddtlDat4, String d125AddtlDat5) {
        this.mcAddHealthcarePK = mcAddHealthcarePK;
        this.msgTyId = msgTyId;
        this.bitMapPri = bitMapPri;
        this.d1BitMapSec = d1BitMapSec;
        this.d24FuncCd = d24FuncCd;
        this.d32AcqInstIdCd = d32AcqInstIdCd;
        this.d33FwdngInstCd = d33FwdngInstCd;
        this.p191OrMsgFmt = p191OrMsgFmt;
        this.p501s1UsageCd = p501s1UsageCd;
        this.p501s2IndstyRec = p501s2IndstyRec;
        this.p642ItmDesc = p642ItmDesc;
        this.a642ItmDesc = a642ItmDesc;
        this.p643s1ItmQty = p643s1ItmQty;
        this.a643s1ItmQty = a643s1ItmQty;
        this.p643s2ItmQtyExp = p643s2ItmQtyExp;
        this.p646s1UnitPrc = p646s1UnitPrc;
        this.a646s1UnitPrc = a646s1UnitPrc;
        this.p646s2UnitPrcExp = p646s2UnitPrcExp;
        this.p764HlthcrEligStInd = p764HlthcrEligStInd;
        this.d63s1LfcycSpInd = d63s1LfcycSpInd;
        this.d63s2TraceId = d63s2TraceId;
        this.d63s3ValidnCd = d63s3ValidnCd;
        this.d63s4LfcyctrSeq = d63s4LfcyctrSeq;
        this.d63s5LfcyctrTot = d63s5LfcyctrTot;
        this.d93TrDestInst = d93TrDestInst;
        this.d94TrOrgInst = d94TrOrgInst;
        this.d100RecvInstId = d100RecvInstId;
        this.d48AddtlDat = d48AddtlDat;
        this.d62AddtlDat2 = d62AddtlDat2;
        this.d123AddtlDat3 = d123AddtlDat3;
        this.d124AddtlDat4 = d124AddtlDat4;
        this.d125AddtlDat5 = d125AddtlDat5;
    }

    public McAddHealthcare(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int p501s4MsgNo, short p501s3OccInd, int d71MsgNo) {
        this.mcAddHealthcarePK = new McAddHealthcarePK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s4MsgNo, p501s3OccInd, d71MsgNo);
    }

    public McAddHealthcarePK getMcAddHealthcarePK() {
        return mcAddHealthcarePK;
    }

    public void setMcAddHealthcarePK(McAddHealthcarePK mcAddHealthcarePK) {
        this.mcAddHealthcarePK = mcAddHealthcarePK;
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

    public String getP642ItmDesc() {
        return p642ItmDesc;
    }

    public void setP642ItmDesc(String p642ItmDesc) {
        this.p642ItmDesc = p642ItmDesc;
    }

    public String getA642ItmDesc() {
        return a642ItmDesc;
    }

    public void setA642ItmDesc(String a642ItmDesc) {
        this.a642ItmDesc = a642ItmDesc;
    }

    public BigDecimal getP643s1ItmQty() {
        return p643s1ItmQty;
    }

    public void setP643s1ItmQty(BigDecimal p643s1ItmQty) {
        this.p643s1ItmQty = p643s1ItmQty;
    }

    public BigDecimal getA643s1ItmQty() {
        return a643s1ItmQty;
    }

    public void setA643s1ItmQty(BigDecimal a643s1ItmQty) {
        this.a643s1ItmQty = a643s1ItmQty;
    }

    public Character getP643s2ItmQtyExp() {
        return p643s2ItmQtyExp;
    }

    public void setP643s2ItmQtyExp(Character p643s2ItmQtyExp) {
        this.p643s2ItmQtyExp = p643s2ItmQtyExp;
    }

    public BigDecimal getP646s1UnitPrc() {
        return p646s1UnitPrc;
    }

    public void setP646s1UnitPrc(BigDecimal p646s1UnitPrc) {
        this.p646s1UnitPrc = p646s1UnitPrc;
    }

    public BigDecimal getA646s1UnitPrc() {
        return a646s1UnitPrc;
    }

    public void setA646s1UnitPrc(BigDecimal a646s1UnitPrc) {
        this.a646s1UnitPrc = a646s1UnitPrc;
    }

    public Character getP646s2UnitPrcExp() {
        return p646s2UnitPrcExp;
    }

    public void setP646s2UnitPrcExp(Character p646s2UnitPrcExp) {
        this.p646s2UnitPrcExp = p646s2UnitPrcExp;
    }

    public Character getP764HlthcrEligStInd() {
        return p764HlthcrEligStInd;
    }

    public void setP764HlthcrEligStInd(Character p764HlthcrEligStInd) {
        this.p764HlthcrEligStInd = p764HlthcrEligStInd;
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

    public String getD62AddtlDat2() {
        return d62AddtlDat2;
    }

    public void setD62AddtlDat2(String d62AddtlDat2) {
        this.d62AddtlDat2 = d62AddtlDat2;
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
        hash += (mcAddHealthcarePK != null ? mcAddHealthcarePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddHealthcare)) {
            return false;
        }
        McAddHealthcare other = (McAddHealthcare) object;
        if ((this.mcAddHealthcarePK == null && other.mcAddHealthcarePK != null) || (this.mcAddHealthcarePK != null && !this.mcAddHealthcarePK.equals(other.mcAddHealthcarePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddHealthcare[ mcAddHealthcarePK=" + mcAddHealthcarePK + " ]";
    }
    
}
