/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "SPND_PROD_CNTL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "SpndProdCntl.findAll", query = "SELECT s FROM SpndProdCntl s")})
public class SpndProdCntl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SPND_PRODC_ID")
    private String spndProdcId;
    @Basic(optional = false)
    @Column(name = "SPND_PRODC_DESC")
    private String spndProdcDesc;
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

    public SpndProdCntl() {
    }

    public SpndProdCntl(String spndProdcId) {
        this.spndProdcId = spndProdcId;
    }

    public SpndProdCntl(String spndProdcId, String spndProdcDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.spndProdcId = spndProdcId;
        this.spndProdcDesc = spndProdcDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getSpndProdcId() {
        return spndProdcId;
    }

    public void setSpndProdcId(String spndProdcId) {
        this.spndProdcId = spndProdcId;
    }

    public String getSpndProdcDesc() {
        return spndProdcDesc;
    }

    public void setSpndProdcDesc(String spndProdcDesc) {
        this.spndProdcDesc = spndProdcDesc;
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
        hash += (spndProdcId != null ? spndProdcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpndProdCntl)) {
            return false;
        }
        SpndProdCntl other = (SpndProdCntl) object;
        if ((this.spndProdcId == null && other.spndProdcId != null) || (this.spndProdcId != null && !this.spndProdcId.equals(other.spndProdcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SpndProdCntl[ spndProdcId=" + spndProdcId + " ]";
    }
    
}
