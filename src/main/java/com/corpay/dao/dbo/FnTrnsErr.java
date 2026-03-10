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
@Table(name = "FN_TRNS_ERR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FnTrnsErr.findAll", query = "SELECT f FROM FnTrnsErr f")})
public class FnTrnsErr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnTrnsErrPK fnTrnsErrPK;
    @Basic(optional = false)
    @Column(name = "PROC_FLG")
    private Character procFlg;
    @Basic(optional = false)
    @Column(name = "PROC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date procTs;
    @Basic(optional = false)
    @Column(name = "TRX_MASTER_ID")
    private long trxMasterId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TRX_TOT_AMT")
    private BigDecimal trxTotAmt;
    @Basic(optional = false)
    @Column(name = "TRX_TOT_PROD_NBR")
    private short trxTotProdNbr;
    @Basic(optional = false)
    @Column(name = "ERR_CD")
    private int errCd;
    @Basic(optional = false)
    @Column(name = "ERR_DESC")
    private String errDesc;
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

    public FnTrnsErr() {
    }

    public FnTrnsErr(FnTrnsErrPK fnTrnsErrPK) {
        this.fnTrnsErrPK = fnTrnsErrPK;
    }

    public FnTrnsErr(FnTrnsErrPK fnTrnsErrPK, Character procFlg, Date procTs, long trxMasterId, BigDecimal trxTotAmt, short trxTotProdNbr, int errCd, String errDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnTrnsErrPK = fnTrnsErrPK;
        this.procFlg = procFlg;
        this.procTs = procTs;
        this.trxMasterId = trxMasterId;
        this.trxTotAmt = trxTotAmt;
        this.trxTotProdNbr = trxTotProdNbr;
        this.errCd = errCd;
        this.errDesc = errDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnTrnsErr(Date fileDt, short fileSeq, int trnsSeq) {
        this.fnTrnsErrPK = new FnTrnsErrPK(fileDt, fileSeq, trnsSeq);
    }

    public FnTrnsErrPK getFnTrnsErrPK() {
        return fnTrnsErrPK;
    }

    public void setFnTrnsErrPK(FnTrnsErrPK fnTrnsErrPK) {
        this.fnTrnsErrPK = fnTrnsErrPK;
    }

    public Character getProcFlg() {
        return procFlg;
    }

    public void setProcFlg(Character procFlg) {
        this.procFlg = procFlg;
    }

    public Date getProcTs() {
        return procTs;
    }

    public void setProcTs(Date procTs) {
        this.procTs = procTs;
    }

    public long getTrxMasterId() {
        return trxMasterId;
    }

    public void setTrxMasterId(long trxMasterId) {
        this.trxMasterId = trxMasterId;
    }

    public BigDecimal getTrxTotAmt() {
        return trxTotAmt;
    }

    public void setTrxTotAmt(BigDecimal trxTotAmt) {
        this.trxTotAmt = trxTotAmt;
    }

    public short getTrxTotProdNbr() {
        return trxTotProdNbr;
    }

    public void setTrxTotProdNbr(short trxTotProdNbr) {
        this.trxTotProdNbr = trxTotProdNbr;
    }

    public int getErrCd() {
        return errCd;
    }

    public void setErrCd(int errCd) {
        this.errCd = errCd;
    }

    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
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
        hash += (fnTrnsErrPK != null ? fnTrnsErrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FnTrnsErr)) {
            return false;
        }
        FnTrnsErr other = (FnTrnsErr) object;
        if ((this.fnTrnsErrPK == null && other.fnTrnsErrPK != null) || (this.fnTrnsErrPK != null && !this.fnTrnsErrPK.equals(other.fnTrnsErrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnTrnsErr[ fnTrnsErrPK=" + fnTrnsErrPK + " ]";
    }
    
}
