package com.corpay.dao.cxxcow;

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
@Table(name = "MMDDLIA", catalog = "", schema = "CXXCOW")
public class Mmddlia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MmddliaPK mmddliaPK;
    @Basic(optional = false)
    @Column(name = "DDLIA_AVAIL_DATE")
    @Temporal(TemporalType.DATE)
    private Date ddliaAvailDate;

    @Basic(optional = false)
    @Column(name = "DDLIA_AMOUNT")
    private BigDecimal ddliaAmount;

    public Mmddlia() {
    }

    public Mmddlia(MmddliaPK mmddliaPK) {
        this.mmddliaPK = mmddliaPK;
    }

    public Mmddlia(MmddliaPK mmddliaPK, Date ddliaAvailDate, BigDecimal ddliaAmount) {
        this.mmddliaPK = mmddliaPK;
        this.ddliaAvailDate = ddliaAvailDate;
        this.ddliaAmount = ddliaAmount;
    }

    public Mmddlia(String ddliaAccountId, String ddliaCustomerId, String ddliaEmployeeNr, int ddliaReferenceNr) {
        this.mmddliaPK = new MmddliaPK(ddliaAccountId, ddliaCustomerId, ddliaEmployeeNr, ddliaReferenceNr);
    }

    public MmddliaPK getMmddliaPK() {
        return mmddliaPK;
    }

    public void setMmddliaPK(MmddliaPK mmddliaPK) {
        this.mmddliaPK = mmddliaPK;
    }

    public Date getDdliaAvailDate() {
        return ddliaAvailDate;
    }

    public void setDdliaAvailDate(Date ddliaAvailDate) {
        this.ddliaAvailDate = ddliaAvailDate;
    }

    public BigDecimal getDdliaAmount() {
        return ddliaAmount;
    }

    public void setDdliaAmount(BigDecimal ddliaAmount) {
        this.ddliaAmount = ddliaAmount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mmddliaPK != null ? mmddliaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Mmddlia)) {
            return false;
        }
        Mmddlia other = (Mmddlia) object;
        if ((this.mmddliaPK == null && other.mmddliaPK != null) || (this.mmddliaPK != null && !this.mmddliaPK.equals(other.mmddliaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Mmddlia[ mmddliaPK=" + mmddliaPK + " ]";
    }

}
