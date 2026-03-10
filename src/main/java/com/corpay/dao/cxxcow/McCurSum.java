/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "MC_CUR_SUM", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McCurSum.findAll", query = "SELECT m FROM McCurSum m"),
    @NamedQuery(name = "McCurSum.findByP105s1FileTy", query = "SELECT m FROM McCurSum m WHERE m.mcCurSumPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McCurSum.findByP105s2FileRDt", query = "SELECT m FROM McCurSum m WHERE m.mcCurSumPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McCurSum.findByP105s3ProcId", query = "SELECT m FROM McCurSum m WHERE m.mcCurSumPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McCurSum.findByP105s4FileSeqNo", query = "SELECT m FROM McCurSum m WHERE m.mcCurSumPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McCurSum.findByD71MsgNo", query = "SELECT m FROM McCurSum m WHERE m.mcCurSumPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McCurSum.findByMsgTyId", query = "SELECT m FROM McCurSum m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McCurSum.findByBitMapPri", query = "SELECT m FROM McCurSum m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McCurSum.findByD1BitMapSec", query = "SELECT m FROM McCurSum m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McCurSum.findByD24FuncCd", query = "SELECT m FROM McCurSum m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McCurSum.findByD25MsgRsnCd", query = "SELECT m FROM McCurSum m WHERE m.d25MsgRsnCd = :d25MsgRsnCd"),
    @NamedQuery(name = "McCurSum.findByD48AddtlDat", query = "SELECT m FROM McCurSum m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McCurSum.findByP300s1FileTy", query = "SELECT m FROM McCurSum m WHERE m.p300s1FileTy = :p300s1FileTy"),
    @NamedQuery(name = "McCurSum.findByP300s2FileRefDt", query = "SELECT m FROM McCurSum m WHERE m.p300s2FileRefDt = :p300s2FileRefDt"),
    @NamedQuery(name = "McCurSum.findByP300s3ProcId", query = "SELECT m FROM McCurSum m WHERE m.p300s3ProcId = :p300s3ProcId"),
    @NamedQuery(name = "McCurSum.findByP300s4FileSeqNo", query = "SELECT m FROM McCurSum m WHERE m.p300s4FileSeqNo = :p300s4FileSeqNo"),
    @NamedQuery(name = "McCurSum.findByP380s1DbCrInd", query = "SELECT m FROM McCurSum m WHERE m.p380s1DbCrInd = :p380s1DbCrInd"),
    @NamedQuery(name = "McCurSum.findByP380s2TranAmt", query = "SELECT m FROM McCurSum m WHERE m.p380s2TranAmt = :p380s2TranAmt"),
    @NamedQuery(name = "McCurSum.findByP381s1DbCrInd", query = "SELECT m FROM McCurSum m WHERE m.p381s1DbCrInd = :p381s1DbCrInd"),
    @NamedQuery(name = "McCurSum.findByP381s2TranAmt", query = "SELECT m FROM McCurSum m WHERE m.p381s2TranAmt = :p381s2TranAmt"),
    @NamedQuery(name = "McCurSum.findByP384s1DbCrInd", query = "SELECT m FROM McCurSum m WHERE m.p384s1DbCrInd = :p384s1DbCrInd"),
    @NamedQuery(name = "McCurSum.findByP384s2NetAmt", query = "SELECT m FROM McCurSum m WHERE m.p384s2NetAmt = :p384s2NetAmt"),
    @NamedQuery(name = "McCurSum.findByP400TranNoDbs", query = "SELECT m FROM McCurSum m WHERE m.p400TranNoDbs = :p400TranNoDbs"),
    @NamedQuery(name = "McCurSum.findByP401TranNoCrs", query = "SELECT m FROM McCurSum m WHERE m.p401TranNoCrs = :p401TranNoCrs"),
    @NamedQuery(name = "McCurSum.findByP402TranNoTot", query = "SELECT m FROM McCurSum m WHERE m.p402TranNoTot = :p402TranNoTot"),
    @NamedQuery(name = "McCurSum.findByD49TranCurrCd", query = "SELECT m FROM McCurSum m WHERE m.d49TranCurrCd = :d49TranCurrCd"),
    @NamedQuery(name = "McCurSum.findByD62AddtlData2", query = "SELECT m FROM McCurSum m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McCurSum.findByD93TrDestInst", query = "SELECT m FROM McCurSum m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McCurSum.findByD100RecvInstId", query = "SELECT m FROM McCurSum m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McCurSum.findByD123AddtlDat3", query = "SELECT m FROM McCurSum m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McCurSum.findByD124AddtlDat4", query = "SELECT m FROM McCurSum m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McCurSum.findByD125AddtlDat5", query = "SELECT m FROM McCurSum m WHERE m.d125AddtlDat5 = :d125AddtlDat5")})
public class McCurSum implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McCurSumPK mcCurSumPK;
    @Column(name = "MSG_TY_ID")
    private Short msgTyId;
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D25_MSG_RSN_CD")
    private Short d25MsgRsnCd;
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Column(name = "P300S1_FILE_TY")
    private Short p300s1FileTy;
    @Column(name = "P300S2_FILE_REF_DT")
    private Integer p300s2FileRefDt;
    @Column(name = "P300S3_PROC_ID")
    private Long p300s3ProcId;
    @Column(name = "P300S4_FILE_SEQ_NO")
    private Integer p300s4FileSeqNo;
    @Column(name = "P380S1_DB_CR_IND")
    private Character p380s1DbCrInd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "P380S2_TRAN_AMT")
    private BigDecimal p380s2TranAmt;
    @Column(name = "P381S1_DB_CR_IND")
    private Character p381s1DbCrInd;
    @Column(name = "P381S2_TRAN_AMT")
    private BigDecimal p381s2TranAmt;
    @Column(name = "P384S1_DB_CR_IND")
    private Character p384s1DbCrInd;
    @Column(name = "P384S2_NET_AMT")
    private BigDecimal p384s2NetAmt;
    @Column(name = "P400_TRAN_NO_DBS")
    private Long p400TranNoDbs;
    @Column(name = "P401_TRAN_NO_CRS")
    private Long p401TranNoCrs;
    @Column(name = "P402_TRAN_NO_TOT")
    private Long p402TranNoTot;
    @Column(name = "D49_TRAN_CURR_CD")
    private Short d49TranCurrCd;
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Column(name = "D93_TR_DEST_INST")
    private Long d93TrDestInst;
    @Column(name = "D100_RECV_INST_ID")
    private Long d100RecvInstId;
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;

    public McCurSum() {
    }

    public McCurSum(McCurSumPK mcCurSumPK) {
        this.mcCurSumPK = mcCurSumPK;
    }

    public McCurSum(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcCurSumPK = new McCurSumPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McCurSumPK getMcCurSumPK() {
        return mcCurSumPK;
    }

    public void setMcCurSumPK(McCurSumPK mcCurSumPK) {
        this.mcCurSumPK = mcCurSumPK;
    }

    public Short getMsgTyId() {
        return msgTyId;
    }

    public void setMsgTyId(Short msgTyId) {
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

    public Short getD24FuncCd() {
        return d24FuncCd;
    }

    public void setD24FuncCd(Short d24FuncCd) {
        this.d24FuncCd = d24FuncCd;
    }

    public Short getD25MsgRsnCd() {
        return d25MsgRsnCd;
    }

    public void setD25MsgRsnCd(Short d25MsgRsnCd) {
        this.d25MsgRsnCd = d25MsgRsnCd;
    }

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
    }

    public Short getP300s1FileTy() {
        return p300s1FileTy;
    }

    public void setP300s1FileTy(Short p300s1FileTy) {
        this.p300s1FileTy = p300s1FileTy;
    }

    public Integer getP300s2FileRefDt() {
        return p300s2FileRefDt;
    }

    public void setP300s2FileRefDt(Integer p300s2FileRefDt) {
        this.p300s2FileRefDt = p300s2FileRefDt;
    }

    public Long getP300s3ProcId() {
        return p300s3ProcId;
    }

    public void setP300s3ProcId(Long p300s3ProcId) {
        this.p300s3ProcId = p300s3ProcId;
    }

    public Integer getP300s4FileSeqNo() {
        return p300s4FileSeqNo;
    }

    public void setP300s4FileSeqNo(Integer p300s4FileSeqNo) {
        this.p300s4FileSeqNo = p300s4FileSeqNo;
    }

    public Character getP380s1DbCrInd() {
        return p380s1DbCrInd;
    }

    public void setP380s1DbCrInd(Character p380s1DbCrInd) {
        this.p380s1DbCrInd = p380s1DbCrInd;
    }

    public BigDecimal getP380s2TranAmt() {
        return p380s2TranAmt;
    }

    public void setP380s2TranAmt(BigDecimal p380s2TranAmt) {
        this.p380s2TranAmt = p380s2TranAmt;
    }

    public Character getP381s1DbCrInd() {
        return p381s1DbCrInd;
    }

    public void setP381s1DbCrInd(Character p381s1DbCrInd) {
        this.p381s1DbCrInd = p381s1DbCrInd;
    }

    public BigDecimal getP381s2TranAmt() {
        return p381s2TranAmt;
    }

    public void setP381s2TranAmt(BigDecimal p381s2TranAmt) {
        this.p381s2TranAmt = p381s2TranAmt;
    }

    public Character getP384s1DbCrInd() {
        return p384s1DbCrInd;
    }

    public void setP384s1DbCrInd(Character p384s1DbCrInd) {
        this.p384s1DbCrInd = p384s1DbCrInd;
    }

    public BigDecimal getP384s2NetAmt() {
        return p384s2NetAmt;
    }

    public void setP384s2NetAmt(BigDecimal p384s2NetAmt) {
        this.p384s2NetAmt = p384s2NetAmt;
    }

    public Long getP400TranNoDbs() {
        return p400TranNoDbs;
    }

    public void setP400TranNoDbs(Long p400TranNoDbs) {
        this.p400TranNoDbs = p400TranNoDbs;
    }

    public Long getP401TranNoCrs() {
        return p401TranNoCrs;
    }

    public void setP401TranNoCrs(Long p401TranNoCrs) {
        this.p401TranNoCrs = p401TranNoCrs;
    }

    public Long getP402TranNoTot() {
        return p402TranNoTot;
    }

    public void setP402TranNoTot(Long p402TranNoTot) {
        this.p402TranNoTot = p402TranNoTot;
    }

    public Short getD49TranCurrCd() {
        return d49TranCurrCd;
    }

    public void setD49TranCurrCd(Short d49TranCurrCd) {
        this.d49TranCurrCd = d49TranCurrCd;
    }

    public String getD62AddtlData2() {
        return d62AddtlData2;
    }

    public void setD62AddtlData2(String d62AddtlData2) {
        this.d62AddtlData2 = d62AddtlData2;
    }

    public Long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(Long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
    }

    public Long getD100RecvInstId() {
        return d100RecvInstId;
    }

    public void setD100RecvInstId(Long d100RecvInstId) {
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
        hash += (mcCurSumPK != null ? mcCurSumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McCurSum)) {
            return false;
        }
        McCurSum other = (McCurSum) object;
        if ((this.mcCurSumPK == null && other.mcCurSumPK != null) || (this.mcCurSumPK != null && !this.mcCurSumPK.equals(other.mcCurSumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McCurSum[ mcCurSumPK=" + mcCurSumPK + " ]";
    }
    
}
