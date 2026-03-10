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
@Table(name = "COMP_STAND_DESC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CompStandDesc.findAll", query = "SELECT c FROM CompStandDesc c")})
public class CompStandDesc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompStandDescPK compStandDescPK;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_DESC")
    private String compStandDesc;
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

    public CompStandDesc() {
    }

    public CompStandDesc(CompStandDescPK compStandDescPK) {
        this.compStandDescPK = compStandDescPK;
    }

    public CompStandDesc(CompStandDescPK compStandDescPK, String compStandDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.compStandDescPK = compStandDescPK;
        this.compStandDesc = compStandDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CompStandDesc(String compStandId, String custId) {
        this.compStandDescPK = new CompStandDescPK(compStandId, custId);
    }

    public CompStandDescPK getCompStandDescPK() {
        return compStandDescPK;
    }

    public void setCompStandDescPK(CompStandDescPK compStandDescPK) {
        this.compStandDescPK = compStandDescPK;
    }

    public String getCompStandDesc() {
        return compStandDesc;
    }

    public void setCompStandDesc(String compStandDesc) {
        this.compStandDesc = compStandDesc;
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
        hash += (compStandDescPK != null ? compStandDescPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompStandDesc)) {
            return false;
        }
        CompStandDesc other = (CompStandDesc) object;
        if ((this.compStandDescPK == null && other.compStandDescPK != null) || (this.compStandDescPK != null && !this.compStandDescPK.equals(other.compStandDescPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CompStandDesc[ compStandDescPK=" + compStandDescPK + " ]";
    }
    
}
