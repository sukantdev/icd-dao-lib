/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_POST_XREF", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McPostXref.findAll", query = "SELECT m FROM McPostXref m"),
    @NamedQuery(name = "McPostXref.findByAuthUpdateTs", query = "SELECT m FROM McPostXref m WHERE m.authUpdateTs = :authUpdateTs"),
    @NamedQuery(name = "McPostXref.findByAuthPan", query = "SELECT m FROM McPostXref m WHERE m.authPan = :authPan"),
    @NamedQuery(name = "McPostXref.findByAuthUtDt", query = "SELECT m FROM McPostXref m WHERE m.authUtDt = :authUtDt"),
    @NamedQuery(name = "McPostXref.findByAuthApprovCd", query = "SELECT m FROM McPostXref m WHERE m.authApprovCd = :authApprovCd"),
    @NamedQuery(name = "McPostXref.findByAuthLocalTs", query = "SELECT m FROM McPostXref m WHERE m.authLocalTs = :authLocalTs"),
    @NamedQuery(name = "McPostXref.findByP105s1FileTy", query = "SELECT m FROM McPostXref m WHERE m.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McPostXref.findByP105s2FileRDt", query = "SELECT m FROM McPostXref m WHERE m.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McPostXref.findByP105s3ProcId", query = "SELECT m FROM McPostXref m WHERE m.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McPostXref.findByP105s4FileSeqNo", query = "SELECT m FROM McPostXref m WHERE m.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McPostXref.findByD71MsgNo", query = "SELECT m FROM McPostXref m WHERE m.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McPostXref.findByAuthD48s63TraceId", query = "SELECT m FROM McPostXref m WHERE m.authD48s63TraceId = :authD48s63TraceId"),
    @NamedQuery(name = "McPostXref.findByAuthPostedDt", query = "SELECT m FROM McPostXref m WHERE m.authPostedDt = :authPostedDt"),
    @NamedQuery(name = "McPostXref.findByAuthPostedTm", query = "SELECT m FROM McPostXref m WHERE m.authPostedTm = :authPostedTm"),
    @NamedQuery(name = "McPostXref.findByXpndCtlNbr", query = "SELECT m FROM McPostXref m WHERE m.xpndCtlNbr = :xpndCtlNbr"),
    @NamedQuery(name = "McPostXref.findByAuthPostMsgNo", query = "SELECT m FROM McPostXref m WHERE m.authPostMsgNo = :authPostMsgNo"),
    @NamedQuery(name = "McPostXref.findByAuthPostedAmt", query = "SELECT m FROM McPostXref m WHERE m.authPostedAmt = :authPostedAmt"),
    @NamedQuery(name = "McPostXref.findByD63s2TraceId", query = "SELECT m FROM McPostXref m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McPostXref.findByXborderFeeAmt", query = "SELECT m FROM McPostXref m WHERE m.xborderFeeAmt = :xborderFeeAmt"),
    @NamedQuery(name = "McPostXref.findByRowChgTs", query = "SELECT m FROM McPostXref m WHERE m.rowChgTs = :rowChgTs")})
public class McPostXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AUTH_UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authUpdateTs;
    @Basic(optional = false)
    @Column(name = "AUTH_PAN")
    private String authPan;
    @Basic(optional = false)
    @Column(name = "AUTH_UT_DT")
    @Temporal(TemporalType.DATE)
    private Date authUtDt;
    @Basic(optional = false)
    @Column(name = "AUTH_APPROV_CD")
    private int authApprovCd;
    @Basic(optional = false)
    @Column(name = "AUTH_LOCAL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authLocalTs;
    @Basic(optional = false)
    @Column(name = "P105S1_FILE_TY")
    private short p105s1FileTy;
    @Basic(optional = false)
    @Column(name = "P105S2_FILE_R_DT")
    private int p105s2FileRDt;
    @Basic(optional = false)
    @Column(name = "P105S3_PROC_ID")
    private long p105s3ProcId;
    @Basic(optional = false)
    @Column(name = "P105S4_FILE_SEQ_NO")
    private int p105s4FileSeqNo;
    @Basic(optional = false)
    @Column(name = "D71_MSG_NO")
    private int d71MsgNo;
    @Basic(optional = false)
    @Column(name = "AUTH_D48S63_TRACE_ID")
    private String authD48s63TraceId;
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_DT")
    @Temporal(TemporalType.DATE)
    private Date authPostedDt;
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_TM")
    @Temporal(TemporalType.TIME)
    private Date authPostedTm;
    @Basic(optional = false)
    @Column(name = "XPND_CTL_NBR")
    private int xpndCtlNbr;
    @Basic(optional = false)
    @Column(name = "AUTH_POST_MSG_NO")
    private int authPostMsgNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AUTH_POSTED_AMT")
    private BigDecimal authPostedAmt;
    @Basic(optional = false)
    @Column(name = "D63S2_TRACE_ID")
    private String d63s2TraceId;
    @Basic(optional = false)
    @Column(name = "XBORDER_FEE_AMT")
    private BigDecimal xborderFeeAmt;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;

    public McPostXref() {
    }

    public McPostXref(Date authUpdateTs) {
        this.authUpdateTs = authUpdateTs;
    }

    public McPostXref(Date authUpdateTs, String authPan, Date authUtDt, int authApprovCd, Date authLocalTs, short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, String authD48s63TraceId, Date authPostedDt, Date authPostedTm, int xpndCtlNbr, int authPostMsgNo, BigDecimal authPostedAmt, String d63s2TraceId, BigDecimal xborderFeeAmt, Date rowChgTs) {
        this.authUpdateTs = authUpdateTs;
        this.authPan = authPan;
        this.authUtDt = authUtDt;
        this.authApprovCd = authApprovCd;
        this.authLocalTs = authLocalTs;
        this.p105s1FileTy = p105s1FileTy;
        this.p105s2FileRDt = p105s2FileRDt;
        this.p105s3ProcId = p105s3ProcId;
        this.p105s4FileSeqNo = p105s4FileSeqNo;
        this.d71MsgNo = d71MsgNo;
        this.authD48s63TraceId = authD48s63TraceId;
        this.authPostedDt = authPostedDt;
        this.authPostedTm = authPostedTm;
        this.xpndCtlNbr = xpndCtlNbr;
        this.authPostMsgNo = authPostMsgNo;
        this.authPostedAmt = authPostedAmt;
        this.d63s2TraceId = d63s2TraceId;
        this.xborderFeeAmt = xborderFeeAmt;
        this.rowChgTs = rowChgTs;
    }

    public Date getAuthUpdateTs() {
        return authUpdateTs;
    }

    public void setAuthUpdateTs(Date authUpdateTs) {
        this.authUpdateTs = authUpdateTs;
    }

    public String getAuthPan() {
        return authPan;
    }

    public void setAuthPan(String authPan) {
        this.authPan = authPan;
    }

    public Date getAuthUtDt() {
        return authUtDt;
    }

    public void setAuthUtDt(Date authUtDt) {
        this.authUtDt = authUtDt;
    }

    public int getAuthApprovCd() {
        return authApprovCd;
    }

    public void setAuthApprovCd(int authApprovCd) {
        this.authApprovCd = authApprovCd;
    }

    public Date getAuthLocalTs() {
        return authLocalTs;
    }

    public void setAuthLocalTs(Date authLocalTs) {
        this.authLocalTs = authLocalTs;
    }

    public short getP105s1FileTy() {
        return p105s1FileTy;
    }

    public void setP105s1FileTy(short p105s1FileTy) {
        this.p105s1FileTy = p105s1FileTy;
    }

    public int getP105s2FileRDt() {
        return p105s2FileRDt;
    }

    public void setP105s2FileRDt(int p105s2FileRDt) {
        this.p105s2FileRDt = p105s2FileRDt;
    }

    public long getP105s3ProcId() {
        return p105s3ProcId;
    }

    public void setP105s3ProcId(long p105s3ProcId) {
        this.p105s3ProcId = p105s3ProcId;
    }

    public int getP105s4FileSeqNo() {
        return p105s4FileSeqNo;
    }

    public void setP105s4FileSeqNo(int p105s4FileSeqNo) {
        this.p105s4FileSeqNo = p105s4FileSeqNo;
    }

    public int getD71MsgNo() {
        return d71MsgNo;
    }

    public void setD71MsgNo(int d71MsgNo) {
        this.d71MsgNo = d71MsgNo;
    }

    public String getAuthD48s63TraceId() {
        return authD48s63TraceId;
    }

    public void setAuthD48s63TraceId(String authD48s63TraceId) {
        this.authD48s63TraceId = authD48s63TraceId;
    }

    public Date getAuthPostedDt() {
        return authPostedDt;
    }

    public void setAuthPostedDt(Date authPostedDt) {
        this.authPostedDt = authPostedDt;
    }

    public Date getAuthPostedTm() {
        return authPostedTm;
    }

    public void setAuthPostedTm(Date authPostedTm) {
        this.authPostedTm = authPostedTm;
    }

    public int getXpndCtlNbr() {
        return xpndCtlNbr;
    }

    public void setXpndCtlNbr(int xpndCtlNbr) {
        this.xpndCtlNbr = xpndCtlNbr;
    }

    public int getAuthPostMsgNo() {
        return authPostMsgNo;
    }

    public void setAuthPostMsgNo(int authPostMsgNo) {
        this.authPostMsgNo = authPostMsgNo;
    }

    public BigDecimal getAuthPostedAmt() {
        return authPostedAmt;
    }

    public void setAuthPostedAmt(BigDecimal authPostedAmt) {
        this.authPostedAmt = authPostedAmt;
    }

    public String getD63s2TraceId() {
        return d63s2TraceId;
    }

    public void setD63s2TraceId(String d63s2TraceId) {
        this.d63s2TraceId = d63s2TraceId;
    }

    public BigDecimal getXborderFeeAmt() {
        return xborderFeeAmt;
    }

    public void setXborderFeeAmt(BigDecimal xborderFeeAmt) {
        this.xborderFeeAmt = xborderFeeAmt;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (authUpdateTs != null ? authUpdateTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McPostXref)) {
            return false;
        }
        McPostXref other = (McPostXref) object;
        if ((this.authUpdateTs == null && other.authUpdateTs != null) || (this.authUpdateTs != null && !this.authUpdateTs.equals(other.authUpdateTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McPostXref[ authUpdateTs=" + authUpdateTs + " ]";
    }
    
}
