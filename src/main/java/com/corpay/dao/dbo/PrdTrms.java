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
@Table(name = "PRD_TRMS", catalog = "", schema = "DBO")
public class PrdTrms implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdTrmsPK prdTrmsPK;
    @Basic(optional = false)
    @Column(name = "RBT_AVL")
    private Character rbtAvl;

    @Basic(optional = false)
    @Column(name = "STUP_FEE")
    private BigDecimal stupFee;
    @Basic(optional = false)
    @Column(name = "PRJTN_AMT")
    private BigDecimal prjtnAmt;
    @Basic(optional = false)
    @Column(name = "MIN_TRNS")
    private BigDecimal minTrns;
    @Basic(optional = false)
    @Column(name = "NOTES")
    private String notes;
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
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public PrdTrms() {
    }

    public PrdTrms(PrdTrmsPK prdTrmsPK) {
        this.prdTrmsPK = prdTrmsPK;
    }

    public PrdTrms(PrdTrmsPK prdTrmsPK, Character rbtAvl, BigDecimal stupFee, BigDecimal prjtnAmt, BigDecimal minTrns, String notes, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.prdTrmsPK = prdTrmsPK;
        this.rbtAvl = rbtAvl;
        this.stupFee = stupFee;
        this.prjtnAmt = prjtnAmt;
        this.minTrns = minTrns;
        this.notes = notes;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public PrdTrms(String applNbr, String childTyp) {
        this.prdTrmsPK = new PrdTrmsPK(applNbr, childTyp);
    }

    public PrdTrmsPK getPrdTrmsPK() {
        return prdTrmsPK;
    }

    public void setPrdTrmsPK(PrdTrmsPK prdTrmsPK) {
        this.prdTrmsPK = prdTrmsPK;
    }

    public Character getRbtAvl() {
        return rbtAvl;
    }

    public void setRbtAvl(Character rbtAvl) {
        this.rbtAvl = rbtAvl;
    }

    public BigDecimal getStupFee() {
        return stupFee;
    }

    public void setStupFee(BigDecimal stupFee) {
        this.stupFee = stupFee;
    }

    public BigDecimal getPrjtnAmt() {
        return prjtnAmt;
    }

    public void setPrjtnAmt(BigDecimal prjtnAmt) {
        this.prjtnAmt = prjtnAmt;
    }

    public BigDecimal getMinTrns() {
        return minTrns;
    }

    public void setMinTrns(BigDecimal minTrns) {
        this.minTrns = minTrns;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdTrmsPK != null ? prdTrmsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdTrms)) {
            return false;
        }
        PrdTrms other = (PrdTrms) object;
        if ((this.prdTrmsPK == null && other.prdTrmsPK != null) || (this.prdTrmsPK != null && !this.prdTrmsPK.equals(other.prdTrmsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTrms[ prdTrmsPK=" + prdTrmsPK + " ]";
    }

}
