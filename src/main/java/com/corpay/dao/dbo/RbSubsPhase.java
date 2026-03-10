/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "RB_SUBS_PHASE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbSubsPhase.findAll", query = "SELECT r FROM RbSubsPhase r")})
public class RbSubsPhase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUB_PHSE_ID")
    private Long subPhseId;
    @Basic(optional = false)
    @Column(name = "START_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTs;
    @Basic(optional = false)
    @Column(name = "END_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTs;
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
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "rbSubsPhase", fetch = FetchType.LAZY)
    private RbBillSched rbBillSched;
    @JoinColumn(name = "SUB_ID", referencedColumnName = "SUB_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbSubscription subId;
    @JoinColumn(name = "SUB_TYP_ID", referencedColumnName = "SUB_TYP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbSubsTyp subTypId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subPhseId", fetch = FetchType.LAZY)
    private Set<RbSubsChng> rbSubsChngSet;

    public RbSubsPhase() {
    }

    public RbSubsPhase(Long subPhseId) {
        this.subPhseId = subPhseId;
    }

    public RbSubsPhase(Long subPhseId, Date startTs, Date endTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.subPhseId = subPhseId;
        this.startTs = startTs;
        this.endTs = endTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getSubPhseId() {
        return subPhseId;
    }

    public void setSubPhseId(Long subPhseId) {
        this.subPhseId = subPhseId;
    }

    public Date getStartTs() {
        return startTs;
    }

    public void setStartTs(Date startTs) {
        this.startTs = startTs;
    }

    public Date getEndTs() {
        return endTs;
    }

    public void setEndTs(Date endTs) {
        this.endTs = endTs;
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

    public RbBillSched getRbBillSched() {
        return rbBillSched;
    }

    public void setRbBillSched(RbBillSched rbBillSched) {
        this.rbBillSched = rbBillSched;
    }

    public RbSubscription getSubId() {
        return subId;
    }

    public void setSubId(RbSubscription subId) {
        this.subId = subId;
    }

    public RbSubsTyp getSubTypId() {
        return subTypId;
    }

    public void setSubTypId(RbSubsTyp subTypId) {
        this.subTypId = subTypId;
    }

    public Set<RbSubsChng> getRbSubsChngSet() {
        return rbSubsChngSet;
    }

    public void setRbSubsChngSet(Set<RbSubsChng> rbSubsChngSet) {
        this.rbSubsChngSet = rbSubsChngSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subPhseId != null ? subPhseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbSubsPhase)) {
            return false;
        }
        RbSubsPhase other = (RbSubsPhase) object;
        if ((this.subPhseId == null && other.subPhseId != null) || (this.subPhseId != null && !this.subPhseId.equals(other.subPhseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbSubsPhase[ subPhseId=" + subPhseId + " ]";
    }
    
}
