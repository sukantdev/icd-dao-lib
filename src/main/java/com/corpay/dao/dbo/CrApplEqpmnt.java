package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CR_APPL_EQPMNT", catalog = "", schema = "DBO")
public class CrApplEqpmnt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "PCHS_RENT")
    private Character pchsRent;

    @Basic(optional = false)
    @Column(name = "PCHS_AMT")
    private BigDecimal pchsAmt;
    @Basic(optional = false)
    @Column(name = "MTHLY_RENT_AMT")
    private BigDecimal mthlyRentAmt;
    @Basic(optional = false)
    @Column(name = "UP_FRNT_AMT")
    private BigDecimal upFrntAmt;
    @Basic(optional = false)
    @Column(name = "RPMNT_RENT_TERM")
    private String rpmntRentTerm;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
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

    public CrApplEqpmnt() {
    }

    public CrApplEqpmnt(String applNbr) {
        this.applNbr = applNbr;
    }

    public CrApplEqpmnt(String applNbr, Character pchsRent, BigDecimal pchsAmt, BigDecimal mthlyRentAmt, BigDecimal upFrntAmt, String rpmntRentTerm, String mdyUsr, Date crtTs, String crtUsr, Date mdyTs) {
        this.applNbr = applNbr;
        this.pchsRent = pchsRent;
        this.pchsAmt = pchsAmt;
        this.mthlyRentAmt = mthlyRentAmt;
        this.upFrntAmt = upFrntAmt;
        this.rpmntRentTerm = rpmntRentTerm;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public Character getPchsRent() {
        return pchsRent;
    }

    public void setPchsRent(Character pchsRent) {
        this.pchsRent = pchsRent;
    }

    public BigDecimal getPchsAmt() {
        return pchsAmt;
    }

    public void setPchsAmt(BigDecimal pchsAmt) {
        this.pchsAmt = pchsAmt;
    }

    public BigDecimal getMthlyRentAmt() {
        return mthlyRentAmt;
    }

    public void setMthlyRentAmt(BigDecimal mthlyRentAmt) {
        this.mthlyRentAmt = mthlyRentAmt;
    }

    public BigDecimal getUpFrntAmt() {
        return upFrntAmt;
    }

    public void setUpFrntAmt(BigDecimal upFrntAmt) {
        this.upFrntAmt = upFrntAmt;
    }

    public String getRpmntRentTerm() {
        return rpmntRentTerm;
    }

    public void setRpmntRentTerm(String rpmntRentTerm) {
        this.rpmntRentTerm = rpmntRentTerm;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplEqpmnt)) {
            return false;
        }
        CrApplEqpmnt other = (CrApplEqpmnt) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplEqpmnt[ applNbr=" + applNbr + " ]";
    }

}
