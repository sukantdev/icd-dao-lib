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
@Table(name = "NET_PRICING_TA_CUST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "NetPricingTaCust.findAll", query = "SELECT n FROM NetPricingTaCust n")})
public class NetPricingTaCust implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NetPricingTaCustPK netPricingTaCustPK;
    @Basic(optional = false)
    @Column(name = "KEY_TO_TA_LOC")
    private String keyToTaLoc;
    @Basic(optional = false)
    @Column(name = "LAST_UPD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdTs;

    public NetPricingTaCust() {
    }

    public NetPricingTaCust(NetPricingTaCustPK netPricingTaCustPK) {
        this.netPricingTaCustPK = netPricingTaCustPK;
    }

    public NetPricingTaCust(NetPricingTaCustPK netPricingTaCustPK, String keyToTaLoc, Date lastUpdTs) {
        this.netPricingTaCustPK = netPricingTaCustPK;
        this.keyToTaLoc = keyToTaLoc;
        this.lastUpdTs = lastUpdTs;
    }

    public NetPricingTaCust(Date effctvDtTs, long unocalNbr, String custId) {
        this.netPricingTaCustPK = new NetPricingTaCustPK(effctvDtTs, unocalNbr, custId);
    }

    public NetPricingTaCustPK getNetPricingTaCustPK() {
        return netPricingTaCustPK;
    }

    public void setNetPricingTaCustPK(NetPricingTaCustPK netPricingTaCustPK) {
        this.netPricingTaCustPK = netPricingTaCustPK;
    }

    public String getKeyToTaLoc() {
        return keyToTaLoc;
    }

    public void setKeyToTaLoc(String keyToTaLoc) {
        this.keyToTaLoc = keyToTaLoc;
    }

    public Date getLastUpdTs() {
        return lastUpdTs;
    }

    public void setLastUpdTs(Date lastUpdTs) {
        this.lastUpdTs = lastUpdTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (netPricingTaCustPK != null ? netPricingTaCustPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NetPricingTaCust)) {
            return false;
        }
        NetPricingTaCust other = (NetPricingTaCust) object;
        if ((this.netPricingTaCustPK == null && other.netPricingTaCustPK != null) || (this.netPricingTaCustPK != null && !this.netPricingTaCustPK.equals(other.netPricingTaCustPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPricingTaCust[ netPricingTaCustPK=" + netPricingTaCustPK + " ]";
    }
    
}
