package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CUST_RACK_UPD_FLGS", catalog = "", schema = "DBO")
public class CustRackUpdFlgs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRackUpdFlgsPK custRackUpdFlgsPK;
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

    public CustRackUpdFlgs() {
    }

    public CustRackUpdFlgs(CustRackUpdFlgsPK custRackUpdFlgsPK) {
        this.custRackUpdFlgsPK = custRackUpdFlgsPK;
    }

    public CustRackUpdFlgs(CustRackUpdFlgsPK custRackUpdFlgsPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.custRackUpdFlgsPK = custRackUpdFlgsPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CustRackUpdFlgs(String custId, String locTyp, String locCd, Character scRackDay) {
        this.custRackUpdFlgsPK = new CustRackUpdFlgsPK(custId, locTyp, locCd, scRackDay);
    }

    public CustRackUpdFlgsPK getCustRackUpdFlgsPK() {
        return custRackUpdFlgsPK;
    }

    public void setCustRackUpdFlgsPK(CustRackUpdFlgsPK custRackUpdFlgsPK) {
        this.custRackUpdFlgsPK = custRackUpdFlgsPK;
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
        hash += (custRackUpdFlgsPK != null ? custRackUpdFlgsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustRackUpdFlgs)) {
            return false;
        }
        CustRackUpdFlgs other = (CustRackUpdFlgs) object;
        if ((this.custRackUpdFlgsPK == null && other.custRackUpdFlgsPK != null) || (this.custRackUpdFlgsPK != null && !this.custRackUpdFlgsPK.equals(other.custRackUpdFlgsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustRackUpdFlgs[ custRackUpdFlgsPK=" + custRackUpdFlgsPK + " ]";
    }

}
