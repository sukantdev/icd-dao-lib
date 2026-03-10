/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "MMDDLIA", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "Mmddlia.findAll", query = "SELECT m FROM Mmddlia m"),
    @NamedQuery(name = "Mmddlia.findByDdliaAccountId", query = "SELECT m FROM Mmddlia m WHERE m.mmddliaPK.ddliaAccountId = :ddliaAccountId"),
    @NamedQuery(name = "Mmddlia.findByDdliaCustomerId", query = "SELECT m FROM Mmddlia m WHERE m.mmddliaPK.ddliaCustomerId = :ddliaCustomerId"),
    @NamedQuery(name = "Mmddlia.findByDdliaEmployeeNr", query = "SELECT m FROM Mmddlia m WHERE m.mmddliaPK.ddliaEmployeeNr = :ddliaEmployeeNr"),
    @NamedQuery(name = "Mmddlia.findByDdliaReferenceNr", query = "SELECT m FROM Mmddlia m WHERE m.mmddliaPK.ddliaReferenceNr = :ddliaReferenceNr"),
    @NamedQuery(name = "Mmddlia.findByDdliaAvailDate", query = "SELECT m FROM Mmddlia m WHERE m.ddliaAvailDate = :ddliaAvailDate"),
    @NamedQuery(name = "Mmddlia.findByDdliaAmount", query = "SELECT m FROM Mmddlia m WHERE m.ddliaAmount = :ddliaAmount")})
public class Mmddlia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MmddliaPK mmddliaPK;
    @Basic(optional = false)
    @Column(name = "DDLIA_AVAIL_DATE")
    @Temporal(TemporalType.DATE)
    private Date ddliaAvailDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
