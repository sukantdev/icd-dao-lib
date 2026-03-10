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
@Table(name = "VMC_BYR_CMNT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VmcByrCmnt.findAll", query = "SELECT v FROM VmcByrCmnt v")})
public class VmcByrCmnt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VmcByrCmntPK vmcByrCmntPK;
    @Basic(optional = false)
    @Column(name = "CMNT")
    private String cmnt;
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

    public VmcByrCmnt() {
    }

    public VmcByrCmnt(VmcByrCmntPK vmcByrCmntPK) {
        this.vmcByrCmntPK = vmcByrCmntPK;
    }

    public VmcByrCmnt(VmcByrCmntPK vmcByrCmntPK, String cmnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.vmcByrCmntPK = vmcByrCmntPK;
        this.cmnt = cmnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public VmcByrCmnt(String acctNbr, String custId, int seqNbr) {
        this.vmcByrCmntPK = new VmcByrCmntPK(acctNbr, custId, seqNbr);
    }

    public VmcByrCmntPK getVmcByrCmntPK() {
        return vmcByrCmntPK;
    }

    public void setVmcByrCmntPK(VmcByrCmntPK vmcByrCmntPK) {
        this.vmcByrCmntPK = vmcByrCmntPK;
    }

    public String getCmnt() {
        return cmnt;
    }

    public void setCmnt(String cmnt) {
        this.cmnt = cmnt;
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
        hash += (vmcByrCmntPK != null ? vmcByrCmntPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VmcByrCmnt)) {
            return false;
        }
        VmcByrCmnt other = (VmcByrCmnt) object;
        if ((this.vmcByrCmntPK == null && other.vmcByrCmntPK != null) || (this.vmcByrCmntPK != null && !this.vmcByrCmntPK.equals(other.vmcByrCmntPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VmcByrCmnt[ vmcByrCmntPK=" + vmcByrCmntPK + " ]";
    }
    
}
