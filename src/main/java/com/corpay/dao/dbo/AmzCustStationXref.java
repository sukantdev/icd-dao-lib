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
@Table(name = "AMZ_CUST_STATION_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AmzCustStationXref.findAll", query = "SELECT a FROM AmzCustStationXref a")})
public class AmzCustStationXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AmzCustStationXrefPK amzCustStationXrefPK;
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

    public AmzCustStationXref() {
    }

    public AmzCustStationXref(AmzCustStationXrefPK amzCustStationXrefPK) {
        this.amzCustStationXrefPK = amzCustStationXrefPK;
    }

    public AmzCustStationXref(AmzCustStationXrefPK amzCustStationXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.amzCustStationXrefPK = amzCustStationXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AmzCustStationXref(String custId, String amzStationCd) {
        this.amzCustStationXrefPK = new AmzCustStationXrefPK(custId, amzStationCd);
    }

    public AmzCustStationXrefPK getAmzCustStationXrefPK() {
        return amzCustStationXrefPK;
    }

    public void setAmzCustStationXrefPK(AmzCustStationXrefPK amzCustStationXrefPK) {
        this.amzCustStationXrefPK = amzCustStationXrefPK;
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
        hash += (amzCustStationXrefPK != null ? amzCustStationXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmzCustStationXref)) {
            return false;
        }
        AmzCustStationXref other = (AmzCustStationXref) object;
        if ((this.amzCustStationXrefPK == null && other.amzCustStationXrefPK != null) || (this.amzCustStationXrefPK != null && !this.amzCustStationXrefPK.equals(other.amzCustStationXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AmzCustStationXref[ amzCustStationXrefPK=" + amzCustStationXrefPK + " ]";
    }
    
}
