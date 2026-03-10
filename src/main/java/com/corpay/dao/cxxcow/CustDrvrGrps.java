/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
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
@Table(name = "CUST_DRVR_GRPS", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "CustDrvrGrps.findAll", query = "SELECT c FROM CustDrvrGrps c"),
    @NamedQuery(name = "CustDrvrGrps.findByDrgrCustId", query = "SELECT c FROM CustDrvrGrps c WHERE c.custDrvrGrpsPK.drgrCustId = :drgrCustId"),
    @NamedQuery(name = "CustDrvrGrps.findByDrgrGrpId", query = "SELECT c FROM CustDrvrGrps c WHERE c.custDrvrGrpsPK.drgrGrpId = :drgrGrpId"),
    @NamedQuery(name = "CustDrvrGrps.findByDrgrDrvrId", query = "SELECT c FROM CustDrvrGrps c WHERE c.custDrvrGrpsPK.drgrDrvrId = :drgrDrvrId"),
    @NamedQuery(name = "CustDrvrGrps.findByDrgrUpdateTs", query = "SELECT c FROM CustDrvrGrps c WHERE c.drgrUpdateTs = :drgrUpdateTs")})
public class CustDrvrGrps implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustDrvrGrpsPK custDrvrGrpsPK;
    @Basic(optional = false)
    @Column(name = "DRGR_UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date drgrUpdateTs;
    @JoinColumns({
        @JoinColumn(name = "DRGR_CUST_ID", referencedColumnName = "DRVR_CUST_ID", insertable = false, updatable = false),
        @JoinColumn(name = "DRGR_DRVR_ID", referencedColumnName = "DRVR_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private CustDriver custDriver;

    public CustDrvrGrps() {
    }

    public CustDrvrGrps(CustDrvrGrpsPK custDrvrGrpsPK) {
        this.custDrvrGrpsPK = custDrvrGrpsPK;
    }

    public CustDrvrGrps(CustDrvrGrpsPK custDrvrGrpsPK, Date drgrUpdateTs) {
        this.custDrvrGrpsPK = custDrvrGrpsPK;
        this.drgrUpdateTs = drgrUpdateTs;
    }

    public CustDrvrGrps(String drgrCustId, String drgrGrpId, String drgrDrvrId) {
        this.custDrvrGrpsPK = new CustDrvrGrpsPK(drgrCustId, drgrGrpId, drgrDrvrId);
    }

    public CustDrvrGrpsPK getCustDrvrGrpsPK() {
        return custDrvrGrpsPK;
    }

    public void setCustDrvrGrpsPK(CustDrvrGrpsPK custDrvrGrpsPK) {
        this.custDrvrGrpsPK = custDrvrGrpsPK;
    }

    public Date getDrgrUpdateTs() {
        return drgrUpdateTs;
    }

    public void setDrgrUpdateTs(Date drgrUpdateTs) {
        this.drgrUpdateTs = drgrUpdateTs;
    }

    public CustDriver getCustDriver() {
        return custDriver;
    }

    public void setCustDriver(CustDriver custDriver) {
        this.custDriver = custDriver;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custDrvrGrpsPK != null ? custDrvrGrpsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustDrvrGrps)) {
            return false;
        }
        CustDrvrGrps other = (CustDrvrGrps) object;
        if ((this.custDrvrGrpsPK == null && other.custDrvrGrpsPK != null) || (this.custDrvrGrpsPK != null && !this.custDrvrGrpsPK.equals(other.custDrvrGrpsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CustDrvrGrps[ custDrvrGrpsPK=" + custDrvrGrpsPK + " ]";
    }
    
}
