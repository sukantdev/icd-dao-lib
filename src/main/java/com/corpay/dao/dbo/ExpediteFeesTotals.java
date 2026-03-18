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
@Table(name = "EXPEDITE_FEES_TOTALS", catalog = "", schema = "DBO")
public class ExpediteFeesTotals implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExpediteFeesTotalsPK expediteFeesTotalsPK;

    @Basic(optional = false)
    @Column(name = "EFT_FEES_CHARGED")
    private BigDecimal eftFeesCharged;
    @Basic(optional = false)
    @Column(name = "EFT_TAX_CHARGED")
    private BigDecimal eftTaxCharged;
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

    public ExpediteFeesTotals() {
    }

    public ExpediteFeesTotals(ExpediteFeesTotalsPK expediteFeesTotalsPK) {
        this.expediteFeesTotalsPK = expediteFeesTotalsPK;
    }

    public ExpediteFeesTotals(ExpediteFeesTotalsPK expediteFeesTotalsPK, BigDecimal eftFeesCharged, BigDecimal eftTaxCharged, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.expediteFeesTotalsPK = expediteFeesTotalsPK;
        this.eftFeesCharged = eftFeesCharged;
        this.eftTaxCharged = eftTaxCharged;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ExpediteFeesTotals(String eftAcctNbr, String eftRequestDate, String eftInvoiceNbr) {
        this.expediteFeesTotalsPK = new ExpediteFeesTotalsPK(eftAcctNbr, eftRequestDate, eftInvoiceNbr);
    }

    public ExpediteFeesTotalsPK getExpediteFeesTotalsPK() {
        return expediteFeesTotalsPK;
    }

    public void setExpediteFeesTotalsPK(ExpediteFeesTotalsPK expediteFeesTotalsPK) {
        this.expediteFeesTotalsPK = expediteFeesTotalsPK;
    }

    public BigDecimal getEftFeesCharged() {
        return eftFeesCharged;
    }

    public void setEftFeesCharged(BigDecimal eftFeesCharged) {
        this.eftFeesCharged = eftFeesCharged;
    }

    public BigDecimal getEftTaxCharged() {
        return eftTaxCharged;
    }

    public void setEftTaxCharged(BigDecimal eftTaxCharged) {
        this.eftTaxCharged = eftTaxCharged;
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
        hash += (expediteFeesTotalsPK != null ? expediteFeesTotalsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ExpediteFeesTotals)) {
            return false;
        }
        ExpediteFeesTotals other = (ExpediteFeesTotals) object;
        if ((this.expediteFeesTotalsPK == null && other.expediteFeesTotalsPK != null) || (this.expediteFeesTotalsPK != null && !this.expediteFeesTotalsPK.equals(other.expediteFeesTotalsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExpediteFeesTotals[ expediteFeesTotalsPK=" + expediteFeesTotalsPK + " ]";
    }

}
