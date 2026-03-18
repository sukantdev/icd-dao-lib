package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class LoadPayNetwrkLoadsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SRV_PRVDR_ACCT_ABBREV")
    private String srvPrvdrAcctAbbrev;
    @Basic(optional = false)
    @Column(name = "SHPR_ID")
    private String shprId;
    @Basic(optional = false)
    @Column(name = "CARR_ID")
    private String carrId;
    @Basic(optional = false)
    @Column(name = "LOAD_ID")
    private String loadId;
    @Basic(optional = false)
    @Column(name = "LOAD_RECVD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loadRecvdTs;

    public LoadPayNetwrkLoadsPK() {
    }

    public LoadPayNetwrkLoadsPK(String srvPrvdrAcctAbbrev, String shprId, String carrId, String loadId, Date loadRecvdTs) {
        this.srvPrvdrAcctAbbrev = srvPrvdrAcctAbbrev;
        this.shprId = shprId;
        this.carrId = carrId;
        this.loadId = loadId;
        this.loadRecvdTs = loadRecvdTs;
    }

    public String getSrvPrvdrAcctAbbrev() {
        return srvPrvdrAcctAbbrev;
    }

    public void setSrvPrvdrAcctAbbrev(String srvPrvdrAcctAbbrev) {
        this.srvPrvdrAcctAbbrev = srvPrvdrAcctAbbrev;
    }

    public String getShprId() {
        return shprId;
    }

    public void setShprId(String shprId) {
        this.shprId = shprId;
    }

    public String getCarrId() {
        return carrId;
    }

    public void setCarrId(String carrId) {
        this.carrId = carrId;
    }

    public String getLoadId() {
        return loadId;
    }

    public void setLoadId(String loadId) {
        this.loadId = loadId;
    }

    public Date getLoadRecvdTs() {
        return loadRecvdTs;
    }

    public void setLoadRecvdTs(Date loadRecvdTs) {
        this.loadRecvdTs = loadRecvdTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srvPrvdrAcctAbbrev != null ? srvPrvdrAcctAbbrev.hashCode() : 0);
        hash += (shprId != null ? shprId.hashCode() : 0);
        hash += (carrId != null ? carrId.hashCode() : 0);
        hash += (loadId != null ? loadId.hashCode() : 0);
        hash += (loadRecvdTs != null ? loadRecvdTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof LoadPayNetwrkLoadsPK)) {
            return false;
        }
        LoadPayNetwrkLoadsPK other = (LoadPayNetwrkLoadsPK) object;
        if ((this.srvPrvdrAcctAbbrev == null && other.srvPrvdrAcctAbbrev != null) || (this.srvPrvdrAcctAbbrev != null && !this.srvPrvdrAcctAbbrev.equals(other.srvPrvdrAcctAbbrev))) {
            return false;
        }
        if ((this.shprId == null && other.shprId != null) || (this.shprId != null && !this.shprId.equals(other.shprId))) {
            return false;
        }
        if ((this.carrId == null && other.carrId != null) || (this.carrId != null && !this.carrId.equals(other.carrId))) {
            return false;
        }
        if ((this.loadId == null && other.loadId != null) || (this.loadId != null && !this.loadId.equals(other.loadId))) {
            return false;
        }
        if ((this.loadRecvdTs == null && other.loadRecvdTs != null) || (this.loadRecvdTs != null && !this.loadRecvdTs.equals(other.loadRecvdTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LoadPayNetwrkLoadsPK[ srvPrvdrAcctAbbrev=" + srvPrvdrAcctAbbrev + ", shprId=" + shprId + ", carrId=" + carrId + ", loadId=" + loadId + ", loadRecvdTs=" + loadRecvdTs + " ]";
    }

}
