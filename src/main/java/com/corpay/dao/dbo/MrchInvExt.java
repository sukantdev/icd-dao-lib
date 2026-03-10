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
@Table(name = "MRCH_INV_EXT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchInvExt.findAll", query = "SELECT m FROM MrchInvExt m")})
public class MrchInvExt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchInvExtPK mrchInvExtPK;
    @Basic(optional = false)
    @Column(name = "MRCH_INV_NBR")
    private String mrchInvNbr;
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

    public MrchInvExt() {
    }

    public MrchInvExt(MrchInvExtPK mrchInvExtPK) {
        this.mrchInvExtPK = mrchInvExtPK;
    }

    public MrchInvExt(MrchInvExtPK mrchInvExtPK, String mrchInvNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchInvExtPK = mrchInvExtPK;
        this.mrchInvNbr = mrchInvNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchInvExt(Date trnsDt, String ctlNbr) {
        this.mrchInvExtPK = new MrchInvExtPK(trnsDt, ctlNbr);
    }

    public MrchInvExtPK getMrchInvExtPK() {
        return mrchInvExtPK;
    }

    public void setMrchInvExtPK(MrchInvExtPK mrchInvExtPK) {
        this.mrchInvExtPK = mrchInvExtPK;
    }

    public String getMrchInvNbr() {
        return mrchInvNbr;
    }

    public void setMrchInvNbr(String mrchInvNbr) {
        this.mrchInvNbr = mrchInvNbr;
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
        hash += (mrchInvExtPK != null ? mrchInvExtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchInvExt)) {
            return false;
        }
        MrchInvExt other = (MrchInvExt) object;
        if ((this.mrchInvExtPK == null && other.mrchInvExtPK != null) || (this.mrchInvExtPK != null && !this.mrchInvExtPK.equals(other.mrchInvExtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchInvExt[ mrchInvExtPK=" + mrchInvExtPK + " ]";
    }
    
}
