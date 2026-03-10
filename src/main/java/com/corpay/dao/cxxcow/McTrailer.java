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
@Table(name = "MC_TRAILER", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McTrailer.findAll", query = "SELECT m FROM McTrailer m"),
    @NamedQuery(name = "McTrailer.findByP105s1FileTy", query = "SELECT m FROM McTrailer m WHERE m.mcTrailerPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McTrailer.findByP105s2FileRDt", query = "SELECT m FROM McTrailer m WHERE m.mcTrailerPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McTrailer.findByP105s3ProcId", query = "SELECT m FROM McTrailer m WHERE m.mcTrailerPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McTrailer.findByP105s4FileSeqNo", query = "SELECT m FROM McTrailer m WHERE m.mcTrailerPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McTrailer.findByMsgTyId", query = "SELECT m FROM McTrailer m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McTrailer.findByBitMapPri", query = "SELECT m FROM McTrailer m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McTrailer.findByD1BitMapSec", query = "SELECT m FROM McTrailer m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McTrailer.findByD2PriAccntNo", query = "SELECT m FROM McTrailer m WHERE m.d2PriAccntNo = :d2PriAccntNo"),
    @NamedQuery(name = "McTrailer.findByD24FuncCd", query = "SELECT m FROM McTrailer m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McTrailer.findByD48AddtlDat", query = "SELECT m FROM McTrailer m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McTrailer.findByP191OrMsgFmt", query = "SELECT m FROM McTrailer m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McTrailer.findByP301CheksumAmt", query = "SELECT m FROM McTrailer m WHERE m.p301CheksumAmt = :p301CheksumAmt"),
    @NamedQuery(name = "McTrailer.findByP306CntsFMsg", query = "SELECT m FROM McTrailer m WHERE m.p306CntsFMsg = :p306CntsFMsg"),
    @NamedQuery(name = "McTrailer.findByD71MsgNo", query = "SELECT m FROM McTrailer m WHERE m.d71MsgNo = :d71MsgNo")})
public class McTrailer implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McTrailerPK mcTrailerPK;
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
    @Column(name = "P191_OR_MSG_FMT")
    private Short p191OrMsgFmt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "P301_CHEKSUM_AMT")
    private BigDecimal p301CheksumAmt;
    @Column(name = "P306_CNTS_F_MSG")
    private Integer p306CntsFMsg;
    @Column(name = "D71_MSG_NO")
    private Integer d71MsgNo;

    public McTrailer() {
    }

    public McTrailer(McTrailerPK mcTrailerPK) {
        this.mcTrailerPK = mcTrailerPK;
    }

    public McTrailer(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo) {
        this.mcTrailerPK = new McTrailerPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo);
    }

    public McTrailerPK getMcTrailerPK() {
        return mcTrailerPK;
    }

    public void setMcTrailerPK(McTrailerPK mcTrailerPK) {
        this.mcTrailerPK = mcTrailerPK;
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

    public Short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(Short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
    }

    public BigDecimal getP301CheksumAmt() {
        return p301CheksumAmt;
    }

    public void setP301CheksumAmt(BigDecimal p301CheksumAmt) {
        this.p301CheksumAmt = p301CheksumAmt;
    }

    public Integer getP306CntsFMsg() {
        return p306CntsFMsg;
    }

    public void setP306CntsFMsg(Integer p306CntsFMsg) {
        this.p306CntsFMsg = p306CntsFMsg;
    }

    public Integer getD71MsgNo() {
        return d71MsgNo;
    }

    public void setD71MsgNo(Integer d71MsgNo) {
        this.d71MsgNo = d71MsgNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcTrailerPK != null ? mcTrailerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McTrailer)) {
            return false;
        }
        McTrailer other = (McTrailer) object;
        if ((this.mcTrailerPK == null && other.mcTrailerPK != null) || (this.mcTrailerPK != null && !this.mcTrailerPK.equals(other.mcTrailerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McTrailer[ mcTrailerPK=" + mcTrailerPK + " ]";
    }
    
}
