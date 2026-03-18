package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class McBatchInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "BTCH_ID")
    private short btchId;
    @Basic(optional = false)
    @Column(name = "STLMT_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stlmtId;

    public McBatchInfoPK() {
    }

    public McBatchInfoPK(short btchId, Date stlmtId) {
        this.btchId = btchId;
        this.stlmtId = stlmtId;
    }

    public short getBtchId() {
        return btchId;
    }

    public void setBtchId(short btchId) {
        this.btchId = btchId;
    }

    public Date getStlmtId() {
        return stlmtId;
    }

    public void setStlmtId(Date stlmtId) {
        this.stlmtId = stlmtId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) btchId;
        hash += (stlmtId != null ? stlmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McBatchInfoPK)) {
            return false;
        }
        McBatchInfoPK other = (McBatchInfoPK) object;
        if (this.btchId != other.btchId) {
            return false;
        }
        if ((this.stlmtId == null && other.stlmtId != null) || (this.stlmtId != null && !this.stlmtId.equals(other.stlmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McBatchInfoPK[ btchId=" + btchId + ", stlmtId=" + stlmtId + " ]";
    }

}
