package com.corpay.dao.cxxcow;

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
@Table(name = "CUSTTYPE_WS_RESOURCES_MAPPING_TXN", catalog = "", schema = "CXXCOW")
public class CusttypeWsResourcesMappingTxn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CusttypeWsResourcesMappingTxnPK custtypeWsResourcesMappingTxnPK;
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

    public CusttypeWsResourcesMappingTxn() {
    }

    public CusttypeWsResourcesMappingTxn(CusttypeWsResourcesMappingTxnPK custtypeWsResourcesMappingTxnPK) {
        this.custtypeWsResourcesMappingTxnPK = custtypeWsResourcesMappingTxnPK;
    }

    public CusttypeWsResourcesMappingTxn(CusttypeWsResourcesMappingTxnPK custtypeWsResourcesMappingTxnPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.custtypeWsResourcesMappingTxnPK = custtypeWsResourcesMappingTxnPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CusttypeWsResourcesMappingTxn(int custTypeId, int webSvcId) {
        this.custtypeWsResourcesMappingTxnPK = new CusttypeWsResourcesMappingTxnPK(custTypeId, webSvcId);
    }

    public CusttypeWsResourcesMappingTxnPK getCusttypeWsResourcesMappingTxnPK() {
        return custtypeWsResourcesMappingTxnPK;
    }

    public void setCusttypeWsResourcesMappingTxnPK(CusttypeWsResourcesMappingTxnPK custtypeWsResourcesMappingTxnPK) {
        this.custtypeWsResourcesMappingTxnPK = custtypeWsResourcesMappingTxnPK;
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
        hash += (custtypeWsResourcesMappingTxnPK != null ? custtypeWsResourcesMappingTxnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CusttypeWsResourcesMappingTxn)) {
            return false;
        }
        CusttypeWsResourcesMappingTxn other = (CusttypeWsResourcesMappingTxn) object;
        if ((this.custtypeWsResourcesMappingTxnPK == null && other.custtypeWsResourcesMappingTxnPK != null) || (this.custtypeWsResourcesMappingTxnPK != null && !this.custtypeWsResourcesMappingTxnPK.equals(other.custtypeWsResourcesMappingTxnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CusttypeWsResourcesMappingTxn[ custtypeWsResourcesMappingTxnPK=" + custtypeWsResourcesMappingTxnPK + " ]";
    }

}
