/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class McAddFleetcard2PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "STLMT_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stlmtId;
    @Basic(optional = false)
    @Column(name = "BTCH_ID")
    private short btchId;
    @Basic(optional = false)
    @Column(name = "MRCH_ID")
    private short mrchId;
    @Basic(optional = false)
    @Column(name = "DTL_STLMT_ID")
    private short dtlStlmtId;
    @Basic(optional = false)
    @Column(name = "FLT2_ADD_ID")
    private short flt2AddId;

    public McAddFleetcard2PK() {
    }

    public McAddFleetcard2PK(Date stlmtId, short btchId, short mrchId, short dtlStlmtId, short flt2AddId) {
        this.stlmtId = stlmtId;
        this.btchId = btchId;
        this.mrchId = mrchId;
        this.dtlStlmtId = dtlStlmtId;
        this.flt2AddId = flt2AddId;
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

    public short getMrchId() {
        return mrchId;
    }

    public void setMrchId(short mrchId) {
        this.mrchId = mrchId;
    }

    public short getDtlStlmtId() {
        return dtlStlmtId;
    }

    public void setDtlStlmtId(short dtlStlmtId) {
        this.dtlStlmtId = dtlStlmtId;
    }

    public short getFlt2AddId() {
        return flt2AddId;
    }

    public void setFlt2AddId(short flt2AddId) {
        this.flt2AddId = flt2AddId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stlmtId != null ? stlmtId.hashCode() : 0);
        hash += (int) btchId;
        hash += (int) mrchId;
        hash += (int) dtlStlmtId;
        hash += (int) flt2AddId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddFleetcard2PK)) {
            return false;
        }
        McAddFleetcard2PK other = (McAddFleetcard2PK) object;
        if ((this.stlmtId == null && other.stlmtId != null) || (this.stlmtId != null && !this.stlmtId.equals(other.stlmtId))) {
            return false;
        }
        if (this.btchId != other.btchId) {
            return false;
        }
        if (this.mrchId != other.mrchId) {
            return false;
        }
        if (this.dtlStlmtId != other.dtlStlmtId) {
            return false;
        }
        if (this.flt2AddId != other.flt2AddId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddFleetcard2PK[ stlmtId=" + stlmtId + ", btchId=" + btchId + ", mrchId=" + mrchId + ", dtlStlmtId=" + dtlStlmtId + ", flt2AddId=" + flt2AddId + " ]";
    }
    
}
