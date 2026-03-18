package com.corpay.dao.cxxcow;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_TEXT_MSG", catalog = "", schema = "CXXCOW")
public class McTextMsg implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McTextMsgPK mcTextMsgPK;
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
    @Column(name = "D72_DATA_REC")
    private String d72DataRec;
    @Column(name = "D93_TR_DEST_INST")
    private Long d93TrDestInst;
    @Column(name = "D94_TR_ORG_INST")
    private Long d94TrOrgInst;
    @Column(name = "D100_RECV_INST_ID")
    private Long d100RecvInstId;

    public McTextMsg() {
    }

    public McTextMsg(McTextMsgPK mcTextMsgPK) {
        this.mcTextMsgPK = mcTextMsgPK;
    }

    public McTextMsg(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcTextMsgPK = new McTextMsgPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McTextMsgPK getMcTextMsgPK() {
        return mcTextMsgPK;
    }

    public void setMcTextMsgPK(McTextMsgPK mcTextMsgPK) {
        this.mcTextMsgPK = mcTextMsgPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcTextMsgPK != null ? mcTextMsgPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McTextMsg)) {
            return false;
        }
        McTextMsg other = (McTextMsg) object;
        if ((this.mcTextMsgPK == null && other.mcTextMsgPK != null) || (this.mcTextMsgPK != null && !this.mcTextMsgPK.equals(other.mcTextMsgPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McTextMsg[ mcTextMsgPK=" + mcTextMsgPK + " ]";
    }

}
