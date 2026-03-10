/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_MERCH_DESC", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McMerchDesc.findAll", query = "SELECT m FROM McMerchDesc m"),
    @NamedQuery(name = "McMerchDesc.findByMrchId", query = "SELECT m FROM McMerchDesc m WHERE m.mcMerchDescPK.mrchId = :mrchId"),
    @NamedQuery(name = "McMerchDesc.findByStlmtId", query = "SELECT m FROM McMerchDesc m WHERE m.mcMerchDescPK.stlmtId = :stlmtId"),
    @NamedQuery(name = "McMerchDesc.findByBtchId", query = "SELECT m FROM McMerchDesc m WHERE m.mcMerchDescPK.btchId = :btchId"),
    @NamedQuery(name = "McMerchDesc.findByMrchCatCd", query = "SELECT m FROM McMerchDesc m WHERE m.mrchCatCd = :mrchCatCd"),
    @NamedQuery(name = "McMerchDesc.findByMrchDescr", query = "SELECT m FROM McMerchDesc m WHERE m.mrchDescr = :mrchDescr"),
    @NamedQuery(name = "McMerchDesc.findByMrchCity", query = "SELECT m FROM McMerchDesc m WHERE m.mrchCity = :mrchCity"),
    @NamedQuery(name = "McMerchDesc.findByMrchState", query = "SELECT m FROM McMerchDesc m WHERE m.mrchState = :mrchState"),
    @NamedQuery(name = "McMerchDesc.findByNoteid", query = "SELECT m FROM McMerchDesc m WHERE m.noteid = :noteid"),
    @NamedQuery(name = "McMerchDesc.findByClusterKey", query = "SELECT m FROM McMerchDesc m WHERE m.clusterKey = :clusterKey"),
    @NamedQuery(name = "McMerchDesc.findByMrchastate", query = "SELECT m FROM McMerchDesc m WHERE m.mrchastate = :mrchastate"),
    @NamedQuery(name = "McMerchDesc.findByFilteredFlags", query = "SELECT m FROM McMerchDesc m WHERE m.filteredFlags = :filteredFlags")})
public class McMerchDesc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McMerchDescPK mcMerchDescPK;
    @Basic(optional = false)
    @Column(name = "MRCH_CAT_CD")
    private short mrchCatCd;
    @Basic(optional = false)
    @Column(name = "MRCH_DESCR")
    private String mrchDescr;
    @Basic(optional = false)
    @Column(name = "MRCH_CITY")
    private String mrchCity;
    @Basic(optional = false)
    @Column(name = "MRCH_STATE")
    private String mrchState;
    @Basic(optional = false)
    @Column(name = "NOTEID")
    private int noteid;
    @Basic(optional = false)
    @Column(name = "CLUSTER_KEY")
    private String clusterKey;
    @Basic(optional = false)
    @Column(name = "MRCHASTATE")
    private String mrchastate;
    @Basic(optional = false)
    @Column(name = "FILTERED_FLAGS")
    private String filteredFlags;

    public McMerchDesc() {
    }

    public McMerchDesc(McMerchDescPK mcMerchDescPK) {
        this.mcMerchDescPK = mcMerchDescPK;
    }

    public McMerchDesc(McMerchDescPK mcMerchDescPK, short mrchCatCd, String mrchDescr, String mrchCity, String mrchState, int noteid, String clusterKey, String mrchastate, String filteredFlags) {
        this.mcMerchDescPK = mcMerchDescPK;
        this.mrchCatCd = mrchCatCd;
        this.mrchDescr = mrchDescr;
        this.mrchCity = mrchCity;
        this.mrchState = mrchState;
        this.noteid = noteid;
        this.clusterKey = clusterKey;
        this.mrchastate = mrchastate;
        this.filteredFlags = filteredFlags;
    }

    public McMerchDesc(short mrchId, Date stlmtId, short btchId) {
        this.mcMerchDescPK = new McMerchDescPK(mrchId, stlmtId, btchId);
    }

    public McMerchDescPK getMcMerchDescPK() {
        return mcMerchDescPK;
    }

    public void setMcMerchDescPK(McMerchDescPK mcMerchDescPK) {
        this.mcMerchDescPK = mcMerchDescPK;
    }

    public short getMrchCatCd() {
        return mrchCatCd;
    }

    public void setMrchCatCd(short mrchCatCd) {
        this.mrchCatCd = mrchCatCd;
    }

    public String getMrchDescr() {
        return mrchDescr;
    }

    public void setMrchDescr(String mrchDescr) {
        this.mrchDescr = mrchDescr;
    }

    public String getMrchCity() {
        return mrchCity;
    }

    public void setMrchCity(String mrchCity) {
        this.mrchCity = mrchCity;
    }

    public String getMrchState() {
        return mrchState;
    }

    public void setMrchState(String mrchState) {
        this.mrchState = mrchState;
    }

    public int getNoteid() {
        return noteid;
    }

    public void setNoteid(int noteid) {
        this.noteid = noteid;
    }

    public String getClusterKey() {
        return clusterKey;
    }

    public void setClusterKey(String clusterKey) {
        this.clusterKey = clusterKey;
    }

    public String getMrchastate() {
        return mrchastate;
    }

    public void setMrchastate(String mrchastate) {
        this.mrchastate = mrchastate;
    }

    public String getFilteredFlags() {
        return filteredFlags;
    }

    public void setFilteredFlags(String filteredFlags) {
        this.filteredFlags = filteredFlags;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMerchDescPK != null ? mcMerchDescPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McMerchDesc)) {
            return false;
        }
        McMerchDesc other = (McMerchDesc) object;
        if ((this.mcMerchDescPK == null && other.mcMerchDescPK != null) || (this.mcMerchDescPK != null && !this.mcMerchDescPK.equals(other.mcMerchDescPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMerchDesc[ mcMerchDescPK=" + mcMerchDescPK + " ]";
    }
    
}
