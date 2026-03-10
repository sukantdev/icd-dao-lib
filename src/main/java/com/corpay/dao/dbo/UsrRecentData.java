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
@Table(name = "USR_RECENT_DATA", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrRecentData.findAll", query = "SELECT u FROM UsrRecentData u")})
public class UsrRecentData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrRecentDataPK usrRecentDataPK;
    @Basic(optional = false)
    @Column(name = "DATA_TXT")
    private String dataTxt;
    @Basic(optional = false)
    @Column(name = "LAST_CRC")
    private long lastCrc;
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

    public UsrRecentData() {
    }

    public UsrRecentData(UsrRecentDataPK usrRecentDataPK) {
        this.usrRecentDataPK = usrRecentDataPK;
    }

    public UsrRecentData(UsrRecentDataPK usrRecentDataPK, String dataTxt, long lastCrc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrRecentDataPK = usrRecentDataPK;
        this.dataTxt = dataTxt;
        this.lastCrc = lastCrc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrRecentData(String usrId, Date lastUsedTs) {
        this.usrRecentDataPK = new UsrRecentDataPK(usrId, lastUsedTs);
    }

    public UsrRecentDataPK getUsrRecentDataPK() {
        return usrRecentDataPK;
    }

    public void setUsrRecentDataPK(UsrRecentDataPK usrRecentDataPK) {
        this.usrRecentDataPK = usrRecentDataPK;
    }

    public String getDataTxt() {
        return dataTxt;
    }

    public void setDataTxt(String dataTxt) {
        this.dataTxt = dataTxt;
    }

    public long getLastCrc() {
        return lastCrc;
    }

    public void setLastCrc(long lastCrc) {
        this.lastCrc = lastCrc;
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
        hash += (usrRecentDataPK != null ? usrRecentDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrRecentData)) {
            return false;
        }
        UsrRecentData other = (UsrRecentData) object;
        if ((this.usrRecentDataPK == null && other.usrRecentDataPK != null) || (this.usrRecentDataPK != null && !this.usrRecentDataPK.equals(other.usrRecentDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrRecentData[ usrRecentDataPK=" + usrRecentDataPK + " ]";
    }
    
}
