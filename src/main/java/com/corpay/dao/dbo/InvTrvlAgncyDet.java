/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "INV_TRVL_AGNCY_DET", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvTrvlAgncyDet.findAll", query = "SELECT i FROM InvTrvlAgncyDet i")})
public class InvTrvlAgncyDet implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvTrvlAgncyDetPK invTrvlAgncyDetPK;
    @Basic(optional = false)
    @Column(name = "CSTM_ID_TYP")
    private String cstmIdTyp;
    @Basic(optional = false)
    @Column(name = "CSTM_ID_DET")
    private String cstmIdDet;
    @Basic(optional = false)
    @Column(name = "TRVL_AGNCY_SEQ_NUM")
    private String trvlAgncySeqNum;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TRVL_AGNCY_FEE_AMT")
    private BigDecimal trvlAgncyFeeAmt;
    @Basic(optional = false)
    @Column(name = "TRVL_AGNCY_FEE_AMT_D_C")
    private Character trvlAgncyFeeAmtDC;
    @Basic(optional = false)
    @Column(name = "TRVL_AGNCY_FEE_AMT_RT")
    private long trvlAgncyFeeAmtRt;
    @Basic(optional = false)
    @Column(name = "TRVL_AGNCY_FEE_AMT_DESC")
    private String trvlAgncyFeeAmtDesc;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public InvTrvlAgncyDet() {
    }

    public InvTrvlAgncyDet(InvTrvlAgncyDetPK invTrvlAgncyDetPK) {
        this.invTrvlAgncyDetPK = invTrvlAgncyDetPK;
    }

    public InvTrvlAgncyDet(InvTrvlAgncyDetPK invTrvlAgncyDetPK, String cstmIdTyp, String cstmIdDet, String trvlAgncySeqNum, BigDecimal trvlAgncyFeeAmt, Character trvlAgncyFeeAmtDC, long trvlAgncyFeeAmtRt, String trvlAgncyFeeAmtDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invTrvlAgncyDetPK = invTrvlAgncyDetPK;
        this.cstmIdTyp = cstmIdTyp;
        this.cstmIdDet = cstmIdDet;
        this.trvlAgncySeqNum = trvlAgncySeqNum;
        this.trvlAgncyFeeAmt = trvlAgncyFeeAmt;
        this.trvlAgncyFeeAmtDC = trvlAgncyFeeAmtDC;
        this.trvlAgncyFeeAmtRt = trvlAgncyFeeAmtRt;
        this.trvlAgncyFeeAmtDesc = trvlAgncyFeeAmtDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvTrvlAgncyDet(Date pstdDt, int trnsId, short seqNo) {
        this.invTrvlAgncyDetPK = new InvTrvlAgncyDetPK(pstdDt, trnsId, seqNo);
    }

    public InvTrvlAgncyDetPK getInvTrvlAgncyDetPK() {
        return invTrvlAgncyDetPK;
    }

    public void setInvTrvlAgncyDetPK(InvTrvlAgncyDetPK invTrvlAgncyDetPK) {
        this.invTrvlAgncyDetPK = invTrvlAgncyDetPK;
    }

    public String getCstmIdTyp() {
        return cstmIdTyp;
    }

    public void setCstmIdTyp(String cstmIdTyp) {
        this.cstmIdTyp = cstmIdTyp;
    }

    public String getCstmIdDet() {
        return cstmIdDet;
    }

    public void setCstmIdDet(String cstmIdDet) {
        this.cstmIdDet = cstmIdDet;
    }

    public String getTrvlAgncySeqNum() {
        return trvlAgncySeqNum;
    }

    public void setTrvlAgncySeqNum(String trvlAgncySeqNum) {
        this.trvlAgncySeqNum = trvlAgncySeqNum;
    }

    public BigDecimal getTrvlAgncyFeeAmt() {
        return trvlAgncyFeeAmt;
    }

    public void setTrvlAgncyFeeAmt(BigDecimal trvlAgncyFeeAmt) {
        this.trvlAgncyFeeAmt = trvlAgncyFeeAmt;
    }

    public Character getTrvlAgncyFeeAmtDC() {
        return trvlAgncyFeeAmtDC;
    }

    public void setTrvlAgncyFeeAmtDC(Character trvlAgncyFeeAmtDC) {
        this.trvlAgncyFeeAmtDC = trvlAgncyFeeAmtDC;
    }

    public long getTrvlAgncyFeeAmtRt() {
        return trvlAgncyFeeAmtRt;
    }

    public void setTrvlAgncyFeeAmtRt(long trvlAgncyFeeAmtRt) {
        this.trvlAgncyFeeAmtRt = trvlAgncyFeeAmtRt;
    }

    public String getTrvlAgncyFeeAmtDesc() {
        return trvlAgncyFeeAmtDesc;
    }

    public void setTrvlAgncyFeeAmtDesc(String trvlAgncyFeeAmtDesc) {
        this.trvlAgncyFeeAmtDesc = trvlAgncyFeeAmtDesc;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invTrvlAgncyDetPK != null ? invTrvlAgncyDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvTrvlAgncyDet)) {
            return false;
        }
        InvTrvlAgncyDet other = (InvTrvlAgncyDet) object;
        if ((this.invTrvlAgncyDetPK == null && other.invTrvlAgncyDetPK != null) || (this.invTrvlAgncyDetPK != null && !this.invTrvlAgncyDetPK.equals(other.invTrvlAgncyDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvTrvlAgncyDet[ invTrvlAgncyDetPK=" + invTrvlAgncyDetPK + " ]";
    }
    
}
