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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MRCH_LOC_PPU", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchLocPpu.findAll", query = "SELECT m FROM MrchLocPpu m")})
public class MrchLocPpu implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocPpuPK mrchLocPpuPK;
    @Basic(optional = false)
    @Column(name = "LST_TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date lstTrnsDt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "FL_UNIT_PRC")
    private BigDecimal flUnitPrc;
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

    public MrchLocPpu() {
    }

    public MrchLocPpu(MrchLocPpuPK mrchLocPpuPK) {
        this.mrchLocPpuPK = mrchLocPpuPK;
    }

    public MrchLocPpu(MrchLocPpuPK mrchLocPpuPK, Date lstTrnsDt, BigDecimal flUnitPrc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchLocPpuPK = mrchLocPpuPK;
        this.lstTrnsDt = lstTrnsDt;
        this.flUnitPrc = flUnitPrc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchLocPpu(String locId, Character flSrvTyp, String flPrdCd) {
        this.mrchLocPpuPK = new MrchLocPpuPK(locId, flSrvTyp, flPrdCd);
    }

    public MrchLocPpuPK getMrchLocPpuPK() {
        return mrchLocPpuPK;
    }

    public void setMrchLocPpuPK(MrchLocPpuPK mrchLocPpuPK) {
        this.mrchLocPpuPK = mrchLocPpuPK;
    }

    public Date getLstTrnsDt() {
        return lstTrnsDt;
    }

    public void setLstTrnsDt(Date lstTrnsDt) {
        this.lstTrnsDt = lstTrnsDt;
    }

    public BigDecimal getFlUnitPrc() {
        return flUnitPrc;
    }

    public void setFlUnitPrc(BigDecimal flUnitPrc) {
        this.flUnitPrc = flUnitPrc;
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
        hash += (mrchLocPpuPK != null ? mrchLocPpuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocPpu)) {
            return false;
        }
        MrchLocPpu other = (MrchLocPpu) object;
        if ((this.mrchLocPpuPK == null && other.mrchLocPpuPK != null) || (this.mrchLocPpuPK != null && !this.mrchLocPpuPK.equals(other.mrchLocPpuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocPpu[ mrchLocPpuPK=" + mrchLocPpuPK + " ]";
    }
    
}
