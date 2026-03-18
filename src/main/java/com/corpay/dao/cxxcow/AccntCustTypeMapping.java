package com.corpay.dao.cxxcow;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ACCNT_CUST_TYPE_MAPPING", catalog = "", schema = "CXXCOW")
public class AccntCustTypeMapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccntCustTypeMappingPK accntCustTypeMappingPK;
    @Column(name = "PLSD_ACCT_DESC")
    private String plsdAcctDesc;
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
    @Column(name = "FIS_USER_ID")
    private String fisUserId;
    @Column(name = "FIS_USER_PASSWORD")
    private String fisUserPassword;

    public AccntCustTypeMapping() {
    }

    public AccntCustTypeMapping(AccntCustTypeMappingPK accntCustTypeMappingPK) {
        this.accntCustTypeMappingPK = accntCustTypeMappingPK;
    }

    public AccntCustTypeMapping(AccntCustTypeMappingPK accntCustTypeMappingPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.accntCustTypeMappingPK = accntCustTypeMappingPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AccntCustTypeMapping(int custTypeId, String plsdAcctNbr) {
        this.accntCustTypeMappingPK = new AccntCustTypeMappingPK(custTypeId, plsdAcctNbr);
    }

    public AccntCustTypeMappingPK getAccntCustTypeMappingPK() {
        return accntCustTypeMappingPK;
    }

    public void setAccntCustTypeMappingPK(AccntCustTypeMappingPK accntCustTypeMappingPK) {
        this.accntCustTypeMappingPK = accntCustTypeMappingPK;
    }

    public String getPlsdAcctDesc() {
        return plsdAcctDesc;
    }

    public void setPlsdAcctDesc(String plsdAcctDesc) {
        this.plsdAcctDesc = plsdAcctDesc;
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

    public String getFisUserId() {
        return fisUserId;
    }

    public void setFisUserId(String fisUserId) {
        this.fisUserId = fisUserId;
    }

    public String getFisUserPassword() {
        return fisUserPassword;
    }

    public void setFisUserPassword(String fisUserPassword) {
        this.fisUserPassword = fisUserPassword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accntCustTypeMappingPK != null ? accntCustTypeMappingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AccntCustTypeMapping)) {
            return false;
        }
        AccntCustTypeMapping other = (AccntCustTypeMapping) object;
        if ((this.accntCustTypeMappingPK == null && other.accntCustTypeMappingPK != null) || (this.accntCustTypeMappingPK != null && !this.accntCustTypeMappingPK.equals(other.accntCustTypeMappingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.AccntCustTypeMapping[ accntCustTypeMappingPK=" + accntCustTypeMappingPK + " ]";
    }

}
