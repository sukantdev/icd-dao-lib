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
@Table(name = "FMRM_SUMM_SITELOC_HDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FmrmSummSitelocHdr.findAll", query = "SELECT f FROM FmrmSummSitelocHdr f")})
public class FmrmSummSitelocHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "NETW_TYP")
    private Character netwTyp;
    @Basic(optional = false)
    @Column(name = "DETL_CNT")
    private int detlCnt;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public FmrmSummSitelocHdr() {
    }

    public FmrmSummSitelocHdr(String custId) {
        this.custId = custId;
    }

    public FmrmSummSitelocHdr(String custId, Character netwTyp, int detlCnt, Date crtTs) {
        this.custId = custId;
        this.netwTyp = netwTyp;
        this.detlCnt = detlCnt;
        this.crtTs = crtTs;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Character getNetwTyp() {
        return netwTyp;
    }

    public void setNetwTyp(Character netwTyp) {
        this.netwTyp = netwTyp;
    }

    public int getDetlCnt() {
        return detlCnt;
    }

    public void setDetlCnt(int detlCnt) {
        this.detlCnt = detlCnt;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FmrmSummSitelocHdr)) {
            return false;
        }
        FmrmSummSitelocHdr other = (FmrmSummSitelocHdr) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmrmSummSitelocHdr[ custId=" + custId + " ]";
    }
    
}
