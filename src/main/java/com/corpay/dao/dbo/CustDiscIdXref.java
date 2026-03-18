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
@Table(name = "CUST_DISC_ID_XREF", catalog = "", schema = "DBO")
public class CustDiscIdXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustDiscIdXrefPK custDiscIdXrefPK;
    @Basic(optional = false)
    @Column(name = "PRIORITY_IND")
    private short priorityInd;
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

    public CustDiscIdXref() {
    }

    public CustDiscIdXref(CustDiscIdXrefPK custDiscIdXrefPK) {
        this.custDiscIdXrefPK = custDiscIdXrefPK;
    }

    public CustDiscIdXref(CustDiscIdXrefPK custDiscIdXrefPK, short priorityInd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.custDiscIdXrefPK = custDiscIdXrefPK;
        this.priorityInd = priorityInd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CustDiscIdXref(String acctCd, String discId) {
        this.custDiscIdXrefPK = new CustDiscIdXrefPK(acctCd, discId);
    }

    public CustDiscIdXrefPK getCustDiscIdXrefPK() {
        return custDiscIdXrefPK;
    }

    public void setCustDiscIdXrefPK(CustDiscIdXrefPK custDiscIdXrefPK) {
        this.custDiscIdXrefPK = custDiscIdXrefPK;
    }

    public short getPriorityInd() {
        return priorityInd;
    }

    public void setPriorityInd(short priorityInd) {
        this.priorityInd = priorityInd;
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
        hash += (custDiscIdXrefPK != null ? custDiscIdXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustDiscIdXref)) {
            return false;
        }
        CustDiscIdXref other = (CustDiscIdXref) object;
        if ((this.custDiscIdXrefPK == null && other.custDiscIdXrefPK != null) || (this.custDiscIdXrefPK != null && !this.custDiscIdXrefPK.equals(other.custDiscIdXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustDiscIdXref[ custDiscIdXrefPK=" + custDiscIdXrefPK + " ]";
    }

}
