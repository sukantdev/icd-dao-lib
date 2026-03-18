package com.corpay.dao.dbo;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CUST_UNIT_GRPS", catalog = "", schema = "DBO")
public class CustUnitGrps implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustUnitGrpsPK custUnitGrpsPK;
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public CustUnitGrps() {
    }

    public CustUnitGrps(CustUnitGrpsPK custUnitGrpsPK) {
        this.custUnitGrpsPK = custUnitGrpsPK;
    }

    public CustUnitGrps(String custId, String unitId, String grpId) {
        this.custUnitGrpsPK = new CustUnitGrpsPK(custId, unitId, grpId);
    }

    public CustUnitGrpsPK getCustUnitGrpsPK() {
        return custUnitGrpsPK;
    }

    public void setCustUnitGrpsPK(CustUnitGrpsPK custUnitGrpsPK) {
        this.custUnitGrpsPK = custUnitGrpsPK;
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
        hash += (custUnitGrpsPK != null ? custUnitGrpsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustUnitGrps)) {
            return false;
        }
        CustUnitGrps other = (CustUnitGrps) object;
        if ((this.custUnitGrpsPK == null && other.custUnitGrpsPK != null) || (this.custUnitGrpsPK != null && !this.custUnitGrpsPK.equals(other.custUnitGrpsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustUnitGrps[ custUnitGrpsPK=" + custUnitGrpsPK + " ]";
    }

}
