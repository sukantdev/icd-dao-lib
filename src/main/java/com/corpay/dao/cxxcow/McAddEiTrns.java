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

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_ADD_EI_TRNS", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McAddEiTrns.findAll", query = "SELECT m FROM McAddEiTrns m"),
    @NamedQuery(name = "McAddEiTrns.findByP105s1FileTy", query = "SELECT m FROM McAddEiTrns m WHERE m.mcAddEiTrnsPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McAddEiTrns.findByP105s2FileRDt", query = "SELECT m FROM McAddEiTrns m WHERE m.mcAddEiTrnsPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McAddEiTrns.findByP105s3ProcId", query = "SELECT m FROM McAddEiTrns m WHERE m.mcAddEiTrnsPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McAddEiTrns.findByP105s4FileSeqNo", query = "SELECT m FROM McAddEiTrns m WHERE m.mcAddEiTrnsPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McAddEiTrns.findByMsgTyId", query = "SELECT m FROM McAddEiTrns m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McAddEiTrns.findByD71MsgNo", query = "SELECT m FROM McAddEiTrns m WHERE m.mcAddEiTrnsPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McAddEiTrns.findByBitMapPri", query = "SELECT m FROM McAddEiTrns m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McAddEiTrns.findByD1BitMapSec", query = "SELECT m FROM McAddEiTrns m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McAddEiTrns.findByD24FuncCd", query = "SELECT m FROM McAddEiTrns m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McAddEiTrns.findByD32AcqInstIdCd", query = "SELECT m FROM McAddEiTrns m WHERE m.d32AcqInstIdCd = :d32AcqInstIdCd"),
    @NamedQuery(name = "McAddEiTrns.findByD33FwdngInstCd", query = "SELECT m FROM McAddEiTrns m WHERE m.d33FwdngInstCd = :d33FwdngInstCd"),
    @NamedQuery(name = "McAddEiTrns.findByP191OrMsgFmt", query = "SELECT m FROM McAddEiTrns m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McAddEiTrns.findByP501s1UsageCd", query = "SELECT m FROM McAddEiTrns m WHERE m.p501s1UsageCd = :p501s1UsageCd"),
    @NamedQuery(name = "McAddEiTrns.findByP501s2IndstyRec", query = "SELECT m FROM McAddEiTrns m WHERE m.p501s2IndstyRec = :p501s2IndstyRec"),
    @NamedQuery(name = "McAddEiTrns.findByP501s3OccInd", query = "SELECT m FROM McAddEiTrns m WHERE m.p501s3OccInd = :p501s3OccInd"),
    @NamedQuery(name = "McAddEiTrns.findByP501s4MsgNo", query = "SELECT m FROM McAddEiTrns m WHERE m.p501s4MsgNo = :p501s4MsgNo"),
    @NamedQuery(name = "McAddEiTrns.findByP573InvNo", query = "SELECT m FROM McAddEiTrns m WHERE m.p573InvNo = :p573InvNo"),
    @NamedQuery(name = "McAddEiTrns.findByP579InvDt", query = "SELECT m FROM McAddEiTrns m WHERE m.p579InvDt = :p579InvDt"),
    @NamedQuery(name = "McAddEiTrns.findByP589s1InvCrtDt", query = "SELECT m FROM McAddEiTrns m WHERE m.p589s1InvCrtDt = :p589s1InvCrtDt"),
    @NamedQuery(name = "McAddEiTrns.findByP589s2InvCrtTm", query = "SELECT m FROM McAddEiTrns m WHERE m.p589s2InvCrtTm = :p589s2InvCrtTm"),
    @NamedQuery(name = "McAddEiTrns.findByD63s1LfcycSpInd", query = "SELECT m FROM McAddEiTrns m WHERE m.d63s1LfcycSpInd = :d63s1LfcycSpInd"),
    @NamedQuery(name = "McAddEiTrns.findByD63s2TraceId", query = "SELECT m FROM McAddEiTrns m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McAddEiTrns.findByD63s3ValidnCd", query = "SELECT m FROM McAddEiTrns m WHERE m.d63s3ValidnCd = :d63s3ValidnCd"),
    @NamedQuery(name = "McAddEiTrns.findByD63s4LfcyctrSeq", query = "SELECT m FROM McAddEiTrns m WHERE m.d63s4LfcyctrSeq = :d63s4LfcyctrSeq"),
    @NamedQuery(name = "McAddEiTrns.findByD63s5LfcyctrTot", query = "SELECT m FROM McAddEiTrns m WHERE m.d63s5LfcyctrTot = :d63s5LfcyctrTot"),
    @NamedQuery(name = "McAddEiTrns.findByD93TrDestInst", query = "SELECT m FROM McAddEiTrns m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McAddEiTrns.findByD94TrOrgInst", query = "SELECT m FROM McAddEiTrns m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McAddEiTrns.findByD100RecvInstId", query = "SELECT m FROM McAddEiTrns m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McAddEiTrns.findByD48AddtlDat", query = "SELECT m FROM McAddEiTrns m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McAddEiTrns.findByD62AddtlData2", query = "SELECT m FROM McAddEiTrns m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McAddEiTrns.findByD123AddtlDat3", query = "SELECT m FROM McAddEiTrns m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McAddEiTrns.findByD124AddtlDat4", query = "SELECT m FROM McAddEiTrns m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McAddEiTrns.findByD125AddtlDat5", query = "SELECT m FROM McAddEiTrns m WHERE m.d125AddtlDat5 = :d125AddtlDat5")})
public class McAddEiTrns implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddEiTrnsPK mcAddEiTrnsPK;
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
    @Column(name = "P573_INV_NO")
    private String p573InvNo;
    @Basic(optional = false)
    @Column(name = "P579_INV_DT")
    private String p579InvDt;
    @Basic(optional = false)
    @Column(name = "P589S1_INV_CRT_DT")
    private int p589s1InvCrtDt;
    @Basic(optional = false)
    @Column(name = "P589S2_INV_CRT_TM")
    private int p589s2InvCrtTm;
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

    public McAddEiTrns() {
    }

    public McAddEiTrns(McAddEiTrnsPK mcAddEiTrnsPK) {
        this.mcAddEiTrnsPK = mcAddEiTrnsPK;
    }

    public McAddEiTrns(McAddEiTrnsPK mcAddEiTrnsPK, short msgTyId, String bitMapPri, String d1BitMapSec, short d24FuncCd, long d32AcqInstIdCd, long d33FwdngInstCd, short p191OrMsgFmt, short p501s1UsageCd, short p501s2IndstyRec, short p501s3OccInd, int p501s4MsgNo, String p573InvNo, String p579InvDt, int p589s1InvCrtDt, int p589s2InvCrtTm, Character d63s1LfcycSpInd, String d63s2TraceId, String d63s3ValidnCd, String d63s4LfcyctrSeq, String d63s5LfcyctrTot, long d93TrDestInst, long d94TrOrgInst, long d100RecvInstId, String d48AddtlDat, String d62AddtlData2, String d123AddtlDat3, String d124AddtlDat4, String d125AddtlDat5) {
        this.mcAddEiTrnsPK = mcAddEiTrnsPK;
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
        this.p573InvNo = p573InvNo;
        this.p579InvDt = p579InvDt;
        this.p589s1InvCrtDt = p589s1InvCrtDt;
        this.p589s2InvCrtTm = p589s2InvCrtTm;
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
    }

    public McAddEiTrns(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcAddEiTrnsPK = new McAddEiTrnsPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McAddEiTrnsPK getMcAddEiTrnsPK() {
        return mcAddEiTrnsPK;
    }

    public void setMcAddEiTrnsPK(McAddEiTrnsPK mcAddEiTrnsPK) {
        this.mcAddEiTrnsPK = mcAddEiTrnsPK;
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

    public String getP573InvNo() {
        return p573InvNo;
    }

    public void setP573InvNo(String p573InvNo) {
        this.p573InvNo = p573InvNo;
    }

    public String getP579InvDt() {
        return p579InvDt;
    }

    public void setP579InvDt(String p579InvDt) {
        this.p579InvDt = p579InvDt;
    }

    public int getP589s1InvCrtDt() {
        return p589s1InvCrtDt;
    }

    public void setP589s1InvCrtDt(int p589s1InvCrtDt) {
        this.p589s1InvCrtDt = p589s1InvCrtDt;
    }

    public int getP589s2InvCrtTm() {
        return p589s2InvCrtTm;
    }

    public void setP589s2InvCrtTm(int p589s2InvCrtTm) {
        this.p589s2InvCrtTm = p589s2InvCrtTm;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddEiTrnsPK != null ? mcAddEiTrnsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddEiTrns)) {
            return false;
        }
        McAddEiTrns other = (McAddEiTrns) object;
        if ((this.mcAddEiTrnsPK == null && other.mcAddEiTrnsPK != null) || (this.mcAddEiTrnsPK != null && !this.mcAddEiTrnsPK.equals(other.mcAddEiTrnsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddEiTrns[ mcAddEiTrnsPK=" + mcAddEiTrnsPK + " ]";
    }
    
}
