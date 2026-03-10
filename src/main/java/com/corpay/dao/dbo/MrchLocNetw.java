/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MRCH_LOC_NETW", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchLocNetw.findAll", query = "SELECT m FROM MrchLocNetw m")})
public class MrchLocNetw implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocNetwPK mrchLocNetwPK;
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

    public MrchLocNetw() {
    }

    public MrchLocNetw(MrchLocNetwPK mrchLocNetwPK) {
        this.mrchLocNetwPK = mrchLocNetwPK;
    }

    public MrchLocNetw(MrchLocNetwPK mrchLocNetwPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchLocNetwPK = mrchLocNetwPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchLocNetw(String marketerCd, String locId) {
        this.mrchLocNetwPK = new MrchLocNetwPK(marketerCd, locId);
    }

    public MrchLocNetwPK getMrchLocNetwPK() {
        return mrchLocNetwPK;
    }

    public void setMrchLocNetwPK(MrchLocNetwPK mrchLocNetwPK) {
        this.mrchLocNetwPK = mrchLocNetwPK;
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
        hash += (mrchLocNetwPK != null ? mrchLocNetwPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocNetw)) {
            return false;
        }
        MrchLocNetw other = (MrchLocNetw) object;
        if ((this.mrchLocNetwPK == null && other.mrchLocNetwPK != null) || (this.mrchLocNetwPK != null && !this.mrchLocNetwPK.equals(other.mrchLocNetwPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocNetw[ mrchLocNetwPK=" + mrchLocNetwPK + " ]";
    }
    
}
