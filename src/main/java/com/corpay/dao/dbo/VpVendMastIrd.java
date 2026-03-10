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
@Table(name = "VP_VEND_MAST_IRD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpVendMastIrd.findAll", query = "SELECT v FROM VpVendMastIrd v")})
public class VpVendMastIrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpVendMastIrdPK vpVendMastIrdPK;
    @Basic(optional = false)
    @Column(name = "IRD_CD")
    private String irdCd;
    @Basic(optional = false)
    @Column(name = "LAST_PRES_DT")
    @Temporal(TemporalType.DATE)
    private Date lastPresDt;
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

    public VpVendMastIrd() {
    }

    public VpVendMastIrd(VpVendMastIrdPK vpVendMastIrdPK) {
        this.vpVendMastIrdPK = vpVendMastIrdPK;
    }

    public VpVendMastIrd(VpVendMastIrdPK vpVendMastIrdPK, String irdCd, Date lastPresDt, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vpVendMastIrdPK = vpVendMastIrdPK;
        this.irdCd = irdCd;
        this.lastPresDt = lastPresDt;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public VpVendMastIrd(String vendMastId, int seqNbr) {
        this.vpVendMastIrdPK = new VpVendMastIrdPK(vendMastId, seqNbr);
    }

    public VpVendMastIrdPK getVpVendMastIrdPK() {
        return vpVendMastIrdPK;
    }

    public void setVpVendMastIrdPK(VpVendMastIrdPK vpVendMastIrdPK) {
        this.vpVendMastIrdPK = vpVendMastIrdPK;
    }

    public String getIrdCd() {
        return irdCd;
    }

    public void setIrdCd(String irdCd) {
        this.irdCd = irdCd;
    }

    public Date getLastPresDt() {
        return lastPresDt;
    }

    public void setLastPresDt(Date lastPresDt) {
        this.lastPresDt = lastPresDt;
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
        hash += (vpVendMastIrdPK != null ? vpVendMastIrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpVendMastIrd)) {
            return false;
        }
        VpVendMastIrd other = (VpVendMastIrd) object;
        if ((this.vpVendMastIrdPK == null && other.vpVendMastIrdPK != null) || (this.vpVendMastIrdPK != null && !this.vpVendMastIrdPK.equals(other.vpVendMastIrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendMastIrd[ vpVendMastIrdPK=" + vpVendMastIrdPK + " ]";
    }
    
}
