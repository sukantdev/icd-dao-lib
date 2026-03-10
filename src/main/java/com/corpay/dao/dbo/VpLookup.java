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
@Table(name = "VP_LOOKUP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpLookup.findAll", query = "SELECT v FROM VpLookup v")})
public class VpLookup implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpLookupPK vpLookupPK;
    @Basic(optional = false)
    @Column(name = "LOOKUP_VAL")
    private String lookupVal;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "PARENT_TYP")
    private String parentTyp;

    public VpLookup() {
    }

    public VpLookup(VpLookupPK vpLookupPK) {
        this.vpLookupPK = vpLookupPK;
    }

    public VpLookup(VpLookupPK vpLookupPK, String lookupVal, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String parentTyp) {
        this.vpLookupPK = vpLookupPK;
        this.lookupVal = lookupVal;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.parentTyp = parentTyp;
    }

    public VpLookup(String lookupTyp, int lookupId) {
        this.vpLookupPK = new VpLookupPK(lookupTyp, lookupId);
    }

    public VpLookupPK getVpLookupPK() {
        return vpLookupPK;
    }

    public void setVpLookupPK(VpLookupPK vpLookupPK) {
        this.vpLookupPK = vpLookupPK;
    }

    public String getLookupVal() {
        return lookupVal;
    }

    public void setLookupVal(String lookupVal) {
        this.lookupVal = lookupVal;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getParentTyp() {
        return parentTyp;
    }

    public void setParentTyp(String parentTyp) {
        this.parentTyp = parentTyp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpLookupPK != null ? vpLookupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpLookup)) {
            return false;
        }
        VpLookup other = (VpLookup) object;
        if ((this.vpLookupPK == null && other.vpLookupPK != null) || (this.vpLookupPK != null && !this.vpLookupPK.equals(other.vpLookupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpLookup[ vpLookupPK=" + vpLookupPK + " ]";
    }
    
}
