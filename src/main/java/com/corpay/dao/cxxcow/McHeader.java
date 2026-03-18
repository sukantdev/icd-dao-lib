package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MC_HEADER", catalog = "", schema = "CXXCOW")
public class McHeader implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McHeaderPK mcHeaderPK;
    @Column(name = "MSG_TY_ID")
    private Short msgTyId;
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Column(name = "D2_PRI_ACCNT_NO")
    private String d2PriAccntNo;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Column(name = "P026S1_FILE_REV")
    private Character p026s1FileRev;
    @Column(name = "P026S2_CPRDTOR")
    private Integer p026s2Cprdtor;
    @Column(name = "P110S1_TRANMSN_TY")
    private Short p110s1TranmsnTy;
    @Column(name = "P110S2_TRNM_R_DT")
    private Integer p110s2TrnmRDt;
    @Column(name = "P110S3_PROC_ID")
    private Long p110s3ProcId;
    @Column(name = "P110S4_TRNM_SEQ")
    private Integer p110s4TrnmSeq;
    @Column(name = "P122_PRCSNG_MD")
    private Character p122PrcsngMd;
    @Column(name = "P191_OR_MSG_FMT")
    private Short p191OrMsgFmt;
    @Column(name = "D71_MSG_NO")
    private Integer d71MsgNo;
    @Column(name = "FP_PROC_FLAG")
    private Character fpProcFlag;
    @Column(name = "FP_PROC_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fpProcDt;
    @Basic(optional = false)
    @Column(name = "MC_FILTERED_FLG")
    private Character mcFilteredFlg;
    @Basic(optional = false)
    @Column(name = "MC_CAN_FTRD_FLG")
    private Character mcCanFtrdFlg;
    @Basic(optional = false)
    @Column(name = "ST_SLCTR_FLG")
    private Character stSlctrFlg;
    @Basic(optional = false)
    @Column(name = "FLTADV_PROC_FLG")
    private Character fltadvProcFlg;

    public McHeader() {
    }

    public McHeader(McHeaderPK mcHeaderPK) {
        this.mcHeaderPK = mcHeaderPK;
    }

    public McHeader(McHeaderPK mcHeaderPK, Character mcFilteredFlg, Character mcCanFtrdFlg, Character stSlctrFlg, Character fltadvProcFlg) {
        this.mcHeaderPK = mcHeaderPK;
        this.mcFilteredFlg = mcFilteredFlg;
        this.mcCanFtrdFlg = mcCanFtrdFlg;
        this.stSlctrFlg = stSlctrFlg;
        this.fltadvProcFlg = fltadvProcFlg;
    }

    public McHeader(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo) {
        this.mcHeaderPK = new McHeaderPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo);
    }

    public McHeaderPK getMcHeaderPK() {
        return mcHeaderPK;
    }

    public void setMcHeaderPK(McHeaderPK mcHeaderPK) {
        this.mcHeaderPK = mcHeaderPK;
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

    public String getD2PriAccntNo() {
        return d2PriAccntNo;
    }

    public void setD2PriAccntNo(String d2PriAccntNo) {
        this.d2PriAccntNo = d2PriAccntNo;
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

    public Short getP110s1TranmsnTy() {
        return p110s1TranmsnTy;
    }

    public void setP110s1TranmsnTy(Short p110s1TranmsnTy) {
        this.p110s1TranmsnTy = p110s1TranmsnTy;
    }

    public Integer getP110s2TrnmRDt() {
        return p110s2TrnmRDt;
    }

    public void setP110s2TrnmRDt(Integer p110s2TrnmRDt) {
        this.p110s2TrnmRDt = p110s2TrnmRDt;
    }

    public Long getP110s3ProcId() {
        return p110s3ProcId;
    }

    public void setP110s3ProcId(Long p110s3ProcId) {
        this.p110s3ProcId = p110s3ProcId;
    }

    public Integer getP110s4TrnmSeq() {
        return p110s4TrnmSeq;
    }

    public void setP110s4TrnmSeq(Integer p110s4TrnmSeq) {
        this.p110s4TrnmSeq = p110s4TrnmSeq;
    }

    public Character getP122PrcsngMd() {
        return p122PrcsngMd;
    }

    public void setP122PrcsngMd(Character p122PrcsngMd) {
        this.p122PrcsngMd = p122PrcsngMd;
    }

    public Short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(Short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
    }

    public Integer getD71MsgNo() {
        return d71MsgNo;
    }

    public void setD71MsgNo(Integer d71MsgNo) {
        this.d71MsgNo = d71MsgNo;
    }

    public Character getFpProcFlag() {
        return fpProcFlag;
    }

    public void setFpProcFlag(Character fpProcFlag) {
        this.fpProcFlag = fpProcFlag;
    }

    public Date getFpProcDt() {
        return fpProcDt;
    }

    public void setFpProcDt(Date fpProcDt) {
        this.fpProcDt = fpProcDt;
    }

    public Character getMcFilteredFlg() {
        return mcFilteredFlg;
    }

    public void setMcFilteredFlg(Character mcFilteredFlg) {
        this.mcFilteredFlg = mcFilteredFlg;
    }

    public Character getMcCanFtrdFlg() {
        return mcCanFtrdFlg;
    }

    public void setMcCanFtrdFlg(Character mcCanFtrdFlg) {
        this.mcCanFtrdFlg = mcCanFtrdFlg;
    }

    public Character getStSlctrFlg() {
        return stSlctrFlg;
    }

    public void setStSlctrFlg(Character stSlctrFlg) {
        this.stSlctrFlg = stSlctrFlg;
    }

    public Character getFltadvProcFlg() {
        return fltadvProcFlg;
    }

    public void setFltadvProcFlg(Character fltadvProcFlg) {
        this.fltadvProcFlg = fltadvProcFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcHeaderPK != null ? mcHeaderPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McHeader)) {
            return false;
        }
        McHeader other = (McHeader) object;
        if ((this.mcHeaderPK == null && other.mcHeaderPK != null) || (this.mcHeaderPK != null && !this.mcHeaderPK.equals(other.mcHeaderPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McHeader[ mcHeaderPK=" + mcHeaderPK + " ]";
    }

}
