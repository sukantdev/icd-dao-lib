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
@Table(name = "CR_APPL_RATES", catalog = "", schema = "DBO")
public class CrApplRates implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplRatesPK crApplRatesPK;

    @Basic(optional = false)
    @Column(name = "VAL")
    private BigDecimal val;
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

    public CrApplRates() {
    }

    public CrApplRates(CrApplRatesPK crApplRatesPK) {
        this.crApplRatesPK = crApplRatesPK;
    }

    public CrApplRates(CrApplRatesPK crApplRatesPK, BigDecimal val, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplRatesPK = crApplRatesPK;
        this.val = val;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplRates(String applNbr, String childTyp, String typ, String grp) {
        this.crApplRatesPK = new CrApplRatesPK(applNbr, childTyp, typ, grp);
    }

    public CrApplRatesPK getCrApplRatesPK() {
        return crApplRatesPK;
    }

    public void setCrApplRatesPK(CrApplRatesPK crApplRatesPK) {
        this.crApplRatesPK = crApplRatesPK;
    }

    public BigDecimal getVal() {
        return val;
    }

    public void setVal(BigDecimal val) {
        this.val = val;
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
        hash += (crApplRatesPK != null ? crApplRatesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplRates)) {
            return false;
        }
        CrApplRates other = (CrApplRates) object;
        if ((this.crApplRatesPK == null && other.crApplRatesPK != null) || (this.crApplRatesPK != null && !this.crApplRatesPK.equals(other.crApplRatesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplRates[ crApplRatesPK=" + crApplRatesPK + " ]";
    }

}
