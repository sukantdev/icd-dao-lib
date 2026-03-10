/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CUST_GROUPS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CustGroups.findAll", query = "SELECT c FROM CustGroups c")})
public class CustGroups implements Serializable {

    @Basic(optional = false)
    @Column(name = "GRPS_DESC")
    private String grpsDesc;
    @Basic(optional = false)
    @Column(name = "GRPS_UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date grpsUpdateTs;

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustGroupsPK custGroupsPK;
    @Basic(optional = false)
    @Column(name = "UNIT_GRPS_DESC")
    private String unitGrpsDesc;
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public CustGroups() {
    }

    public CustGroups(CustGroupsPK custGroupsPK) {
        this.custGroupsPK = custGroupsPK;
    }

    public CustGroups(CustGroupsPK custGroupsPK, String unitGrpsDesc) {
        this.custGroupsPK = custGroupsPK;
        this.unitGrpsDesc = unitGrpsDesc;
    }

    public CustGroups(String custId, String grpId) {
        this.custGroupsPK = new CustGroupsPK(custId, grpId);
    }

    public CustGroupsPK getCustGroupsPK() {
        return custGroupsPK;
    }

    public void setCustGroupsPK(CustGroupsPK custGroupsPK) {
        this.custGroupsPK = custGroupsPK;
    }

    public String getUnitGrpsDesc() {
        return unitGrpsDesc;
    }

    public void setUnitGrpsDesc(String unitGrpsDesc) {
        this.unitGrpsDesc = unitGrpsDesc;
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
        hash += (custGroupsPK != null ? custGroupsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustGroups)) {
            return false;
        }
        CustGroups other = (CustGroups) object;
        if ((this.custGroupsPK == null && other.custGroupsPK != null) || (this.custGroupsPK != null && !this.custGroupsPK.equals(other.custGroupsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustGroups[ custGroupsPK=" + custGroupsPK + " ]";
    }

    public String getGrpsDesc() {
        return grpsDesc;
    }

    public void setGrpsDesc(String grpsDesc) {
        this.grpsDesc = grpsDesc;
    }

    public Date getGrpsUpdateTs() {
        return grpsUpdateTs;
    }

    public void setGrpsUpdateTs(Date grpsUpdateTs) {
        this.grpsUpdateTs = grpsUpdateTs;
    }
    
}
