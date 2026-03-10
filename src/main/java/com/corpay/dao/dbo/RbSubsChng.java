/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "RB_SUBS_CHNG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbSubsChng.findAll", query = "SELECT r FROM RbSubsChng r")})
public class RbSubsChng implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUB_CHNG_ID")
    private Long subChngId;
    @Basic(optional = false)
    @Column(name = "CHANGE_DESC")
    private String changeDesc;
    @Basic(optional = false)
    @Column(name = "COMM")
    private String comm;
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
    @JoinColumn(name = "SUB_PHSE_ID", referencedColumnName = "SUB_PHSE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbSubsPhase subPhseId;

    public RbSubsChng() {
    }

    public RbSubsChng(Long subChngId) {
        this.subChngId = subChngId;
    }

    public RbSubsChng(Long subChngId, String changeDesc, String comm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.subChngId = subChngId;
        this.changeDesc = changeDesc;
        this.comm = comm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getSubChngId() {
        return subChngId;
    }

    public void setSubChngId(Long subChngId) {
        this.subChngId = subChngId;
    }

    public String getChangeDesc() {
        return changeDesc;
    }

    public void setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
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

    public RbSubsPhase getSubPhseId() {
        return subPhseId;
    }

    public void setSubPhseId(RbSubsPhase subPhseId) {
        this.subPhseId = subPhseId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subChngId != null ? subChngId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbSubsChng)) {
            return false;
        }
        RbSubsChng other = (RbSubsChng) object;
        if ((this.subChngId == null && other.subChngId != null) || (this.subChngId != null && !this.subChngId.equals(other.subChngId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbSubsChng[ subChngId=" + subChngId + " ]";
    }
    
}
