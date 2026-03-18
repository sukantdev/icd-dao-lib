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
@Table(name = "CR_APPL_FEES", catalog = "", schema = "DBO")
public class CrApplFees implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplFeesPK crApplFeesPK;

    @Basic(optional = false)
    @Column(name = "FEE_AMT")
    private BigDecimal feeAmt;
    @Basic(optional = false)
    @Column(name = "FEE_TYP")
    private Character feeTyp;
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

    public CrApplFees() {
    }

    public CrApplFees(CrApplFeesPK crApplFeesPK) {
        this.crApplFeesPK = crApplFeesPK;
    }

    public CrApplFees(CrApplFeesPK crApplFeesPK, BigDecimal feeAmt, Character feeTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplFeesPK = crApplFeesPK;
        this.feeAmt = feeAmt;
        this.feeTyp = feeTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplFees(String applNbr, String feeNm) {
        this.crApplFeesPK = new CrApplFeesPK(applNbr, feeNm);
    }

    public CrApplFeesPK getCrApplFeesPK() {
        return crApplFeesPK;
    }

    public void setCrApplFeesPK(CrApplFeesPK crApplFeesPK) {
        this.crApplFeesPK = crApplFeesPK;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    public Character getFeeTyp() {
        return feeTyp;
    }

    public void setFeeTyp(Character feeTyp) {
        this.feeTyp = feeTyp;
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
        hash += (crApplFeesPK != null ? crApplFeesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplFees)) {
            return false;
        }
        CrApplFees other = (CrApplFees) object;
        if ((this.crApplFeesPK == null && other.crApplFeesPK != null) || (this.crApplFeesPK != null && !this.crApplFeesPK.equals(other.crApplFeesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplFees[ crApplFeesPK=" + crApplFeesPK + " ]";
    }

}
