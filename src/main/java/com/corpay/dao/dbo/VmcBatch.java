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
@Table(name = "VMC_BATCH", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VmcBatch.findAll", query = "SELECT v FROM VmcBatch v")})
public class VmcBatch implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VmcBatchPK vmcBatchPK;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "CRDS_CRT_CNT")
    private int crdsCrtCnt;
    @Basic(optional = false)
    @Column(name = "CRDS_REJ_CNT")
    private int crdsRejCnt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CRT_AMT")
    private BigDecimal crtAmt;
    @Basic(optional = false)
    @Column(name = "REJ_AMT")
    private BigDecimal rejAmt;
    @Basic(optional = false)
    @Column(name = "CRT_DT")
    @Temporal(TemporalType.DATE)
    private Date crtDt;
    @Basic(optional = false)
    @Column(name = "CLS_DT")
    @Temporal(TemporalType.DATE)
    private Date clsDt;
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

    public VmcBatch() {
    }

    public VmcBatch(VmcBatchPK vmcBatchPK) {
        this.vmcBatchPK = vmcBatchPK;
    }

    public VmcBatch(VmcBatchPK vmcBatchPK, Character statCd, int crdsCrtCnt, int crdsRejCnt, BigDecimal crtAmt, BigDecimal rejAmt, Date crtDt, Date clsDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.vmcBatchPK = vmcBatchPK;
        this.statCd = statCd;
        this.crdsCrtCnt = crdsCrtCnt;
        this.crdsRejCnt = crdsRejCnt;
        this.crtAmt = crtAmt;
        this.rejAmt = rejAmt;
        this.crtDt = crtDt;
        this.clsDt = clsDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public VmcBatch(String acctNbr, String custNbr, String custBatchNbr, String batchId) {
        this.vmcBatchPK = new VmcBatchPK(acctNbr, custNbr, custBatchNbr, batchId);
    }

    public VmcBatchPK getVmcBatchPK() {
        return vmcBatchPK;
    }

    public void setVmcBatchPK(VmcBatchPK vmcBatchPK) {
        this.vmcBatchPK = vmcBatchPK;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public int getCrdsCrtCnt() {
        return crdsCrtCnt;
    }

    public void setCrdsCrtCnt(int crdsCrtCnt) {
        this.crdsCrtCnt = crdsCrtCnt;
    }

    public int getCrdsRejCnt() {
        return crdsRejCnt;
    }

    public void setCrdsRejCnt(int crdsRejCnt) {
        this.crdsRejCnt = crdsRejCnt;
    }

    public BigDecimal getCrtAmt() {
        return crtAmt;
    }

    public void setCrtAmt(BigDecimal crtAmt) {
        this.crtAmt = crtAmt;
    }

    public BigDecimal getRejAmt() {
        return rejAmt;
    }

    public void setRejAmt(BigDecimal rejAmt) {
        this.rejAmt = rejAmt;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Date getClsDt() {
        return clsDt;
    }

    public void setClsDt(Date clsDt) {
        this.clsDt = clsDt;
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
        hash += (vmcBatchPK != null ? vmcBatchPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VmcBatch)) {
            return false;
        }
        VmcBatch other = (VmcBatch) object;
        if ((this.vmcBatchPK == null && other.vmcBatchPK != null) || (this.vmcBatchPK != null && !this.vmcBatchPK.equals(other.vmcBatchPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VmcBatch[ vmcBatchPK=" + vmcBatchPK + " ]";
    }
    
}
