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
@Table(name = "PRD_PRMTS", catalog = "", schema = "DBO")
public class PrdPrmts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdPrmtsPK prdPrmtsPK;
    @Basic(optional = false)
    @Column(name = "PERMITS_ACCT_CD")
    private String permitsAcctCd;

    @Basic(optional = false)
    @Column(name = "AVG_MTHLY_TL")
    private BigDecimal avgMthlyTl;
    @Basic(optional = false)
    @Column(name = "STAT_UPD_FEE")
    private BigDecimal statUpdFee;
    @Basic(optional = false)
    @Column(name = "FAX_DELV_FEE")
    private BigDecimal faxDelvFee;
    @Basic(optional = false)
    @Column(name = "ST_UPD_FEE")
    private BigDecimal stUpdFee;
    @Basic(optional = false)
    @Column(name = "INIT_STUP_FEE")
    private BigDecimal initStupFee;
    @Basic(optional = false)
    @Column(name = "FID_NBR")
    private String fidNbr;
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

    public PrdPrmts() {
    }

    public PrdPrmts(PrdPrmtsPK prdPrmtsPK) {
        this.prdPrmtsPK = prdPrmtsPK;
    }

    public PrdPrmts(PrdPrmtsPK prdPrmtsPK, String permitsAcctCd, BigDecimal avgMthlyTl, BigDecimal statUpdFee, BigDecimal faxDelvFee, BigDecimal stUpdFee, BigDecimal initStupFee, String fidNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdPrmtsPK = prdPrmtsPK;
        this.permitsAcctCd = permitsAcctCd;
        this.avgMthlyTl = avgMthlyTl;
        this.statUpdFee = statUpdFee;
        this.faxDelvFee = faxDelvFee;
        this.stUpdFee = stUpdFee;
        this.initStupFee = initStupFee;
        this.fidNbr = fidNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdPrmts(String applNbr, String childTyp) {
        this.prdPrmtsPK = new PrdPrmtsPK(applNbr, childTyp);
    }

    public PrdPrmtsPK getPrdPrmtsPK() {
        return prdPrmtsPK;
    }

    public void setPrdPrmtsPK(PrdPrmtsPK prdPrmtsPK) {
        this.prdPrmtsPK = prdPrmtsPK;
    }

    public String getPermitsAcctCd() {
        return permitsAcctCd;
    }

    public void setPermitsAcctCd(String permitsAcctCd) {
        this.permitsAcctCd = permitsAcctCd;
    }

    public BigDecimal getAvgMthlyTl() {
        return avgMthlyTl;
    }

    public void setAvgMthlyTl(BigDecimal avgMthlyTl) {
        this.avgMthlyTl = avgMthlyTl;
    }

    public BigDecimal getStatUpdFee() {
        return statUpdFee;
    }

    public void setStatUpdFee(BigDecimal statUpdFee) {
        this.statUpdFee = statUpdFee;
    }

    public BigDecimal getFaxDelvFee() {
        return faxDelvFee;
    }

    public void setFaxDelvFee(BigDecimal faxDelvFee) {
        this.faxDelvFee = faxDelvFee;
    }

    public BigDecimal getStUpdFee() {
        return stUpdFee;
    }

    public void setStUpdFee(BigDecimal stUpdFee) {
        this.stUpdFee = stUpdFee;
    }

    public BigDecimal getInitStupFee() {
        return initStupFee;
    }

    public void setInitStupFee(BigDecimal initStupFee) {
        this.initStupFee = initStupFee;
    }

    public String getFidNbr() {
        return fidNbr;
    }

    public void setFidNbr(String fidNbr) {
        this.fidNbr = fidNbr;
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
        hash += (prdPrmtsPK != null ? prdPrmtsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdPrmts)) {
            return false;
        }
        PrdPrmts other = (PrdPrmts) object;
        if ((this.prdPrmtsPK == null && other.prdPrmtsPK != null) || (this.prdPrmtsPK != null && !this.prdPrmtsPK.equals(other.prdPrmtsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdPrmts[ prdPrmtsPK=" + prdPrmtsPK + " ]";
    }

}
