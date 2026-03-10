/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "TRNS_TRKG_NBR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TrnsTrkgNbr.findAll", query = "SELECT t FROM TrnsTrkgNbr t")})
public class TrnsTrkgNbr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRNS_TRKG_NBR")
    private Integer trnsTrkgNbr;
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

    public TrnsTrkgNbr() {
    }

    public TrnsTrkgNbr(Integer trnsTrkgNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
    }

    public TrnsTrkgNbr(Integer trnsTrkgNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getTrnsTrkgNbr() {
        return trnsTrkgNbr;
    }

    public void setTrnsTrkgNbr(Integer trnsTrkgNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
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
        hash += (trnsTrkgNbr != null ? trnsTrkgNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrnsTrkgNbr)) {
            return false;
        }
        TrnsTrkgNbr other = (TrnsTrkgNbr) object;
        if ((this.trnsTrkgNbr == null && other.trnsTrkgNbr != null) || (this.trnsTrkgNbr != null && !this.trnsTrkgNbr.equals(other.trnsTrkgNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrnsTrkgNbr[ trnsTrkgNbr=" + trnsTrkgNbr + " ]";
    }
    
}
