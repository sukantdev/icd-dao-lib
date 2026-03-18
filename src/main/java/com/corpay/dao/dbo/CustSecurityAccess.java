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
@Table(name = "CUST_SECURITY_ACCESS", catalog = "", schema = "DBO")
public class CustSecurityAccess implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustSecurityAccessPK custSecurityAccessPK;
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

    public CustSecurityAccess() {
    }

    public CustSecurityAccess(CustSecurityAccessPK custSecurityAccessPK) {
        this.custSecurityAccessPK = custSecurityAccessPK;
    }

    public CustSecurityAccess(CustSecurityAccessPK custSecurityAccessPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.custSecurityAccessPK = custSecurityAccessPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CustSecurityAccess(String acctNbr, String custId, String securityPartner) {
        this.custSecurityAccessPK = new CustSecurityAccessPK(acctNbr, custId, securityPartner);
    }

    public CustSecurityAccessPK getCustSecurityAccessPK() {
        return custSecurityAccessPK;
    }

    public void setCustSecurityAccessPK(CustSecurityAccessPK custSecurityAccessPK) {
        this.custSecurityAccessPK = custSecurityAccessPK;
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
        hash += (custSecurityAccessPK != null ? custSecurityAccessPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustSecurityAccess)) {
            return false;
        }
        CustSecurityAccess other = (CustSecurityAccess) object;
        if ((this.custSecurityAccessPK == null && other.custSecurityAccessPK != null) || (this.custSecurityAccessPK != null && !this.custSecurityAccessPK.equals(other.custSecurityAccessPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustSecurityAccess[ custSecurityAccessPK=" + custSecurityAccessPK + " ]";
    }

}
