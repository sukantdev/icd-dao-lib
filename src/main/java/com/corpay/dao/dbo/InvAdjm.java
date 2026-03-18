package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "INV_ADJM", catalog = "", schema = "DBO")
public class InvAdjm implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvAdjmPK invAdjmPK;
    @Basic(optional = false)
    @Column(name = "ADJM_CR_OR_DB")
    private Character adjmCrOrDb;
    @Basic(optional = false)
    @Column(name = "BLNG_TYP")
    private Character blngTyp;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "PRD_DESC")
    private String prdDesc;

    @Basic(optional = false)
    @Column(name = "PRD_QTY")
    private BigDecimal prdQty;
    @Basic(optional = false)
    @Column(name = "PRD_CST")
    private BigDecimal prdCst;
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
    @Basic(optional = false)
    @Column(name = "AR_REF")
    private String arRef;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;

    public InvAdjm() {
    }

    public InvAdjm(InvAdjmPK invAdjmPK) {
        this.invAdjmPK = invAdjmPK;
    }

    public InvAdjm(InvAdjmPK invAdjmPK, Character adjmCrOrDb, Character blngTyp, String prdCd, String prdDesc, BigDecimal prdQty, BigDecimal prdCst, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String arRef, String crdNbr) {
        this.invAdjmPK = invAdjmPK;
        this.adjmCrOrDb = adjmCrOrDb;
        this.blngTyp = blngTyp;
        this.prdCd = prdCd;
        this.prdDesc = prdDesc;
        this.prdQty = prdQty;
        this.prdCst = prdCst;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.arRef = arRef;
        this.crdNbr = crdNbr;
    }

    public InvAdjm(Date pstdDt, int trnsId) {
        this.invAdjmPK = new InvAdjmPK(pstdDt, trnsId);
    }

    public InvAdjmPK getInvAdjmPK() {
        return invAdjmPK;
    }

    public void setInvAdjmPK(InvAdjmPK invAdjmPK) {
        this.invAdjmPK = invAdjmPK;
    }

    public Character getAdjmCrOrDb() {
        return adjmCrOrDb;
    }

    public void setAdjmCrOrDb(Character adjmCrOrDb) {
        this.adjmCrOrDb = adjmCrOrDb;
    }

    public Character getBlngTyp() {
        return blngTyp;
    }

    public void setBlngTyp(Character blngTyp) {
        this.blngTyp = blngTyp;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public BigDecimal getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(BigDecimal prdQty) {
        this.prdQty = prdQty;
    }

    public BigDecimal getPrdCst() {
        return prdCst;
    }

    public void setPrdCst(BigDecimal prdCst) {
        this.prdCst = prdCst;
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

    public String getArRef() {
        return arRef;
    }

    public void setArRef(String arRef) {
        this.arRef = arRef;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invAdjmPK != null ? invAdjmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvAdjm)) {
            return false;
        }
        InvAdjm other = (InvAdjm) object;
        if ((this.invAdjmPK == null && other.invAdjmPK != null) || (this.invAdjmPK != null && !this.invAdjmPK.equals(other.invAdjmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvAdjm[ invAdjmPK=" + invAdjmPK + " ]";
    }

}
