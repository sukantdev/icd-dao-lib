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
@Table(name = "MC_MSG_EX_REJECT", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McMsgExReject.findAll", query = "SELECT m FROM McMsgExReject m"),
    @NamedQuery(name = "McMsgExReject.findByP105s1FileTy", query = "SELECT m FROM McMsgExReject m WHERE m.mcMsgExRejectPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McMsgExReject.findByP105s2FileRDt", query = "SELECT m FROM McMsgExReject m WHERE m.mcMsgExRejectPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McMsgExReject.findByP105s3ProcId", query = "SELECT m FROM McMsgExReject m WHERE m.mcMsgExRejectPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McMsgExReject.findByP105s4FileSeqNo", query = "SELECT m FROM McMsgExReject m WHERE m.mcMsgExRejectPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McMsgExReject.findByMsgTyId", query = "SELECT m FROM McMsgExReject m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McMsgExReject.findByBitMapPri", query = "SELECT m FROM McMsgExReject m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McMsgExReject.findByD1BitMapSec", query = "SELECT m FROM McMsgExReject m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McMsgExReject.findByD24FuncCd", query = "SELECT m FROM McMsgExReject m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McMsgExReject.findByD48AddtlDat", query = "SELECT m FROM McMsgExReject m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McMsgExReject.findByP025s1MsgRev", query = "SELECT m FROM McMsgExReject m WHERE m.p025s1MsgRev = :p025s1MsgRev"),
    @NamedQuery(name = "McMsgExReject.findByP025s2Cprdtorig", query = "SELECT m FROM McMsgExReject m WHERE m.p025s2Cprdtorig = :p025s2Cprdtorig"),
    @NamedQuery(name = "McMsgExReject.findByP026s1FileRev", query = "SELECT m FROM McMsgExReject m WHERE m.p026s1FileRev = :p026s1FileRev"),
    @NamedQuery(name = "McMsgExReject.findByP026s2Cprdtor", query = "SELECT m FROM McMsgExReject m WHERE m.p026s2Cprdtor = :p026s2Cprdtor"),
    @NamedQuery(name = "McMsgExReject.findByP138SrceMsg", query = "SELECT m FROM McMsgExReject m WHERE m.p138SrceMsg = :p138SrceMsg"),
    @NamedQuery(name = "McMsgExReject.findByP165s1StlInd", query = "SELECT m FROM McMsgExReject m WHERE m.p165s1StlInd = :p165s1StlInd"),
    @NamedQuery(name = "McMsgExReject.findByP165s2StlInfo", query = "SELECT m FROM McMsgExReject m WHERE m.p165s2StlInfo = :p165s2StlInfo"),
    @NamedQuery(name = "McMsgExReject.findByP280s1FileTy", query = "SELECT m FROM McMsgExReject m WHERE m.p280s1FileTy = :p280s1FileTy"),
    @NamedQuery(name = "McMsgExReject.findByP280s2FileRfDt", query = "SELECT m FROM McMsgExReject m WHERE m.p280s2FileRfDt = :p280s2FileRfDt"),
    @NamedQuery(name = "McMsgExReject.findByP280s3ProcId", query = "SELECT m FROM McMsgExReject m WHERE m.p280s3ProcId = :p280s3ProcId"),
    @NamedQuery(name = "McMsgExReject.findByP280s4FileSqNo", query = "SELECT m FROM McMsgExReject m WHERE m.p280s4FileSqNo = :p280s4FileSqNo"),
    @NamedQuery(name = "McMsgExReject.findByD71MsgNo", query = "SELECT m FROM McMsgExReject m WHERE m.mcMsgExRejectPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McMsgExReject.findByD72DataRec", query = "SELECT m FROM McMsgExReject m WHERE m.d72DataRec = :d72DataRec"),
    @NamedQuery(name = "McMsgExReject.findByD93TrDestInst", query = "SELECT m FROM McMsgExReject m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McMsgExReject.findByD94TrOrgInst", query = "SELECT m FROM McMsgExReject m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McMsgExReject.findByD100RecvInstId", query = "SELECT m FROM McMsgExReject m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McMsgExReject.findByD123AddtlDat3", query = "SELECT m FROM McMsgExReject m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McMsgExReject.findByD124AddtlDat4", query = "SELECT m FROM McMsgExReject m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McMsgExReject.findByD125AddtlDat5", query = "SELECT m FROM McMsgExReject m WHERE m.d125AddtlDat5 = :d125AddtlDat5"),
    @NamedQuery(name = "McMsgExReject.findByP006s1AcptBrdId", query = "SELECT m FROM McMsgExReject m WHERE m.p006s1AcptBrdId = :p006s1AcptBrdId"),
    @NamedQuery(name = "McMsgExReject.findByP006s2BussrvAtcd", query = "SELECT m FROM McMsgExReject m WHERE m.p006s2BussrvAtcd = :p006s2BussrvAtcd"),
    @NamedQuery(name = "McMsgExReject.findByP006s3BussrvIdcd", query = "SELECT m FROM McMsgExReject m WHERE m.p006s3BussrvIdcd = :p006s3BussrvIdcd")})
public class McMsgExReject implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McMsgExRejectPK mcMsgExRejectPK;
    @Column(name = "MSG_TY_ID")
    private Short msgTyId;
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Column(name = "P025S1_MSG_REV")
    private Character p025s1MsgRev;
    @Column(name = "P025S2_CPRDTORIG")
    private Integer p025s2Cprdtorig;
    @Column(name = "P026S1_FILE_REV")
    private Character p026s1FileRev;
    @Column(name = "P026S2_CPRDTOR")
    private Integer p026s2Cprdtor;
    @Column(name = "P138_SRCE_MSG")
    private Integer p138SrceMsg;
    @Column(name = "P165S1_STL_IND")
    private Character p165s1StlInd;
    @Column(name = "P165S2_STL_INFO")
    private String p165s2StlInfo;
    @Column(name = "P280S1_FILE_TY")
    private Integer p280s1FileTy;
    @Column(name = "P280S2_FILE_RF_DT")
    private Integer p280s2FileRfDt;
    @Column(name = "P280S3_PROC_ID")
    private Long p280s3ProcId;
    @Column(name = "P280S4_FILE_SQ_NO")
    private Integer p280s4FileSqNo;
    @Column(name = "D72_DATA_REC")
    private String d72DataRec;
    @Column(name = "D93_TR_DEST_INST")
    private Long d93TrDestInst;
    @Column(name = "D94_TR_ORG_INST")
    private Long d94TrOrgInst;
    @Column(name = "D100_RECV_INST_ID")
    private Long d100RecvInstId;
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;
    @Basic(optional = false)
    @Column(name = "P006S1_ACPT_BRD_ID")
    private String p006s1AcptBrdId;
    @Basic(optional = false)
    @Column(name = "P006S2_BUSSRV_ATCD")
    private Character p006s2BussrvAtcd;
    @Basic(optional = false)
    @Column(name = "P006S3_BUSSRV_IDCD")
    private String p006s3BussrvIdcd;

    public McMsgExReject() {
    }

    public McMsgExReject(McMsgExRejectPK mcMsgExRejectPK) {
        this.mcMsgExRejectPK = mcMsgExRejectPK;
    }

    public McMsgExReject(McMsgExRejectPK mcMsgExRejectPK, String p006s1AcptBrdId, Character p006s2BussrvAtcd, String p006s3BussrvIdcd) {
        this.mcMsgExRejectPK = mcMsgExRejectPK;
        this.p006s1AcptBrdId = p006s1AcptBrdId;
        this.p006s2BussrvAtcd = p006s2BussrvAtcd;
        this.p006s3BussrvIdcd = p006s3BussrvIdcd;
    }

    public McMsgExReject(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcMsgExRejectPK = new McMsgExRejectPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McMsgExRejectPK getMcMsgExRejectPK() {
        return mcMsgExRejectPK;
    }

    public void setMcMsgExRejectPK(McMsgExRejectPK mcMsgExRejectPK) {
        this.mcMsgExRejectPK = mcMsgExRejectPK;
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

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
    }

    public Character getP025s1MsgRev() {
        return p025s1MsgRev;
    }

    public void setP025s1MsgRev(Character p025s1MsgRev) {
        this.p025s1MsgRev = p025s1MsgRev;
    }

    public Integer getP025s2Cprdtorig() {
        return p025s2Cprdtorig;
    }

    public void setP025s2Cprdtorig(Integer p025s2Cprdtorig) {
        this.p025s2Cprdtorig = p025s2Cprdtorig;
    }

    public Character getP026s1FileRev() {
        return p026s1FileRev;
    }

    public void setP026s1FileRev(Character p026s1FileRev) {
        this.p026s1FileRev = p026s1FileRev;
    }

    public Integer getP026s2Cprdtor() {
        return p026s2Cprdtor;
    }

    public void setP026s2Cprdtor(Integer p026s2Cprdtor) {
        this.p026s2Cprdtor = p026s2Cprdtor;
    }

    public Integer getP138SrceMsg() {
        return p138SrceMsg;
    }

    public void setP138SrceMsg(Integer p138SrceMsg) {
        this.p138SrceMsg = p138SrceMsg;
    }

    public Character getP165s1StlInd() {
        return p165s1StlInd;
    }

    public void setP165s1StlInd(Character p165s1StlInd) {
        this.p165s1StlInd = p165s1StlInd;
    }

    public String getP165s2StlInfo() {
        return p165s2StlInfo;
    }

    public void setP165s2StlInfo(String p165s2StlInfo) {
        this.p165s2StlInfo = p165s2StlInfo;
    }

    public Integer getP280s1FileTy() {
        return p280s1FileTy;
    }

    public void setP280s1FileTy(Integer p280s1FileTy) {
        this.p280s1FileTy = p280s1FileTy;
    }

    public Integer getP280s2FileRfDt() {
        return p280s2FileRfDt;
    }

    public void setP280s2FileRfDt(Integer p280s2FileRfDt) {
        this.p280s2FileRfDt = p280s2FileRfDt;
    }

    public Long getP280s3ProcId() {
        return p280s3ProcId;
    }

    public void setP280s3ProcId(Long p280s3ProcId) {
        this.p280s3ProcId = p280s3ProcId;
    }

    public Integer getP280s4FileSqNo() {
        return p280s4FileSqNo;
    }

    public void setP280s4FileSqNo(Integer p280s4FileSqNo) {
        this.p280s4FileSqNo = p280s4FileSqNo;
    }

    public String getD72DataRec() {
        return d72DataRec;
    }

    public void setD72DataRec(String d72DataRec) {
        this.d72DataRec = d72DataRec;
    }

    public Long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(Long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
    }

    public Long getD94TrOrgInst() {
        return d94TrOrgInst;
    }

    public void setD94TrOrgInst(Long d94TrOrgInst) {
        this.d94TrOrgInst = d94TrOrgInst;
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

    public String getP006s1AcptBrdId() {
        return p006s1AcptBrdId;
    }

    public void setP006s1AcptBrdId(String p006s1AcptBrdId) {
        this.p006s1AcptBrdId = p006s1AcptBrdId;
    }

    public Character getP006s2BussrvAtcd() {
        return p006s2BussrvAtcd;
    }

    public void setP006s2BussrvAtcd(Character p006s2BussrvAtcd) {
        this.p006s2BussrvAtcd = p006s2BussrvAtcd;
    }

    public String getP006s3BussrvIdcd() {
        return p006s3BussrvIdcd;
    }

    public void setP006s3BussrvIdcd(String p006s3BussrvIdcd) {
        this.p006s3BussrvIdcd = p006s3BussrvIdcd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMsgExRejectPK != null ? mcMsgExRejectPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McMsgExReject)) {
            return false;
        }
        McMsgExReject other = (McMsgExReject) object;
        if ((this.mcMsgExRejectPK == null && other.mcMsgExRejectPK != null) || (this.mcMsgExRejectPK != null && !this.mcMsgExRejectPK.equals(other.mcMsgExRejectPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMsgExReject[ mcMsgExRejectPK=" + mcMsgExRejectPK + " ]";
    }
    
}
