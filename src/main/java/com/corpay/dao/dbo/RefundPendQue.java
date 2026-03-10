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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "REFUND_PEND_QUE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RefundPendQue.findAll", query = "SELECT r FROM RefundPendQue r")})
public class RefundPendQue implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RefundPendQuePK refundPendQuePK;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
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

    public RefundPendQue() {
    }

    public RefundPendQue(RefundPendQuePK refundPendQuePK) {
        this.refundPendQuePK = refundPendQuePK;
    }

    public RefundPendQue(RefundPendQuePK refundPendQuePK, Character statCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.refundPendQuePK = refundPendQuePK;
        this.statCd = statCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RefundPendQue(Character queueCd, String acctNbr, Date addDt) {
        this.refundPendQuePK = new RefundPendQuePK(queueCd, acctNbr, addDt);
    }

    public RefundPendQuePK getRefundPendQuePK() {
        return refundPendQuePK;
    }

    public void setRefundPendQuePK(RefundPendQuePK refundPendQuePK) {
        this.refundPendQuePK = refundPendQuePK;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
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
        hash += (refundPendQuePK != null ? refundPendQuePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RefundPendQue)) {
            return false;
        }
        RefundPendQue other = (RefundPendQue) object;
        if ((this.refundPendQuePK == null && other.refundPendQuePK != null) || (this.refundPendQuePK != null && !this.refundPendQuePK.equals(other.refundPendQuePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RefundPendQue[ refundPendQuePK=" + refundPendQuePK + " ]";
    }
    
}
