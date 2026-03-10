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
@Table(name = "VP_AUDIT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpAudit.findAll", query = "SELECT v FROM VpAudit v")})
public class VpAudit implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpAuditPK vpAuditPK;
    @Basic(optional = false)
    @Column(name = "OLD_VALUE")
    private String oldValue;
    @Basic(optional = false)
    @Column(name = "NEW_VALUE")
    private String newValue;
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

    public VpAudit() {
    }

    public VpAudit(VpAuditPK vpAuditPK) {
        this.vpAuditPK = vpAuditPK;
    }

    public VpAudit(VpAuditPK vpAuditPK, String oldValue, String newValue, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vpAuditPK = vpAuditPK;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public VpAudit(String userId, String app, String fieldName) {
        this.vpAuditPK = new VpAuditPK(userId, app, fieldName);
    }

    public VpAuditPK getVpAuditPK() {
        return vpAuditPK;
    }

    public void setVpAuditPK(VpAuditPK vpAuditPK) {
        this.vpAuditPK = vpAuditPK;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpAuditPK != null ? vpAuditPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpAudit)) {
            return false;
        }
        VpAudit other = (VpAudit) object;
        if ((this.vpAuditPK == null && other.vpAuditPK != null) || (this.vpAuditPK != null && !this.vpAuditPK.equals(other.vpAuditPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpAudit[ vpAuditPK=" + vpAuditPK + " ]";
    }
    
}
