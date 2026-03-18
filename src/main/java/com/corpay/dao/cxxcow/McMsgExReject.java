package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_MSG_EX_REJECT", catalog = "", schema = "CXXCOW")
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
