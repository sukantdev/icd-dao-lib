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

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_TEXT_MSG", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McTextMsg.findAll", query = "SELECT m FROM McTextMsg m"),
    @NamedQuery(name = "McTextMsg.findByP105s1FileTy", query = "SELECT m FROM McTextMsg m WHERE m.mcTextMsgPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McTextMsg.findByP105s2FileRDt", query = "SELECT m FROM McTextMsg m WHERE m.mcTextMsgPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McTextMsg.findByP105s3ProcId", query = "SELECT m FROM McTextMsg m WHERE m.mcTextMsgPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McTextMsg.findByP105s4FileSeqNo", query = "SELECT m FROM McTextMsg m WHERE m.mcTextMsgPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McTextMsg.findByD71MsgNo", query = "SELECT m FROM McTextMsg m WHERE m.mcTextMsgPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McTextMsg.findByMsgTyId", query = "SELECT m FROM McTextMsg m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McTextMsg.findByBitMapPri", query = "SELECT m FROM McTextMsg m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McTextMsg.findByD1BitMapSec", query = "SELECT m FROM McTextMsg m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McTextMsg.findByD24FuncCd", query = "SELECT m FROM McTextMsg m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McTextMsg.findByD25MsgRsnCd", query = "SELECT m FROM McTextMsg m WHERE m.d25MsgRsnCd = :d25MsgRsnCd"),
    @NamedQuery(name = "McTextMsg.findByD72DataRec", query = "SELECT m FROM McTextMsg m WHERE m.d72DataRec = :d72DataRec"),
    @NamedQuery(name = "McTextMsg.findByD93TrDestInst", query = "SELECT m FROM McTextMsg m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McTextMsg.findByD94TrOrgInst", query = "SELECT m FROM McTextMsg m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McTextMsg.findByD100RecvInstId", query = "SELECT m FROM McTextMsg m WHERE m.d100RecvInstId = :d100RecvInstId")})
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
