package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class McStlmtDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DTL_STLMT_ID")
    private short dtlStlmtId;
    @Basic(optional = false)
    @Column(name = "MRCH_ID")
    private short mrchId;
    @Basic(optional = false)
    @Column(name = "STLMT_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stlmtId;
    @Basic(optional = false)
    @Column(name = "BTCH_ID")
    private short btchId;

    public McStlmtDtlPK() {
    }

    public McStlmtDtlPK(short dtlStlmtId, short mrchId, Date stlmtId, short btchId) {
        this.dtlStlmtId = dtlStlmtId;
        this.mrchId = mrchId;
        this.stlmtId = stlmtId;
        this.btchId = btchId;
    }

    public short getDtlStlmtId() {
        return dtlStlmtId;
    }

    public void setDtlStlmtId(short dtlStlmtId) {
        this.dtlStlmtId = dtlStlmtId;
    }

    public short getMrchId() {
        return mrchId;
    }

    public void setMrchId(short mrchId) {
        this.mrchId = mrchId;
    }

    public Date getStlmtId() {
        return stlmtId;
    }

    public void setStlmtId(Date stlmtId) {
        this.stlmtId = stlmtId;
    }

    public short getBtchId() {
        return btchId;
    }

    public void setBtchId(short btchId) {
        this.btchId = btchId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dtlStlmtId;
        hash += (int) mrchId;
        hash += (stlmtId != null ? stlmtId.hashCode() : 0);
        hash += (int) btchId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McStlmtDtlPK)) {
            return false;
        }
        McStlmtDtlPK other = (McStlmtDtlPK) object;
        if (this.dtlStlmtId != other.dtlStlmtId) {
            return false;
        }
        if (this.mrchId != other.mrchId) {
            return false;
        }
        if ((this.stlmtId == null && other.stlmtId != null) || (this.stlmtId != null && !this.stlmtId.equals(other.stlmtId))) {
            return false;
        }
        if (this.btchId != other.btchId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McStlmtDtlPK[ dtlStlmtId=" + dtlStlmtId + ", mrchId=" + mrchId + ", stlmtId=" + stlmtId + ", btchId=" + btchId + " ]";
    }

}
