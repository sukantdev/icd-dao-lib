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
@Table(name = "MC_CUR_UPDATE", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McCurUpdate.findAll", query = "SELECT m FROM McCurUpdate m"),
    @NamedQuery(name = "McCurUpdate.findByP105s1FileTy", query = "SELECT m FROM McCurUpdate m WHERE m.mcCurUpdatePK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McCurUpdate.findByP105s2FileRDt", query = "SELECT m FROM McCurUpdate m WHERE m.mcCurUpdatePK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McCurUpdate.findByP105s3ProcId", query = "SELECT m FROM McCurUpdate m WHERE m.mcCurUpdatePK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McCurUpdate.findByP105s4FileSeqNo", query = "SELECT m FROM McCurUpdate m WHERE m.mcCurUpdatePK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McCurUpdate.findByMsgTyId", query = "SELECT m FROM McCurUpdate m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McCurUpdate.findByBitMapPri", query = "SELECT m FROM McCurUpdate m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McCurUpdate.findByD1BitMapSec", query = "SELECT m FROM McCurUpdate m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McCurUpdate.findByD24FuncCd", query = "SELECT m FROM McCurUpdate m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McCurUpdate.findByD48AddtlDat", query = "SELECT m FROM McCurUpdate m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McCurUpdate.findByP280s1FileTy", query = "SELECT m FROM McCurUpdate m WHERE m.p280s1FileTy = :p280s1FileTy"),
    @NamedQuery(name = "McCurUpdate.findByP280s2FileRfDt", query = "SELECT m FROM McCurUpdate m WHERE m.p280s2FileRfDt = :p280s2FileRfDt"),
    @NamedQuery(name = "McCurUpdate.findByP280s3ProcId", query = "SELECT m FROM McCurUpdate m WHERE m.p280s3ProcId = :p280s3ProcId"),
    @NamedQuery(name = "McCurUpdate.findByP280s4FileSqNo", query = "SELECT m FROM McCurUpdate m WHERE m.p280s4FileSqNo = :p280s4FileSqNo"),
    @NamedQuery(name = "McCurUpdate.findByD50ReconCurCd", query = "SELECT m FROM McCurUpdate m WHERE m.d50ReconCurCd = :d50ReconCurCd"),
    @NamedQuery(name = "McCurUpdate.findByD71MsgNo", query = "SELECT m FROM McCurUpdate m WHERE m.mcCurUpdatePK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McCurUpdate.findByD93TrDestInst", query = "SELECT m FROM McCurUpdate m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McCurUpdate.findByD94TrOrgInst", query = "SELECT m FROM McCurUpdate m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McCurUpdate.findByD100RecvInstId", query = "SELECT m FROM McCurUpdate m WHERE m.d100RecvInstId = :d100RecvInstId")})
public class McCurUpdate implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McCurUpdatePK mcCurUpdatePK;
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
    @Column(name = "P280S1_FILE_TY")
    private Integer p280s1FileTy;
    @Column(name = "P280S2_FILE_RF_DT")
    private Integer p280s2FileRfDt;
    @Column(name = "P280S3_PROC_ID")
    private Long p280s3ProcId;
    @Column(name = "P280S4_FILE_SQ_NO")
    private Integer p280s4FileSqNo;
    @Column(name = "D50_RECON_CUR_CD")
    private Short d50ReconCurCd;
    @Column(name = "D93_TR_DEST_INST")
    private Long d93TrDestInst;
    @Column(name = "D94_TR_ORG_INST")
    private Long d94TrOrgInst;
    @Column(name = "D100_RECV_INST_ID")
    private Long d100RecvInstId;

    public McCurUpdate() {
    }

    public McCurUpdate(McCurUpdatePK mcCurUpdatePK) {
        this.mcCurUpdatePK = mcCurUpdatePK;
    }

    public McCurUpdate(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcCurUpdatePK = new McCurUpdatePK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McCurUpdatePK getMcCurUpdatePK() {
        return mcCurUpdatePK;
    }

    public void setMcCurUpdatePK(McCurUpdatePK mcCurUpdatePK) {
        this.mcCurUpdatePK = mcCurUpdatePK;
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

    public Short getD50ReconCurCd() {
        return d50ReconCurCd;
    }

    public void setD50ReconCurCd(Short d50ReconCurCd) {
        this.d50ReconCurCd = d50ReconCurCd;
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
        hash += (mcCurUpdatePK != null ? mcCurUpdatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McCurUpdate)) {
            return false;
        }
        McCurUpdate other = (McCurUpdate) object;
        if ((this.mcCurUpdatePK == null && other.mcCurUpdatePK != null) || (this.mcCurUpdatePK != null && !this.mcCurUpdatePK.equals(other.mcCurUpdatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McCurUpdate[ mcCurUpdatePK=" + mcCurUpdatePK + " ]";
    }
    
}
