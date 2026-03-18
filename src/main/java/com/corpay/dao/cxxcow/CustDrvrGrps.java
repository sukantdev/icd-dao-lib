package com.corpay.dao.cxxcow;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "CUST_DRVR_GRPS", catalog = "", schema = "CXXCOW")
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
